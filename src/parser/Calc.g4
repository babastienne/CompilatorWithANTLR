grammar Calc;

// syntactic rules

program  : function* body
         ;
function : '(' 'define' head body ')'
         ;
head     : '(' functionId variableId* ')'
         ;
body     : definition* expression
         ;
definition : '(' '=' variableId* expression ')'
           ;
expression : LITERAL
           | variableId
           | '(' '-' expression tail
           | '(' OP expression expression ')'
           | '(' 'if' expression expression expression ')'
           | '(' functionId expression* ')'
           ;
tail       : ')'
           | expression ')'
           ;
variableId : IDENTIFIER
           ;
functionId : IDENTIFIER
           ;

// lexical rules

OP       : '+' | '*' | '/' | '==' | '<'
         ;

IDENTIFIER : ('a'..'z')('a'..'z' | '0'..'9')*
         ;

LITERAL  : '0' | ('1'..'9')('0'..'9')*
         ;

COMMENT : '/*' .*? '*/' -> channel(HIDDEN)
        ;

LINE_COMMENT : '//' ~'\n'* '\n' -> channel(HIDDEN)
             ;

WS : [ \t\n\r]+ -> channel(HIDDEN)
   ;

