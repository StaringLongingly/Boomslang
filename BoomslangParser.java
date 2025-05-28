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
		PROGRAM_END=1, BLOCK_OPEN=2, BLOCK_CLOSE=3, IF_START=4, ELSE_START=5, 
		WHILE_START=6, FUNCTION_DECLARATION_START=7, FUNCTION_ARGUMENTS=8, FUNCTION_RETURN=9, 
		SCAN_START=10, PRINT_START=11, ASSIGN_START=12, ASSIGN_MIDDLE=13, STRUNBER=14, 
		NUMBER=15, BOOL=16, SMALLER_THAN=17, BEATS=18, IS_ACTUALLY=19, PLUS=20, 
		MINUS=21, TIMES=22, DIVIDED_BY=23, MODULO=24, OR=25, AND=26, OF=27, LPAREN=28, 
		RPAREN=29, NEWLINE=30, COMMA=31, NAME=32, PERIOD=33, SPACES=34, SPACE=35, 
		COMMENT=36;
	public static final int
		RULE_init = 0, RULE_program_piece = 1, RULE_if_block = 2, RULE_if_mult = 3, 
		RULE_if_single = 4, RULE_else_block = 5, RULE_else_mult = 6, RULE_else_single = 7, 
		RULE_if_declaration = 8, RULE_while_block = 9, RULE_while_declaration = 10, 
		RULE_function_block = 11, RULE_function_declaration = 12, RULE_arguments = 13, 
		RULE_condition = 14, RULE_statement = 15, RULE_print = 16, RULE_assign = 17, 
		RULE_return = 18, RULE_scan = 19, RULE_comment = 20, RULE_name = 21, RULE_value = 22, 
		RULE_orExpr = 23, RULE_andExpr = 24, RULE_comparisonExpr = 25, RULE_addExpr = 26, 
		RULE_multExpr = 27, RULE_unaryExpr = 28, RULE_primaryExpr = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "program_piece", "if_block", "if_mult", "if_single", "else_block", 
			"else_mult", "else_single", "if_declaration", "while_block", "while_declaration", 
			"function_block", "function_declaration", "arguments", "condition", "statement", 
			"print", "assign", "return", "scan", "comment", "name", "value", "orExpr", 
			"andExpr", "comparisonExpr", "addExpr", "multExpr", "unaryExpr", "primaryExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PLEASE LIKE AND SUBSCRIBE'", null, null, "'WHAT IF'", "'LIES!'", 
			"'STAY TUNED WHILE'", "'DISCOVER HOW TO '", "' WITH '", null, "'LATEST NEWS ON'", 
			"'YOU WON'T WANT TO MISS '", "'EXPERTS CLAIM '", "' TO BE'", null, null, 
			null, null, "' BEATS '", "' IS ACTUALLY '", "' PLUS '", "' MINUS '", 
			"' TIMES '", "' DIVIDED BY '", "' MODULO '", "' OR '", "' AND '", "' OF '", 
			"'('", "')'", null, "','", null, "'.'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM_END", "BLOCK_OPEN", "BLOCK_CLOSE", "IF_START", "ELSE_START", 
			"WHILE_START", "FUNCTION_DECLARATION_START", "FUNCTION_ARGUMENTS", "FUNCTION_RETURN", 
			"SCAN_START", "PRINT_START", "ASSIGN_START", "ASSIGN_MIDDLE", "STRUNBER", 
			"NUMBER", "BOOL", "SMALLER_THAN", "BEATS", "IS_ACTUALLY", "PLUS", "MINUS", 
			"TIMES", "DIVIDED_BY", "MODULO", "OR", "AND", "OF", "LPAREN", "RPAREN", 
			"NEWLINE", "COMMA", "NAME", "PERIOD", "SPACES", "SPACE", "COMMENT"
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
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				program_piece();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68719483600L) != 0) );
			setState(65);
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
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				{
				setState(67);
				comment();
				}
				break;
			case IF_START:
				{
				setState(68);
				if_block();
				}
				break;
			case WHILE_START:
				{
				setState(69);
				while_block();
				}
				break;
			case FUNCTION_DECLARATION_START:
				{
				setState(70);
				function_block();
				}
				break;
			case FUNCTION_RETURN:
			case PRINT_START:
			case ASSIGN_START:
				{
				setState(71);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					match(NEWLINE);
					}
					} 
				}
				setState(79);
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
			setState(80);
			if_declaration();
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SPACES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(84);
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
				setState(82);
				if_single();
				}
				break;
			case BLOCK_OPEN:
				{
				setState(83);
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
			setState(86);
			match(BLOCK_OPEN);
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SPACES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				program_piece();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68719483600L) != 0) );
			setState(93);
			match(BLOCK_CLOSE);
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE_START:
				{
				setState(94);
				else_block();
				}
				break;
			case BLOCK_CLOSE:
				{
				setState(95);
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
			setState(98);
			program_piece();
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(99);
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
			setState(102);
			match(ELSE_START);
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SPACES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
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
				setState(104);
				else_single();
				}
				break;
			case BLOCK_OPEN:
				{
				setState(105);
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
			setState(108);
			match(BLOCK_OPEN);
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SPACES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68719483600L) != 0) );
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
			setState(117);
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
			setState(119);
			match(IF_START);
			setState(120);
			match(SPACES);
			setState(121);
			condition();
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
		public TerminalNode BLOCK_OPEN() { return getToken(BoomslangParser.BLOCK_OPEN, 0); }
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
			setState(123);
			while_declaration();
			setState(124);
			match(BLOCK_OPEN);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				program_piece();
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68719483600L) != 0) );
			setState(130);
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
			setState(132);
			match(WHILE_START);
			setState(133);
			match(SPACES);
			setState(134);
			condition();
			setState(135);
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
			setState(137);
			function_declaration();
			setState(138);
			match(BLOCK_OPEN);
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				program_piece();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68719483600L) != 0) );
			setState(144);
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
			setState(146);
			match(FUNCTION_DECLARATION_START);
			setState(147);
			name();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION_ARGUMENTS) {
				{
				setState(148);
				match(FUNCTION_ARGUMENTS);
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(149);
					arguments();
					}
					}
					setState(152); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4565582848L) != 0) );
				}
			}

			setState(156);
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
			setState(158);
			value();
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(COMMA);
					setState(160);
					match(SPACES);
					setState(161);
					value();
					}
					} 
				}
				setState(166);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				print();
				}
				break;
			case ASSIGN_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				assign();
				}
				break;
			case FUNCTION_RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
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
			setState(174);
			match(PRINT_START);
			setState(175);
			value();
			setState(176);
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
			setState(178);
			match(ASSIGN_START);
			setState(179);
			name();
			setState(180);
			match(ASSIGN_MIDDLE);
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SPACES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(182);
			value();
			setState(183);
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
			setState(185);
			match(FUNCTION_RETURN);
			setState(186);
			value();
			setState(187);
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
			setState(189);
			match(SCAN_START);
			setState(190);
			match(SPACES);
			setState(191);
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
			setState(193);
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
			setState(195);
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
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
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
		enterRule(_localctx, 44, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			orExpr();
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
	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(BoomslangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(BoomslangParser.OR, i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitOrExpr(this);
		}
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_orExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			andExpr();
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					match(OR);
					setState(201);
					andExpr();
					}
					} 
				}
				setState(206);
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
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ParserRuleContext {
		public List<ComparisonExprContext> comparisonExpr() {
			return getRuleContexts(ComparisonExprContext.class);
		}
		public ComparisonExprContext comparisonExpr(int i) {
			return getRuleContext(ComparisonExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(BoomslangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(BoomslangParser.AND, i);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitAndExpr(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_andExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			comparisonExpr();
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(AND);
					setState(209);
					comparisonExpr();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class ComparisonExprContext extends ParserRuleContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public List<TerminalNode> SMALLER_THAN() { return getTokens(BoomslangParser.SMALLER_THAN); }
		public TerminalNode SMALLER_THAN(int i) {
			return getToken(BoomslangParser.SMALLER_THAN, i);
		}
		public List<TerminalNode> BEATS() { return getTokens(BoomslangParser.BEATS); }
		public TerminalNode BEATS(int i) {
			return getToken(BoomslangParser.BEATS, i);
		}
		public List<TerminalNode> IS_ACTUALLY() { return getTokens(BoomslangParser.IS_ACTUALLY); }
		public TerminalNode IS_ACTUALLY(int i) {
			return getToken(BoomslangParser.IS_ACTUALLY, i);
		}
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitComparisonExpr(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comparisonExpr);
		int _la;
		try {
			int _alt;
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				addExpr();
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(216);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						addExpr();
						}
						} 
					}
					setState(222);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				addExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ParserRuleContext {
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(BoomslangParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BoomslangParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(BoomslangParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(BoomslangParser.MINUS, i);
		}
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitAddExpr(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_addExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			multExpr();
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(228);
					multExpr();
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
	public static class MultExprContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(BoomslangParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(BoomslangParser.TIMES, i);
		}
		public List<TerminalNode> DIVIDED_BY() { return getTokens(BoomslangParser.DIVIDED_BY); }
		public TerminalNode DIVIDED_BY(int i) {
			return getToken(BoomslangParser.DIVIDED_BY, i);
		}
		public List<TerminalNode> MODULO() { return getTokens(BoomslangParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(BoomslangParser.MODULO, i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitMultExpr(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_multExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			unaryExpr();
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(236);
					unaryExpr();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	public static class UnaryExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(BoomslangParser.MINUS, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unaryExpr);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCAN_START:
			case STRUNBER:
			case BOOL:
			case LPAREN:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				primaryExpr();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(MINUS);
				setState(244);
				primaryExpr();
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
	public static class PrimaryExprContext extends ParserRuleContext {
		public TerminalNode STRUNBER() { return getToken(BoomslangParser.STRUNBER, 0); }
		public TerminalNode BOOL() { return getToken(BoomslangParser.BOOL, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OF() { return getToken(BoomslangParser.OF, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(BoomslangParser.LPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BoomslangParser.RPAREN, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoomslangListener ) ((BoomslangListener)listener).exitPrimaryExpr(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primaryExpr);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(STRUNBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				name();
				setState(251);
				match(OF);
				setState(252);
				arguments();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				scan();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(LPAREN);
				setState(256);
				value();
				setState(257);
				match(RPAREN);
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

	public static final String _serializedATN =
		"\u0004\u0001$\u0106\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0004\u0000"+
		">\b\u0000\u000b\u0000\f\u0000?\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001I\b\u0001\u0001"+
		"\u0001\u0005\u0001L\b\u0001\n\u0001\f\u0001O\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u0003Z\b\u0003\u000b\u0003\f\u0003[\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003a\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004e\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005k\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"p\b\u0006\u000b\u0006\f\u0006q\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0004\t"+
		"\u007f\b\t\u000b\t\f\t\u0080\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u008d\b\u000b"+
		"\u000b\u000b\f\u000b\u008e\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0004\f\u0097\b\f\u000b\f\f\f\u0098\u0003\f\u009b\b\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00a3\b\r\n\r\f\r\u00a6"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00ad\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u00cb\b\u0017\n\u0017\f\u0017\u00ce\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u00d3\b\u0018\n\u0018\f\u0018\u00d6\t\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u00db\b\u0019\n\u0019\f\u0019"+
		"\u00de\t\u0019\u0001\u0019\u0003\u0019\u00e1\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u00e6\b\u001a\n\u001a\f\u001a\u00e9\t\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u00ee\b\u001b\n\u001b"+
		"\f\u001b\u00f1\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u00f6\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0104\b\u001d\u0001\u001d\u0000\u0000\u001e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:\u0000\u0004\u0002\u0000\u001e\u001e\"\"\u0001\u0000"+
		"\u0011\u0013\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u0018\u0106\u0000"+
		"=\u0001\u0000\u0000\u0000\u0002H\u0001\u0000\u0000\u0000\u0004P\u0001"+
		"\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\bb\u0001\u0000\u0000"+
		"\u0000\nf\u0001\u0000\u0000\u0000\fl\u0001\u0000\u0000\u0000\u000eu\u0001"+
		"\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000\u0012{\u0001\u0000\u0000"+
		"\u0000\u0014\u0084\u0001\u0000\u0000\u0000\u0016\u0089\u0001\u0000\u0000"+
		"\u0000\u0018\u0092\u0001\u0000\u0000\u0000\u001a\u009e\u0001\u0000\u0000"+
		"\u0000\u001c\u00a7\u0001\u0000\u0000\u0000\u001e\u00ac\u0001\u0000\u0000"+
		"\u0000 \u00ae\u0001\u0000\u0000\u0000\"\u00b2\u0001\u0000\u0000\u0000"+
		"$\u00b9\u0001\u0000\u0000\u0000&\u00bd\u0001\u0000\u0000\u0000(\u00c1"+
		"\u0001\u0000\u0000\u0000*\u00c3\u0001\u0000\u0000\u0000,\u00c5\u0001\u0000"+
		"\u0000\u0000.\u00c7\u0001\u0000\u0000\u00000\u00cf\u0001\u0000\u0000\u0000"+
		"2\u00e0\u0001\u0000\u0000\u00004\u00e2\u0001\u0000\u0000\u00006\u00ea"+
		"\u0001\u0000\u0000\u00008\u00f5\u0001\u0000\u0000\u0000:\u0103\u0001\u0000"+
		"\u0000\u0000<>\u0003\u0002\u0001\u0000=<\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AB\u0005\u0001\u0000\u0000B\u0001\u0001\u0000"+
		"\u0000\u0000CI\u0003(\u0014\u0000DI\u0003\u0004\u0002\u0000EI\u0003\u0012"+
		"\t\u0000FI\u0003\u0016\u000b\u0000GI\u0003\u001e\u000f\u0000HC\u0001\u0000"+
		"\u0000\u0000HD\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000IM\u0001\u0000\u0000\u0000"+
		"JL\u0005\u001e\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\u0003\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0003\u0010\b\u0000QT\u0007"+
		"\u0000\u0000\u0000RU\u0003\b\u0004\u0000SU\u0003\u0006\u0003\u0000TR\u0001"+
		"\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0005\u0001\u0000\u0000"+
		"\u0000VW\u0005\u0002\u0000\u0000WY\u0007\u0000\u0000\u0000XZ\u0003\u0002"+
		"\u0001\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]`\u0005\u0003\u0000\u0000^a\u0003\n\u0005\u0000_a\u0005\u0003\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000a\u0007\u0001\u0000"+
		"\u0000\u0000bd\u0003\u0002\u0001\u0000ce\u0003\n\u0005\u0000dc\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000e\t\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0005\u0000\u0000gj\u0007\u0000\u0000\u0000hk\u0003\u000e\u0007\u0000"+
		"ik\u0003\f\u0006\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"k\u000b\u0001\u0000\u0000\u0000lm\u0005\u0002\u0000\u0000mo\u0007\u0000"+
		"\u0000\u0000np\u0003\u0002\u0001\u0000on\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0005\u0003\u0000\u0000t\r\u0001\u0000\u0000"+
		"\u0000uv\u0003\u0002\u0001\u0000v\u000f\u0001\u0000\u0000\u0000wx\u0005"+
		"\u0004\u0000\u0000xy\u0005\"\u0000\u0000yz\u0003\u001c\u000e\u0000z\u0011"+
		"\u0001\u0000\u0000\u0000{|\u0003\u0014\n\u0000|~\u0005\u0002\u0000\u0000"+
		"}\u007f\u0003\u0002\u0001\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\u0003\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"\u0006\u0000\u0000\u0085\u0086\u0005\"\u0000\u0000\u0086\u0087\u0003\u001c"+
		"\u000e\u0000\u0087\u0088\u0005\u001e\u0000\u0000\u0088\u0015\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0003\u0018\f\u0000\u008a\u008c\u0005\u0002\u0000"+
		"\u0000\u008b\u008d\u0003\u0002\u0001\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005\u0003\u0000\u0000\u0091\u0017\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005\u0007\u0000\u0000\u0093\u009a\u0003*\u0015\u0000"+
		"\u0094\u0096\u0005\b\u0000\u0000\u0095\u0097\u0003\u001a\r\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009b\u0001\u0000\u0000\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005\u001e\u0000\u0000\u009d\u0019\u0001\u0000\u0000\u0000\u009e"+
		"\u00a4\u0003,\u0016\u0000\u009f\u00a0\u0005\u001f\u0000\u0000\u00a0\u00a1"+
		"\u0005\"\u0000\u0000\u00a1\u00a3\u0003,\u0016\u0000\u00a2\u009f\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u001b\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003"+
		",\u0016\u0000\u00a8\u001d\u0001\u0000\u0000\u0000\u00a9\u00ad\u0003 \u0010"+
		"\u0000\u00aa\u00ad\u0003\"\u0011\u0000\u00ab\u00ad\u0003$\u0012\u0000"+
		"\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u001f\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\u000b\u0000\u0000\u00af\u00b0\u0003,\u0016\u0000\u00b0"+
		"\u00b1\u0005\u001e\u0000\u0000\u00b1!\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005\f\u0000\u0000\u00b3\u00b4\u0003*\u0015\u0000\u00b4\u00b5\u0005"+
		"\r\u0000\u0000\u00b5\u00b6\u0007\u0000\u0000\u0000\u00b6\u00b7\u0003,"+
		"\u0016\u0000\u00b7\u00b8\u0005\u001e\u0000\u0000\u00b8#\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005\t\u0000\u0000\u00ba\u00bb\u0003,\u0016\u0000"+
		"\u00bb\u00bc\u0005\u001e\u0000\u0000\u00bc%\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\n\u0000\u0000\u00be\u00bf\u0005\"\u0000\u0000\u00bf\u00c0"+
		"\u0005\u000e\u0000\u0000\u00c0\'\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005"+
		"$\u0000\u0000\u00c2)\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005 \u0000"+
		"\u0000\u00c4+\u0001\u0000\u0000\u0000\u00c5\u00c6\u0003.\u0017\u0000\u00c6"+
		"-\u0001\u0000\u0000\u0000\u00c7\u00cc\u00030\u0018\u0000\u00c8\u00c9\u0005"+
		"\u0019\u0000\u0000\u00c9\u00cb\u00030\u0018\u0000\u00ca\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd/\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d4\u00032\u0019\u0000"+
		"\u00d0\u00d1\u0005\u001a\u0000\u0000\u00d1\u00d3\u00032\u0019\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5"+
		"1\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00dc"+
		"\u00034\u001a\u0000\u00d8\u00d9\u0007\u0001\u0000\u0000\u00d9\u00db\u0003"+
		"4\u001a\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e1\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00e1\u00034\u001a\u0000\u00e0\u00d7\u0001\u0000\u0000"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e13\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e7\u00036\u001b\u0000\u00e3\u00e4\u0007\u0002\u0000\u0000\u00e4"+
		"\u00e6\u00036\u001b\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e85\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ea\u00ef\u00038\u001c\u0000\u00eb\u00ec\u0007\u0003"+
		"\u0000\u0000\u00ec\u00ee\u00038\u001c\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f07\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f6\u0003:\u001d\u0000\u00f3"+
		"\u00f4\u0005\u0015\u0000\u0000\u00f4\u00f6\u0003:\u001d\u0000\u00f5\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f69\u0001"+
		"\u0000\u0000\u0000\u00f7\u0104\u0005\u000e\u0000\u0000\u00f8\u0104\u0005"+
		"\u0010\u0000\u0000\u00f9\u0104\u0003*\u0015\u0000\u00fa\u00fb\u0003*\u0015"+
		"\u0000\u00fb\u00fc\u0005\u001b\u0000\u0000\u00fc\u00fd\u0003\u001a\r\u0000"+
		"\u00fd\u0104\u0001\u0000\u0000\u0000\u00fe\u0104\u0003&\u0013\u0000\u00ff"+
		"\u0100\u0005\u001c\u0000\u0000\u0100\u0101\u0003,\u0016\u0000\u0101\u0102"+
		"\u0005\u001d\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u00f7"+
		"\u0001\u0000\u0000\u0000\u0103\u00f8\u0001\u0000\u0000\u0000\u0103\u00f9"+
		"\u0001\u0000\u0000\u0000\u0103\u00fa\u0001\u0000\u0000\u0000\u0103\u00fe"+
		"\u0001\u0000\u0000\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0104;\u0001"+
		"\u0000\u0000\u0000\u0017?HMT[`djq\u0080\u008e\u0098\u009a\u00a4\u00ac"+
		"\u00cc\u00d4\u00dc\u00e0\u00e7\u00ef\u00f5\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}