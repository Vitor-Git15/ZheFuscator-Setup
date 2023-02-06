package com.TestApplication;

import java.io.IOException;

/**
* <h1>Main!</h1>
* The Main program implements an application that
* encrypts or decrypts a text based on the AES method
*
* @author  Vitor Emanuel
* @version 1.0
* @since   2022-11-01
*/
public class Main { 
  
  private static final boolean ENCRYPT_MODE = true;
  private static final boolean DECRYPT_MODE = false;

    /**
     * The main function of the encryption/decryption based on the used grammar
     * @param args
     * @throws java.io.IOException
     */
  public static void main(String[] args) throws IOException, InterruptedException, Exception {
      
    ArgsManipulator arg = new ArgsManipulator();
    arg.parseArgs(args);
    
    if(arg.getOption() == ENCRYPT_MODE){
        arg.encryptCase();
    } else if (arg.getOption() == DECRYPT_MODE){
        arg.decryptCase();
    }
  }
}