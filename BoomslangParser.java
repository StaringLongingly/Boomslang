// Generated from Boomslang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BoomslangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PROGRAM_END=2, BLOCK_CLOSE=3, IF_START=4, ELSE_START=5, WHILE_START=6, 
		FUNCTION_DECLARATION_START=7, FUNCTION_ARGUMENTS=8, FUNCTION_BODY_START=9, 
		FUNCTION_RETURN=10, PRINT_START=11, ASSIGN_START=12, ASSIGN_MIDDLE=13, 
		STRUNBER=14, BOOL=15, STRUNBER_COMPARISON=16, BOOL_COMPARISON=17, NEWLINE=18, 
		COMMA=19, NAME=20, PERIOD=21, SPACE=22;
	public static final int
		RULE_init = 0, RULE_program_piece = 1, RULE_if_block = 2, RULE_if_declaration = 3, 
		RULE_while_block = 4, RULE_while_declaration = 5, RULE_function_block = 6, 
		RULE_function_declaration = 7, RULE_arguments = 8, RULE_condition = 9, 
		RULE_statement = 10, RULE_print = 11, RULE_assign = 12, RULE_return = 13, 
		RULE_name = 14, RULE_value = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "program_piece", "if_block", "if_declaration", "while_block", 
			"while_declaration", "function_block", "function_declaration", "arguments", 
			"condition", "statement", "print", "assign", "return", "name", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' OF '", "'PLEASE LIKE AND SUBSCRIBE'", null, "'WHAT IF'", null, 
			"'STAY TUNED WHILE'", "'DISCOVER HOW TO '", "' WITH '", "'RUMOR HAS IT'", 
			null, "'YOU WON'T WANT TO MISS '", "'EXPERTS CLAIM '", "' TO BE '", null, 
			null, null, null, null, "','", null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PROGRAM_END", "BLOCK_CLOSE", "IF_START", "ELSE_START", "WHILE_START", 
			"FUNCTION_DECLARATION_START", "FUNCTION_ARGUMENTS", "FUNCTION_BODY_START", 
			"FUNCTION_RETURN", "PRINT_START", "ASSIGN_START", "ASSIGN_MIDDLE", "STRUNBER", 
			"BOOL", "STRUNBER_COMPARISON", "BOOL_COMPARISON", "NEWLINE", "COMMA", 
			"NAME", "PERIOD", "SPACE"
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
	public String getGrammarFileName() { return "Boomslang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BoomslangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public TerminalNode PROGRAM_END() { return getToken(BoomslangParser.PROGRAM_END, 0); }
		public List<Program_pieceContext> program_piece() {
			return getRuleContexts(Program_pieceContext.class);
		}
		public Program_pieceContext program_piece(int i) {
			return getRuleContext(Program_pieceContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(BoomslangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BoomslangParser.NEWLINE, i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				program_piece();
				setState(33);
				match(NEWLINE);
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7376L) != 0) );
			setState(39);
			match(PROGRAM_END);
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
	public static class Program_pieceContext extends ParserRuleContext {
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(BoomslangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BoomslangParser.NEWLINE, i);
		}
		public Program_pieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_piece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterProgram_piece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitProgram_piece(this);
		}
	}

	public final Program_pieceContext program_piece() throws RecognitionException {
		Program_pieceContext _localctx = new Program_pieceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_piece);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_START:
				{
				setState(41);
				if_block();
				}
				break;
			case WHILE_START:
				{
				setState(42);
				while_block();
				}
				break;
			case FUNCTION_DECLARATION_START:
				{
				setState(43);
				function_block();
				}
				break;
			case FUNCTION_RETURN:
			case PRINT_START:
			case ASSIGN_START:
				{
				setState(44);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(48); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(47);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(50); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class If_blockContext extends ParserRuleContext {
		public If_declarationContext if_declaration() {
			return getRuleContext(If_declarationContext.class,0);
		}
		public TerminalNode BLOCK_CLOSE() { return getToken(BoomslangParser.BLOCK_CLOSE, 0); }
		public List<Program_pieceContext> program_piece() {
			return getRuleContexts(Program_pieceContext.class);
		}
		public Program_pieceContext program_piece(int i) {
			return getRuleContext(Program_pieceContext.class,i);
		}
		public TerminalNode ELSE_START() { return getToken(BoomslangParser.ELSE_START, 0); }
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitIf_block(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			if_declaration();
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				program_piece();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7376L) != 0) );
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_START) {
				{
				setState(58);
				match(ELSE_START);
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(59);
					program_piece();
					}
					}
					setState(62); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7376L) != 0) );
				}
			}

			setState(66);
			match(BLOCK_CLOSE);
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
	public static class If_declarationContext extends ParserRuleContext {
		public TerminalNode IF_START() { return getToken(BoomslangParser.IF_START, 0); }
		public TerminalNode SPACE() { return getToken(BoomslangParser.SPACE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BoomslangParser.NEWLINE, 0); }
		public If_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterIf_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitIf_declaration(this);
		}
	}

	public final If_declarationContext if_declaration() throws RecognitionException {
		If_declarationContext _localctx = new If_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(IF_START);
			setState(69);
			match(SPACE);
			setState(70);
			condition(0);
			setState(71);
			match(NEWLINE);
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
	public static class While_blockContext extends ParserRuleContext {
		public While_declarationContext while_declaration() {
			return getRuleContext(While_declarationContext.class,0);
		}
		public TerminalNode BLOCK_CLOSE() { return getToken(BoomslangParser.BLOCK_CLOSE, 0); }
		public List<Program_pieceContext> program_piece() {
			return getRuleContexts(Program_pieceContext.class);
		}
		public Program_pieceContext program_piece(int i) {
			return getRuleContext(Program_pieceContext.class,i);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterWhile_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitWhile_block(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_while_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			while_declaration();
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				program_piece();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7376L) != 0) );
			setState(79);
			match(BLOCK_CLOSE);
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
	public static class While_declarationContext extends ParserRuleContext {
		public TerminalNode WHILE_START() { return getToken(BoomslangParser.WHILE_START, 0); }
		public TerminalNode SPACE() { return getToken(BoomslangParser.SPACE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BoomslangParser.NEWLINE, 0); }
		public While_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterWhile_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitWhile_declaration(this);
		}
	}

	public final While_declarationContext while_declaration() throws RecognitionException {
		While_declarationContext _localctx = new While_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(WHILE_START);
			setState(82);
			match(SPACE);
			setState(83);
			condition(0);
			setState(84);
			match(NEWLINE);
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
	public static class Function_blockContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public TerminalNode FUNCTION_BODY_START() { return getToken(BoomslangParser.FUNCTION_BODY_START, 0); }
		public TerminalNode NEWLINE() { return getToken(BoomslangParser.NEWLINE, 0); }
		public TerminalNode BLOCK_CLOSE() { return getToken(BoomslangParser.BLOCK_CLOSE, 0); }
		public List<Program_pieceContext> program_piece() {
			return getRuleContexts(Program_pieceContext.class);
		}
		public Program_pieceContext program_piece(int i) {
			return getRuleContext(Program_pieceContext.class,i);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitFunction_block(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			function_declaration();
			setState(87);
			match(FUNCTION_BODY_START);
			setState(88);
			match(NEWLINE);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				program_piece();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7376L) != 0) );
			setState(94);
			match(BLOCK_CLOSE);
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
	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION_DECLARATION_START() { return getToken(BoomslangParser.FUNCTION_DECLARATION_START, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BoomslangParser.NEWLINE, 0); }
		public TerminalNode FUNCTION_ARGUMENTS() { return getToken(BoomslangParser.FUNCTION_ARGUMENTS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(FUNCTION_DECLARATION_START);
			setState(97);
			name();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION_ARGUMENTS) {
				{
				setState(98);
				match(FUNCTION_ARGUMENTS);
				setState(99);
				arguments();
				}
			}

			setState(102);
			match(NEWLINE);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BoomslangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BoomslangParser.COMMA, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(BoomslangParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(BoomslangParser.SPACE, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			value();
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					match(COMMA);
					setState(106);
					match(SPACE);
					setState(107);
					value();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode STRUNBER_COMPARISON() { return getToken(BoomslangParser.STRUNBER_COMPARISON, 0); }
		public TerminalNode BOOL() { return getToken(BoomslangParser.BOOL, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode BOOL_COMPARISON() { return getToken(BoomslangParser.BOOL_COMPARISON, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUNBER:
			case NAME:
				{
				setState(114);
				value();
				setState(115);
				match(STRUNBER_COMPARISON);
				setState(116);
				value();
				}
				break;
			case BOOL:
				{
				setState(118);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(121);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(122);
					match(BOOL_COMPARISON);
					setState(123);
					condition(3);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				print();
				}
				break;
			case ASSIGN_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				assign();
				}
				break;
			case FUNCTION_RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				return_();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT_START() { return getToken(BoomslangParser.PRINT_START, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BoomslangParser.NEWLINE, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(PRINT_START);
			setState(135);
			value();
			setState(136);
			match(NEWLINE);
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN_START() { return getToken(BoomslangParser.ASSIGN_START, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN_MIDDLE() { return getToken(BoomslangParser.ASSIGN_MIDDLE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BoomslangParser.NEWLINE, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ASSIGN_START);
			setState(139);
			name();
			setState(140);
			match(ASSIGN_MIDDLE);
			setState(141);
			value();
			setState(142);
			match(NEWLINE);
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
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode FUNCTION_RETURN() { return getToken(BoomslangParser.FUNCTION_RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitReturn(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(FUNCTION_RETURN);
			setState(145);
			value();
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
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(BoomslangParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(NAME);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRUNBER() { return getToken(BoomslangParser.STRUNBER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(STRUNBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				name();
				setState(151);
				match(T__0);
				setState(152);
				arguments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				name();
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u009e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000$\b\u0000\u000b"+
		"\u0000\f\u0000%\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0004\u00011\b\u0001"+
		"\u000b\u0001\f\u00012\u0001\u0002\u0001\u0002\u0004\u00027\b\u0002\u000b"+
		"\u0002\f\u00028\u0001\u0002\u0001\u0002\u0004\u0002=\b\u0002\u000b\u0002"+
		"\f\u0002>\u0003\u0002A\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0004"+
		"\u0004L\b\u0004\u000b\u0004\f\u0004M\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0004\u0006[\b\u0006\u000b\u0006\f\u0006\\\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007e\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\bm\b\b\n\b\f\bp\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\tx\b\t\u0001\t\u0001\t\u0001\t\u0005\t}\b\t\n\t\f\t\u0080\t\t"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u0085\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u009c\b\u000f\u0001"+
		"\u000f\u0000\u0001\u0012\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000\u009f\u0000#\u0001"+
		"\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000"+
		"\u0000\u0006D\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nQ\u0001"+
		"\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000e`\u0001\u0000\u0000"+
		"\u0000\u0010h\u0001\u0000\u0000\u0000\u0012w\u0001\u0000\u0000\u0000\u0014"+
		"\u0084\u0001\u0000\u0000\u0000\u0016\u0086\u0001\u0000\u0000\u0000\u0018"+
		"\u008a\u0001\u0000\u0000\u0000\u001a\u0090\u0001\u0000\u0000\u0000\u001c"+
		"\u0093\u0001\u0000\u0000\u0000\u001e\u009b\u0001\u0000\u0000\u0000 !\u0003"+
		"\u0002\u0001\u0000!\"\u0005\u0012\u0000\u0000\"$\u0001\u0000\u0000\u0000"+
		"# \u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0005\u0002"+
		"\u0000\u0000(\u0001\u0001\u0000\u0000\u0000).\u0003\u0004\u0002\u0000"+
		"*.\u0003\b\u0004\u0000+.\u0003\f\u0006\u0000,.\u0003\u0014\n\u0000-)\u0001"+
		"\u0000\u0000\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-,\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/1\u0005\u0012\u0000"+
		"\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u00003\u0003\u0001\u0000\u0000\u0000"+
		"46\u0003\u0006\u0003\u000057\u0003\u0002\u0001\u000065\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009@\u0001\u0000\u0000\u0000:<\u0005\u0005\u0000\u0000;=\u0003"+
		"\u0002\u0001\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000"+
		"\u0000@:\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000BC\u0005\u0003\u0000\u0000C\u0005\u0001\u0000\u0000\u0000"+
		"DE\u0005\u0004\u0000\u0000EF\u0005\u0016\u0000\u0000FG\u0003\u0012\t\u0000"+
		"GH\u0005\u0012\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IK\u0003\n\u0005"+
		"\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OP\u0005\u0003\u0000\u0000P\t\u0001\u0000\u0000\u0000"+
		"QR\u0005\u0006\u0000\u0000RS\u0005\u0016\u0000\u0000ST\u0003\u0012\t\u0000"+
		"TU\u0005\u0012\u0000\u0000U\u000b\u0001\u0000\u0000\u0000VW\u0003\u000e"+
		"\u0007\u0000WX\u0005\t\u0000\u0000XZ\u0005\u0012\u0000\u0000Y[\u0003\u0002"+
		"\u0001\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^_\u0005\u0003\u0000\u0000_\r\u0001\u0000\u0000\u0000`a\u0005\u0007\u0000"+
		"\u0000ad\u0003\u001c\u000e\u0000bc\u0005\b\u0000\u0000ce\u0003\u0010\b"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0012\u0000\u0000g\u000f\u0001\u0000\u0000\u0000"+
		"hn\u0003\u001e\u000f\u0000ij\u0005\u0013\u0000\u0000jk\u0005\u0016\u0000"+
		"\u0000km\u0003\u001e\u000f\u0000li\u0001\u0000\u0000\u0000mp\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0011"+
		"\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0006\t\uffff\uffff"+
		"\u0000rs\u0003\u001e\u000f\u0000st\u0005\u0010\u0000\u0000tu\u0003\u001e"+
		"\u000f\u0000ux\u0001\u0000\u0000\u0000vx\u0005\u000f\u0000\u0000wq\u0001"+
		"\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x~\u0001\u0000\u0000\u0000"+
		"yz\n\u0002\u0000\u0000z{\u0005\u0011\u0000\u0000{}\u0003\u0012\t\u0003"+
		"|y\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0013\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0085\u0003\u0016\u000b\u0000"+
		"\u0082\u0085\u0003\u0018\f\u0000\u0083\u0085\u0003\u001a\r\u0000\u0084"+
		"\u0081\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0015\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005\u000b\u0000\u0000\u0087\u0088\u0003\u001e\u000f\u0000\u0088"+
		"\u0089\u0005\u0012\u0000\u0000\u0089\u0017\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005\f\u0000\u0000\u008b\u008c\u0003\u001c\u000e\u0000\u008c\u008d"+
		"\u0005\r\u0000\u0000\u008d\u008e\u0003\u001e\u000f\u0000\u008e\u008f\u0005"+
		"\u0012\u0000\u0000\u008f\u0019\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"\n\u0000\u0000\u0091\u0092\u0003\u001e\u000f\u0000\u0092\u001b\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005\u0014\u0000\u0000\u0094\u001d\u0001\u0000"+
		"\u0000\u0000\u0095\u009c\u0005\u000e\u0000\u0000\u0096\u0097\u0003\u001c"+
		"\u000e\u0000\u0097\u0098\u0005\u0001\u0000\u0000\u0098\u0099\u0003\u0010"+
		"\b\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u009c\u0003\u001c\u000e"+
		"\u0000\u009b\u0095\u0001\u0000\u0000\u0000\u009b\u0096\u0001\u0000\u0000"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u001f\u0001\u0000\u0000"+
		"\u0000\u000e%-28>@M\\dnw~\u0084\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}