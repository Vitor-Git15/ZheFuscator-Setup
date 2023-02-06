package com.TestApplication;

import com.ZheCipher.ZheCipherMain;
import java.io.IOException;
import java.util.Scanner;

/**
 * <h1>ArgsManipulator!</h1>
 *
 * The ArgsManipulator class implements an application that selects the
 * requested methods at program initialization, calling each necessary function.
 *
 * @author Vitor Emanuel
 * @version 1.0
 * @since 2022-12-01
 */
public class ArgsManipulator {

    private String key;
    private boolean option;
    private String fileIn;
    private String fileOut;

    private ZheCipherMain zcm;

    /**
     * This method is used to print to the standard output which options in the
     * program call are available.
     */
    private void use() {
        System.out.println("\t -[i|I]:\"input file name\" - Input file address\t");
        System.out.println("\t -[o|O]:\"output file name\" - Output file address\t");
        System.out.println("\t -[d|D] - Select decryption mode\t");
        System.out.println("\t -[e|E] - Select encryption mode\t");
        System.out.println("\t -[k|K]:\"encryption/decryption key\" - Select key\t");
    }

    private void getArgs() {
        use();
        Scanner in = new Scanner(System.in);
        fileIn = in.nextLine();
        fileOut = in.nextLine();
        option = in.nextBoolean();
        key = in.nextLine();
    }

    /**
     * This method is used to select the necessary options in the program call,
     * invoking the respective functions.
     *
     * @param args This is an array of type java. lang. String class that stores
     * java command line arguments
     */
    public void parseArgs(String[] args) {
        if (args.length < 2) {
            getArgs();
        }
        for (String arg : args) {

            if (arg.contains("-I:") || arg.contains("-i:")) {
                String[] argFileIn = arg.split(":");
                fileIn = argFileIn[1];
            } else if (arg.contains("-O:") || arg.contains("-o:")) {
                String[] argFileOut = arg.split(":");
                fileOut = argFileOut[1];
            } else if (arg.contains("-D") || arg.contains("-d")) {
                option = false;
            } else if (arg.contains("-E") || arg.contains("-e")) {
                option = true;
            } else if (arg.contains("-K:") || arg.contains("-k:")) {
                String[] argKey = arg.split(":");
                key = argKey[1];
            } else {
                use();
            }
        }

    }

    /**
     * This method returns the operation indicated in the program call, being
     * true for encryption and false for decryption.
     *
     * @return Boolean This is the result
     */
    public boolean getOption() {
        return this.option;
    }

    /**
     * This method performs the call of the encryption function passing all
     * necessary parameters.
     *
     * @throws java.io.IOException
     */
    public void encryptCase() throws IOException, InterruptedException, Exception {
        zcm = new ZheCipherMain(fileIn, fileOut, key, true);
    }

    /**
     * This method performs the call of the decryption function passing all
     * necessary parameters.
     *
     * @throws java.io.IOException
     */
    public void decryptCase() throws IOException, InterruptedException, Exception {
        zcm = new ZheCipherMain(fileIn, fileOut, key, false);
    }
}
