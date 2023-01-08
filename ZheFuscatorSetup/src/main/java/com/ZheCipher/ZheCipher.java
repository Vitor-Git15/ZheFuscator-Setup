/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ZheCipher;

import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
/**
* <h1>ZheCipher!</h1>
* The ZheCipher program implements an application that
* encrypts or decrypts a text based on the AES method
*
* @author  Vitor Emanuel
* @version 1.0
* @since   2022-11-01
*/

public class ZheCipher{
  private final String ALGORITHM = "AES";
  private final String TRANSFORMATION = "AES";
  private String key;

  /** 
   * This is builder of ZheCipher class without argument. The key
   * used is taken from a standard file.
   * @param Nothing 
   */

  public ZheCipher() {
    try { 
      FileReader arq = new FileReader("Zhefuscator/Texts/key.txt");
      BufferedReader lerArq = new BufferedReader(arq);
      this.key = lerArq.readLine(); // 128 bit key

      arq.close();

    } catch (IOException e) {
      System.err.printf("Error opening file for reading: %s.\n",
          e.getMessage());
    }
  }
  /** 
   * This is builder of ZheCipher class with argument. The argument
   * is a key who is used to encrypt and decrypt the texts.
   * @param key This is the key to be used
   */
  public ZheCipher(String key) {
    this.key = key;
  }

  
  /** 
   * This method is used to convert a byte array to
   * StringBuilder.
   * @param outputBytes This is the byte array to be converted
   * @return StringBuilder This returns the converted byte array
   */
  private StringBuilder doStringBuilder(byte[] outputBytes){
    StringBuilder sb = new StringBuilder();
    for (byte b : outputBytes) {
        sb.append((char) b);
    }
    return sb;
  }

  
  /** 
   * This method is used to convert a String to
   * byte array.
   * @param str This is the String to be converted
   * @return byte[] This returns the converted String
   */
  private byte[] doByteBuilder(String str){
    byte[] bb = new byte[str.length()];
    for (int i = 0; i < str.length(); i++) {
      bb[i] = (byte) str.charAt(i);
                
    }
    return bb;
  }

  
  /** 
   * This method is used to decode a String from Base64
   * enconding.
   * @param text This is the String to be decoded
   * @return String This returns the decoded String
   */
  private String buildDecodeString(String text) {
      return new String(Base64.getDecoder().decode(text));
  }
  
  /** 
   * This method is used to encode a String to Base64
   * enconding.
   * @param inputBytes This is the String to be encoded
   * @return String This returns the encoded String
   */
  private String buildEncodeString(byte[] inputBytes) {
    String StringBuilder = doStringBuilder(inputBytes).toString();
    return Base64.getEncoder().encodeToString(StringBuilder.getBytes());
  }
  
  /** 
   * This method is used to encrypt a String based on 
   * the AES method.
   * @param text This is the String to be encrypted
   * @return String This returns the encrypted String
   */
  public String encrypt(String text){
    try {
      Key aesKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
      Cipher cipher = Cipher.getInstance(TRANSFORMATION);
      cipher.init(Cipher.ENCRYPT_MODE, aesKey);

      byte[] inputBytes = cipher.doFinal(text.getBytes());

      return buildEncodeString(inputBytes);
    }
    catch(InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e){
      return "#ERROR#";
    }
  }

  
  /** 
   * This method is used to decode a String based on
   * the AES method.
   * @param text This is the String to be decrypted
   * @return String This returns the decrypted String
   */
  public String decrypt(String text){
    try{

      Key aesKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
      Cipher cipher = Cipher.getInstance(TRANSFORMATION);
      cipher.init(Cipher.DECRYPT_MODE, aesKey);

      String buildString = buildDecodeString(text);

      byte[] outputBytes = new byte[buildString.length()];
      outputBytes = doByteBuilder(buildString);
      return new String(cipher.doFinal(outputBytes));
    }
    catch(InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e){
      return "#ERROR#";
    }
  }
}
