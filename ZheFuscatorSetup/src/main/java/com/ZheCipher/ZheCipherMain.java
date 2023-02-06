package com.ZheCipher;

import com.zhefuscator.LogInterface;
import com.zhefuscator.RegexManipulator;
import com.zhefuscator.TxtFileLog;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>ZheCipherMain!</h1>
 *
 * The class ZheCipherMain is responsible for the integration between the text
 * files and the ZheCipher class. The class functions by obtaining the necessary
 * information from the files and performing operations on them in accordance
 * with the requirements, utilizing the functionality provided by the ZheCipher
 * class.
 *
 * @author Vitor Emanuel
 * @version 1.0
 * @since 2022-12-01
 */
public class ZheCipherMain {

    private LogInterface li;

    private final boolean ENCRYPT_MODE = true;
    private final boolean DECRYPT_MODE = false;

    private TxtFileLog tfl;
    private RegexManipulator rm;
    private ZheCipher zc;

    /**
     * This is the constructor with parameters using the standard
     * encryption/decryption key, in this all variables are initialized as
     * passed.
     *
     * @param fileEncrypted This is a String representing the file to be
     * encrypted.
     * @param fileDecrypted This is a String representing the file to be
     * decrypted.
     * @param opMode This is a Boolean representing the operation mode, true for
     * encryption and false for decryption.
     * @throws java.io.IOException
     */
    public ZheCipherMain(String fileEncrypted, String fileDecrypted, boolean opMode) throws IOException, InterruptedException, Exception {

        tfl = new TxtFileLog(fileEncrypted, fileDecrypted);
        zc = new ZheCipher();

        if (opMode == ENCRYPT_MODE) {
            try {
                encryptMode();
            } catch (ClassNotFoundException | InvocationTargetException | IllegalAccessException | InstantiationException | NoSuchMethodException ex) {
                Logger.getLogger(ZheCipherMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opMode == DECRYPT_MODE) {
            decryptMode();
        }
    }

    /**
     * This is the constructor with parameters that uses a key passed as
     * parameter, in this all variables are initialized as passed.
     *
     * @param fileEncrypted This is a String representing the file to be
     * encrypted.
     * @param fileDecrypted This is a String representing the file to be
     * decrypted.
     * @param key This is a String representing the key to be used for
     * encryption/decryption.
     * @param opMode This is a Boolean representing the operation mode, true for
     * encryption and false for decryption.
     * @throws java.io.IOException
     */
    public ZheCipherMain(String fileEncrypted, String fileDecrypted, String key, boolean opMode) throws IOException, InterruptedException, Exception {

        tfl = new TxtFileLog(fileEncrypted, fileDecrypted);
        zc = new ZheCipher(key);

        if (opMode == ENCRYPT_MODE) {
            try {
                encryptMode();
            } catch (ClassNotFoundException | InvocationTargetException | IllegalAccessException | InstantiationException | NoSuchMethodException ex) {
                Logger.getLogger(ZheCipherMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (opMode == DECRYPT_MODE) {
            decryptMode();
        }

    }

    /**
     * This method performs the call of the encryption function, performing all
     * processing operations before encryption.
     */
    private void encryptMode() throws IOException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException, InterruptedException, Exception {
        li = new LogInterface();
        int i = 0;
        while(i < 3)
        {
            String line;
            line = tfl.read();
            while (line != null) {
                li.setSensitives(line);
                var words = line.split(" ");
                for (String word : words) {
                    if (li.isStringSensitive(1)) {
                        tfl.write("<e>" + zc.encrypt(word) + "</e>");
                    } else {
                        tfl.write(word);
                    }
                    tfl.write(" ");
                }
                tfl.write("\n");
                line = tfl.read();
                TimeUnit.SECONDS.sleep(5);
            }
            tfl.closeFiles();
            i++;
        }
        
    }

    /**
     * This method performs the call of the decryption function, performing all
     * processing operations before decryption.
     */
    private void decryptMode() {
        rm = new RegexManipulator();

        String line = tfl.read();

        while (line != null) {

            if (rm.checkString(line, ".*<e>.*</e>.*")) {
                tfl.write(rm.getGroup(line, "(.*?)(<e>)(.*)(</e>)(.*)", 1)
                        + zc.decrypt(rm.getGroup(line, "(.*?)(<e>)(.*)(</e>)(.*)", 3))
                        + rm.getGroup(line, "(.*?)(<e>)(.*)(</e>)(.*)", 5));
                tfl.newLine();
            } else {
                tfl.write(line);
                tfl.newLine();
            }

            line = tfl.read();
        }

        tfl.closeFiles();
    }
}
