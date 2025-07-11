// Generated from ./src/Parser/Mx.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, True=6, False=7, Int=8, Bool=9, 
		Void=10, String=11, If=12, Else=13, For=14, While=15, Break=16, Continue=17, 
		Return=18, LeftParen=19, RightParen=20, LeftBracket=21, RightBracket=22, 
		LeftBrace=23, RightBrace=24, Less=25, LessEqual=26, Greater=27, GreaterEqual=28, 
		LeftShift=29, RightShift=30, Plus=31, Minus=32, Mult=33, Div=34, And=35, 
		Or=36, Land=37, Lor=38, Xor=39, Lnot=40, Tilde=41, Question=42, Colon=43, 
		Semi=44, Comma=45, SelfInc=46, SelfDec=47, Dot=48, Assign=49, Equal=50, 
		NotEqual=51, DecimalInteger=52, Identifier=53, StringLiteral=54, Whitespace=55, 
		Newline=56, BlockComment=57, LineComment=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "True", "False", "Int", "Bool", 
			"Void", "String", "If", "Else", "For", "While", "Break", "Continue", 
			"Return", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", 
			"RightShift", "Plus", "Minus", "Mult", "Div", "And", "Or", "Land", "Lor", 
			"Xor", "Lnot", "Tilde", "Question", "Colon", "Semi", "Comma", "SelfInc", 
			"SelfDec", "Dot", "Assign", "Equal", "NotEqual", "DecimalInteger", "Identifier", 
			"StringLiteral", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'%'", "'new'", "'this'", "'null'", "'true'", "'false'", 
			"'int'", "'bool'", "'void'", "'string'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'continue'", "'return'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'-'", "'*'", 
			"'/'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", 
			"';'", "','", "'++'", "'--'", "'.'", "'='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "True", "False", "Int", "Bool", "Void", 
			"String", "If", "Else", "For", "While", "Break", "Continue", "Return", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", 
			"RightShift", "Plus", "Minus", "Mult", "Div", "And", "Or", "Land", "Lor", 
			"Xor", "Lnot", "Tilde", "Question", "Colon", "Semi", "Comma", "SelfInc", 
			"SelfDec", "Dot", "Assign", "Equal", "NotEqual", "DecimalInteger", "Identifier", 
			"StringLiteral", "Whitespace", "Newline", "BlockComment", "LineComment"
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


	public MxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mx.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0166\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\65\3\65\7\65\u0124\n\65\f\65\16\65\u0127\13"+
		"\65\3\65\5\65\u012a\n\65\3\66\3\66\7\66\u012e\n\66\f\66\16\66\u0131\13"+
		"\66\3\67\3\67\3\67\3\67\7\67\u0137\n\67\f\67\16\67\u013a\13\67\3\67\3"+
		"\67\38\68\u013f\n8\r8\168\u0140\38\38\39\39\59\u0147\n9\39\59\u014a\n"+
		"9\39\39\3:\3:\3:\3:\7:\u0152\n:\f:\16:\u0155\13:\3:\3:\3:\3:\3:\3;\3;"+
		"\3;\3;\7;\u0160\n;\f;\16;\u0163\13;\3;\3;\3\u0153\2<\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<\3\2\t\3\2\63"+
		";\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\4\2$$^^\4\2\13\13\"\"\4\2\f\f\17\17"+
		"\2\u016f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5}"+
		"\3\2\2\2\7\177\3\2\2\2\t\u0083\3\2\2\2\13\u0088\3\2\2\2\r\u008d\3\2\2"+
		"\2\17\u0092\3\2\2\2\21\u0098\3\2\2\2\23\u009c\3\2\2\2\25\u00a1\3\2\2\2"+
		"\27\u00a6\3\2\2\2\31\u00ad\3\2\2\2\33\u00b0\3\2\2\2\35\u00b5\3\2\2\2\37"+
		"\u00b9\3\2\2\2!\u00bf\3\2\2\2#\u00c5\3\2\2\2%\u00ce\3\2\2\2\'\u00d5\3"+
		"\2\2\2)\u00d7\3\2\2\2+\u00d9\3\2\2\2-\u00db\3\2\2\2/\u00dd\3\2\2\2\61"+
		"\u00df\3\2\2\2\63\u00e1\3\2\2\2\65\u00e3\3\2\2\2\67\u00e6\3\2\2\29\u00e8"+
		"\3\2\2\2;\u00eb\3\2\2\2=\u00ee\3\2\2\2?\u00f1\3\2\2\2A\u00f3\3\2\2\2C"+
		"\u00f5\3\2\2\2E\u00f7\3\2\2\2G\u00f9\3\2\2\2I\u00fb\3\2\2\2K\u00fd\3\2"+
		"\2\2M\u0100\3\2\2\2O\u0103\3\2\2\2Q\u0105\3\2\2\2S\u0107\3\2\2\2U\u0109"+
		"\3\2\2\2W\u010b\3\2\2\2Y\u010d\3\2\2\2[\u010f\3\2\2\2]\u0111\3\2\2\2_"+
		"\u0114\3\2\2\2a\u0117\3\2\2\2c\u0119\3\2\2\2e\u011b\3\2\2\2g\u011e\3\2"+
		"\2\2i\u0129\3\2\2\2k\u012b\3\2\2\2m\u0132\3\2\2\2o\u013e\3\2\2\2q\u0149"+
		"\3\2\2\2s\u014d\3\2\2\2u\u015b\3\2\2\2wx\7e\2\2xy\7n\2\2yz\7c\2\2z{\7"+
		"u\2\2{|\7u\2\2|\4\3\2\2\2}~\7\'\2\2~\6\3\2\2\2\177\u0080\7p\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7y\2\2\u0082\b\3\2\2\2\u0083\u0084\7v\2\2\u0084"+
		"\u0085\7j\2\2\u0085\u0086\7k\2\2\u0086\u0087\7u\2\2\u0087\n\3\2\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7w\2\2\u008a\u008b\7n\2\2\u008b\u008c\7n\2\2"+
		"\u008c\f\3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f\7t\2\2\u008f\u0090\7w"+
		"\2\2\u0090\u0091\7g\2\2\u0091\16\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094"+
		"\7c\2\2\u0094\u0095\7n\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097"+
		"\20\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7v\2\2\u009b"+
		"\22\3\2\2\2\u009c\u009d\7d\2\2\u009d\u009e\7q\2\2\u009e\u009f\7q\2\2\u009f"+
		"\u00a0\7n\2\2\u00a0\24\3\2\2\2\u00a1\u00a2\7x\2\2\u00a2\u00a3\7q\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7f\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7u\2\2\u00a7"+
		"\u00a8\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2"+
		"\u00ab\u00ac\7i\2\2\u00ac\30\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7"+
		"h\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3"+
		"\7u\2\2\u00b3\u00b4\7g\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7t\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7y\2\2\u00ba\u00bb"+
		"\7j\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7g\2\2\u00be"+
		" \3\2\2\2\u00bf\u00c0\7d\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7m\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7e\2\2\u00c6"+
		"\u00c7\7q\2\2\u00c7\u00c8\7p\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7k\2\2"+
		"\u00ca\u00cb\7p\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7g\2\2\u00cd$\3\2\2"+
		"\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2"+
		"\7w\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7p\2\2\u00d4&\3\2\2\2\u00d5\u00d6"+
		"\7*\2\2\u00d6(\3\2\2\2\u00d7\u00d8\7+\2\2\u00d8*\3\2\2\2\u00d9\u00da\7"+
		"]\2\2\u00da,\3\2\2\2\u00db\u00dc\7_\2\2\u00dc.\3\2\2\2\u00dd\u00de\7}"+
		"\2\2\u00de\60\3\2\2\2\u00df\u00e0\7\177\2\2\u00e0\62\3\2\2\2\u00e1\u00e2"+
		"\7>\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4\u00e5\7?\2\2\u00e5\66"+
		"\3\2\2\2\u00e6\u00e7\7@\2\2\u00e78\3\2\2\2\u00e8\u00e9\7@\2\2\u00e9\u00ea"+
		"\7?\2\2\u00ea:\3\2\2\2\u00eb\u00ec\7>\2\2\u00ec\u00ed\7>\2\2\u00ed<\3"+
		"\2\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0\7@\2\2\u00f0>\3\2\2\2\u00f1\u00f2"+
		"\7-\2\2\u00f2@\3\2\2\2\u00f3\u00f4\7/\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7"+
		",\2\2\u00f6D\3\2\2\2\u00f7\u00f8\7\61\2\2\u00f8F\3\2\2\2\u00f9\u00fa\7"+
		"(\2\2\u00faH\3\2\2\2\u00fb\u00fc\7~\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\7("+
		"\2\2\u00fe\u00ff\7(\2\2\u00ffL\3\2\2\2\u0100\u0101\7~\2\2\u0101\u0102"+
		"\7~\2\2\u0102N\3\2\2\2\u0103\u0104\7`\2\2\u0104P\3\2\2\2\u0105\u0106\7"+
		"#\2\2\u0106R\3\2\2\2\u0107\u0108\7\u0080\2\2\u0108T\3\2\2\2\u0109\u010a"+
		"\7A\2\2\u010aV\3\2\2\2\u010b\u010c\7<\2\2\u010cX\3\2\2\2\u010d\u010e\7"+
		"=\2\2\u010eZ\3\2\2\2\u010f\u0110\7.\2\2\u0110\\\3\2\2\2\u0111\u0112\7"+
		"-\2\2\u0112\u0113\7-\2\2\u0113^\3\2\2\2\u0114\u0115\7/\2\2\u0115\u0116"+
		"\7/\2\2\u0116`\3\2\2\2\u0117\u0118\7\60\2\2\u0118b\3\2\2\2\u0119\u011a"+
		"\7?\2\2\u011ad\3\2\2\2\u011b\u011c\7?\2\2\u011c\u011d\7?\2\2\u011df\3"+
		"\2\2\2\u011e\u011f\7#\2\2\u011f\u0120\7?\2\2\u0120h\3\2\2\2\u0121\u0125"+
		"\t\2\2\2\u0122\u0124\t\3\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012a\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0128\u012a\7\62\2\2\u0129\u0121\3\2\2\2\u0129\u0128\3\2\2\2\u012a"+
		"j\3\2\2\2\u012b\u012f\t\4\2\2\u012c\u012e\t\5\2\2\u012d\u012c\3\2\2\2"+
		"\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130l\3"+
		"\2\2\2\u0131\u012f\3\2\2\2\u0132\u0138\7$\2\2\u0133\u0137\n\6\2\2\u0134"+
		"\u0135\7^\2\2\u0135\u0137\13\2\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7$\2\2\u013cn\3\2\2\2\u013d"+
		"\u013f\t\7\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\b8\2\2\u0143"+
		"p\3\2\2\2\u0144\u0146\7\17\2\2\u0145\u0147\7\f\2\2\u0146\u0145\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u014a\7\f\2\2\u0149\u0144"+
		"\3\2\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b9\2\2\u014c"+
		"r\3\2\2\2\u014d\u014e\7\61\2\2\u014e\u014f\7,\2\2\u014f\u0153\3\2\2\2"+
		"\u0150\u0152\13\2\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0157\7,\2\2\u0157\u0158\7\61\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b:"+
		"\2\2\u015at\3\2\2\2\u015b\u015c\7\61\2\2\u015c\u015d\7\61\2\2\u015d\u0161"+
		"\3\2\2\2\u015e\u0160\n\b\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2"+
		"\2\2\u0164\u0165\b;\2\2\u0165v\3\2\2\2\r\2\u0125\u0129\u012f\u0136\u0138"+
		"\u0140\u0146\u0149\u0153\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}