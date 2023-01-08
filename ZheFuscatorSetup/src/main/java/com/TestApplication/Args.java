/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TestApplication;

import com.ZheCipher.ZheCipherMain;
import java.io.IOException;

/**
 *
 * @author vitor
 */
public class Args {
    
  private String key;
  private boolean option;
  private String fileIn;
  private String fileOut;
  private String[] argms;
  
  private ZheCipherMain zcm;
  
  private void use(){
      System.out.println("\t -[i|I]:\"input file name\" - Input file address\t");
      System.out.println("\t -[o|O]:\"output file name\" - Output file address\t");
      System.out.println("\t -[d|D] - Select decryption mode\t");
      System.out.println("\t -[e|E] - Select encryption mode\t");
      System.out.println("\t -[k|K]:\"encryption/decryption key\" - Select key\t");
  }
  
  public void parseArgs(String[] args){
    for(String arg : args){
        
        if(arg.contains("-I:") || arg.contains("-i:")){
            String[] argFileIn = arg.split(":");
            fileIn = argFileIn[1];
        } else if (arg.contains("-O:") || arg.contains("-o:") ){
            String[] argFileOut = arg.split(":");
            fileOut = argFileOut[1];
        } else if (arg.contains("-D")  || arg.contains("-d")){
            option = false;
        } else if (arg.contains("-E") || arg.contains("-e")){
            option = true;
        } else if (arg.contains("-K:") || arg.contains("-k:")){
            String[] argKey = arg.split(":");
            key = argKey[1];
        } else{
            use();
        }
    } 
          
  }
  
  public boolean getOption(){
    return this.option;
  }
  
  public void encryptCase() throws IOException{
    zcm = new ZheCipherMain(fileIn, fileOut, key, true);
  }
  
  public void decryptCase() throws IOException{
    zcm = new ZheCipherMain(fileIn, fileOut, key, false);
  }
}
