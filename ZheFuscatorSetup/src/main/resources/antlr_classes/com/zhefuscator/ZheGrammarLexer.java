// Generated from java-escape by ANTLR 4.11.1
package com.zhefuscator;

	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ZheGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN0=1, TOKEN1=2, TOKEN2=3, TOKEN3=4, TOKEN4=5, TOKEN5=6, TOKEN6=7, 
		WHITESPACE=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TOKEN0", "TOKEN1", "TOKEN2", "TOKEN3", "TOKEN4", "TOKEN5", "TOKEN6", 
			"WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOKEN0", "TOKEN1", "TOKEN2", "TOKEN3", "TOKEN4", "TOKEN5", "TOKEN6", 
			"WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


		Map<Integer, Boolean> isSensitive = new HashMap<Integer, Boolean>();


	public ZheGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ZheGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\b`\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0000\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0001\u0000\u0012\u0001"+
		"\u0000zz\u0001\u0000hh\u0001\u0000ee\u0001\u0000ff\u0001\u0000uu\u0001"+
		"\u0000ss\u0001\u0000cc\u0001\u0000aa\u0001\u0000tt\u0001\u0000oo\u0001"+
		"\u0000rr\u0001\u000011\u0001\u000033\u0001\u0000..\u0001\u000022\u0001"+
		"\u0000ii\u0001\u0000vv\u0001\u0000dd_\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u0003\u001d"+
		"\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u00075\u0001\u0000"+
		"\u0000\u0000\t:\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000"+
		"\rP\u0001\u0000\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0007\u0000\u0000\u0000\u0012\u0013\u0007\u0001\u0000\u0000\u0013\u0014"+
		"\u0007\u0002\u0000\u0000\u0014\u0015\u0007\u0003\u0000\u0000\u0015\u0016"+
		"\u0007\u0004\u0000\u0000\u0016\u0017\u0007\u0005\u0000\u0000\u0017\u0018"+
		"\u0007\u0006\u0000\u0000\u0018\u0019\u0007\u0007\u0000\u0000\u0019\u001a"+
		"\u0007\b\u0000\u0000\u001a\u001b\u0007\t\u0000\u0000\u001b\u001c\u0007"+
		"\n\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0007\u000b"+
		"\u0000\u0000\u001e\u001f\u0007\f\u0000\u0000\u001f \u0007\r\u0000\u0000"+
		" !\u0007\u000b\u0000\u0000!\"\u0007\u000e\u0000\u0000\"#\u0007\f\u0000"+
		"\u0000#$\u0007\r\u0000\u0000$%\u0007\u000b\u0000\u0000%&\u0007\u000e\u0000"+
		"\u0000&\'\u0007\f\u0000\u0000\'(\u0007\r\u0000\u0000()\u0007\u000b\u0000"+
		"\u0000)*\u0007\u000e\u0000\u0000*+\u0007\f\u0000\u0000+\u0004\u0001\u0000"+
		"\u0000\u0000,-\u0007\n\u0000\u0000-.\u0007\u0002\u0000\u0000./\u0007\u0006"+
		"\u0000\u0000/0\u0007\u0002\u0000\u000001\u0007\u000f\u0000\u000012\u0007"+
		"\u0010\u0000\u000023\u0007\u0002\u0000\u000034\u0007\u0011\u0000\u0000"+
		"4\u0006\u0001\u0000\u0000\u000056\u0007\u0001\u0000\u000067\u0007\t\u0000"+
		"\u000078\u0007\u0005\u0000\u000089\u0007\b\u0000\u00009\b\u0001\u0000"+
		"\u0000\u0000:;\u0007\u000b\u0000\u0000;<\u0007\u000e\u0000\u0000<=\u0007"+
		"\f\u0000\u0000=>\u0007\r\u0000\u0000>?\u0007\u000b\u0000\u0000?@\u0007"+
		"\u000e\u0000\u0000@A\u0007\f\u0000\u0000AB\u0007\r\u0000\u0000BC\u0007"+
		"\u000b\u0000\u0000CD\u0007\u000e\u0000\u0000DE\u0007\f\u0000\u0000EF\u0007"+
		"\r\u0000\u0000FG\u0007\u000b\u0000\u0000GH\u0007\u000e\u0000\u0000HI\u0007"+
		"\f\u0000\u0000I\n\u0001\u0000\u0000\u0000JK\u0007\u0001\u0000\u0000KL"+
		"\u0007\t\u0000\u0000LM\u0007\u0005\u0000\u0000MN\u0007\b\u0000\u0000N"+
		"O\u0007\u0005\u0000\u0000O\f\u0001\u0000\u0000\u0000PQ\u0007\u000b\u0000"+
		"\u0000QR\u0007\u000b\u0000\u0000RS\u0007\r\u0000\u0000ST\u0007\u000b\u0000"+
		"\u0000TU\u0007\u000b\u0000\u0000UV\u0007\r\u0000\u0000VW\u0007\u000b\u0000"+
		"\u0000WX\u0007\u000b\u0000\u0000XY\u0007\r\u0000\u0000YZ\u0007\u000b\u0000"+
		"\u0000Z[\u0007\u000b\u0000\u0000[\u000e\u0001\u0000\u0000\u0000\\]\u0005"+
		" \u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0006\u0007\u0000\u0000_\u0010"+
		"\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}