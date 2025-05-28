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

import java.io.FileOutputStream;
import java.io.PrintStream;
    
public class Tabloid2Python {

    static void printf(String string) { System.out.print(string); } //leave me alone java
                                                                    
    static void printIndent(int indentationCount) { //since Python handles blocks with identation we have to keep track and print them
        for (int i = 0; i < indentationCount; i++) {
            printf("    ");
        }
    }

    static void printHelp() {
        printf("Usage:\n");
        printf("-- java Boomslang_TS.java --help | -h : shows this message\n");
        printf("-- java Boomslang_TS.java <tabloid sc> : by default stdout is used for the Python source code\n");
        printf("-- java Boomslang_TS.jaca <tabloid sc> <output file> : redirects Python source code to output file\n");
    }

    static class BoomslangListener extends BoomslangBaseListener{
        static int indentationCount = 0; 

        @Override public void enterInit(BoomslangParser.InitContext ctx) {
            printf("# Beginning of the python program\n\n"); 
        }

        @Override public void exitInit(BoomslangParser.InitContext ctx) {
            printf("\n# End of the python program\n");
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
            //indentationCount--; reasonably confident it is not needed look here if smth breaks <====
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
	        //printf("enterAssign");
            printIndent(indentationCount);
	    }
	   
	    @Override public void exitAssign(BoomslangParser.AssignContext ctx) {
	        //printf("exitAssign");
            printf("\n");
        }

	    @Override public void enterReturn(BoomslangParser.ReturnContext ctx) { 
            printIndent(indentationCount);
            printf("return ");
        }

	    @Override public void exitReturn(BoomslangParser.ReturnContext ctx) { 
            printf("\n");
        }
     
        @Override public void enterScan(BoomslangParser.ScanContext ctx) { 
            printf(" input(");
        }

        @Override public void exitScan(BoomslangParser.ScanContext ctx) {
            printf(")");
        }

	    @Override public void enterName(BoomslangParser.NameContext ctx) { 
            printf(ctx.getText());
        }

	    @Override public void exitName(BoomslangParser.NameContext ctx) { 
            // Nothing to do
        }

	    @Override public void enterPrimaryExpr(BoomslangParser.PrimaryExprContext ctx) { //only strunbers dont have need to be handled here
            if (ctx.STRUNBER() != null) {
                String value = ctx.STRUNBER().getText();
                
                //reformating string declaration for python 
                if (value.startsWith("'") && value.endsWith("'")) { 
                    printf("\"" + value.substring(1, value.length() - 1) + "\""); //generated by claude*
                } else {
                    printf(value);
                }
            } 
        }

	    @Override public void exitPrimaryExpr(BoomslangParser.PrimaryExprContext ctx) {  
	        // Nothing to do 
	    }

	   //there are a lot of extra rules here related to recursive expressions parsing that I will leave out because we do nothing in them
	   
	   @Override public void enterComment(BoomslangParser.CommentContext ctx) {
	        //printf("enterComment");
	        printIndent(indentationCount);
	        printf("#");
	        String comment = ctx.getText(); //even if its NULL it's okay
	        printf(comment.substring(18, comment.length())); //cutting the declaration since it's parsed all in one
	    }

	    @Override public void exitComment(BoomslangParser.CommentContext ctx) {
	        //printf("exitComment");
	        printf("\n");
	    }

        @Override public void visitTerminal(TerminalNode node) { //handles things at the end of the tree hence terminal stuff that goes inbetween parser rules in this case
            String text = node.getText();
            
            if (text.contains(" SMALLER THAN ")) { //comparisons 
                printf(" < ");
            } 
            else if (text.equals(" BEATS ")) {
                printf(" > ");
            } 
            else if (text.equals(" IS ACTUALLY ")) {
                printf(" == ");
            } 
            else if (text.equals(" OR ")) {
                printf(" or ");
            } 
            else if (text.equals(" AND ")) {
                printf(" and ");
            } 
            else if (text.equals("TOTALLY RIGHT")) {
                printf("True");
            } 
            else if (text.equals("COMPLETELY WRONG")) {
                printf("False");
            } 
            else if (text.equals(" TO BE")) { //declarations
                printf(" = ");
            } 
            else if (text.equals(",")) { //comma,(on arguments)
                printf(", ");
            }
            else if (text.equals(" PLUS ")) { //operands
                printf(" + ");
            } 
            else if (text.equals(" MINUS ")) {
                printf(" - ");
            } 
            else if (text.equals(" TIMES ")) {
                printf(" * ");
            } 
            else if (text.equals(" DIVIDED BY ")) {
                printf(" / ");
            } 
            else if (text.equals(" MODULO ")) {
                printf(" % ");
            }
            else if (text.equals("(")) { //parentheses
                printf("(");
            }
            else if (text.equals(")")) {
                printf(")");
            }

        }

	    @Override public void enterEveryRule(ParserRuleContext ctx) { 
	        //System.out.print("|"+indentationCount+"|"); 
	    }

	    @Override public void exitEveryRule(ParserRuleContext ctx) { 
            //System.out.print("|"+indentationCount+"|"); 
	    }

	    @Override public void visitErrorNode(ErrorNode node) { //may not work even if it doesnt a runtime exception will probably occur
            if (node.getText() != null || node.getText() != " ") 
                System.err.println("Parse error on node: " + node.getText()); 
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;

        if (args.length > 0 && args.length < 2) { //if one arg we check for help or assign the imput file
            if (args.length > 0 && (args[0].equals("-h") || args[0].equals("--help"))) {
                printHelp();
                System.exit(0);
            }            
            inputFile = args[0];
        }
        else if (args.length > 1 && args.length < 3) {//the second argument is an output folder
            String outputFile = args[1];
            inputFile = args[0];
            
            if(!args[1].equals("-cd")){
                try {
                    PrintStream fileOut = new PrintStream(new FileOutputStream(outputFile, false)); //From stack overflow*
                    System.setOut(fileOut);  // Redirect System.out to the output file
                    //System.out.println(outputFile);
                } catch(Exception e) {
                    System.err.println("Failed opening output file");
                    System.exit(1);
                }
            }
            else {
                Path p = Paths.get(inputFile);
                String cwd = System.getProperty("user.dir"); //just for the filename..
                String fileName = p.getFileName().toString();
                String outputFileAlt = (cwd + "/" + fileName.substring(0, fileName.length() - 3) + "py");

                try {
                    PrintStream fileOutAlt = new PrintStream(new FileOutputStream(outputFileAlt, false)); //From stack overflow*
                    System.setOut(fileOutAlt);  // Redirect System.out to the output file
                    //System.out.println(outputFile);
                } catch(Exception e) {
                    System.err.println("Failed opening output file alternative");
                    System.exit(1);
                }
            }
        }
        else {
            printf("WARNING! WARNING! WARNING!\n");
            printHelp();
            System.exit(1);
        }

        InputStream instream;  
        try {
            instream = new FileInputStream(inputFile);
        } catch (Exception e) {
            System.err.println("Error opening input file");
            System.exit(1);
            return;
        }

        Path inPath = Paths.get(inputFile); //just for the filename.. 
        System.out.println("# Beginning of Boomslang Tabloid Source to Python 3 source compiler: " + inPath.getFileName());

        CharStream charStream = CharStreams.fromStream(instream);
                                                               
        BoomslangLexer lexer = new BoomslangLexer(charStream); //lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer); //tokens
        BoomslangParser parser = new BoomslangParser(tokens); //parser

        ParseTree tree = parser.init(); //parse tree on init(starting point of the grammar)

        BoomslangListener listener = new BoomslangListener(); //listener
        ParseTreeWalker walker = new ParseTreeWalker(); //walker

        walker.walk(listener, tree); //walking through the parse tree to actually do the transpilation      
    }
}
