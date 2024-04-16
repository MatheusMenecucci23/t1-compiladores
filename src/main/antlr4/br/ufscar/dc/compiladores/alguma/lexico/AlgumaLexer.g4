lexer grammar AlgumaLexer;

LOGICO: 'logico';
E : 'e';
SETADUPLADIR:'=>';
SETADUPLAESQ: '<=';
MENORIGUAL: '=<';
MAIORIGUAL: '>=';
DIFERENTE: '<>';
IGUAL: '=';
NAO: 'nao';
OU: 'ou';
MAIOR: '>';
SE: 'se';
FIM_SE:'fim_se';
FIM_CASO: 'fim_caso';
DOUBLEPONTO: '..';
SENAO: 'senao';
ENTAO:'entao';
CASO: 'caso';
SEJA:'seja';
PARA: 'para';
ATE: 'ate';
FACA: 'faca';
FIMPARA: 'fim_para';
ENQUANTO: 'enquanto';
FIMENQUANTO: 'fim_enquanto';
CONSTANTE: 'constante';
TIPO : 'tipo';
REGISTRO: 'registro';
FIM_REGISTRO: 'fim_registro';
FECHACOLCHETES: ']';
ABRECOLCHETES: '[';
FUNCAO: 'funcao';
FIMFUNCAO: 'fim_funcao';
PONTO:'.';
PROCEDIMENTO: 'procedimento';
FIMPROCEDIMENTO: 'fim_procedimento';
VARIAVEL: 'var';
RETORNE: 'retorne';
VERDADEIRA: 'verdadeiro';
FALSO: 'falso';
ALGORITMO : 'algoritmo' {System.out.println("<'algoritmo','algoritmo'>");};
DECLARE : 'declare' {System.out.println("<'declare','declare'>");};
LITERAL : 'literal' {System.out.println("<'literal','literal'>");};
INTEIRO : 'inteiro' {System.out.println("<'inteiro','inteiro'>");};
LEIA : 'leia' {System.out.println("<'leia','leia'>");};
ESCREVA : 'escreva' {System.out.println("<'escreva','escreva'>");};
CADEIA : '"' (~["\r\n])* '"' {System.out.println("<'"+getText()+"',CADEIA>");};
LPAREN : '(' {System.out.println("<'(','('>");};
RPAREN : ')' {System.out.println("<')',')'>");};
COLON : ':' {System.out.println("<':',':'>");};
COMMA : ',' {System.out.println("<',',','>");};
FIM_ALGORITMO : 'fim_algoritmo' {System.out.println("<'fim_algoritmo','fim_algoritmo'>");};

fragment Letra : [a-zA-Z];
fragment Digito : [0-9];
HIFEN: '-';  

ADICAO : '+' {System.out.println("<'+','+'>");};
BARRA: '/' {System.out.println("<'/','/'>");};
REAL: 'real' {System.out.println("<'real','real'>");};


NUM_INT	: ('0'..'9')+;
NUM_REAL : ('0'..'9')+ ('.' ('0'..'9')+)?;



SETA: '<-'{System.out.println("<'<-','<-'>");};

Comentario : '{' ~('}')* '}' -> skip ; // Descarta os comentários dentro de { e }
COMENTARIO_NAO_FECHADO: '{' ~('\n'|'}')* '\n' {_input.seek(_input.size());};

ASTERISCO: '*' {System.out.println("<'*','*'>");};

MENOR: '<';



DIGITO: '0'..'9';

PORCENTAGEM:'%';
ACENTOVOVO: '^';
ECOMERCIAL: '&';
Whitespace : [ \t\r\n] -> skip ;
IDENT: Letra (Letra | Digito | '_')* {System.out.println("<'"+getText()+"',IDENT>");};

CADEIA_NAO_FECHADA: '"' .*? {System.err.println("Linha " + getLine() + ": cadeia literal não fechada"); _input.seek(_input.size());}; // Detecta a cadeia não fechada e ignora o restante do input

SimboloNaoIdentificado: . { System.out.println("Linha " + getLine() + ":"+ getText() + " - símbolo não identificado "); _input.seek(_input.size()); };
 
