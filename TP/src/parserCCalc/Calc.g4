grammar Calc;

// syntactic rules

program  : function* body EOF
         ;
function : head body
         ;
head     : LPAR functionid variableid* RPAR // to change
         ;
body     : definition* expression
         ;
definition : variableid ASSERT expression
           | LPAR definition RPAR
           ;

expression : LITERAL                                                          # LiteralExpression
           | BOOLEAN                                                          # BooleanExpression
           | variableid                                                       # VariableExpression
           | (MINUS | EX) expression                                          # UnaryExpression
           | expression (TIMES | DIVIDE) expression                           # BinaryExpression
           | expression (PLUS | MINUS | EQUALITYRULES | AND | OR) expression  # BinaryExpression
           | 'if' expression expression expression                            # ConditionalExpression
           | functionid expression*                                           # FunctionCallExpression
           | LPAR expression RPAR                                             # ParenthesisExpression
           | <assoc=right> expression MARK expression COLON expression        # ConditionalExpression
           ;

variableid : IDENTIFIER
           ;
functionid : IDENTIFIER
           ;

// lexical rules

LPAR : '(';
RPAR : ')';

PLUS          : '+';
MINUS         : '-';
TIMES         : '*';
DIVIDE        : '/';
EX            : '!';
ASSERT        : '=';
OR            : '||';
AND           : '&&';
EQUALITYRULES : '>' | '<' | '>=' | '<=' | '==' | '!=';
BOOLEAN       : 'true' | 'false';
MARK          : '?';
COLON         : ':';


IDENTIFIER : ('a'..'z')('a'..'z' | '0'..'9')*
         ;

LITERAL  : '0' | ('1'..'9')('0'..'9')*
         ;


// Generated from ANTLR
COMMENT : '/*' .*? '*/' -> channel(HIDDEN)
        ;

LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN)
             ;

WS : [ \t\n\r]+ -> channel(HIDDEN)
   ;

