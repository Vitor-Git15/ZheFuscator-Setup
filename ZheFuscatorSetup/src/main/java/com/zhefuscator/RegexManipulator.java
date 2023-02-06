/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zhefuscator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
* <h1>ManipulateRegex!</h1>
* The ManipulateRegex program implements an application that
* do specific operations on string using regex
* @author  Vitor Emanuel
* @version 1.0
* @since   2022-11-01
*/
public class RegexManipulator{
  /** 
   * This method is used to get a specific group 
   * of string patterns
   * @param str This is the string to be analyzed
   * @param stringPattern This is the string pattern
   * @param group This is the group to get
   * @return String This is the group obtained
   */
  public String getGroup(String str, String stringPattern, int group){
    Pattern pattern = Pattern.compile(stringPattern);
    Matcher matcher = pattern.matcher(str);
    matcher.find();
    return matcher.group(group);
  }

  
  /** 
   * This method is used to check if a string matches
   * of a regular expression
   * @param s This is the string to be analyzed
   * @param regex This is the regular expression
   * @return Boolean This is the result
   */
  public boolean checkString(String s, String regex) {
    return s.matches(regex);
  }
}
