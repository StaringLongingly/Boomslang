grammar Boomslang; 

/*
/ Parser Rules
*/

init:
  program_piece+
  PROGRAM_END
  ;

program_piece:
    (comment
    | if_block
    | while_block
    | function_block
    | statement)
  NEWLINE*
  ;

// If
if_block:
  if_declaration
  (NEWLINE | SPACES)
  (if_single | if_mult)
  ;

if_mult:
  BLOCK_OPEN (NEWLINE | SPACES) program_piece+ BLOCK_CLOSE // Multiple Statements
  (else_block | BLOCK_CLOSE)
  ;

if_single:
  program_piece // Single Statement 
  else_block?
  ;

else_block:
  ELSE_START
  (NEWLINE | SPACES)
  (else_single | else_mult)
  ;

else_mult:
  BLOCK_OPEN (NEWLINE | SPACES) program_piece+ // Multiple Statements
  BLOCK_CLOSE
  ;

else_single:
  program_piece // Single Statement 
  ;

if_declaration:
  IF_START SPACES condition
  ;

// While
while_block:
  while_declaration
  program_piece+
  BLOCK_CLOSE
  ;

while_declaration:
  WHILE_START SPACES condition NEWLINE
  ;

// Function
function_block:
  function_declaration
  BLOCK_OPEN
  program_piece+
  BLOCK_CLOSE
  ;

function_declaration:
  FUNCTION_DECLARATION_START name (FUNCTION_ARGUMENTS arguments+)? NEWLINE
  ;

arguments:
  value (COMMA SPACES value)*
  ;

condition:
  value STRUNBER_COMPARISON value 
  | condition BOOL_COMPARISON condition
  | BOOL
  ;

statement:
  print
  | assign
  | return
  ;

print:
  PRINT_START value NEWLINE
  ;

assign:
  ASSIGN_START name ASSIGN_MIDDLE (NEWLINE | SPACES) value NEWLINE
  ;

return:
  FUNCTION_RETURN value NEWLINE
  ;

scan:
  SCAN_START SPACES STRUNBER
  ;

comment:
  COMMENT
  ;

name: NAME ;

// Arithmetic expressions with proper precedence
value:
  orExpr
  ;

orExpr:
  andExpr (OR andExpr)*
  ;

andExpr:
  addExpr (AND addExpr)*
  ;

addExpr:
  multExpr ((PLUS | MINUS) multExpr)*
  ;

multExpr:
  unaryExpr ((TIMES | DIVIDED_BY | MODULO) unaryExpr)*
  ;

unaryExpr:
  primaryExpr
  | MINUS primaryExpr
  ;

primaryExpr:
  STRUNBER
  | name
  | name OF arguments  // Function calls
  | scan
  | LPAREN value RPAREN
  ;

/*
/ Lexer Rules
*/

// Declaration String Fragments
PROGRAM_END: 'PLEASE LIKE AND SUBSCRIBE' ;
BLOCK_OPEN: 'RUMOR HAS IT' NEWLINE ;
BLOCK_CLOSE: SPACES? 'END OF STORY' NEWLINE ;
IF_START: 'WHAT IF' ;
ELSE_START: 'LIES!' ;
WHILE_START: 'STAY TUNED WHILE' ; 
FUNCTION_DECLARATION_START: 'DISCOVER HOW TO ' ;
FUNCTION_ARGUMENTS: ' WITH ' ;
FUNCTION_RETURN: 'SHOCKING DEVELOPMENT' (NEWLINE | SPACES) ;

SCAN_START: 'LATEST NEWS ON' ;
PRINT_START: 'YOU WON\'T WANT TO MISS ' ;
ASSIGN_START: 'EXPERTS CLAIM ' ;
ASSIGN_MIDDLE: ' TO BE' ;
fragment COMMENT_START: 'UNCONFIRMED RUMOR:' ;

// Strunbers 
fragment JINT : [0-9]+ ;
fragment BLOAT : JINT? PERIOD JINT+ ;
fragment STRING : '\'' (~['\\] | '\\' .)* '\'' ;
STRUNBER:
  JINT
  | BLOAT
  | STRING
  ;

NUMBER: 
  JINT
  | BLOAT
  ;

// Bool
fragment TRUE : 'TOTALLY RIGHT' ;
fragment FALSE : 'COMPLETELY WRONG' ;
BOOL: TRUE | FALSE ;

// Algebraic expressions
fragment LT : ' SMALLER THAN ' ;
fragment GT : ' BEATS ' ;
fragment EQ : ' IS ACTUALLY ' ;
STRUNBER_COMPARISON : 
  LT 
  | GT 
  | EQ 
  ;

// Arithmetic operators (separated for clarity)
PLUS: ' PLUS ' ;
MINUS: ' MINUS ' ;
TIMES: ' TIMES ' ;
DIVIDED_BY: ' DIVIDED BY ' ;
MODULO: ' MODULO ' ;

// Boolean operators
OR: ' OR ' ;
AND: ' AND ' ;
BOOL_COMPARISON: OR | AND;

// Function call
OF: ' OF ' ;

// Parentheses for grouping
LPAREN: '(' ;
RPAREN: ')' ;

// Strings
NEWLINE: SPACES? '\n' SPACES?;
COMMA: ',' ;
NAME: [A-Za-z]+[0-9]* ;
PERIOD: '.' ;
SPACES: (' ' | '\t')+ ;
SPACE: ' ' ;
COMMENT: COMMENT_START ~('\n')* ;
