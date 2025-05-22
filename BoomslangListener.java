// Generated from Boomslang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BoomslangParser}.
 */
public interface BoomslangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(BoomslangParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(BoomslangParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#program_piece}.
	 * @param ctx the parse tree
	 */
	void enterProgram_piece(BoomslangParser.Program_pieceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#program_piece}.
	 * @param ctx the parse tree
	 */
	void exitProgram_piece(BoomslangParser.Program_pieceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterIf_block(BoomslangParser.If_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitIf_block(BoomslangParser.If_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#if_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIf_declaration(BoomslangParser.If_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#if_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIf_declaration(BoomslangParser.If_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#while_block}.
	 * @param ctx the parse tree
	 */
	void enterWhile_block(BoomslangParser.While_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#while_block}.
	 * @param ctx the parse tree
	 */
	void exitWhile_block(BoomslangParser.While_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#while_declaration}.
	 * @param ctx the parse tree
	 */
	void enterWhile_declaration(BoomslangParser.While_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#while_declaration}.
	 * @param ctx the parse tree
	 */
	void exitWhile_declaration(BoomslangParser.While_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(BoomslangParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(BoomslangParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(BoomslangParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(BoomslangParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(BoomslangParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(BoomslangParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(BoomslangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(BoomslangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BoomslangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BoomslangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(BoomslangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(BoomslangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(BoomslangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(BoomslangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(BoomslangParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(BoomslangParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(BoomslangParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(BoomslangParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(BoomslangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(BoomslangParser.ValueContext ctx);
}