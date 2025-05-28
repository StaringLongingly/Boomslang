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
		T__0=1, PROGRAM_END=2, BLOCK_OPEN=3, BLOCK_CLOSE=4, IF_START=5, ELSE_START=6, 
		WHILE_START=7, FUNCTION_DECLARATION_START=8, FUNCTION_ARGUMENTS=9, FUNCTION_RETURN=10, 
		SCAN_START=11, PRINT_START=12, ASSIGN_START=13, ASSIGN_MIDDLE=14, STRUNBER=15, 
		NUMBER=16, BOOL=17, STRUNBER_COMPARISON=18, OP=19, BOOL_COMPARISON=20, 
		NEWLINE=21, COMMA=22, NAME=23, PERIOD=24, SPACES=25, SPACE=26, COMMENT=27;
	public static final int
		RULE_init = 0, RULE_program_piece = 1, RULE_if_block = 2, RULE_if_mult = 3, 
		RULE_if_single = 4, RULE_else_block = 5, RULE_else_mult = 6, RULE_else_single = 7, 
		RULE_if_declaration = 8, RULE_while_block = 9, RULE_while_declaration = 10, 
		RULE_function_block = 11, RULE_function_declaration = 12, RULE_arguments = 13, 
		RULE_condition = 14, RULE_statement = 15, RULE_print = 16, RULE_assign = 17, 
		RULE_return = 18, RULE_scan = 19, RULE_comment = 20, RULE_name = 21, RULE_value = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "program_piece", "if_block", "if_mult", "if_single", "else_block", 
			"else_mult", "else_single", "if_declaration", "while_block", "while_declaration", 
			"function_block", "function_declaration", "arguments", "condition", "statement", 
			"print", "assign", "return", "scan", "comment", "name", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' OF '", "'PLEASE LIKE AND SUBSCRIBE'", null, null, "'WHAT IF'", 
			"'LIES!'", "'STAY TUNED WHILE'", "'DISCOVER HOW TO '", "' WITH '", null, 
			"'LATEST NEWS ON'", "'YOU WON'T WANT TO MISS '", "'EXPERTS CLAIM '", 
			"' TO BE'", null, null, null, null, null, null, null, "','", null, "'.'", 
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PROGRAM_END", "BLOCK_OPEN", "BLOCK_CLOSE", "IF_START", "ELSE_START", 
			"WHILE_START", "FUNCTION_DECLARATION_START", "FUNCTION_ARGUMENTS", "FUNCTION_RETURN", 
			"SCAN_START", "PRINT_START", "ASSIGN_START", "ASSIGN_MIDDLE", "STRUNBER", 
			"NUMBER", "BOOL", "STRUNBER_COMPARISON", "OP", "BOOL_COMPARISON", "NEWLINE", 
			"COMMA", "NAME", "PERIOD", "SPACES", "SPACE", "COMMENT"
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
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				program_piece();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 134231456L) != 0) );
			setState(51);
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				{
				setState(53);
				comment();
				}
				break;
			case IF_START:
				{
				setState(54);
				if_block();
				}
				break;
			case WHILE_START:
				{
				setState(55);
				while_block();
				}
				break;
			case FUNCTION_DECLARATION_START:
				{
				setState(56);
				function_block();
				}
				break;
			case FUNCTION_RETURN:
			case PRINT_START:
			case ASSIGN_START:
				{
				setState(57);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					match(NEWLINE);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class If_blockContext extends ParserRuleContext {
		public If_declarationContext if_declaration() {
			return getRuleContext(If_declarationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BoomslangParser.NEWLINE, 0); }
		public TerminalNode SPACES() { return getToken(BoomslangParser.SPACES, 0); }
		public If_singleContext if_single() {
			return getRuleContext(If_singleContext.class,0);
		}
		public If_multContext if_mult() {
			return getRuleContext(If_multContext.class,0);
		}
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
			setState(66);
			if_declaration();
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SPACES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_START:
			case WHILE_START:
			case FUNCTION_DECLARATION_START:
			case FUNCTION_RETURN:
			case PRINT_START:
			case ASSIGN_START:
			case COMMENT:
				{
				setState(68);
				if_single();
				}
				break;
			case BLOCK_OPEN:
				{
				setState(69);
				if_mult();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class If_multContext extends ParserRuleContext {
		public TerminalNode BLOCK_OPEN() { return getToken(BoomslangParser.BLOCK_OPEN, 0); }
		public List<TerminalNode> BLOCK_CLOSE() { return getTokens(BoomslangParser.BLOCK_CLOSE); }
		public TerminalNode BLOCK_CLOSE(int i) {
			return getToken(BoomslangParser.BLOCK_CLOSE, i);
		}
		public TerminalNode NEWLINE() { return getToken(BoomslangParser.NEWLINE, 0); }
		public TerminalNode SPACES() { return getToken(BoomslangParser.SPACES, 0); }
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public List<Program_pieceContext> program_piece() {
			return getRuleContexts(Program_pieceContext.class);
		}
		public Program_pieceContext program_piece(int i) {
			return getRuleContext(Program_pieceContext.class,i);
		}
		public If_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterIf_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitIf_mult(this);
		}
	}

	public final If_multContext if_mult() throws RecognitionException {
		If_multContext _localctx = new If_multContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(BLOCK_OPEN);
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SPACES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 134231456L) != 0) );
			setState(79);
			match(BLOCK_CLOSE);
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE_START:
				{
				setState(80);
				else_block();
				}
				break;
			case BLOCK_CLOSE:
				{
				setState(81);
				match(BLOCK_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class If_singleContext extends ParserRuleContext {
		public Program_pieceContext program_piece() {
			return getRuleContext(Program_pieceContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterIf_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitIf_single(this);
		}
	}

	public final If_singleContext if_single() throws RecognitionException {
		If_singleContext _localctx = new If_singleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_single);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			program_piece();
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(85);
				else_block();
				}
				break;
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
	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE_START() { return getToken(BoomslangParser.ELSE_START, 0); }
		public TerminalNode NEWLINE() { return getToken(BoomslangParser.NEWLINE, 0); }
		public TerminalNode SPACES() { return getToken(BoomslangParser.SPACES, 0); }
		public Else_singleContext else_single() {
			return getRuleContext(Else_singleContext.class,0);
		}
		public Else_multContext else_mult() {
			return getRuleContext(Else_multContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitElse_block(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ELSE_START);
			setState(89);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SPACES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_START:
			case WHILE_START:
			case FUNCTION_DECLARATION_START:
			case FUNCTION_RETURN:
			case PRINT_START:
			case ASSIGN_START:
			case COMMENT:
				{
				setState(90);
				else_single();
				}
				break;
			case BLOCK_OPEN:
				{
				setState(91);
				else_mult();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Else_multContext extends ParserRuleContext {
		public TerminalNode BLOCK_OPEN() { return getToken(BoomslangParser.BLOCK_OPEN, 0); }
		public TerminalNode BLOCK_CLOSE() { return getToken(BoomslangParser.BLOCK_CLOSE, 0); }
		public TerminalNode NEWLINE() { return getToken(BoomslangParser.NEWLINE, 0); }
		public TerminalNode SPACES() { return getToken(BoomslangParser.SPACES, 0); }
		public List<Program_pieceContext> program_piece() {
			return getRuleContexts(Program_pieceContext.class);
		}
		public Program_pieceContext program_piece(int i) {
			return getRuleContext(Program_pieceContext.class,i);
		}
		public Else_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterElse_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitElse_mult(this);
		}
	}

	public final Else_multContext else_mult() throws RecognitionException {
		Else_multContext _localctx = new Else_multContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_else_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(BLOCK_OPEN);
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SPACES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				program_piece();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 134231456L) != 0) );
			setState(101);
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
	public static class Else_singleContext extends ParserRuleContext {
		public Program_pieceContext program_piece() {
			return getRuleContext(Program_pieceContext.class,0);
		}
		public Else_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterElse_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitElse_single(this);
		}
	}

	public final Else_singleContext else_single() throws RecognitionException {
		Else_singleContext _localctx = new Else_singleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_single);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			program_piece();
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
		public TerminalNode SPACES() { return getToken(BoomslangParser.SPACES, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_if_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IF_START);
			setState(106);
			match(SPACES);
			setState(107);
			condition(0);
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
		enterRule(_localctx, 18, RULE_while_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			while_declaration();
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				program_piece();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 134231456L) != 0) );
			setState(115);
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
		public TerminalNode SPACES() { return getToken(BoomslangParser.SPACES, 0); }
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
		enterRule(_localctx, 20, RULE_while_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(WHILE_START);
			setState(118);
			match(SPACES);
			setState(119);
			condition(0);
			setState(120);
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
		public TerminalNode BLOCK_OPEN() { return getToken(BoomslangParser.BLOCK_OPEN, 0); }
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
		enterRule(_localctx, 22, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			function_declaration();
			setState(123);
			match(BLOCK_OPEN);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				program_piece();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 134231456L) != 0) );
			setState(129);
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
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
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
		enterRule(_localctx, 24, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(FUNCTION_DECLARATION_START);
			setState(132);
			name();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION_ARGUMENTS) {
				{
				setState(133);
				match(FUNCTION_ARGUMENTS);
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					arguments();
					}
					}
					setState(137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8423424L) != 0) );
				}
			}

			setState(141);
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
		public List<TerminalNode> SPACES() { return getTokens(BoomslangParser.SPACES); }
		public TerminalNode SPACES(int i) {
			return getToken(BoomslangParser.SPACES, i);
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
		enterRule(_localctx, 26, RULE_arguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			value(0);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					match(COMMA);
					setState(145);
					match(SPACES);
					setState(146);
					value(0);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAN_START:
			case STRUNBER:
			case NAME:
				{
				setState(153);
				value(0);
				setState(154);
				match(STRUNBER_COMPARISON);
				setState(155);
				value(0);
				}
				break;
			case BOOL:
				{
				setState(157);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(160);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(161);
					match(BOOL_COMPARISON);
					setState(162);
					condition(3);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				print();
				}
				break;
			case ASSIGN_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				assign();
				}
				break;
			case FUNCTION_RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
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
		enterRule(_localctx, 32, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(PRINT_START);
			setState(174);
			value(0);
			setState(175);
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
		public List<TerminalNode> NEWLINE() { return getTokens(BoomslangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BoomslangParser.NEWLINE, i);
		}
		public TerminalNode SPACES() { return getToken(BoomslangParser.SPACES, 0); }
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
		enterRule(_localctx, 34, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ASSIGN_START);
			setState(178);
			name();
			setState(179);
			match(ASSIGN_MIDDLE);
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SPACES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(181);
			value(0);
			setState(182);
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
		public TerminalNode NEWLINE() { return getToken(BoomslangParser.NEWLINE, 0); }
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
		enterRule(_localctx, 36, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(FUNCTION_RETURN);
			setState(185);
			value(0);
			setState(186);
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
	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCAN_START() { return getToken(BoomslangParser.SCAN_START, 0); }
		public TerminalNode SPACES() { return getToken(BoomslangParser.SPACES, 0); }
		public TerminalNode STRUNBER() { return getToken(BoomslangParser.STRUNBER, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitScan(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(SCAN_START);
			setState(189);
			match(SPACES);
			setState(190);
			match(STRUNBER);
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(BoomslangParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(COMMENT);
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
		enterRule(_localctx, 42, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode OP() { return getToken(BoomslangParser.OP, 0); }
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
		return value(0);
	}

	private ValueContext value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueContext _localctx = new ValueContext(_ctx, _parentState);
		ValueContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_value, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(197);
				match(STRUNBER);
				}
				break;
			case 2:
				{
				setState(198);
				name();
				setState(199);
				match(T__0);
				setState(200);
				arguments();
				}
				break;
			case 3:
				{
				setState(202);
				scan();
				}
				break;
			case 4:
				{
				setState(203);
				name();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_value);
					setState(206);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(207);
					match(OP);
					setState(208);
					value(5);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 22:
			return value_sempred((ValueContext)_localctx, predIndex);
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
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u00d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0004\u00000\b\u0000\u000b"+
		"\u0000\f\u00001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0001\u0005"+
		"\u0001>\b\u0001\n\u0001\f\u0001A\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002G\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003L\b\u0003\u000b\u0003\f\u0003M\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003S\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"W\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"]\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006b\b\u0006\u000b"+
		"\u0006\f\u0006c\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004\tp\b\t\u000b\t\f\tq\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b~\b\u000b\u000b\u000b\f\u000b\u007f\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0088\b\f\u000b\f"+
		"\f\f\u0089\u0003\f\u008c\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u0094\b\r\n\r\f\r\u0097\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009f\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00a4\b\u000e\n\u000e\f\u000e\u00a7"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ac\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u00cd\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u00d2\b\u0016\n\u0016\f\u0016\u00d5\t\u0016\u0001\u0016\u0000"+
		"\u0002\u001c,\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0001\u0002\u0000\u0015\u0015"+
		"\u0019\u0019\u00d8\u0000/\u0001\u0000\u0000\u0000\u0002:\u0001\u0000\u0000"+
		"\u0000\u0004B\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\b"+
		"T\u0001\u0000\u0000\u0000\nX\u0001\u0000\u0000\u0000\f^\u0001\u0000\u0000"+
		"\u0000\u000eg\u0001\u0000\u0000\u0000\u0010i\u0001\u0000\u0000\u0000\u0012"+
		"m\u0001\u0000\u0000\u0000\u0014u\u0001\u0000\u0000\u0000\u0016z\u0001"+
		"\u0000\u0000\u0000\u0018\u0083\u0001\u0000\u0000\u0000\u001a\u008f\u0001"+
		"\u0000\u0000\u0000\u001c\u009e\u0001\u0000\u0000\u0000\u001e\u00ab\u0001"+
		"\u0000\u0000\u0000 \u00ad\u0001\u0000\u0000\u0000\"\u00b1\u0001\u0000"+
		"\u0000\u0000$\u00b8\u0001\u0000\u0000\u0000&\u00bc\u0001\u0000\u0000\u0000"+
		"(\u00c0\u0001\u0000\u0000\u0000*\u00c2\u0001\u0000\u0000\u0000,\u00cc"+
		"\u0001\u0000\u0000\u0000.0\u0003\u0002\u0001\u0000/.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000034\u0005\u0002\u0000\u00004\u0001"+
		"\u0001\u0000\u0000\u00005;\u0003(\u0014\u00006;\u0003\u0004\u0002\u0000"+
		"7;\u0003\u0012\t\u00008;\u0003\u0016\u000b\u00009;\u0003\u001e\u000f\u0000"+
		":5\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000\u0000:7\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;?\u0001\u0000"+
		"\u0000\u0000<>\u0005\u0015\u0000\u0000=<\u0001\u0000\u0000\u0000>A\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@\u0003\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0003\u0010"+
		"\b\u0000CF\u0007\u0000\u0000\u0000DG\u0003\b\u0004\u0000EG\u0003\u0006"+
		"\u0003\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\u0005"+
		"\u0001\u0000\u0000\u0000HI\u0005\u0003\u0000\u0000IK\u0007\u0000\u0000"+
		"\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OR\u0005\u0004\u0000\u0000PS\u0003\n\u0005\u0000QS\u0005"+
		"\u0004\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000"+
		"S\u0007\u0001\u0000\u0000\u0000TV\u0003\u0002\u0001\u0000UW\u0003\n\u0005"+
		"\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\t\u0001\u0000"+
		"\u0000\u0000XY\u0005\u0006\u0000\u0000Y\\\u0007\u0000\u0000\u0000Z]\u0003"+
		"\u000e\u0007\u0000[]\u0003\f\u0006\u0000\\Z\u0001\u0000\u0000\u0000\\"+
		"[\u0001\u0000\u0000\u0000]\u000b\u0001\u0000\u0000\u0000^_\u0005\u0003"+
		"\u0000\u0000_a\u0007\u0000\u0000\u0000`b\u0003\u0002\u0001\u0000a`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0005\u0004\u0000"+
		"\u0000f\r\u0001\u0000\u0000\u0000gh\u0003\u0002\u0001\u0000h\u000f\u0001"+
		"\u0000\u0000\u0000ij\u0005\u0005\u0000\u0000jk\u0005\u0019\u0000\u0000"+
		"kl\u0003\u001c\u000e\u0000l\u0011\u0001\u0000\u0000\u0000mo\u0003\u0014"+
		"\n\u0000np\u0003\u0002\u0001\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000st\u0005\u0004\u0000\u0000t\u0013\u0001\u0000\u0000"+
		"\u0000uv\u0005\u0007\u0000\u0000vw\u0005\u0019\u0000\u0000wx\u0003\u001c"+
		"\u000e\u0000xy\u0005\u0015\u0000\u0000y\u0015\u0001\u0000\u0000\u0000"+
		"z{\u0003\u0018\f\u0000{}\u0005\u0003\u0000\u0000|~\u0003\u0002\u0001\u0000"+
		"}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005\u0004\u0000\u0000\u0082\u0017\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\b\u0000\u0000\u0084\u008b\u0003*"+
		"\u0015\u0000\u0085\u0087\u0005\t\u0000\u0000\u0086\u0088\u0003\u001a\r"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0085\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005\u0015\u0000\u0000\u008e\u0019\u0001\u0000\u0000"+
		"\u0000\u008f\u0095\u0003,\u0016\u0000\u0090\u0091\u0005\u0016\u0000\u0000"+
		"\u0091\u0092\u0005\u0019\u0000\u0000\u0092\u0094\u0003,\u0016\u0000\u0093"+
		"\u0090\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u001b\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0006\u000e\uffff\uffff\u0000\u0099\u009a\u0003,\u0016\u0000\u009a"+
		"\u009b\u0005\u0012\u0000\u0000\u009b\u009c\u0003,\u0016\u0000\u009c\u009f"+
		"\u0001\u0000\u0000\u0000\u009d\u009f\u0005\u0011\u0000\u0000\u009e\u0098"+
		"\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\n\u0002\u0000\u0000\u00a1\u00a2\u0005"+
		"\u0014\u0000\u0000\u00a2\u00a4\u0003\u001c\u000e\u0003\u00a3\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u001d\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ac\u0003"+
		" \u0010\u0000\u00a9\u00ac\u0003\"\u0011\u0000\u00aa\u00ac\u0003$\u0012"+
		"\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u001f\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005\f\u0000\u0000\u00ae\u00af\u0003,\u0016\u0000"+
		"\u00af\u00b0\u0005\u0015\u0000\u0000\u00b0!\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0005\r\u0000\u0000\u00b2\u00b3\u0003*\u0015\u0000\u00b3\u00b4"+
		"\u0005\u000e\u0000\u0000\u00b4\u00b5\u0007\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0003,\u0016\u0000\u00b6\u00b7\u0005\u0015\u0000\u0000\u00b7#\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005\n\u0000\u0000\u00b9\u00ba\u0003,\u0016"+
		"\u0000\u00ba\u00bb\u0005\u0015\u0000\u0000\u00bb%\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005\u000b\u0000\u0000\u00bd\u00be\u0005\u0019\u0000\u0000"+
		"\u00be\u00bf\u0005\u000f\u0000\u0000\u00bf\'\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005\u001b\u0000\u0000\u00c1)\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0005\u0017\u0000\u0000\u00c3+\u0001\u0000\u0000\u0000\u00c4\u00c5\u0006"+
		"\u0016\uffff\uffff\u0000\u00c5\u00cd\u0005\u000f\u0000\u0000\u00c6\u00c7"+
		"\u0003*\u0015\u0000\u00c7\u00c8\u0005\u0001\u0000\u0000\u00c8\u00c9\u0003"+
		"\u001a\r\u0000\u00c9\u00cd\u0001\u0000\u0000\u0000\u00ca\u00cd\u0003&"+
		"\u0013\u0000\u00cb\u00cd\u0003*\u0015\u0000\u00cc\u00c4\u0001\u0000\u0000"+
		"\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d3\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\n\u0004\u0000\u0000\u00cf\u00d0\u0005\u0013\u0000\u0000"+
		"\u00d0\u00d2\u0003,\u0016\u0005\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d4-\u0001\u0000\u0000\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00131:?FMRV\\cq\u007f\u0089\u008b\u0095\u009e"+
		"\u00a5\u00ab\u00cc\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}