grammar Nova;

// ============================================
// REGLAS LÉXICAS (TOKENS)
// ============================================

// Palabras reservadas
CLASS       : 'class';
VAR         : 'var';
FUNC        : 'func';
RETURN      : 'return';
IF          : 'if';
ELSE        : 'else';
WHILE       : 'while';
MAIN        : 'main';
TRUE        : 'true';
FALSE       : 'false';
PRINT       : 'print';
EXTENDS     : 'extends';
NEW         : 'new';

// Tipos primitivos
INT_TYPE    : 'Int';
FLOAT_TYPE  : 'Float';
BOOL_TYPE   : 'Bool';
STRING_TYPE : 'String';
VOID_TYPE   : 'Void';

// Símbolos especiales
LBRACE      : '{';
RBRACE      : '}';
LPAREN      : '(';
RPAREN      : ')';
SEMI        : ';';
COLON       : ':';
COMMA       : ',';
DOT         : '.';

// Operadores - ORDEN IMPORTANTE (longest match)
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
DIV         : '/';
MOD         : '%';
ASSIGN      : '=';
EQ          : '==';
NEQ         : '!=';
LT          : '<';
GT          : '>';
LE          : '<=';
GE          : '>=';
AND         : '&&';
NOT         : '!';

// Literales
INT_LITERAL   : [0-9]+;
FLOAT_LITERAL : [0-9]+ '.' [0-9]+;
STRING_LITERAL : '"' (~["\r\n])* '"';
ID            : [a-zA-Z] [a-zA-Z0-9_]*;

// Espacios y comentarios
WS            : [ \t\r\n]+ -> skip;
LINE_COMMENT  : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;

// ============================================
// REGLAS SINTÁCTICAS - VERSIÓN CORREGIDA
// ============================================

// 1. ESTRUCTURA DEL PROGRAMA
programa
    : (clase)* bloqueMain EOF
    ;

// 2. DEFINICIÓN DE CLASES
clase
    : CLASS ID (EXTENDS ID)? LBRACE (miembro)* RBRACE
    ;

miembro
    : declaracionAtributo
    | declaracionMetodo
    ;

// 3. ATRIBUTOS
declaracionAtributo
    : VAR ID COLON tipo SEMI
    ;

// 4. MÉTODOS
declaracionMetodo
    : FUNC ID LPAREN parametros? RPAREN COLON tipo bloqueCodigo
    ;

parametros
    : parametro (COMMA parametro)*
    ;

parametro
    : ID COLON tipo
    ;

// 5. BLOQUE MAIN
bloqueMain
    : MAIN bloqueCodigo
    ;

// 6. BLOQUES DE CÓDIGO
bloqueCodigo
    : LBRACE sentencia* RBRACE
    ;

// 7. SENTENCIAS - CORREGIDO
sentencia
    : declaracionVariableLocal SEMI       # SentenciaDeclVar
    | asignacion SEMI                     # SentenciaAsignacion
    | asignacionVariable SEMI             # SentenciaAsignacionVar  // NUEVO: asignación a variable local
    | invocacionMetodo SEMI               # SentenciaInvocacion
    | instruccionPrint SEMI               # SentenciaPrint
    | RETURN expresion SEMI               # SentenciaReturn
    | ifSentencia                         # SentenciaIf
    | whileSentencia                      # SentenciaWhile
    | bloqueCodigo                        # SentenciaBloque
    ;

// 8. DECLARACIÓN DE VARIABLES LOCALES
declaracionVariableLocal
    : tipo ID
    ;

// 9. ASIGNACIÓN A ATRIBUTO DE OBJETO
asignacion
    : ID DOT ID ASSIGN expresion
    ;

// 10. ASIGNACIÓN A VARIABLE LOCAL - NUEVO
asignacionVariable
    : ID ASSIGN expresion
    ;

// 11. INVOCACIÓN DE MÉTODOS
invocacionMetodo
    : ID DOT ID LPAREN argumentos? RPAREN
    | ID LPAREN argumentos? RPAREN
    ;

argumentos
    : expresion (COMMA expresion)*
    ;

// 12. PRINT
instruccionPrint
    : PRINT LPAREN expresion RPAREN
    ;

// 13. ESTRUCTURAS DE CONTROL
ifSentencia
    : IF LPAREN expresion RPAREN bloqueCodigo (ELSE bloqueCodigo)?
    ;

whileSentencia
    : WHILE LPAREN expresion RPAREN bloqueCodigo
    ;

// 14. EXPRESIONES - CON PRECEDENCIA CORRECTA
expresion
    : expresion AND expresion           # ExpAnd
    | expresion EQ expresion            # ExpIgualdad
    | expresion NEQ expresion           # ExpDiferencia
    | expresion LT expresion            # ExpMenor
    | expresion GT expresion            # ExpMayor
    | expresion LE expresion            # ExpMenorIgual
    | expresion GE expresion            # ExpMayorIgual
    | expresion PLUS expresion          # ExpSuma
    | expresion MINUS expresion         # ExpResta
    | expresion MULT expresion          # ExpMultiplicacion
    | expresion DIV expresion           # ExpDivision
    | expresion MOD expresion           # ExpModulo
    | NOT expresion                     # ExpNot
    | LPAREN expresion RPAREN           # ExpParentesis
    | literal                           # ExpLiteral
    | ID                                # ExpID
    | NEW ID LPAREN argumentos? RPAREN  # ExpNew
    ;

// 15. LITERALES
literal
    : INT_LITERAL
    | FLOAT_LITERAL
    | STRING_LITERAL
    | TRUE
    | FALSE
    ;

// 16. TIPOS
tipo
    : INT_TYPE
    | FLOAT_TYPE
    | BOOL_TYPE
    | STRING_TYPE
    | VOID_TYPE
    | ID
    ;