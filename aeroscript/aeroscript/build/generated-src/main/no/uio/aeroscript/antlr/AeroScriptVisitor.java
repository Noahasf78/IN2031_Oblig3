// Generated from AeroScript.g4 by ANTLR 4.13.1

package no.uio.aeroscript.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AeroScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AeroScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AeroScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#execution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecution(AeroScriptParser.ExecutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AeroScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#reaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReaction(AeroScriptParser.ReactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(AeroScriptParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(AeroScriptParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#acAscend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcAscend(AeroScriptParser.AcAscendContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#acMove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcMove(AeroScriptParser.AcMoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#acTurn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcTurn(AeroScriptParser.AcTurnContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#acDock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcDock(AeroScriptParser.AcDockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#acDescend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcDescend(AeroScriptParser.AcDescendContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AeroScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(AeroScriptParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link AeroScriptParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(AeroScriptParser.RangeContext ctx);
}