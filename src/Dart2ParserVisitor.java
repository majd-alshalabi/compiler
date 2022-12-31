// Generated from C:/Users/majd/IdeaProjects/untitled\Dart2Parser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Dart2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Dart2ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Dart2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(Dart2Parser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(Dart2Parser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#intIncrease}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntIncrease(Dart2Parser.IntIncreaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#boolVarDefnition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVarDefnition(Dart2Parser.BoolVarDefnitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#varEQ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarEQ(Dart2Parser.VarEQContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#boolVarEq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVarEq(Dart2Parser.BoolVarEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BetweenBracket}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenBracket(Dart2Parser.BetweenBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Dart2Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(Dart2Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathematicsLogic}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathematicsLogic(Dart2Parser.MathematicsLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(Dart2Parser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(Dart2Parser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolMathematicsLogic}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolMathematicsLogic(Dart2Parser.BoolMathematicsLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(Dart2Parser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVariable}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVariable(Dart2Parser.BoolVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolBetweenBracket}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolBetweenBracket(Dart2Parser.BoolBetweenBracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#def_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_class(Dart2Parser.Def_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(Dart2Parser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#def_function_void}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_function_void(Dart2Parser.Def_function_voidContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#def_function_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_function_datatype(Dart2Parser.Def_function_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(Dart2Parser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#def_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_if(Dart2Parser.Def_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfContent(Dart2Parser.IfContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#elseIfContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfContent(Dart2Parser.ElseIfContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#elseContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseContent(Dart2Parser.ElseContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionBool}
	 * labeled alternative in {@link Dart2Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBool(Dart2Parser.ConditionBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonBetweenTwoNormalVar}
	 * labeled alternative in {@link Dart2Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonBetweenTwoNormalVar(Dart2Parser.ComparisonBetweenTwoNormalVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiCondition}
	 * labeled alternative in {@link Dart2Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiCondition(Dart2Parser.MultiConditionContext ctx);
}