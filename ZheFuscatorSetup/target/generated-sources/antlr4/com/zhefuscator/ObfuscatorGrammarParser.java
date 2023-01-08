// Generated from java-escape by ANTLR 4.11.1
package com.zhefuscator;

	import java.util.Map;
	import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ObfuscatorGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN0=1, TOKEN1=2, TOKEN2=3, WHITESPACE=4;
	public static final int
		RULE_r0 = 0, RULE_r1 = 1, RULE_r2 = 2, RULE_r3 = 3, RULE_r4 = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"r0", "r1", "r2", "r3", "r4"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOKEN0", "TOKEN1", "TOKEN2", "WHITESPACE"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Boolean> sensitive = new HashMap<String, Boolean>();

	public ObfuscatorGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class R0Context extends ParserRuleContext {
		public R1Context r1() {
			return getRuleContext(R1Context.class,0);
		}
		public R2Context r2() {
			return getRuleContext(R2Context.class,0);
		}
		public R0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfuscatorGrammarListener ) ((ObfuscatorGrammarListener)listener).enterR0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfuscatorGrammarListener ) ((ObfuscatorGrammarListener)listener).exitR0(this);
		}
	}

	public final R0Context r0() throws RecognitionException {
		R0Context _localctx = new R0Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_r0);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			r1();
			setState(11);
			r2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class R1Context extends ParserRuleContext {
		public Token TOKEN0;
		public TerminalNode TOKEN0() { return getToken(ObfuscatorGrammarParser.TOKEN0, 0); }
		public R1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfuscatorGrammarListener ) ((ObfuscatorGrammarListener)listener).enterR1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfuscatorGrammarListener ) ((ObfuscatorGrammarListener)listener).exitR1(this);
		}
	}

	public final R1Context r1() throws RecognitionException {
		R1Context _localctx = new R1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_r1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			((R1Context)_localctx).TOKEN0 = match(TOKEN0);
			sensitive.put((((R1Context)_localctx).TOKEN0!=null?((R1Context)_localctx).TOKEN0.getText():null), false); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class R2Context extends ParserRuleContext {
		public R3Context r3() {
			return getRuleContext(R3Context.class,0);
		}
		public R4Context r4() {
			return getRuleContext(R4Context.class,0);
		}
		public R2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfuscatorGrammarListener ) ((ObfuscatorGrammarListener)listener).enterR2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfuscatorGrammarListener ) ((ObfuscatorGrammarListener)listener).exitR2(this);
		}
	}

	public final R2Context r2() throws RecognitionException {
		R2Context _localctx = new R2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_r2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			r3();
			setState(17);
			r4();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class R3Context extends ParserRuleContext {
		public Token TOKEN1;
		public TerminalNode TOKEN1() { return getToken(ObfuscatorGrammarParser.TOKEN1, 0); }
		public R3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfuscatorGrammarListener ) ((ObfuscatorGrammarListener)listener).enterR3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfuscatorGrammarListener ) ((ObfuscatorGrammarListener)listener).exitR3(this);
		}
	}

	public final R3Context r3() throws RecognitionException {
		R3Context _localctx = new R3Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_r3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			((R3Context)_localctx).TOKEN1 = match(TOKEN1);
			sensitive.put((((R3Context)_localctx).TOKEN1!=null?((R3Context)_localctx).TOKEN1.getText():null), false); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class R4Context extends ParserRuleContext {
		public Token TOKEN2;
		public TerminalNode TOKEN2() { return getToken(ObfuscatorGrammarParser.TOKEN2, 0); }
		public R4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObfuscatorGrammarListener ) ((ObfuscatorGrammarListener)listener).enterR4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObfuscatorGrammarListener ) ((ObfuscatorGrammarListener)listener).exitR4(this);
		}
	}

	public final R4Context r4() throws RecognitionException {
		R4Context _localctx = new R4Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_r4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((R4Context)_localctx).TOKEN2 = match(TOKEN2);
			sensitive.put((((R4Context)_localctx).TOKEN2!=null?((R4Context)_localctx).TOKEN2.getText():null), true); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0004\u001a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u0000\u0014\u0000\n\u0001\u0000\u0000\u0000"+
		"\u0002\r\u0001\u0000\u0000\u0000\u0004\u0010\u0001\u0000\u0000\u0000\u0006"+
		"\u0013\u0001\u0000\u0000\u0000\b\u0016\u0001\u0000\u0000\u0000\n\u000b"+
		"\u0003\u0002\u0001\u0000\u000b\f\u0003\u0004\u0002\u0000\f\u0001\u0001"+
		"\u0000\u0000\u0000\r\u000e\u0005\u0001\u0000\u0000\u000e\u000f\u0006\u0001"+
		"\uffff\uffff\u0000\u000f\u0003\u0001\u0000\u0000\u0000\u0010\u0011\u0003"+
		"\u0006\u0003\u0000\u0011\u0012\u0003\b\u0004\u0000\u0012\u0005\u0001\u0000"+
		"\u0000\u0000\u0013\u0014\u0005\u0002\u0000\u0000\u0014\u0015\u0006\u0003"+
		"\uffff\uffff\u0000\u0015\u0007\u0001\u0000\u0000\u0000\u0016\u0017\u0005"+
		"\u0003\u0000\u0000\u0017\u0018\u0006\u0004\uffff\uffff\u0000\u0018\t\u0001"+
		"\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}