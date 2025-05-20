grammar Boomslang;

// TODO: Complete Statements, Check for correct newlining

/*
/ Parser Rules
*/

program:
  (program_piece NEWLINE)+
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

// Function Statement
function_block:
  function_declaration
  FUNCTION_BODY_START NEWLINE
  program_piece+
  BLOCK_CLOSE
  ;

function_declaration:
  FUNCTION_DECLARATION_START SPACE name FUNCTION_ARGUMENTS arguments NEWLINE
  ;

arguments:
  name (COMMA name).

condition:
  condition BOOL_COMPARISON condition
  | BOOL
  | STRUNBER STRUNBER_COMPARISON STRUNBER_COMPARISON
  ;

/*
/ Lexer Rules
*/

// Declaration String Fragments
BLOCK_CLOSE: 'END OF STORY\n'
IF_START: 'WHAT IF'
WHILE_START: 'STAY TUNED WHILE'
FUNCTION_DECLARATION_START: 'DISCOVER HOW TO' 
FUNCTION_BODY_START: 'RUMOR HAS IT' 

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
