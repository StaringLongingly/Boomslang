grammar Boomslang;

// TODO: Check for correct newlining

/*
/ Parser Rules
*/

init:
  (program_piece NEWLINE)+
  PROGRAM_END
  ;

program_piece:
  if_block
  | while_block
  | statement
  ;

// If Statement
if_block:
  if_declaration
  program_piece+
  BLOCK_CLOSE
  ;

if_declaration:
  IF_START SPACE CONDITION NEWLINE
  ;

// While Statement
while_block:
  while_declaration
  program_piece+
  BLOCK_CLOSE
  ;

while_declaration:
  WHILE_START SPACE condition NEWLINE
  ;

// Function Statement
function_block:
  function_declaration
  FUNCTION_BODY_START NEWLINE
  program_piece+
  BLOCK_CLOSE
  ;

function_declaration:
  FUNCTION_DECLARATION_START name FUNCTION_ARGUMENTS arguments NEWLINE
  ;

arguments:
  name (COMMA SPACE name).
  ;

condition:
  condition BOOL_COMPARISON condition
  | BOOL
  | STRUNBER STRUNBER_COMPARISON STRUNBER_COMPARISON
  ;

statement:
  PRINT_START SPACE STRUNBER NEWLINE
  | ASSIGN_START name ASSIGN_MIDDLE STRUNBER
  | FUNCTION_RETURN STRUNBER?
  ;

/*
/ Lexer Rules
*/

// Declaration String Fragments
PROGRAM_END: 'PLEASE LIKE AND SUBSCRIBE' ;
BLOCK_CLOSE: 'END OF STORY\n' ;
IF_START: 'WHAT IF' ;
WHILE_START: 'STAY TUNED WHILE' ; 
FUNCTION_DECLARATION_START: 'DISCOVER HOW TO ' ;
FUNCTION_ARGUMENTS: ' WITH' ;
FUNCTION_BODY_START: 'RUMOR HAS IT' ;
FUNCTION_RETURN: 'SHOCKING DEVELOPMENT ' ;
PRINT_START: 'YOU WON'T WANT TO MISS' ;
ASSIGN_START: 'EXPERTS CLAIM ' ;
ASSIGN_MIDDLE: ' TO BE ' ;

// Strunbers 
fragment JINT : [0-9]+;
fragment BLOAT : JINT? PERIOD JINT+; 
fragment STRING : '\'' .* '\'' ;
STRUNBER:
  JINT
  | BLOAT
  | STRING
  ;

// Bool
fragment true : 'TOTALLY RIGHT'
fragment false : 'COMPLETELY WRONG'
BOOL : true | false ;

// Comparisons
fragment LT: ' SMALLER THAN '
fragment GT: ' BEATS '
fragment EQ: ' IS ACTUALLY '
STRUNBER_COMPARISON: LT | GT | EQ ;

fragment OR: ' OR '
fragment AND: ' AND '
BOOL_COMPARISON: OR | AND;

// Strings
NEWLINE: '\r' '\n' | '\n' | '\r' ;
COMMA: ',' 
PERIOD: '.' 
SPACE: ' ';
