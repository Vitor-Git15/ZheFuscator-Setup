package com.zhefuscator;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import javax.tools.*;
import org.antlr.v4.Tool;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.tool.Grammar;
import org.antlr.v4.tool.ast.GrammarRootAST;

import zhe.ParSy.Parser.ZheParser;
/**
 * <h1>LogInterface!</h1>
 *
 * The LogInterface serves as an intermediary between the information obtained
 * from the log and the grammar generated for obscuring sensitive texts. It
 * serves as a bridge to link the data from the log with the grammar rules used
 * to obfuscate the sensitive texts, allowing for effective and efficient
 * handling of sensitive data.
 *
 * @author Vitor Emanuel
 * @version 1.0
 * @since 2022-12-01
 */
public class LogInterface {

    private final ZheParser zheParser;
    private final String grammarPath;
    private ZheGrammarLexer lexer;
    private ZheGrammarParser parser;

    public LogInterface() {
        lexer = null;
        parser = null;
        this.grammarPath = "src/main/antlr4/com/zhefuscator/ZheGrammar.g4";
        zheParser = new ZheParser(" ", this.grammarPath);

    }

    public LogInterface(String grammarPath) {
        this.grammarPath = grammarPath;
        zheParser = new ZheParser(" ", this.grammarPath);

    }

    private void grammarUpdater(String text) throws IOException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String grammarName = "ZheGrammar";
        String sourcePath = "src/main/resources/antlr_classes/com/zhefuscator/";
        String sourcePath_ = "com.zhefuscator.";
        
        String[] args = {"-no-visitor", "-no-listener", "-o", sourcePath};
        Tool tool = new Tool(args);

        if (args.length == 0) {
            tool.help();
            tool.exit(0);
        }

        try {
            String updatedGrammar = new String(Files.readAllBytes(Paths.get(grammarPath)));
            System.out.println(updatedGrammar);
            GrammarRootAST ast = tool.parseGrammarFromString(updatedGrammar);
            Grammar g = tool.createGrammar(ast);
            tool.process(g, false);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, System.out, System.err, "-sourcepath", sourcePath, sourcePath + grammarName + "Lexer.java", sourcePath + grammarName + "Parser.java");
        
        if (result == 0) {
            try {
                CharStream cs = CharStreams.fromString(text);
                
                Class<?> lexerClass = Class.forName(sourcePath_ + grammarName + "Lexer");
                ClassLoader lexerClassLoader = lexerClass.getClassLoader();
                lexerClassLoader.loadClass(sourcePath_ + grammarName + "Lexer");
                Constructor lexerCTor = lexerClass.getConstructor(CharStream.class);
                lexer = (ZheGrammarLexer) lexerCTor.newInstance(cs);
                lexer.removeErrorListeners();
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                
                Class<?> parserClass = Class.forName(sourcePath_ + grammarName + "Parser");
                ClassLoader parserClassLoader = parserClass.getClassLoader();
                parserClassLoader.loadClass(sourcePath_ + grammarName + "Parser");
                Constructor parserCTor = parserClass.getConstructor(TokenStream.class);
                parser = (ZheGrammarParser) parserCTor.newInstance(tokens);
                
                Method entryPointMethod = parserClass.getMethod("r0");
                entryPointMethod.invoke(parser);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This method is responsible for obtaining the sensitive portions within
     * the passed text, based on the grammar taken as the standard.It performs
     * the task of identifying sensitive information within the text by
     * utilizing the grammar rules set as the standard, thus enabling the
     * effective and efficient handling of sensitive data.
     *
     * @param text This is a String representing the text to be analyzed.
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public void setSensitives(String text) throws IOException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException, IllegalArgumentException, NoSuchMethodException, Exception {
        if (true) {
            zheParser.update(text);
            grammarUpdater(text);
        }

        parser.setBuildParseTree(true);
        ParseTree tree = parser.r0();
        System.out.println(tree.toStringTree(parser));

        parser.removeErrorListeners();
        parser.r0();

        System.out.println(parser.getTokenTypeMap());
        System.out.println(parser.isSensitive);

        lexer.reset();
        Token t = null;

        while ((t = lexer.nextToken()).getType() != Token.EOF) {
            System.out.println("<" +
                               lexer.getVocabulary().getSymbolicName(t.getType()) + 
                               " = " +
                               t.getType() + 
                               ", " +
                               t.getText() +
                               ", " +
                               isStringSensitive(t.getType()) +
                               ">");
        }

    }

    /**
     * This method returns whether a given word in the text is sensitive or not,
     * returning true if it is sensitive and false otherwise. It examines the
     * word in question against the sensitive word list and returns a Boolean
     * value indicating whether the word is considered sensitive or not, thus
     * providing a means for identifying sensitive words within the text.
     *
     * @param word This is a String representing the word to be analyzed.
     * @return Boolean This returns true if the word is sensitive and false
     * otherwise.
     */
    public boolean isStringSensitive(int wordType) {
        
        return parser.isSensitive.getOrDefault(wordType, false);
    }
}
