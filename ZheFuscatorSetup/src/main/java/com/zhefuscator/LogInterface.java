/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zhefuscator;

import java.io.IOException;
import java.util.Map;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATN;

/**
 *
 * @author vitor
 */
public class LogInterface {
    Map<String, Boolean> sensitive;
    
    public void setSenstives(String text) throws IOException{
        CharStream cs = CharStreams.fromString(text);
        ObfuscatorGrammarLexer lexer = new ObfuscatorGrammarLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ObfuscatorGrammarParser parser = new ObfuscatorGrammarParser(tokens);
        
        ObfuscatorGrammarParser.R0Context ctx = parser.r0();
        
        lexer.removeErrorListeners();
        
        sensitive = parser.sensitive;
    }
    
    public boolean isStringSensitive(String str){
        if(sensitive.containsKey(str)){
            return sensitive.get(str);
        }
        
        return false;
    }
}
