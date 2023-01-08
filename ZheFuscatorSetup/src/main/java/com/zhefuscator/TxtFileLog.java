/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zhefuscator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author vitor
 */
public class TxtFileLog {
    
  private FileReader arq;
  private BufferedReader inFile;
  private BufferedWriter outFile;
    
  public TxtFileLog(String fileIn, String fileOut){
      openInFile(fileIn);
      openOutFile(fileOut);
  }
  
  public TxtFileLog(){
  }
  
  private void openInFile(String fileName){
    try {
        
      arq = new FileReader(fileName);
      inFile = new BufferedReader(arq);
    } catch (IOException e) {}
    
  }
  
  private void openOutFile(String fileName){
    try {
        
      OutputStream os = new FileOutputStream(
          fileName);
      Writer wr = new OutputStreamWriter(os);
      outFile = new BufferedWriter(wr);
      
    } catch (IOException e) {}
  }
  
  public String read(){
      try{
        return inFile.readLine();
      } catch (IOException e) {
        return null;
      }
  }
  
  public void write(String string){
      try{
        outFile.write(string);
      } catch (IOException e) {
      }
  }
  
  public void newLine(){
      write("\n");
  }
  
  private void closeInFile(){
    try{
      inFile.close();
    } catch (IOException e) {
    }  
      
  }
  
  private void closeOutFile(){
    try{
      outFile.close();
    } catch (IOException e) {
    }  
  }
  
  public void closeFiles(){
    closeInFile();
    closeOutFile();
  }
  
}
