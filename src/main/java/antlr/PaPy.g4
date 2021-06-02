// ANTLR4
// PaPy.g4

grammar PaPy;
@header { package antlr;}
// --- TOKENS ---

NL: '\r'?'\n';
LBR: '{';
RBR: '}';
LPAR: '(';
RPAR: ')';
LSQBR: '[';
RSQBR: ']';
INT: '0' | [1-9][0-9]*;
FLOAT: INT DOT INT;
//SCIENTIFIC: FLOAT 'E'[+-]? INT;
STRING: '"' ~["]* '"';
INT_TYPE: 'int';
FLOAT_TYPE: 'float';
BOOL_TYPE: 'bool';
STRING_TYPE: 'string';
COMMENT: '#' (~[\r\n])* -> skip;
FOR: 'for';
IN: 'in';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
ELIF: 'elif';
MUL: '*';
ADD: '+';
SUB: '-';
DIV: '/';
REMOVE_AT: '@-';
ASSIGN: '=';
EQ: '==';
NEQ: '!=';
LTE: '<=';
GTE: '>=';
GT: '>';
LT: '<';
AND: 'and';
OR: 'or';
NOT: 'not';
TRUE: 'True';
FALSE: 'False';
DEF: 'def';
RET: 'ret';
RETURN: 'return';
COMMA: ',';
DOT: '.';
TAB: '\t';
SPACES: [ ]+ -> skip; // https://stackoverflow.com/questions/15503561/antlr4-whitespace-handling
IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]*;
// --- RULES ---

program: section* EOF;

section:
    statement
    | functionDeclaration
    | NL;

statement:
  (expression
  | variableDeclaration
  | loopStatement
  | funcCall
  | ifStatement) NL;

expression:
  arithmeticExpression
  | logicalExpression
  | value;

arithmeticExpression:
     LPAR arithmeticExpression RPAR
     | arithmeticExpression MUL arithmeticExpression
     | arithmeticExpression DIV arithmeticExpression
     | arithmeticExpression ADD arithmeticExpression
     | arithmeticExpression SUB arithmeticExpression
     | value;

logicalExpression:
  | LPAR logicalExpression RPAR
  | NOT logicalExpression
  | logicalExpression (EQ|NEQ|GTE|LTE|GT|LT) logicalExpression
  | logicalExpression AND logicalExpression
  | logicalExpression OR logicalExpression
  | value;

variableDeclaration:
  type IDENTIFIER ASSIGN expression;

loopStatement:
  forStatement
  | whileStatement;

forStatement:
  FOR IDENTIFIER IN range block;

range:
  LPAR INT DOT DOT INT RPAR;

whileStatement:
  WHILE LPAR logicalExpression RPAR block;

ifStatement:
  IF LPAR expression RPAR block (NL (elifStatement|elseStatement))?;

elifStatement:
  ELIF LPAR expression RPAR block (NL (elifStatement|elseStatement))?;

elseStatement:
  ELSE block;

block:
  NL? LBR (statement|NL)* RBR;

functionDeclaration:
  DEF IDENTIFIER LPAR (functionDeclarationArgument (COMMA functionDeclarationArgument)*)? RPAR RET type returnBlock
  | DEF IDENTIFIER LPAR (functionDeclarationArgument (COMMA functionDeclarationArgument)*)? RPAR block;

functionDeclarationArgument:
    type IDENTIFIER;

returnBlock:
  NL? LBR (statement|NL)* (RETURN expression NL?) RBR;

funcCall:
  IDENTIFIER LPAR argList? RPAR;

argList:
  value (COMMA value)*;

value:
  number
  | funcCall
  | IDENTIFIER
  | logicalValue
  | STRING;

number:
  FLOAT
  | INT;
 // | SCIENTIFIC;
logicalValue:
  TRUE
  | FALSE;

type:
  INT_TYPE
  | FLOAT_TYPE
  | BOOL_TYPE
  | STRING_TYPE;