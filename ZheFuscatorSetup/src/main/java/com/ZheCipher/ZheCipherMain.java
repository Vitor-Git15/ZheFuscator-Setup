/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ZheCipher;

import com.zhefuscator.LogInterface;
import com.zhefuscator.RegexManipulator;
import com.zhefuscator.TxtFileLog;
import java.io.IOException;

/**
 *
 * @author vitor
 */
public class ZheCipherMain {
    
    private LogInterface li;
    
    private final boolean ENCRYPT_MODE = true;
    private final boolean DECRYPT_MODE = false;

    private TxtFileLog tfl;
    private RegexManipulator rm;
    private ZheCipher zc;

    public ZheCipherMain(String fileEncrypted, String fileDecrypted, boolean opMode) {

        tfl = new TxtFileLog(fileEncrypted, fileDecrypted);
        zc = new ZheCipher();

        if (opMode == ENCRYPT_MODE) {

        } else if (opMode == DECRYPT_MODE) {
            decryptMode();
        }
    }

    public ZheCipherMain(String fileEncrypted, String fileDecrypted, String key, boolean opMode) throws IOException {

        tfl = new TxtFileLog(fileEncrypted, fileDecrypted);
        zc = new ZheCipher(key);

        if (opMode == ENCRYPT_MODE) {
            encryptMode();
        } else if (opMode == DECRYPT_MODE) {
            decryptMode();
        }

    }

    private void encryptMode() throws IOException {
        li = new LogInterface();
        String line;
        line = tfl.read();
        while (line != null) {
            li.setSenstives(line);
            var words = line.split(" ");
            for (String word : words) {
                if (li.isStringSensitive(word)) {
                    tfl.write("<e>" + zc.encrypt(word) + "</e>");
                } else {
                    tfl.write(word);
                }
                tfl.write(" ");
            }
            tfl.write("\n");
            line = tfl.read();
        }
        tfl.closeFiles();
    }

    private void decryptMode() {
        rm = new RegexManipulator();
        
        String line = tfl.read();

        while (line != null) {

            // escreve o texto desencriptado no arquivo
            if (rm.checkString(line, ".*<e>.*</e>.*")) {
                tfl.write(rm.getGroup(line, "(.*?)(<e>)(.*)(</e>)(.*)", 1)
                        + zc.decrypt(rm.getGroup(line, "(.*?)(<e>)(.*)(</e>)(.*)", 3))
                        + rm.getGroup(line, "(.*?)(<e>)(.*)(</e>)(.*)", 5));
                tfl.newLine();
            } else {
                tfl.write(line);
                tfl.newLine();
            }

            // lê da segunda até a última linha
            line = tfl.read();
        }
        
        tfl.closeFiles();
    }
}
