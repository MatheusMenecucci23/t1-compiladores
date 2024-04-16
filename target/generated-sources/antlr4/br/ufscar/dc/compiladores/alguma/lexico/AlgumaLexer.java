// Generated from br/ufscar/dc/compiladores/alguma/lexico/AlgumaLexer.g4 by ANTLR 4.12.0
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LOGICO=1, E=2, SETADUPLADIR=3, SETADUPLAESQ=4, MENORIGUAL=5, MAIORIGUAL=6, 
		DIFERENTE=7, IGUAL=8, NAO=9, OU=10, MAIOR=11, SE=12, FIM_SE=13, FIM_CASO=14, 
		DOUBLEPONTO=15, SENAO=16, ENTAO=17, CASO=18, SEJA=19, PARA=20, ATE=21, 
		FACA=22, FIMPARA=23, ENQUANTO=24, FIMENQUANTO=25, CONSTANTE=26, TIPO=27, 
		REGISTRO=28, FIM_REGISTRO=29, FECHACOLCHETES=30, ABRECOLCHETES=31, FUNCAO=32, 
		FIMFUNCAO=33, PONTO=34, PROCEDIMENTO=35, FIMPROCEDIMENTO=36, VARIAVEL=37, 
		RETORNE=38, VERDADEIRA=39, FALSO=40, ALGORITMO=41, DECLARE=42, LITERAL=43, 
		INTEIRO=44, LEIA=45, ESCREVA=46, CADEIA=47, LPAREN=48, RPAREN=49, COLON=50, 
		COMMA=51, FIM_ALGORITMO=52, HIFEN=53, ADICAO=54, BARRA=55, REAL=56, NUM_INT=57, 
		NUM_REAL=58, SETA=59, Comentario=60, COMENTARIO_NAO_FECHADO=61, ASTERISCO=62, 
		MENOR=63, DIGITO=64, PORCENTAGEM=65, ACENTOVOVO=66, ECOMERCIAL=67, Whitespace=68, 
		IDENT=69, CADEIA_NAO_FECHADA=70, SimboloNaoIdentificado=71;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LOGICO", "E", "SETADUPLADIR", "SETADUPLAESQ", "MENORIGUAL", "MAIORIGUAL", 
			"DIFERENTE", "IGUAL", "NAO", "OU", "MAIOR", "SE", "FIM_SE", "FIM_CASO", 
			"DOUBLEPONTO", "SENAO", "ENTAO", "CASO", "SEJA", "PARA", "ATE", "FACA", 
			"FIMPARA", "ENQUANTO", "FIMENQUANTO", "CONSTANTE", "TIPO", "REGISTRO", 
			"FIM_REGISTRO", "FECHACOLCHETES", "ABRECOLCHETES", "FUNCAO", "FIMFUNCAO", 
			"PONTO", "PROCEDIMENTO", "FIMPROCEDIMENTO", "VARIAVEL", "RETORNE", "VERDADEIRA", 
			"FALSO", "ALGORITMO", "DECLARE", "LITERAL", "INTEIRO", "LEIA", "ESCREVA", 
			"CADEIA", "LPAREN", "RPAREN", "COLON", "COMMA", "FIM_ALGORITMO", "Letra", 
			"Digito", "HIFEN", "ADICAO", "BARRA", "REAL", "NUM_INT", "NUM_REAL", 
			"SETA", "Comentario", "COMENTARIO_NAO_FECHADO", "ASTERISCO", "MENOR", 
			"DIGITO", "PORCENTAGEM", "ACENTOVOVO", "ECOMERCIAL", "Whitespace", "IDENT", 
			"CADEIA_NAO_FECHADA", "SimboloNaoIdentificado"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'logico'", "'e'", "'=>'", "'<='", "'=<'", "'>='", "'<>'", "'='", 
			"'nao'", "'ou'", "'>'", "'se'", "'fim_se'", "'fim_caso'", "'..'", "'senao'", 
			"'entao'", "'caso'", "'seja'", "'para'", "'ate'", "'faca'", "'fim_para'", 
			"'enquanto'", "'fim_enquanto'", "'constante'", "'tipo'", "'registro'", 
			"'fim_registro'", "']'", "'['", "'funcao'", "'fim_funcao'", "'.'", "'procedimento'", 
			"'fim_procedimento'", "'var'", "'retorne'", "'verdadeiro'", "'falso'", 
			"'algoritmo'", "'declare'", "'literal'", "'inteiro'", "'leia'", "'escreva'", 
			null, "'('", "')'", "':'", "','", "'fim_algoritmo'", "'-'", "'+'", "'/'", 
			"'real'", null, null, "'<-'", null, null, "'*'", "'<'", null, "'%'", 
			"'^'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LOGICO", "E", "SETADUPLADIR", "SETADUPLAESQ", "MENORIGUAL", "MAIORIGUAL", 
			"DIFERENTE", "IGUAL", "NAO", "OU", "MAIOR", "SE", "FIM_SE", "FIM_CASO", 
			"DOUBLEPONTO", "SENAO", "ENTAO", "CASO", "SEJA", "PARA", "ATE", "FACA", 
			"FIMPARA", "ENQUANTO", "FIMENQUANTO", "CONSTANTE", "TIPO", "REGISTRO", 
			"FIM_REGISTRO", "FECHACOLCHETES", "ABRECOLCHETES", "FUNCAO", "FIMFUNCAO", 
			"PONTO", "PROCEDIMENTO", "FIMPROCEDIMENTO", "VARIAVEL", "RETORNE", "VERDADEIRA", 
			"FALSO", "ALGORITMO", "DECLARE", "LITERAL", "INTEIRO", "LEIA", "ESCREVA", 
			"CADEIA", "LPAREN", "RPAREN", "COLON", "COMMA", "FIM_ALGORITMO", "HIFEN", 
			"ADICAO", "BARRA", "REAL", "NUM_INT", "NUM_REAL", "SETA", "Comentario", 
			"COMENTARIO_NAO_FECHADO", "ASTERISCO", "MENOR", "DIGITO", "PORCENTAGEM", 
			"ACENTOVOVO", "ECOMERCIAL", "Whitespace", "IDENT", "CADEIA_NAO_FECHADA", 
			"SimboloNaoIdentificado"
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


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlgumaLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 40:
			ALGORITMO_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			DECLARE_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			LITERAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			INTEIRO_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			LEIA_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			ESCREVA_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			CADEIA_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			LPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			RPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			COLON_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			COMMA_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			FIM_ALGORITMO_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			ADICAO_action((RuleContext)_localctx, actionIndex);
			break;
		case 56:
			BARRA_action((RuleContext)_localctx, actionIndex);
			break;
		case 57:
			REAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 60:
			SETA_action((RuleContext)_localctx, actionIndex);
			break;
		case 62:
			COMENTARIO_NAO_FECHADO_action((RuleContext)_localctx, actionIndex);
			break;
		case 63:
			ASTERISCO_action((RuleContext)_localctx, actionIndex);
			break;
		case 70:
			IDENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 71:
			CADEIA_NAO_FECHADA_action((RuleContext)_localctx, actionIndex);
			break;
		case 72:
			SimboloNaoIdentificado_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ALGORITMO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("<'algoritmo','algoritmo'>");
			break;
		}
	}
	private void DECLARE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("<'declare','declare'>");
			break;
		}
	}
	private void LITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("<'literal','literal'>");
			break;
		}
	}
	private void INTEIRO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("<'inteiro','inteiro'>");
			break;
		}
	}
	private void LEIA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("<'leia','leia'>");
			break;
		}
	}
	private void ESCREVA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			System.out.println("<'escreva','escreva'>");
			break;
		}
	}
	private void CADEIA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			System.out.println("<'"+getText()+"',CADEIA>");
			break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			System.out.println("<'(','('>");
			break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			System.out.println("<')',')'>");
			break;
		}
	}
	private void COLON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			System.out.println("<':',':'>");
			break;
		}
	}
	private void COMMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			System.out.println("<',',','>");
			break;
		}
	}
	private void FIM_ALGORITMO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			System.out.println("<'fim_algoritmo','fim_algoritmo'>");
			break;
		}
	}
	private void ADICAO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			System.out.println("<'+','+'>");
			break;
		}
	}
	private void BARRA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			System.out.println("<'/','/'>");
			break;
		}
	}
	private void REAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			System.out.println("<'real','real'>");
			break;
		}
	}
	private void SETA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			System.out.println("<'<-','<-'>");
			break;
		}
	}
	private void COMENTARIO_NAO_FECHADO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			_input.seek(_input.size());
			break;
		}
	}
	private void ASTERISCO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			System.out.println("<'*','*'>");
			break;
		}
	}
	private void IDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			System.out.println("<'"+getText()+"',IDENT>");
			break;
		}
	}
	private void CADEIA_NAO_FECHADA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			System.err.println("Linha " + getLine() + ": cadeia literal não fechada"); _input.seek(_input.size());
			break;
		}
	}
	private void SimboloNaoIdentificado_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			 System.out.println("Linha " + getLine() + ":"+ getText() + " - símbolo não identificado "); _input.seek(_input.size()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000G\u024f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0005.\u01c5\b.\n."+
		"\f.\u01c8\t.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00012\u00012\u00012\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00015\u00015\u00016\u00016\u00017\u0001"+
		"7\u00017\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u0001:\u0004:\u01fd\b:\u000b:\f:\u01fe\u0001;\u0004;\u0202\b"+
		";\u000b;\f;\u0203\u0001;\u0001;\u0004;\u0208\b;\u000b;\f;\u0209\u0003"+
		";\u020c\b;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0005=\u0215"+
		"\b=\n=\f=\u0218\t=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0005>\u0220"+
		"\b>\n>\f>\u0223\t>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001A\u0001A\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001E\u0001"+
		"E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0005F\u023d\bF\nF\fF\u0240"+
		"\tF\u0001F\u0001F\u0001G\u0001G\u0005G\u0246\bG\nG\fG\u0249\tG\u0001G"+
		"\u0001G\u0001H\u0001H\u0001H\u0001\u0247\u0000I\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e"+
		"3g4i\u0000k\u0000m5o6q7s8u9w:y;{<}=\u007f>\u0081?\u0083@\u0085A\u0087"+
		"B\u0089C\u008bD\u008dE\u008fF\u0091G\u0001\u0000\u0006\u0003\u0000\n\n"+
		"\r\r\"\"\u0002\u0000AZaz\u0001\u000009\u0001\u0000}}\u0002\u0000\n\n}"+
		"}\u0003\u0000\t\n\r\r  \u0257\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000"+
		"\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000"+
		"\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W"+
		"\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000"+
		"\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000"+
		"\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e"+
		"\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000m\u0001\u0000"+
		"\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000"+
		"\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w"+
		"\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{\u0001\u0000"+
		"\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001\u0000\u0000"+
		"\u0000\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083\u0001\u0000\u0000"+
		"\u0000\u0000\u0085\u0001\u0000\u0000\u0000\u0000\u0087\u0001\u0000\u0000"+
		"\u0000\u0000\u0089\u0001\u0000\u0000\u0000\u0000\u008b\u0001\u0000\u0000"+
		"\u0000\u0000\u008d\u0001\u0000\u0000\u0000\u0000\u008f\u0001\u0000\u0000"+
		"\u0000\u0000\u0091\u0001\u0000\u0000\u0000\u0001\u0093\u0001\u0000\u0000"+
		"\u0000\u0003\u009a\u0001\u0000\u0000\u0000\u0005\u009c\u0001\u0000\u0000"+
		"\u0000\u0007\u009f\u0001\u0000\u0000\u0000\t\u00a2\u0001\u0000\u0000\u0000"+
		"\u000b\u00a5\u0001\u0000\u0000\u0000\r\u00a8\u0001\u0000\u0000\u0000\u000f"+
		"\u00ab\u0001\u0000\u0000\u0000\u0011\u00ad\u0001\u0000\u0000\u0000\u0013"+
		"\u00b1\u0001\u0000\u0000\u0000\u0015\u00b4\u0001\u0000\u0000\u0000\u0017"+
		"\u00b6\u0001\u0000\u0000\u0000\u0019\u00b9\u0001\u0000\u0000\u0000\u001b"+
		"\u00c0\u0001\u0000\u0000\u0000\u001d\u00c9\u0001\u0000\u0000\u0000\u001f"+
		"\u00cc\u0001\u0000\u0000\u0000!\u00d2\u0001\u0000\u0000\u0000#\u00d8\u0001"+
		"\u0000\u0000\u0000%\u00dd\u0001\u0000\u0000\u0000\'\u00e2\u0001\u0000"+
		"\u0000\u0000)\u00e7\u0001\u0000\u0000\u0000+\u00eb\u0001\u0000\u0000\u0000"+
		"-\u00f0\u0001\u0000\u0000\u0000/\u00f9\u0001\u0000\u0000\u00001\u0102"+
		"\u0001\u0000\u0000\u00003\u010f\u0001\u0000\u0000\u00005\u0119\u0001\u0000"+
		"\u0000\u00007\u011e\u0001\u0000\u0000\u00009\u0127\u0001\u0000\u0000\u0000"+
		";\u0134\u0001\u0000\u0000\u0000=\u0136\u0001\u0000\u0000\u0000?\u0138"+
		"\u0001\u0000\u0000\u0000A\u013f\u0001\u0000\u0000\u0000C\u014a\u0001\u0000"+
		"\u0000\u0000E\u014c\u0001\u0000\u0000\u0000G\u0159\u0001\u0000\u0000\u0000"+
		"I\u016a\u0001\u0000\u0000\u0000K\u016e\u0001\u0000\u0000\u0000M\u0176"+
		"\u0001\u0000\u0000\u0000O\u0181\u0001\u0000\u0000\u0000Q\u0187\u0001\u0000"+
		"\u0000\u0000S\u0193\u0001\u0000\u0000\u0000U\u019d\u0001\u0000\u0000\u0000"+
		"W\u01a7\u0001\u0000\u0000\u0000Y\u01b1\u0001\u0000\u0000\u0000[\u01b8"+
		"\u0001\u0000\u0000\u0000]\u01c2\u0001\u0000\u0000\u0000_\u01cc\u0001\u0000"+
		"\u0000\u0000a\u01cf\u0001\u0000\u0000\u0000c\u01d2\u0001\u0000\u0000\u0000"+
		"e\u01d5\u0001\u0000\u0000\u0000g\u01d8\u0001\u0000\u0000\u0000i\u01e8"+
		"\u0001\u0000\u0000\u0000k\u01ea\u0001\u0000\u0000\u0000m\u01ec\u0001\u0000"+
		"\u0000\u0000o\u01ee\u0001\u0000\u0000\u0000q\u01f1\u0001\u0000\u0000\u0000"+
		"s\u01f4\u0001\u0000\u0000\u0000u\u01fc\u0001\u0000\u0000\u0000w\u0201"+
		"\u0001\u0000\u0000\u0000y\u020d\u0001\u0000\u0000\u0000{\u0212\u0001\u0000"+
		"\u0000\u0000}\u021d\u0001\u0000\u0000\u0000\u007f\u0227\u0001\u0000\u0000"+
		"\u0000\u0081\u022a\u0001\u0000\u0000\u0000\u0083\u022c\u0001\u0000\u0000"+
		"\u0000\u0085\u022e\u0001\u0000\u0000\u0000\u0087\u0230\u0001\u0000\u0000"+
		"\u0000\u0089\u0232\u0001\u0000\u0000\u0000\u008b\u0234\u0001\u0000\u0000"+
		"\u0000\u008d\u0238\u0001\u0000\u0000\u0000\u008f\u0243\u0001\u0000\u0000"+
		"\u0000\u0091\u024c\u0001\u0000\u0000\u0000\u0093\u0094\u0005l\u0000\u0000"+
		"\u0094\u0095\u0005o\u0000\u0000\u0095\u0096\u0005g\u0000\u0000\u0096\u0097"+
		"\u0005i\u0000\u0000\u0097\u0098\u0005c\u0000\u0000\u0098\u0099\u0005o"+
		"\u0000\u0000\u0099\u0002\u0001\u0000\u0000\u0000\u009a\u009b\u0005e\u0000"+
		"\u0000\u009b\u0004\u0001\u0000\u0000\u0000\u009c\u009d\u0005=\u0000\u0000"+
		"\u009d\u009e\u0005>\u0000\u0000\u009e\u0006\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005<\u0000\u0000\u00a0\u00a1\u0005=\u0000\u0000\u00a1\b\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005=\u0000\u0000\u00a3\u00a4\u0005<\u0000"+
		"\u0000\u00a4\n\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005>\u0000\u0000"+
		"\u00a6\u00a7\u0005=\u0000\u0000\u00a7\f\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005<\u0000\u0000\u00a9\u00aa\u0005>\u0000\u0000\u00aa\u000e\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005=\u0000\u0000\u00ac\u0010\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005n\u0000\u0000\u00ae\u00af\u0005a\u0000\u0000"+
		"\u00af\u00b0\u0005o\u0000\u0000\u00b0\u0012\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0005o\u0000\u0000\u00b2\u00b3\u0005u\u0000\u0000\u00b3\u0014\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005>\u0000\u0000\u00b5\u0016\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005s\u0000\u0000\u00b7\u00b8\u0005e\u0000\u0000"+
		"\u00b8\u0018\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005f\u0000\u0000\u00ba"+
		"\u00bb\u0005i\u0000\u0000\u00bb\u00bc\u0005m\u0000\u0000\u00bc\u00bd\u0005"+
		"_\u0000\u0000\u00bd\u00be\u0005s\u0000\u0000\u00be\u00bf\u0005e\u0000"+
		"\u0000\u00bf\u001a\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005f\u0000\u0000"+
		"\u00c1\u00c2\u0005i\u0000\u0000\u00c2\u00c3\u0005m\u0000\u0000\u00c3\u00c4"+
		"\u0005_\u0000\u0000\u00c4\u00c5\u0005c\u0000\u0000\u00c5\u00c6\u0005a"+
		"\u0000\u0000\u00c6\u00c7\u0005s\u0000\u0000\u00c7\u00c8\u0005o\u0000\u0000"+
		"\u00c8\u001c\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005.\u0000\u0000\u00ca"+
		"\u00cb\u0005.\u0000\u0000\u00cb\u001e\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005s\u0000\u0000\u00cd\u00ce\u0005e\u0000\u0000\u00ce\u00cf\u0005n"+
		"\u0000\u0000\u00cf\u00d0\u0005a\u0000\u0000\u00d0\u00d1\u0005o\u0000\u0000"+
		"\u00d1 \u0001\u0000\u0000\u0000\u00d2\u00d3\u0005e\u0000\u0000\u00d3\u00d4"+
		"\u0005n\u0000\u0000\u00d4\u00d5\u0005t\u0000\u0000\u00d5\u00d6\u0005a"+
		"\u0000\u0000\u00d6\u00d7\u0005o\u0000\u0000\u00d7\"\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005c\u0000\u0000\u00d9\u00da\u0005a\u0000\u0000\u00da"+
		"\u00db\u0005s\u0000\u0000\u00db\u00dc\u0005o\u0000\u0000\u00dc$\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005s\u0000\u0000\u00de\u00df\u0005e\u0000"+
		"\u0000\u00df\u00e0\u0005j\u0000\u0000\u00e0\u00e1\u0005a\u0000\u0000\u00e1"+
		"&\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005p\u0000\u0000\u00e3\u00e4\u0005"+
		"a\u0000\u0000\u00e4\u00e5\u0005r\u0000\u0000\u00e5\u00e6\u0005a\u0000"+
		"\u0000\u00e6(\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005a\u0000\u0000\u00e8"+
		"\u00e9\u0005t\u0000\u0000\u00e9\u00ea\u0005e\u0000\u0000\u00ea*\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005f\u0000\u0000\u00ec\u00ed\u0005a\u0000"+
		"\u0000\u00ed\u00ee\u0005c\u0000\u0000\u00ee\u00ef\u0005a\u0000\u0000\u00ef"+
		",\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005f\u0000\u0000\u00f1\u00f2\u0005"+
		"i\u0000\u0000\u00f2\u00f3\u0005m\u0000\u0000\u00f3\u00f4\u0005_\u0000"+
		"\u0000\u00f4\u00f5\u0005p\u0000\u0000\u00f5\u00f6\u0005a\u0000\u0000\u00f6"+
		"\u00f7\u0005r\u0000\u0000\u00f7\u00f8\u0005a\u0000\u0000\u00f8.\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005e\u0000\u0000\u00fa\u00fb\u0005n\u0000"+
		"\u0000\u00fb\u00fc\u0005q\u0000\u0000\u00fc\u00fd\u0005u\u0000\u0000\u00fd"+
		"\u00fe\u0005a\u0000\u0000\u00fe\u00ff\u0005n\u0000\u0000\u00ff\u0100\u0005"+
		"t\u0000\u0000\u0100\u0101\u0005o\u0000\u0000\u01010\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0005f\u0000\u0000\u0103\u0104\u0005i\u0000\u0000\u0104"+
		"\u0105\u0005m\u0000\u0000\u0105\u0106\u0005_\u0000\u0000\u0106\u0107\u0005"+
		"e\u0000\u0000\u0107\u0108\u0005n\u0000\u0000\u0108\u0109\u0005q\u0000"+
		"\u0000\u0109\u010a\u0005u\u0000\u0000\u010a\u010b\u0005a\u0000\u0000\u010b"+
		"\u010c\u0005n\u0000\u0000\u010c\u010d\u0005t\u0000\u0000\u010d\u010e\u0005"+
		"o\u0000\u0000\u010e2\u0001\u0000\u0000\u0000\u010f\u0110\u0005c\u0000"+
		"\u0000\u0110\u0111\u0005o\u0000\u0000\u0111\u0112\u0005n\u0000\u0000\u0112"+
		"\u0113\u0005s\u0000\u0000\u0113\u0114\u0005t\u0000\u0000\u0114\u0115\u0005"+
		"a\u0000\u0000\u0115\u0116\u0005n\u0000\u0000\u0116\u0117\u0005t\u0000"+
		"\u0000\u0117\u0118\u0005e\u0000\u0000\u01184\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005t\u0000\u0000\u011a\u011b\u0005i\u0000\u0000\u011b\u011c\u0005"+
		"p\u0000\u0000\u011c\u011d\u0005o\u0000\u0000\u011d6\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0005r\u0000\u0000\u011f\u0120\u0005e\u0000\u0000\u0120"+
		"\u0121\u0005g\u0000\u0000\u0121\u0122\u0005i\u0000\u0000\u0122\u0123\u0005"+
		"s\u0000\u0000\u0123\u0124\u0005t\u0000\u0000\u0124\u0125\u0005r\u0000"+
		"\u0000\u0125\u0126\u0005o\u0000\u0000\u01268\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0005f\u0000\u0000\u0128\u0129\u0005i\u0000\u0000\u0129\u012a\u0005"+
		"m\u0000\u0000\u012a\u012b\u0005_\u0000\u0000\u012b\u012c\u0005r\u0000"+
		"\u0000\u012c\u012d\u0005e\u0000\u0000\u012d\u012e\u0005g\u0000\u0000\u012e"+
		"\u012f\u0005i\u0000\u0000\u012f\u0130\u0005s\u0000\u0000\u0130\u0131\u0005"+
		"t\u0000\u0000\u0131\u0132\u0005r\u0000\u0000\u0132\u0133\u0005o\u0000"+
		"\u0000\u0133:\u0001\u0000\u0000\u0000\u0134\u0135\u0005]\u0000\u0000\u0135"+
		"<\u0001\u0000\u0000\u0000\u0136\u0137\u0005[\u0000\u0000\u0137>\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0005f\u0000\u0000\u0139\u013a\u0005u\u0000"+
		"\u0000\u013a\u013b\u0005n\u0000\u0000\u013b\u013c\u0005c\u0000\u0000\u013c"+
		"\u013d\u0005a\u0000\u0000\u013d\u013e\u0005o\u0000\u0000\u013e@\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0005f\u0000\u0000\u0140\u0141\u0005i\u0000"+
		"\u0000\u0141\u0142\u0005m\u0000\u0000\u0142\u0143\u0005_\u0000\u0000\u0143"+
		"\u0144\u0005f\u0000\u0000\u0144\u0145\u0005u\u0000\u0000\u0145\u0146\u0005"+
		"n\u0000\u0000\u0146\u0147\u0005c\u0000\u0000\u0147\u0148\u0005a\u0000"+
		"\u0000\u0148\u0149\u0005o\u0000\u0000\u0149B\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0005.\u0000\u0000\u014bD\u0001\u0000\u0000\u0000\u014c\u014d\u0005"+
		"p\u0000\u0000\u014d\u014e\u0005r\u0000\u0000\u014e\u014f\u0005o\u0000"+
		"\u0000\u014f\u0150\u0005c\u0000\u0000\u0150\u0151\u0005e\u0000\u0000\u0151"+
		"\u0152\u0005d\u0000\u0000\u0152\u0153\u0005i\u0000\u0000\u0153\u0154\u0005"+
		"m\u0000\u0000\u0154\u0155\u0005e\u0000\u0000\u0155\u0156\u0005n\u0000"+
		"\u0000\u0156\u0157\u0005t\u0000\u0000\u0157\u0158\u0005o\u0000\u0000\u0158"+
		"F\u0001\u0000\u0000\u0000\u0159\u015a\u0005f\u0000\u0000\u015a\u015b\u0005"+
		"i\u0000\u0000\u015b\u015c\u0005m\u0000\u0000\u015c\u015d\u0005_\u0000"+
		"\u0000\u015d\u015e\u0005p\u0000\u0000\u015e\u015f\u0005r\u0000\u0000\u015f"+
		"\u0160\u0005o\u0000\u0000\u0160\u0161\u0005c\u0000\u0000\u0161\u0162\u0005"+
		"e\u0000\u0000\u0162\u0163\u0005d\u0000\u0000\u0163\u0164\u0005i\u0000"+
		"\u0000\u0164\u0165\u0005m\u0000\u0000\u0165\u0166\u0005e\u0000\u0000\u0166"+
		"\u0167\u0005n\u0000\u0000\u0167\u0168\u0005t\u0000\u0000\u0168\u0169\u0005"+
		"o\u0000\u0000\u0169H\u0001\u0000\u0000\u0000\u016a\u016b\u0005v\u0000"+
		"\u0000\u016b\u016c\u0005a\u0000\u0000\u016c\u016d\u0005r\u0000\u0000\u016d"+
		"J\u0001\u0000\u0000\u0000\u016e\u016f\u0005r\u0000\u0000\u016f\u0170\u0005"+
		"e\u0000\u0000\u0170\u0171\u0005t\u0000\u0000\u0171\u0172\u0005o\u0000"+
		"\u0000\u0172\u0173\u0005r\u0000\u0000\u0173\u0174\u0005n\u0000\u0000\u0174"+
		"\u0175\u0005e\u0000\u0000\u0175L\u0001\u0000\u0000\u0000\u0176\u0177\u0005"+
		"v\u0000\u0000\u0177\u0178\u0005e\u0000\u0000\u0178\u0179\u0005r\u0000"+
		"\u0000\u0179\u017a\u0005d\u0000\u0000\u017a\u017b\u0005a\u0000\u0000\u017b"+
		"\u017c\u0005d\u0000\u0000\u017c\u017d\u0005e\u0000\u0000\u017d\u017e\u0005"+
		"i\u0000\u0000\u017e\u017f\u0005r\u0000\u0000\u017f\u0180\u0005o\u0000"+
		"\u0000\u0180N\u0001\u0000\u0000\u0000\u0181\u0182\u0005f\u0000\u0000\u0182"+
		"\u0183\u0005a\u0000\u0000\u0183\u0184\u0005l\u0000\u0000\u0184\u0185\u0005"+
		"s\u0000\u0000\u0185\u0186\u0005o\u0000\u0000\u0186P\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0005a\u0000\u0000\u0188\u0189\u0005l\u0000\u0000\u0189"+
		"\u018a\u0005g\u0000\u0000\u018a\u018b\u0005o\u0000\u0000\u018b\u018c\u0005"+
		"r\u0000\u0000\u018c\u018d\u0005i\u0000\u0000\u018d\u018e\u0005t\u0000"+
		"\u0000\u018e\u018f\u0005m\u0000\u0000\u018f\u0190\u0005o\u0000\u0000\u0190"+
		"\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0006(\u0000\u0000\u0192R\u0001"+
		"\u0000\u0000\u0000\u0193\u0194\u0005d\u0000\u0000\u0194\u0195\u0005e\u0000"+
		"\u0000\u0195\u0196\u0005c\u0000\u0000\u0196\u0197\u0005l\u0000\u0000\u0197"+
		"\u0198\u0005a\u0000\u0000\u0198\u0199\u0005r\u0000\u0000\u0199\u019a\u0005"+
		"e\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0006)\u0001"+
		"\u0000\u019cT\u0001\u0000\u0000\u0000\u019d\u019e\u0005l\u0000\u0000\u019e"+
		"\u019f\u0005i\u0000\u0000\u019f\u01a0\u0005t\u0000\u0000\u01a0\u01a1\u0005"+
		"e\u0000\u0000\u01a1\u01a2\u0005r\u0000\u0000\u01a2\u01a3\u0005a\u0000"+
		"\u0000\u01a3\u01a4\u0005l\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0006*\u0002\u0000\u01a6V\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0005i\u0000\u0000\u01a8\u01a9\u0005n\u0000\u0000\u01a9\u01aa\u0005t"+
		"\u0000\u0000\u01aa\u01ab\u0005e\u0000\u0000\u01ab\u01ac\u0005i\u0000\u0000"+
		"\u01ac\u01ad\u0005r\u0000\u0000\u01ad\u01ae\u0005o\u0000\u0000\u01ae\u01af"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0006+\u0003\u0000\u01b0X\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b2\u0005l\u0000\u0000\u01b2\u01b3\u0005e\u0000\u0000"+
		"\u01b3\u01b4\u0005i\u0000\u0000\u01b4\u01b5\u0005a\u0000\u0000\u01b5\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0006,\u0004\u0000\u01b7Z\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0005e\u0000\u0000\u01b9\u01ba\u0005s\u0000\u0000"+
		"\u01ba\u01bb\u0005c\u0000\u0000\u01bb\u01bc\u0005r\u0000\u0000\u01bc\u01bd"+
		"\u0005e\u0000\u0000\u01bd\u01be\u0005v\u0000\u0000\u01be\u01bf\u0005a"+
		"\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0006-\u0005"+
		"\u0000\u01c1\\\u0001\u0000\u0000\u0000\u01c2\u01c6\u0005\"\u0000\u0000"+
		"\u01c3\u01c5\b\u0000\u0000\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\"\u0000\u0000\u01ca\u01cb"+
		"\u0006.\u0006\u0000\u01cb^\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005("+
		"\u0000\u0000\u01cd\u01ce\u0006/\u0007\u0000\u01ce`\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d0\u0005)\u0000\u0000\u01d0\u01d1\u00060\b\u0000\u01d1b\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0005:\u0000\u0000\u01d3\u01d4\u00061\t"+
		"\u0000\u01d4d\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005,\u0000\u0000\u01d6"+
		"\u01d7\u00062\n\u0000\u01d7f\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005"+
		"f\u0000\u0000\u01d9\u01da\u0005i\u0000\u0000\u01da\u01db\u0005m\u0000"+
		"\u0000\u01db\u01dc\u0005_\u0000\u0000\u01dc\u01dd\u0005a\u0000\u0000\u01dd"+
		"\u01de\u0005l\u0000\u0000\u01de\u01df\u0005g\u0000\u0000\u01df\u01e0\u0005"+
		"o\u0000\u0000\u01e0\u01e1\u0005r\u0000\u0000\u01e1\u01e2\u0005i\u0000"+
		"\u0000\u01e2\u01e3\u0005t\u0000\u0000\u01e3\u01e4\u0005m\u0000\u0000\u01e4"+
		"\u01e5\u0005o\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u00063\u000b\u0000\u01e7h\u0001\u0000\u0000\u0000\u01e8\u01e9\u0007\u0001"+
		"\u0000\u0000\u01e9j\u0001\u0000\u0000\u0000\u01ea\u01eb\u0007\u0002\u0000"+
		"\u0000\u01ebl\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005-\u0000\u0000\u01ed"+
		"n\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005+\u0000\u0000\u01ef\u01f0\u0006"+
		"7\f\u0000\u01f0p\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005/\u0000\u0000"+
		"\u01f2\u01f3\u00068\r\u0000\u01f3r\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0005r\u0000\u0000\u01f5\u01f6\u0005e\u0000\u0000\u01f6\u01f7\u0005a"+
		"\u0000\u0000\u01f7\u01f8\u0005l\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u00069\u000e\u0000\u01fat\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fd\u000209\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001"+
		"\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001"+
		"\u0000\u0000\u0000\u01ffv\u0001\u0000\u0000\u0000\u0200\u0202\u000209"+
		"\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000"+
		"\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000"+
		"\u0000\u0204\u020b\u0001\u0000\u0000\u0000\u0205\u0207\u0005.\u0000\u0000"+
		"\u0206\u0208\u000209\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a"+
		"\u0001\u0000\u0000\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u0205"+
		"\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020cx\u0001"+
		"\u0000\u0000\u0000\u020d\u020e\u0005<\u0000\u0000\u020e\u020f\u0005-\u0000"+
		"\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0211\u0006<\u000f\u0000"+
		"\u0211z\u0001\u0000\u0000\u0000\u0212\u0216\u0005{\u0000\u0000\u0213\u0215"+
		"\b\u0003\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0215\u0218\u0001"+
		"\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216\u0217\u0001"+
		"\u0000\u0000\u0000\u0217\u0219\u0001\u0000\u0000\u0000\u0218\u0216\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0005}\u0000\u0000\u021a\u021b\u0001\u0000"+
		"\u0000\u0000\u021b\u021c\u0006=\u0010\u0000\u021c|\u0001\u0000\u0000\u0000"+
		"\u021d\u0221\u0005{\u0000\u0000\u021e\u0220\b\u0004\u0000\u0000\u021f"+
		"\u021e\u0001\u0000\u0000\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221"+
		"\u021f\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222"+
		"\u0224\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0005\n\u0000\u0000\u0225\u0226\u0006>\u0011\u0000\u0226~\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0005*\u0000\u0000\u0228\u0229\u0006?\u0012"+
		"\u0000\u0229\u0080\u0001\u0000\u0000\u0000\u022a\u022b\u0005<\u0000\u0000"+
		"\u022b\u0082\u0001\u0000\u0000\u0000\u022c\u022d\u000209\u0000\u022d\u0084"+
		"\u0001\u0000\u0000\u0000\u022e\u022f\u0005%\u0000\u0000\u022f\u0086\u0001"+
		"\u0000\u0000\u0000\u0230\u0231\u0005^\u0000\u0000\u0231\u0088\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0005&\u0000\u0000\u0233\u008a\u0001\u0000\u0000"+
		"\u0000\u0234\u0235\u0007\u0005\u0000\u0000\u0235\u0236\u0001\u0000\u0000"+
		"\u0000\u0236\u0237\u0006E\u0010\u0000\u0237\u008c\u0001\u0000\u0000\u0000"+
		"\u0238\u023e\u0003i4\u0000\u0239\u023d\u0003i4\u0000\u023a\u023d\u0003"+
		"k5\u0000\u023b\u023d\u0005_\u0000\u0000\u023c\u0239\u0001\u0000\u0000"+
		"\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023b\u0001\u0000\u0000"+
		"\u0000\u023d\u0240\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0241\u0001\u0000\u0000"+
		"\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0241\u0242\u0006F\u0013\u0000"+
		"\u0242\u008e\u0001\u0000\u0000\u0000\u0243\u0247\u0005\"\u0000\u0000\u0244"+
		"\u0246\t\u0000\u0000\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0246\u0249"+
		"\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0247\u0245"+
		"\u0001\u0000\u0000\u0000\u0248\u024a\u0001\u0000\u0000\u0000\u0249\u0247"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0006G\u0014\u0000\u024b\u0090\u0001"+
		"\u0000\u0000\u0000\u024c\u024d\t\u0000\u0000\u0000\u024d\u024e\u0006H"+
		"\u0015\u0000\u024e\u0092\u0001\u0000\u0000\u0000\u000b\u0000\u01c6\u01fe"+
		"\u0203\u0209\u020b\u0216\u0221\u023c\u023e\u0247\u0016\u0001(\u0000\u0001"+
		")\u0001\u0001*\u0002\u0001+\u0003\u0001,\u0004\u0001-\u0005\u0001.\u0006"+
		"\u0001/\u0007\u00010\b\u00011\t\u00012\n\u00013\u000b\u00017\f\u00018"+
		"\r\u00019\u000e\u0001<\u000f\u0006\u0000\u0000\u0001>\u0010\u0001?\u0011"+
		"\u0001F\u0012\u0001G\u0013\u0001H\u0014";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}