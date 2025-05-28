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
	 * Enter a parse tree produced by {@link BoomslangParser#if_mult}.
	 * @param ctx the parse tree
	 */
	void enterIf_mult(BoomslangParser.If_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#if_mult}.
	 * @param ctx the parse tree
	 */
	void exitIf_mult(BoomslangParser.If_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#if_single}.
	 * @param ctx the parse tree
	 */
	void enterIf_single(BoomslangParser.If_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#if_single}.
	 * @param ctx the parse tree
	 */
	void exitIf_single(BoomslangParser.If_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(BoomslangParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(BoomslangParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#else_mult}.
	 * @param ctx the parse tree
	 */
	void enterElse_mult(BoomslangParser.Else_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#else_mult}.
	 * @param ctx the parse tree
	 */
	void exitElse_mult(BoomslangParser.Else_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#else_single}.
	 * @param ctx the parse tree
	 */
	void enterElse_single(BoomslangParser.Else_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#else_single}.
	 * @param ctx the parse tree
	 */
	void exitElse_single(BoomslangParser.Else_singleContext ctx);
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
	 * Enter a parse tree produced by {@link BoomslangParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(BoomslangParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(BoomslangParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(BoomslangParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(BoomslangParser.CommentContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(BoomslangParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(BoomslangParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(BoomslangParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(BoomslangParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(BoomslangParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(BoomslangParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(BoomslangParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(BoomslangParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(BoomslangParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(BoomslangParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoomslangParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(BoomslangParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoomslangParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(BoomslangParser.PrimaryExprContext ctx);
}