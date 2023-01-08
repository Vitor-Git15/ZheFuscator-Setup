/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TestApplication;

import java.io.IOException;

/**
 *
 * @author vitor
 */
public class Main { 
  
  private static final boolean ENCRYPT_MODE = true;
  private static final boolean DECRYPT_MODE = false;

    /**
     *
     * @param args
     * @throws IOException
     */
  public static void main(String[] args) throws IOException {
      
    Args arg = new Args();
    arg.parseArgs(args);
    
    if(arg.getOption() == ENCRYPT_MODE){
        arg.encryptCase();
    } else if (arg.getOption() == DECRYPT_MODE){
        arg.decryptCase();
    }
  }
}
