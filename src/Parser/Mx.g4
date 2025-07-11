grammar Mx;

program: (classDef|function|statement)+ EOF ;

singleVarDef : Identifier ('=' expression)? ;

varDef : type singleVarDef (',' singleVarDef)* ';' ;

classDef :

    'class' Identifier '{' ( varDef | function )* '}' ';' ;

parameterList : type Identifier (',' type Identifier)* ;

argList : expression (',' expression)* ;

function

    : type Identifier '(' parameterList? ')' suite                 #normalFunction
    
    | Identifier '(' ')' suite                                     #constructFunction

    ;

suite: '{' statement* '}' ;

statement

    : suite                                                        #blockStmt

    | varDef                                                       #varDefStmt

    | If '(' expression ')' trueStmt = statement
      (Else falseStmt = statement)?                                #ifStmt
    
    | For '(' initialStmt = statement  forConditionExpr = expression ';' stepExpr = expression ')' 
              trueStmt = statement                                 #forStmt

    | While '(' conditionExpr = expression ')' trueStmt = statement           #whileStmt

    | Break                                                        #breakStmt

    | Continue                                                     #continueStmt

    | Return expression ';'                                        #returnStmt
    
    | expression ';'                                               #exprStmt

    | ';'                                                          #pureStmt
    
    ;

basicType

    : Int                                                          

    | Bool                                                                                                             

    | String                                                       

    | Identifier

    ;

type : basicType ('[' ']')* | Void ;

expression

    : <assoc=right> expression Assign expression                       #assignExpr

    | expression '?' expression ':' expression                         #ternaryExpr

    | expression '||' expression                                       #binaryExpr

    | expression '&&' expression                                       #binaryExpr

    | expression '|' expression                                        #binaryExpr

    | expression '^' expression                                        #binaryExpr

    | expression '&' expression                                        #binaryExpr

    | expression '==' expression                                       #binaryExpr

    | expression '!=' expression                                       #binaryExpr

    | expression '<' expression                                        #binaryExpr

    | expression '>' expression                                        #binaryExpr

    | expression '<=' expression                                       #binaryExpr

    | expression '>=' expression                                       #binaryExpr

    | expression '<<' expression                                       #binaryExpr

    | expression '>>' expression                                       #binaryExpr

    | expression '+' expression                                        #binaryExpr

    | expression '-' expression                                        #binaryExpr

    | expression '*' expression                                        #binaryExpr

    | expression '/' expression                                        #binaryExpr

    | expression '%' expression                                        #binaryExpr

    | '++' expression                                                  #unaryExpr

    | '--' expression                                                  #unaryExpr

    | '!' expression                                                   #unaryExpr

    | '~' expression                                                   #unaryExpr

    | '-' expression                                                   #unaryExpr

    | expression '++'                                                  #unaryExpr

    | expression '--'                                                  #unaryExpr

    | expression '[' expression ']'                                    #arrayAccess

    | expression '.' Identifier                                        #memberAccess

    | expression '(' argList? ')'                                      #funcCall

    | 'new' creator                                                    #newExpr

    | arrayLiteral                                                     #arrayLiteralExpr

    | '(' expression ')'                                               #parenExpr

    | 'this'                                                           #thisExpr

    | Identifier                                                       #identifierExpr

    | DecimalInteger                                                   #intLiteralExpr

    | StringLiteral                                                    #stringLiteralExpr

    | arrayLiteral                                                     #arrayLiteralExpr

    | boolLiteral                                                      #boolLiteralExpr

    | 'null'                                                           #nullLiteralExpr

    ;

creator

    : basicType ('[' expression ']')+ ('[' ']')*                       #arrayCreator

    | basicType '(' ')'                                                #classCreator
    
    | type arrayLiteral                                             #arrayCreatorWithLiteral

    ;

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

DecimalInteger

    : [1-9] [0-9]*

    | '0'

    ;

Identifier

    : [a-zA-Z] [a-zA-Z_0-9]*

    ;

arrayLiteral

    : '{' (expression (',' expression)*)? '}' 
    
    ;

boolLiteral

    : True

    | False

    ;

StringLiteral : '"' ( ~["\\] | '\\' .)* '"' ;

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