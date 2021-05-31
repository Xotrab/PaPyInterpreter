// ANTLR4
// PaPy.g4

grammar PaPy;

// --- TOKENS ---

NL: '\r'?'\n';
EMPTY_LINE: NL NL;
LBR: '{';
RBR: '}';
LPAR: '(';
RPAR: ')';
LSQBR: '[';
RSQBR: ']';
INT: '0' | [1-9][0-9]*;
FLOAT: INT DOT INT;
SCIENTIFIC: FLOAT 'E'[+-]? INT;
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
program: (statement|NL|functionDeclaration)* EOF;
statement:
  (expression
  | variableDeclaration
  | loopStatement
  | funcCall
  | ifStatement) NL;
expression:
  arithmeticExpression
  | logicalExpression;
arithmeticExpression:
  term
  | arithmeticExpression (ADD|SUB) arithmeticExpression;
term:
  | LPAR arithmeticExpression RPAR
  | value
  | term (MUL|DIV) term;
logicalExpression:
  logicalAnd
  | logicalExpression OR logicalExpression;
logicalAnd:
  logicalTerm
  | logicalAnd AND logicalAnd;
logicalTerm:
  logicalResult
  | NOT logicalTerm;
logicalResult:
  LPAR logicalExpression RPAR
  | value
  | logicalResult (EQ|NEQ|GTE|LTE|GT|LT) logicalResult;
variableDeclaration:
  type IDENTIFIER ASSIGN (value | arithmeticExpression | logicalExpression)
  | type LSQBR RSQBR IDENTIFIER ASSIGN listValue;
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
  IF LPAR expression RPAR block (EMPTY_LINE|elifStatement|elseStatement);
elifStatement:
  ELIF LPAR expression RPAR block (EMPTY_LINE|elifStatement|elseStatement);
elseStatement:
  ELSE block EMPTY_LINE;
block:
  NL? LBR (statement|EMPTY_LINE)* RBR;
functionDeclaration:
  DEF IDENTIFIER LPAR (type IDENTIFIER (COMMA type IDENTIFIER)*)? RPAR RET type returnBlock
  | DEF IDENTIFIER LPAR (type IDENTIFIER (COMMA type IDENTIFIER)*)? RPAR block;
returnBlock:
  NL? LBR (statement|EMPTY_LINE)* RETURN (value|expression|IDENTIFIER);
funcCall:
  IDENTIFIER LPAR argList? RPAR;

argList:
  value (COMMA value)*;
value:
  number
  | funcCall
  | IDENTIFIER
  | logicalValue
  | sequence
  | listElementAt;
number:
  FLOAT
  | INT
  | SCIENTIFIC;
logicalValue:
  TRUE
  | FALSE;
sequence:
  STRING
  | listValue;
listValue:
  LSQBR (value (COMMA value)*)? RSQBR;
listElementAt:
  IDENTIFIER LSQBR INT RSQBR;
listRemoveAt:
  IDENTIFIER REMOVE_AT INT;

type:
  INT_TYPE
  | FLOAT_TYPE
  | BOOL_TYPE
  | STRING_TYPE;