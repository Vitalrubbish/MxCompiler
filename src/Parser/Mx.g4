grammar Mx;

program: (classDef|function|statement)+ EOF ;

varDef:

    type Identifier ('=' expression)? ';' ;

classDef:

    'class' Identifier '{' ( varDef | function )* '}' ';' ;

parameterList : type Identifier (',' type Identifier)* ;

function

    : type Identifier '(' parameterList? ')' '{' ( statement | expression )* '}'  #normalFunction
    
    | Identifier '(' ')' '{'  ( statement | expression ) '}'       #constructFunction

    ;

suite: '{' statement* '}' ;

statement

    : suite                                                        #block

    | varDef                                                       #varDefStmt

    | If '(' expression ')' trueStmt = statement
      (Else falseStmt = statement)?                                #ifStmt
    
    | For '(' initialStmt = statement ';' forConditionExpression = expression ';' stepExpression = expression ')' 
      '{' ( trueStmt = statement | trueExpr = expression ) '}'     #forStmt

    | While '(' conditionExpr = expression ')' statement           #whileStmt

    | Break                                                        #breakStmt

    | Continue                                                     #continueStmt

    | Return expression ';'                                        #returnStmt
    
    | expression ';'                                               #exprStmt

    | ';'                                                          #pureStmt
    
    ;

type

    : Int                                                          #intType

    | Bool                                                         #boolType

    | Void                                                         #VoidType

    | String                                                       #StringType

    | Identifier                                                   #ClassType
    
    ;

expression

    : <assoc=right> expression Assign expression                       #assignExpr

    | expression '?' expression ':' expression                         #ternaryExpr

    | expression '||' expression                                       #lorExpr

    | expression '&&' expression                                       #landExpr

    | expression '|' expression                                        #orExpr

    | expression '^' expression                                        #xorExpr

    | expression '&' expression                                        #andExpr

    | expression Equal expression                                      #equalExpr

    | expression NotEqual expression                                   #notEqualExpr

    | expression '<' expression                                        #lessExpr

    | expression '>' expression                                        #greaterExpr

    | expression '<=' expression                                       #leqslantExpr

    | expression '>=' expression                                       #geqslantExpr

    | expression '<<' expression                                       #shiftLeftExpr

    | expression '>>' expression                                       #shiftRightExpr

    | expression '+' expression                                        #addExpr

    | expression '-' expression                                        #subExpr

    | expression '*' expression                                        #mulExpr

    | expression '/' expression                                        #divExpr

    | expression '%' expression                                        #modExpr

    | '++' expression                                                 #preIncExpr

    | '--' expression                                                 #preDecExpr

    | '!' expression                                                  #lnotExpr

    | '~' expression                                                  #notExpr

    | '-' expression                                                  #negExpr

    | expression '++'                                                 #postIncExpr

    | expression '--'                                                 #postDecExpr

    | expression '[' expression ']'                                   #arrayAccess

    | expression '.' Identifier                                       #memberAccess

    | expression '.' 'size' '(' ')'                                   #arraySizeMethod

    | expression '.' 'length' '(' ')'                                 #stringLengthMethod

    | expression '.' 'substring' '(' expression ',' expression ')'    #stringSubstringMethod

    | expression '.' 'parseInt' '(' ')'                               #stringParseIntMethod

    | expression '.' 'ord' '(' expression ')'                         #stringOrdMethod

    | expression '(' parameterList? ')'                               #funcCall

    | 'new' creator                                                   #newExpr

    | arrayLiteral                                                    #arrayLiteralExpr

    | '(' expression ')'                                              #parenExpr

    | 'this'                                                          #thisExpr

    | Identifier                                                      #identifierExpr

    | DecimalInteger                                                  #intLiteral

    | StringLiteral                                                   #stringLiteral

    | 'true'                                                          #trueLiteral

    | 'false'                                                         #falseLiteral

    | 'null'                                                          #nullLiteral

    ;

creator

    : type ('[' expression ']')+ ('[' ']')*                          #arrayCreator

    | type '(' ')'                                                   #classCreator
    
    ;

arrayLiteral : '{' (expression (',' expression)*)? '}' ;

StringLiteral : '"' ( ~["\\] | '\\' .)* '"' ;

True : 'true';

False: 'false';

Int : 'int';

Bool : 'bool';

Void : 'void';

String : 'string';

If : 'if';

Else : 'else';

For : 'for';

While : 'while';

Break : 'break';

Continue : 'continue';

Return : 'return';

LeftParen : '(';

RightParen : ')';

LeftBracket : '[';

RightBracket : ']';

LeftBrace : '{';

RightBrace : '}';

Less : '<';

LessEqual : '<=';

Greater : '>';

GreaterEqual : '>=';

LeftShift : '<<';

RightShift : '>>';

Plus : '+';

Minus : '-';

Mult : '*';

Div : '/';

And : '&';

Or : '|';

Land : '&&';

Lor : '||';

Xor : '^';

Lnot : '!';

Tilde : '~';

Question : '?';

Colon : ':';

Semi : ';';

Comma : ',';

SelfInc : '++';

SelfDec : '--';

Dot : '.';

Assign : '=';

Equal : '==';

NotEqual : '!=';

Identifier

    : [a-zA-Z] [a-zA-Z_0-9]*

    ;

DecimalInteger

    : [1-9] [0-9]*

    | '0'

    ;

Whitespace

    :   [ \t]+

        -> skip

    ;

Newline

    :   (   '\r' '\n'?

        |   '\n'

        )

        -> skip

    ;

BlockComment

    :   '/*' .*? '*/'

        -> skip

    ;

LineComment

    :   '//' ~[\r\n]*

        -> skip

    ;