grammar Boomslang;

// TODO: Check for correct newlining, Implement Arithmetic Operations, Fix EOF

/*
/ Parser Rules
*/

init:
  (program_piece NEWLINE)+
  PROGRAM_END
  ;

program_piece:
    (if_block
    | while_block
    | function_block
    | statement)
  NEWLINE+
  ;

// If
if_block:
  if_declaration
  program_piece+
  (ELSE_START program_piece+)?
  BLOCK_CLOSE
  ;

if_declaration:
  IF_START SPACES condition NEWLINE
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
  FUNCTION_BODY_START NEWLINE
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
  ASSIGN_START name ASSIGN_MIDDLE value NEWLINE
  ;

return:
  FUNCTION_RETURN value
  ;

name: NAME ;
value:
  STRUNBER 
  | value OP value
  | name ' OF ' arguments
  | name
  ;


/*
/ Lexer Rules
*/

// Declaration String Fragments
PROGRAM_END: 'PLEASE LIKE AND SUBSCRIBE' ;
BLOCK_CLOSE: '*' 'END OF STORY\n?' | SPACES? 'END OF STORY' NEWLINE;
IF_START: 'WHAT IF' ;
ELSE_START: 'LIES! RUMOR HAS IT' NEWLINE;
WHILE_START: 'STAY TUNED WHILE' ; 
FUNCTION_DECLARATION_START: 'DISCOVER HOW TO ' ;
FUNCTION_ARGUMENTS: ' WITH ' ;
FUNCTION_BODY_START: 'RUMOR HAS IT' ;
FUNCTION_RETURN: 'SHOCKING DEVELOPMENT' (NEWLINE | SPACES) ;
PRINT_START: 'YOU WON\'T WANT TO MISS ' ;
ASSIGN_START: 'EXPERTS CLAIM ' ;
ASSIGN_MIDDLE: ' TO BE ' ;

// Strunbers 
fragment JINT : [0-9]+ ;
fragment BLOAT : JINT? PERIOD JINT+ ;
fragment STRING : '\'' .*? '\'' ;
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

OP : 
  ' PLUS ' 
  | ' MINUS '
  | ' TIMES '
  | ' DIVIDED BY '
  | ' MODULO '
  ;

fragment OR: ' OR ' ;
fragment AND: ' AND ' ;
BOOL_COMPARISON: OR | AND;

// Strings
NEWLINE: '\n' ' '*;
COMMA: ',' ;
NAME: [A-Za-z]+[0-9]* ;
PERIOD: '.' ;
SPACES: ' '+ ;
SPACE: ' ' ;
