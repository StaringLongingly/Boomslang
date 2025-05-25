import java.util.*;
import java.lang.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.InputStream;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
    
public class Boomslang_TS {

    static void printf(String string) { System.out.print(string); } //leave me alone java
                                                                    
    static void printIndent(int indentationCount) { //since python handles blocks with identation we have to keep track and print them
        for(int i = 0; i < indentationCount; i++){
            printf("    ");
        }
    }

    static class BoomslangListener extends BoomslangBaseListener{

        String debug = "test";
        static int indentationCount = 0; 

        @Override public void enterInit(BoomslangParser.InitContext ctx) {
            System.out.println("# Beginning of the python program"); 
        }

        @Override public void exitInit(BoomslangParser.InitContext ctx) {
            System.out.println("\n# End of the python program\n");
        }

        @Override public void enterProgram_piece(BoomslangParser.Program_pieceContext ctx) { 
            //nothing to do
        }
        
        @Override public void exitProgram_piece(BoomslangParser.Program_pieceContext ctx) { 
            //nothing to do
        }
               
        @Override public void enterIf_block(BoomslangParser.If_blockContext ctx) { 
            //nothing to do, handled by children, indentationCount++ will be done after If_declaration
        }
	    
	    @Override public void exitIf_block(BoomslangParser.If_blockContext ctx) { 
            indentationCount--;
	    }
        
        @Override public void enterElse_block(BoomslangParser.Else_blockContext ctx) {
            printIndent(indentationCount - 1); //indentation needs to go one back here to mach if declaration
            printf("else:\n");
        }
 
        @Override public void exitElse_block(BoomslangParser.Else_blockContext ctx) { 
            //indentationCount--; reasonably confident it is not needed
        }

        @Override public void enterIf_declaration(BoomslangParser.If_declarationContext ctx) { //Tabloid syntax allows if and else statements
            printIndent(indentationCount);                                                     //to be opened without blocks this is not handled
            printf("if ");
        }

        @Override public void exitIf_declaration(BoomslangParser.If_declarationContext ctx) { 
            printf(":\n");
            indentationCount++;
        }

        @Override public void enterWhile_block(BoomslangParser.While_blockContext ctx) { 
            //nothing to do just like with If_blocks identation is done by the declaration
        }

        @Override public void exitWhile_block(BoomslangParser.While_blockContext ctx) {
            indentationCount--;
        }
 
        @Override public void enterWhile_declaration(BoomslangParser.While_declarationContext ctx) {
            printIndent(indentationCount);
            printf("while ");
            indentationCount++;
        }
        
        @Override public void exitWhile_declaration(BoomslangParser.While_declarationContext ctx) {
            printf(":\n");
        }
        
        @Override public void enterFunction_block(BoomslangParser.Function_blockContext ctx) { 
           //indentationCount++; this works still it won't be used 
        }
	      
	    @Override public void exitFunction_block(BoomslangParser.Function_blockContext ctx) {
            indentationCount--; 
	    }
	     
	    @Override public void enterFunction_declaration(BoomslangParser.Function_declarationContext ctx) { 
            printIndent(indentationCount - 1);
            printf("def ");
            indentationCount++;
	    }
	    
	    @Override public void exitFunction_declaration(BoomslangParser.Function_declarationContext ctx) {
            printf(":\n");
	    }
	    	   
	    @Override public void enterArguments(BoomslangParser.ArgumentsContext ctx) { 
            printf("(");
	    }
	 
	    @Override public void exitArguments(BoomslangParser.ArgumentsContext ctx) { 
            printf(")");
	    }
	  
	    @Override public void enterCondition(BoomslangParser.ConditionContext ctx) {
            // Nothing to do, everything handled by children functions
	    }
	  
	    @Override public void exitCondition(BoomslangParser.ConditionContext ctx) { 
             // Nothing to do
	    }
	    
	    @Override public void enterStatement(BoomslangParser.StatementContext ctx) { 
            // Nothing to do, everything handled by children functions
	    }
	   
	    @Override public void exitStatement(BoomslangParser.StatementContext ctx) { 
            // Nothing to do
	    }
	 
	    @Override public void enterPrint(BoomslangParser.PrintContext ctx) { 
            printIndent(indentationCount);
            printf("print(");
	    }
	 
	    @Override public void exitPrint(BoomslangParser.PrintContext ctx) {
            printf(")\n");
	    }

	    @Override public void enterAssign(BoomslangParser.AssignContext ctx) {
            printIndent(indentationCount);
	    }
	   
	    @Override public void exitAssign(BoomslangParser.AssignContext ctx) { 
            printf("\n");
        }

	    @Override public void enterReturn(BoomslangParser.ReturnContext ctx) { 
            printIndent(indentationCount);
            printf("return ");
        }

	    @Override public void exitReturn(BoomslangParser.ReturnContext ctx) { 
            printf("\n");
        }

	    @Override public void enterName(BoomslangParser.NameContext ctx) { 
            printf(ctx.getText());
        }

	    @Override public void exitName(BoomslangParser.NameContext ctx) { 
            // Nothing to do
        }

	    @Override public void enterValue(BoomslangParser.ValueContext ctx) { //only strunbers dont have need to be handled here
            if (ctx.STRUNBER() != null) {
                String value = ctx.STRUNBER().getText();
                
                //reformating string declaration for python
                if (value.startsWith("'") && value.endsWith("'")) { 
                    printf("\"" + value.substring(1, value.length() - 1) + "\"");
                } else {
                    printf(value);
                }
            } 
        }

	    @Override public void exitValue(BoomslangParser.ValueContext ctx) {  
	        // Nothing to do 
	    }

        @Override public void visitTerminal(TerminalNode node) { //handles strays stuff that goes inbetween parser rules in this case
            String text = node.getText();
            
            if (text.equals(" SMALLER THAN ")) { //comparisons 
                printf(" < ");
            } else if (text.equals(" BEATS ")) {
                printf(" > ");
            } else if (text.equals(" IS ACTUALLY ")) {
                printf(" == ");
            } else if (text.equals(" OR ")) {
                printf(" or ");
            } else if (text.equals(" AND ")) {
                printf(" and ");
            } else if (text.equals("TOTALLY RIGHT")) {
                printf("True");
            } else if (text.equals("COMPLETELY WRONG")) {
                printf("False");
            } else if (text.equals(" TO BE ")) { //declarations
                printf(" = ");
            } else if (text.equals(",")) { //commas,(on arguments)
                printf(", ");
            }
            else if (text.equals(" PLUS ")) { //operands
                printf(" + ");
            } else if (text.equals(" MINUS ")) {
                printf(" - ");
            } else if (text.equals(" TIMES ")) {
                printf(" * ");
            } else if (text.equals(" DIVIDED BY ")) {
                printf(" / ");
            } else if (text.equals(" MODULO ")) {
                printf(" % ");
            }
        }

	    @Override 
	    public void enterEveryRule(ParserRuleContext ctx) { 
	        //System.out.print("|"+indentationCount+"|"); 
	    }

	    @Override public void exitEveryRule(ParserRuleContext ctx) { 
            //System.out.print("|"+indentationCount+"|"); 
	    }

	    @Override 
	    public void visitErrorNode(ErrorNode node) { //may not work 
            System.err.println("Parse error on node: " + node.getText()); 
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;

        if (args.length > 0){
            if(args.length > 0 && (args[0].equals("-h") || args[0].equals("--help"))){
                System.out.println("Usage: java Boomslang_TS <Tabloid source file>");
                System.out.println("Python source code will be output to stdout for easy inspection and debugging, redirection to a file can be used to actually execute the python code");
                System.exit(0);
            }            
            inputFile = args[0];
        }
        else{
            System.err.println("Error!!!\n--Usage: java Boomslang_TS <Tabloid source file>");
            System.exit(1);
        }

        InputStream instream;
        
        try {
            instream = new FileInputStream(inputFile);
        } catch (Exception e) {
            System.err.println("Error reading file: " + inputFile);
            System.exit(1);
            return;
        }

        Path path = Paths.get(inputFile); //just for the filename.. 
        System.out.println("# Beginning of Boomslang Tabloid Source to Python 3 source compiler: " + path.getFileName());

        CharStream charStream = CharStreams.fromStream(instream);
                                                               
        BoomslangLexer lexer = new BoomslangLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BoomslangParser parser = new BoomslangParser(tokens);

        // Add error handling
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, 
                                  int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
            }
        });

        ParseTree tree = parser.init();

        BoomslangListener listener = new BoomslangListener();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, tree);

        //System.out.println("#Debug: End of Boomslang compilation");
        
        try {
            instream.close();
        } catch (Exception e) {
            // We don't care about this
        }
    }
}
