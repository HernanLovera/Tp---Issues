// Generated from Nova.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NovaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, VAR=2, FUNC=3, RETURN=4, IF=5, ELSE=6, WHILE=7, MAIN=8, TRUE=9, 
		FALSE=10, PRINT=11, EXTENDS=12, NEW=13, INT_TYPE=14, FLOAT_TYPE=15, BOOL_TYPE=16, 
		STRING_TYPE=17, VOID_TYPE=18, LBRACE=19, RBRACE=20, LPAREN=21, RPAREN=22, 
		SEMI=23, COLON=24, COMMA=25, DOT=26, PLUS=27, MINUS=28, MULT=29, DIV=30, 
		MOD=31, ASSIGN=32, EQ=33, NEQ=34, LT=35, GT=36, LE=37, GE=38, AND=39, 
		NOT=40, INT_LITERAL=41, FLOAT_LITERAL=42, STRING_LITERAL=43, ID=44, WS=45, 
		LINE_COMMENT=46, BLOCK_COMMENT=47;
	public static final int
		RULE_programa = 0, RULE_clase = 1, RULE_miembro = 2, RULE_declaracionAtributo = 3, 
		RULE_declaracionMetodo = 4, RULE_parametros = 5, RULE_parametro = 6, RULE_bloqueMain = 7, 
		RULE_bloqueCodigo = 8, RULE_sentencia = 9, RULE_declaracionVariableLocal = 10, 
		RULE_asignacion = 11, RULE_asignacionVariable = 12, RULE_invocacionMetodo = 13, 
		RULE_argumentos = 14, RULE_instruccionPrint = 15, RULE_ifSentencia = 16, 
		RULE_whileSentencia = 17, RULE_expresion = 18, RULE_literal = 19, RULE_tipo = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "clase", "miembro", "declaracionAtributo", "declaracionMetodo", 
			"parametros", "parametro", "bloqueMain", "bloqueCodigo", "sentencia", 
			"declaracionVariableLocal", "asignacion", "asignacionVariable", "invocacionMetodo", 
			"argumentos", "instruccionPrint", "ifSentencia", "whileSentencia", "expresion", 
			"literal", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'var'", "'func'", "'return'", "'if'", "'else'", "'while'", 
			"'main'", "'true'", "'false'", "'print'", "'extends'", "'new'", "'Int'", 
			"'Float'", "'Bool'", "'String'", "'Void'", "'{'", "'}'", "'('", "')'", 
			"';'", "':'", "','", "'.'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "VAR", "FUNC", "RETURN", "IF", "ELSE", "WHILE", "MAIN", 
			"TRUE", "FALSE", "PRINT", "EXTENDS", "NEW", "INT_TYPE", "FLOAT_TYPE", 
			"BOOL_TYPE", "STRING_TYPE", "VOID_TYPE", "LBRACE", "RBRACE", "LPAREN", 
			"RPAREN", "SEMI", "COLON", "COMMA", "DOT", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "ASSIGN", "EQ", "NEQ", "LT", "GT", "LE", "GE", "AND", "NOT", "INT_LITERAL", 
			"FLOAT_LITERAL", "STRING_LITERAL", "ID", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "Nova.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NovaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BloqueMainContext bloqueMain() {
			return getRuleContext(BloqueMainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(NovaParser.EOF, 0); }
		public List<ClaseContext> clase() {
			return getRuleContexts(ClaseContext.class);
		}
		public ClaseContext clase(int i) {
			return getRuleContext(ClaseContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(42);
				clase();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			bloqueMain();
			setState(49);
			match(EOF);
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
	public static class ClaseContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(NovaParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(NovaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NovaParser.ID, i);
		}
		public TerminalNode LBRACE() { return getToken(NovaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NovaParser.RBRACE, 0); }
		public TerminalNode EXTENDS() { return getToken(NovaParser.EXTENDS, 0); }
		public List<MiembroContext> miembro() {
			return getRuleContexts(MiembroContext.class);
		}
		public MiembroContext miembro(int i) {
			return getRuleContext(MiembroContext.class,i);
		}
		public ClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitClase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitClase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClaseContext clase() throws RecognitionException {
		ClaseContext _localctx = new ClaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_clase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(CLASS);
			setState(52);
			match(ID);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(53);
				match(EXTENDS);
				setState(54);
				match(ID);
				}
			}

			setState(57);
			match(LBRACE);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==FUNC) {
				{
				{
				setState(58);
				miembro();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(RBRACE);
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
	public static class MiembroContext extends ParserRuleContext {
		public DeclaracionAtributoContext declaracionAtributo() {
			return getRuleContext(DeclaracionAtributoContext.class,0);
		}
		public DeclaracionMetodoContext declaracionMetodo() {
			return getRuleContext(DeclaracionMetodoContext.class,0);
		}
		public MiembroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_miembro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterMiembro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitMiembro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitMiembro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiembroContext miembro() throws RecognitionException {
		MiembroContext _localctx = new MiembroContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_miembro);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				declaracionAtributo();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				declaracionMetodo();
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
	public static class DeclaracionAtributoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(NovaParser.VAR, 0); }
		public TerminalNode ID() { return getToken(NovaParser.ID, 0); }
		public TerminalNode COLON() { return getToken(NovaParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NovaParser.SEMI, 0); }
		public DeclaracionAtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionAtributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterDeclaracionAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitDeclaracionAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitDeclaracionAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionAtributoContext declaracionAtributo() throws RecognitionException {
		DeclaracionAtributoContext _localctx = new DeclaracionAtributoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracionAtributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(VAR);
			setState(71);
			match(ID);
			setState(72);
			match(COLON);
			setState(73);
			tipo();
			setState(74);
			match(SEMI);
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
	public static class DeclaracionMetodoContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(NovaParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(NovaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(NovaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NovaParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(NovaParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public BloqueCodigoContext bloqueCodigo() {
			return getRuleContext(BloqueCodigoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public DeclaracionMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterDeclaracionMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitDeclaracionMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitDeclaracionMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionMetodoContext declaracionMetodo() throws RecognitionException {
		DeclaracionMetodoContext _localctx = new DeclaracionMetodoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracionMetodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(FUNC);
			setState(77);
			match(ID);
			setState(78);
			match(LPAREN);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(79);
				parametros();
				}
			}

			setState(82);
			match(RPAREN);
			setState(83);
			match(COLON);
			setState(84);
			tipo();
			setState(85);
			bloqueCodigo();
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NovaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NovaParser.COMMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			parametro();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(88);
				match(COMMA);
				setState(89);
				parametro();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NovaParser.ID, 0); }
		public TerminalNode COLON() { return getToken(NovaParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
			setState(96);
			match(COLON);
			setState(97);
			tipo();
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
	public static class BloqueMainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(NovaParser.MAIN, 0); }
		public BloqueCodigoContext bloqueCodigo() {
			return getRuleContext(BloqueCodigoContext.class,0);
		}
		public BloqueMainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueMain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterBloqueMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitBloqueMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitBloqueMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueMainContext bloqueMain() throws RecognitionException {
		BloqueMainContext _localctx = new BloqueMainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloqueMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(MAIN);
			setState(100);
			bloqueCodigo();
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
	public static class BloqueCodigoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(NovaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NovaParser.RBRACE, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueCodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueCodigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterBloqueCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitBloqueCodigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitBloqueCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueCodigoContext bloqueCodigo() throws RecognitionException {
		BloqueCodigoContext _localctx = new BloqueCodigoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloqueCodigo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(LBRACE);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592187078832L) != 0)) {
				{
				{
				setState(103);
				sentencia();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(RBRACE);
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
	public static class SentenciaContext extends ParserRuleContext {
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	 
		public SentenciaContext() { }
		public void copyFrom(SentenciaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaDeclVarContext extends SentenciaContext {
		public DeclaracionVariableLocalContext declaracionVariableLocal() {
			return getRuleContext(DeclaracionVariableLocalContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NovaParser.SEMI, 0); }
		public SentenciaDeclVarContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterSentenciaDeclVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitSentenciaDeclVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitSentenciaDeclVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaReturnContext extends SentenciaContext {
		public TerminalNode RETURN() { return getToken(NovaParser.RETURN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NovaParser.SEMI, 0); }
		public SentenciaReturnContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterSentenciaReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitSentenciaReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitSentenciaReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaWhileContext extends SentenciaContext {
		public WhileSentenciaContext whileSentencia() {
			return getRuleContext(WhileSentenciaContext.class,0);
		}
		public SentenciaWhileContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterSentenciaWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitSentenciaWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitSentenciaWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaPrintContext extends SentenciaContext {
		public InstruccionPrintContext instruccionPrint() {
			return getRuleContext(InstruccionPrintContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NovaParser.SEMI, 0); }
		public SentenciaPrintContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterSentenciaPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitSentenciaPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitSentenciaPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaInvocacionContext extends SentenciaContext {
		public InvocacionMetodoContext invocacionMetodo() {
			return getRuleContext(InvocacionMetodoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NovaParser.SEMI, 0); }
		public SentenciaInvocacionContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterSentenciaInvocacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitSentenciaInvocacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitSentenciaInvocacion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaAsignacionContext extends SentenciaContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NovaParser.SEMI, 0); }
		public SentenciaAsignacionContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterSentenciaAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitSentenciaAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitSentenciaAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaIfContext extends SentenciaContext {
		public IfSentenciaContext ifSentencia() {
			return getRuleContext(IfSentenciaContext.class,0);
		}
		public SentenciaIfContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterSentenciaIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitSentenciaIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitSentenciaIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaBloqueContext extends SentenciaContext {
		public BloqueCodigoContext bloqueCodigo() {
			return getRuleContext(BloqueCodigoContext.class,0);
		}
		public SentenciaBloqueContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterSentenciaBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitSentenciaBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitSentenciaBloque(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaAsignacionVarContext extends SentenciaContext {
		public AsignacionVariableContext asignacionVariable() {
			return getRuleContext(AsignacionVariableContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NovaParser.SEMI, 0); }
		public SentenciaAsignacionVarContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterSentenciaAsignacionVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitSentenciaAsignacionVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitSentenciaAsignacionVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentencia);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new SentenciaDeclVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				declaracionVariableLocal();
				setState(112);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new SentenciaAsignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				asignacion();
				setState(115);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new SentenciaAsignacionVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				asignacionVariable();
				setState(118);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new SentenciaInvocacionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				invocacionMetodo();
				setState(121);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new SentenciaPrintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				instruccionPrint();
				setState(124);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new SentenciaReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				match(RETURN);
				setState(127);
				expresion(0);
				setState(128);
				match(SEMI);
				}
				break;
			case 7:
				_localctx = new SentenciaIfContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				ifSentencia();
				}
				break;
			case 8:
				_localctx = new SentenciaWhileContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				whileSentencia();
				}
				break;
			case 9:
				_localctx = new SentenciaBloqueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				bloqueCodigo();
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
	public static class DeclaracionVariableLocalContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(NovaParser.ID, 0); }
		public DeclaracionVariableLocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionVariableLocal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterDeclaracionVariableLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitDeclaracionVariableLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitDeclaracionVariableLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionVariableLocalContext declaracionVariableLocal() throws RecognitionException {
		DeclaracionVariableLocalContext _localctx = new DeclaracionVariableLocalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracionVariableLocal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			tipo();
			setState(136);
			match(ID);
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
	public static class AsignacionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(NovaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NovaParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(NovaParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(NovaParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			setState(139);
			match(DOT);
			setState(140);
			match(ID);
			setState(141);
			match(ASSIGN);
			setState(142);
			expresion(0);
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
	public static class AsignacionVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NovaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(NovaParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterAsignacionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitAsignacionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitAsignacionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionVariableContext asignacionVariable() throws RecognitionException {
		AsignacionVariableContext _localctx = new AsignacionVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_asignacionVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ID);
			setState(145);
			match(ASSIGN);
			setState(146);
			expresion(0);
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
	public static class InvocacionMetodoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(NovaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NovaParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(NovaParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(NovaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NovaParser.RPAREN, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public InvocacionMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocacionMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterInvocacionMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitInvocacionMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitInvocacionMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvocacionMetodoContext invocacionMetodo() throws RecognitionException {
		InvocacionMetodoContext _localctx = new InvocacionMetodoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_invocacionMetodo);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ID);
				setState(149);
				match(DOT);
				setState(150);
				match(ID);
				setState(151);
				match(LPAREN);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34084862567936L) != 0)) {
					{
					setState(152);
					argumentos();
					}
				}

				setState(155);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(ID);
				setState(157);
				match(LPAREN);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34084862567936L) != 0)) {
					{
					setState(158);
					argumentos();
					}
				}

				setState(161);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NovaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NovaParser.COMMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			expresion(0);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(165);
				match(COMMA);
				setState(166);
				expresion(0);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class InstruccionPrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(NovaParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(NovaParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NovaParser.RPAREN, 0); }
		public InstruccionPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterInstruccionPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitInstruccionPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitInstruccionPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionPrintContext instruccionPrint() throws RecognitionException {
		InstruccionPrintContext _localctx = new InstruccionPrintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instruccionPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(PRINT);
			setState(173);
			match(LPAREN);
			setState(174);
			expresion(0);
			setState(175);
			match(RPAREN);
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
	public static class IfSentenciaContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(NovaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(NovaParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NovaParser.RPAREN, 0); }
		public List<BloqueCodigoContext> bloqueCodigo() {
			return getRuleContexts(BloqueCodigoContext.class);
		}
		public BloqueCodigoContext bloqueCodigo(int i) {
			return getRuleContext(BloqueCodigoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(NovaParser.ELSE, 0); }
		public IfSentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterIfSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitIfSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitIfSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfSentenciaContext ifSentencia() throws RecognitionException {
		IfSentenciaContext _localctx = new IfSentenciaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifSentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(IF);
			setState(178);
			match(LPAREN);
			setState(179);
			expresion(0);
			setState(180);
			match(RPAREN);
			setState(181);
			bloqueCodigo();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(182);
				match(ELSE);
				setState(183);
				bloqueCodigo();
				}
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
	public static class WhileSentenciaContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(NovaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(NovaParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NovaParser.RPAREN, 0); }
		public BloqueCodigoContext bloqueCodigo() {
			return getRuleContext(BloqueCodigoContext.class,0);
		}
		public WhileSentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileSentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterWhileSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitWhileSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitWhileSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileSentenciaContext whileSentencia() throws RecognitionException {
		WhileSentenciaContext _localctx = new WhileSentenciaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileSentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WHILE);
			setState(187);
			match(LPAREN);
			setState(188);
			expresion(0);
			setState(189);
			match(RPAREN);
			setState(190);
			bloqueCodigo();
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
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpMenorIgualContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode LE() { return getToken(NovaParser.LE, 0); }
		public ExpMenorIgualContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpMenorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpMenorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpLiteralContext extends ExpresionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpLiteralContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpIgualdadContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(NovaParser.EQ, 0); }
		public ExpIgualdadContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpIgualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpMayorContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode GT() { return getToken(NovaParser.GT, 0); }
		public ExpMayorContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpMayor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpMayor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpNewContext extends ExpresionContext {
		public TerminalNode NEW() { return getToken(NovaParser.NEW, 0); }
		public TerminalNode ID() { return getToken(NovaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(NovaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NovaParser.RPAREN, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ExpNewContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpNew(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpMultiplicacionContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(NovaParser.MULT, 0); }
		public ExpMultiplicacionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpMultiplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpDiferenciaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(NovaParser.NEQ, 0); }
		public ExpDiferenciaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpDiferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpDiferencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpDiferencia(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpDivisionContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(NovaParser.DIV, 0); }
		public ExpDivisionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpMenorContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode LT() { return getToken(NovaParser.LT, 0); }
		public ExpMenorContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpSumaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(NovaParser.PLUS, 0); }
		public ExpSumaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpSuma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParentesisContext extends ExpresionContext {
		public TerminalNode LPAREN() { return getToken(NovaParser.LPAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NovaParser.RPAREN, 0); }
		public ExpParentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpAndContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode AND() { return getToken(NovaParser.AND, 0); }
		public ExpAndContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpModuloContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(NovaParser.MOD, 0); }
		public ExpModuloContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpNotContext extends ExpresionContext {
		public TerminalNode NOT() { return getToken(NovaParser.NOT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpNotContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpIDContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(NovaParser.ID, 0); }
		public ExpIDContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpMayorIgualContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode GE() { return getToken(NovaParser.GE, 0); }
		public ExpMayorIgualContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpMayorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpMayorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpMayorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpRestaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(NovaParser.MINUS, 0); }
		public ExpRestaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterExpResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitExpResta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitExpResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new ExpNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(193);
				match(NOT);
				setState(194);
				expresion(5);
				}
				break;
			case LPAREN:
				{
				_localctx = new ExpParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(LPAREN);
				setState(196);
				expresion(0);
				setState(197);
				match(RPAREN);
				}
				break;
			case TRUE:
			case FALSE:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				_localctx = new ExpLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				literal();
				}
				break;
			case ID:
				{
				_localctx = new ExpIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(ID);
				}
				break;
			case NEW:
				{
				_localctx = new ExpNewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				match(NEW);
				setState(202);
				match(ID);
				setState(203);
				match(LPAREN);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34084862567936L) != 0)) {
					{
					setState(204);
					argumentos();
					}
				}

				setState(207);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpAndContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(210);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(211);
						match(AND);
						setState(212);
						expresion(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpIgualdadContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(213);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(214);
						match(EQ);
						setState(215);
						expresion(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpDiferenciaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(216);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(217);
						match(NEQ);
						setState(218);
						expresion(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpMenorContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(219);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(220);
						match(LT);
						setState(221);
						expresion(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpMayorContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(222);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(223);
						match(GT);
						setState(224);
						expresion(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpMenorIgualContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(225);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(226);
						match(LE);
						setState(227);
						expresion(13);
						}
						break;
					case 7:
						{
						_localctx = new ExpMayorIgualContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(228);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(229);
						match(GE);
						setState(230);
						expresion(12);
						}
						break;
					case 8:
						{
						_localctx = new ExpSumaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(231);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(232);
						match(PLUS);
						setState(233);
						expresion(11);
						}
						break;
					case 9:
						{
						_localctx = new ExpRestaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(234);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(235);
						match(MINUS);
						setState(236);
						expresion(10);
						}
						break;
					case 10:
						{
						_localctx = new ExpMultiplicacionContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(237);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(238);
						match(MULT);
						setState(239);
						expresion(9);
						}
						break;
					case 11:
						{
						_localctx = new ExpDivisionContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(240);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(241);
						match(DIV);
						setState(242);
						expresion(8);
						}
						break;
					case 12:
						{
						_localctx = new ExpModuloContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(243);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(244);
						match(MOD);
						setState(245);
						expresion(7);
						}
						break;
					}
					} 
				}
				setState(250);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(NovaParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(NovaParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(NovaParser.STRING_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(NovaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(NovaParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15393162790400L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(NovaParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(NovaParser.FLOAT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(NovaParser.BOOL_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(NovaParser.STRING_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(NovaParser.VOID_TYPE, 0); }
		public TerminalNode ID() { return getToken(NovaParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NovaListener ) ((NovaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NovaVisitor ) return ((NovaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592186552320L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u0100\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0005\u0000"+
		",\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001<\b\u0001\n\u0001\f\u0001?\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002E\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Q\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005[\b\u0005\n\u0005\f\u0005^\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0005\bi\b\b\n\b\f\bl\t\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0086\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u009a\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a0\b\r"+
		"\u0001\r\u0003\r\u00a3\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00a8\b\u000e\n\u000e\f\u000e\u00ab\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b9\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00ce\b\u0012\u0001\u0012\u0003\u0012\u00d1\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00f7\b\u0012\n\u0012\f\u0012\u00fa\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0001$\u0015\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(\u0000\u0002\u0002\u0000\t\n)+\u0002\u0000\u000e\u0012,,\u010f\u0000"+
		"-\u0001\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u0004D\u0001"+
		"\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000"+
		"\u0000\nW\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000\u000ec\u0001"+
		"\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000\u0012\u0085\u0001\u0000"+
		"\u0000\u0000\u0014\u0087\u0001\u0000\u0000\u0000\u0016\u008a\u0001\u0000"+
		"\u0000\u0000\u0018\u0090\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000"+
		"\u0000\u0000\u001c\u00a4\u0001\u0000\u0000\u0000\u001e\u00ac\u0001\u0000"+
		"\u0000\u0000 \u00b1\u0001\u0000\u0000\u0000\"\u00ba\u0001\u0000\u0000"+
		"\u0000$\u00d0\u0001\u0000\u0000\u0000&\u00fb\u0001\u0000\u0000\u0000("+
		"\u00fd\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001\u0000+*\u0001\u0000"+
		"\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.0\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"01\u0003\u000e\u0007\u000012\u0005\u0000\u0000\u00012\u0001\u0001\u0000"+
		"\u0000\u000034\u0005\u0001\u0000\u000047\u0005,\u0000\u000056\u0005\f"+
		"\u0000\u000068\u0005,\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009=\u0005\u0013\u0000\u0000:<\u0003"+
		"\u0004\u0002\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0014\u0000\u0000A\u0003\u0001"+
		"\u0000\u0000\u0000BE\u0003\u0006\u0003\u0000CE\u0003\b\u0004\u0000DB\u0001"+
		"\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\u0005\u0001\u0000\u0000"+
		"\u0000FG\u0005\u0002\u0000\u0000GH\u0005,\u0000\u0000HI\u0005\u0018\u0000"+
		"\u0000IJ\u0003(\u0014\u0000JK\u0005\u0017\u0000\u0000K\u0007\u0001\u0000"+
		"\u0000\u0000LM\u0005\u0003\u0000\u0000MN\u0005,\u0000\u0000NP\u0005\u0015"+
		"\u0000\u0000OQ\u0003\n\u0005\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005\u0016\u0000\u0000ST\u0005"+
		"\u0018\u0000\u0000TU\u0003(\u0014\u0000UV\u0003\u0010\b\u0000V\t\u0001"+
		"\u0000\u0000\u0000W\\\u0003\f\u0006\u0000XY\u0005\u0019\u0000\u0000Y["+
		"\u0003\f\u0006\u0000ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u000b\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005,\u0000\u0000`a\u0005\u0018"+
		"\u0000\u0000ab\u0003(\u0014\u0000b\r\u0001\u0000\u0000\u0000cd\u0005\b"+
		"\u0000\u0000de\u0003\u0010\b\u0000e\u000f\u0001\u0000\u0000\u0000fj\u0005"+
		"\u0013\u0000\u0000gi\u0003\u0012\t\u0000hg\u0001\u0000\u0000\u0000il\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005\u0014\u0000"+
		"\u0000n\u0011\u0001\u0000\u0000\u0000op\u0003\u0014\n\u0000pq\u0005\u0017"+
		"\u0000\u0000q\u0086\u0001\u0000\u0000\u0000rs\u0003\u0016\u000b\u0000"+
		"st\u0005\u0017\u0000\u0000t\u0086\u0001\u0000\u0000\u0000uv\u0003\u0018"+
		"\f\u0000vw\u0005\u0017\u0000\u0000w\u0086\u0001\u0000\u0000\u0000xy\u0003"+
		"\u001a\r\u0000yz\u0005\u0017\u0000\u0000z\u0086\u0001\u0000\u0000\u0000"+
		"{|\u0003\u001e\u000f\u0000|}\u0005\u0017\u0000\u0000}\u0086\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u0004\u0000\u0000\u007f\u0080\u0003$\u0012\u0000"+
		"\u0080\u0081\u0005\u0017\u0000\u0000\u0081\u0086\u0001\u0000\u0000\u0000"+
		"\u0082\u0086\u0003 \u0010\u0000\u0083\u0086\u0003\"\u0011\u0000\u0084"+
		"\u0086\u0003\u0010\b\u0000\u0085o\u0001\u0000\u0000\u0000\u0085r\u0001"+
		"\u0000\u0000\u0000\u0085u\u0001\u0000\u0000\u0000\u0085x\u0001\u0000\u0000"+
		"\u0000\u0085{\u0001\u0000\u0000\u0000\u0085~\u0001\u0000\u0000\u0000\u0085"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0013\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0003(\u0014\u0000\u0088\u0089\u0005,\u0000\u0000\u0089\u0015\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005,\u0000\u0000\u008b\u008c\u0005\u001a"+
		"\u0000\u0000\u008c\u008d\u0005,\u0000\u0000\u008d\u008e\u0005 \u0000\u0000"+
		"\u008e\u008f\u0003$\u0012\u0000\u008f\u0017\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005,\u0000\u0000\u0091\u0092\u0005 \u0000\u0000\u0092\u0093\u0003"+
		"$\u0012\u0000\u0093\u0019\u0001\u0000\u0000\u0000\u0094\u0095\u0005,\u0000"+
		"\u0000\u0095\u0096\u0005\u001a\u0000\u0000\u0096\u0097\u0005,\u0000\u0000"+
		"\u0097\u0099\u0005\u0015\u0000\u0000\u0098\u009a\u0003\u001c\u000e\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00a3\u0005\u0016\u0000\u0000"+
		"\u009c\u009d\u0005,\u0000\u0000\u009d\u009f\u0005\u0015\u0000\u0000\u009e"+
		"\u00a0\u0003\u001c\u000e\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a3\u0005\u0016\u0000\u0000\u00a2\u0094\u0001\u0000\u0000\u0000\u00a2"+
		"\u009c\u0001\u0000\u0000\u0000\u00a3\u001b\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a9\u0003$\u0012\u0000\u00a5\u00a6\u0005\u0019\u0000\u0000\u00a6\u00a8"+
		"\u0003$\u0012\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u001d\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005\u000b\u0000\u0000\u00ad\u00ae\u0005"+
		"\u0015\u0000\u0000\u00ae\u00af\u0003$\u0012\u0000\u00af\u00b0\u0005\u0016"+
		"\u0000\u0000\u00b0\u001f\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0005"+
		"\u0000\u0000\u00b2\u00b3\u0005\u0015\u0000\u0000\u00b3\u00b4\u0003$\u0012"+
		"\u0000\u00b4\u00b5\u0005\u0016\u0000\u0000\u00b5\u00b8\u0003\u0010\b\u0000"+
		"\u00b6\u00b7\u0005\u0006\u0000\u0000\u00b7\u00b9\u0003\u0010\b\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"!\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0007\u0000\u0000\u00bb\u00bc"+
		"\u0005\u0015\u0000\u0000\u00bc\u00bd\u0003$\u0012\u0000\u00bd\u00be\u0005"+
		"\u0016\u0000\u0000\u00be\u00bf\u0003\u0010\b\u0000\u00bf#\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0006\u0012\uffff\uffff\u0000\u00c1\u00c2\u0005"+
		"(\u0000\u0000\u00c2\u00d1\u0003$\u0012\u0005\u00c3\u00c4\u0005\u0015\u0000"+
		"\u0000\u00c4\u00c5\u0003$\u0012\u0000\u00c5\u00c6\u0005\u0016\u0000\u0000"+
		"\u00c6\u00d1\u0001\u0000\u0000\u0000\u00c7\u00d1\u0003&\u0013\u0000\u00c8"+
		"\u00d1\u0005,\u0000\u0000\u00c9\u00ca\u0005\r\u0000\u0000\u00ca\u00cb"+
		"\u0005,\u0000\u0000\u00cb\u00cd\u0005\u0015\u0000\u0000\u00cc\u00ce\u0003"+
		"\u001c\u000e\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0005"+
		"\u0016\u0000\u0000\u00d0\u00c0\u0001\u0000\u0000\u0000\u00d0\u00c3\u0001"+
		"\u0000\u0000\u0000\u00d0\u00c7\u0001\u0000\u0000\u0000\u00d0\u00c8\u0001"+
		"\u0000\u0000\u0000\u00d0\u00c9\u0001\u0000\u0000\u0000\u00d1\u00f8\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\n\u0011\u0000\u0000\u00d3\u00d4\u0005\'"+
		"\u0000\u0000\u00d4\u00f7\u0003$\u0012\u0012\u00d5\u00d6\n\u0010\u0000"+
		"\u0000\u00d6\u00d7\u0005!\u0000\u0000\u00d7\u00f7\u0003$\u0012\u0011\u00d8"+
		"\u00d9\n\u000f\u0000\u0000\u00d9\u00da\u0005\"\u0000\u0000\u00da\u00f7"+
		"\u0003$\u0012\u0010\u00db\u00dc\n\u000e\u0000\u0000\u00dc\u00dd\u0005"+
		"#\u0000\u0000\u00dd\u00f7\u0003$\u0012\u000f\u00de\u00df\n\r\u0000\u0000"+
		"\u00df\u00e0\u0005$\u0000\u0000\u00e0\u00f7\u0003$\u0012\u000e\u00e1\u00e2"+
		"\n\f\u0000\u0000\u00e2\u00e3\u0005%\u0000\u0000\u00e3\u00f7\u0003$\u0012"+
		"\r\u00e4\u00e5\n\u000b\u0000\u0000\u00e5\u00e6\u0005&\u0000\u0000\u00e6"+
		"\u00f7\u0003$\u0012\f\u00e7\u00e8\n\n\u0000\u0000\u00e8\u00e9\u0005\u001b"+
		"\u0000\u0000\u00e9\u00f7\u0003$\u0012\u000b\u00ea\u00eb\n\t\u0000\u0000"+
		"\u00eb\u00ec\u0005\u001c\u0000\u0000\u00ec\u00f7\u0003$\u0012\n\u00ed"+
		"\u00ee\n\b\u0000\u0000\u00ee\u00ef\u0005\u001d\u0000\u0000\u00ef\u00f7"+
		"\u0003$\u0012\t\u00f0\u00f1\n\u0007\u0000\u0000\u00f1\u00f2\u0005\u001e"+
		"\u0000\u0000\u00f2\u00f7\u0003$\u0012\b\u00f3\u00f4\n\u0006\u0000\u0000"+
		"\u00f4\u00f5\u0005\u001f\u0000\u0000\u00f5\u00f7\u0003$\u0012\u0007\u00f6"+
		"\u00d2\u0001\u0000\u0000\u0000\u00f6\u00d5\u0001\u0000\u0000\u0000\u00f6"+
		"\u00d8\u0001\u0000\u0000\u0000\u00f6\u00db\u0001\u0000\u0000\u0000\u00f6"+
		"\u00de\u0001\u0000\u0000\u0000\u00f6\u00e1\u0001\u0000\u0000\u0000\u00f6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00f6\u00e7\u0001\u0000\u0000\u0000\u00f6"+
		"\u00ea\u0001\u0000\u0000\u0000\u00f6\u00ed\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f9%\u0001\u0000\u0000\u0000\u00fa\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0007\u0000\u0000\u0000\u00fc\'\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0007\u0001\u0000\u0000\u00fe)\u0001\u0000"+
		"\u0000\u0000\u0011-7=DP\\j\u0085\u0099\u009f\u00a2\u00a9\u00b8\u00cd\u00d0"+
		"\u00f6\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}