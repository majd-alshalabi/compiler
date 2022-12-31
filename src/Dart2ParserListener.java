// Generated from C:/Users/majd/IdeaProjects/untitled\Dart2Parser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Dart2Parser}.
 */
public interface Dart2ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Dart2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Dart2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(Dart2Parser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(Dart2Parser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(Dart2Parser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(Dart2Parser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#intIncrease}.
	 * @param ctx the parse tree
	 */
	void enterIntIncrease(Dart2Parser.IntIncreaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#intIncrease}.
	 * @param ctx the parse tree
	 */
	void exitIntIncrease(Dart2Parser.IntIncreaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#boolVarDefnition}.
	 * @param ctx the parse tree
	 */
	void enterBoolVarDefnition(Dart2Parser.BoolVarDefnitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#boolVarDefnition}.
	 * @param ctx the parse tree
	 */
	void exitBoolVarDefnition(Dart2Parser.BoolVarDefnitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#varEQ}.
	 * @param ctx the parse tree
	 */
	void enterVarEQ(Dart2Parser.VarEQContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#varEQ}.
	 * @param ctx the parse tree
	 */
	void exitVarEQ(Dart2Parser.VarEQContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#boolVarEq}.
	 * @param ctx the parse tree
	 */
	void enterBoolVarEq(Dart2Parser.BoolVarEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#boolVarEq}.
	 * @param ctx the parse tree
	 */
	void exitBoolVarEq(Dart2Parser.BoolVarEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BetweenBracket}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBetweenBracket(Dart2Parser.BetweenBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BetweenBracket}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBetweenBracket(Dart2Parser.BetweenBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Dart2Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Dart2Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Dart2Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Dart2Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathematicsLogic}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMathematicsLogic(Dart2Parser.MathematicsLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathematicsLogic}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMathematicsLogic(Dart2Parser.MathematicsLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterString(Dart2Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitString(Dart2Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDouble(Dart2Parser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDouble(Dart2Parser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolMathematicsLogic}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBoolMathematicsLogic(Dart2Parser.BoolMathematicsLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolMathematicsLogic}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBoolMathematicsLogic(Dart2Parser.BoolMathematicsLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBool(Dart2Parser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBool(Dart2Parser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVariable}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBoolVariable(Dart2Parser.BoolVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVariable}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBoolVariable(Dart2Parser.BoolVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolBetweenBracket}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBoolBetweenBracket(Dart2Parser.BoolBetweenBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolBetweenBracket}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBoolBetweenBracket(Dart2Parser.BoolBetweenBracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#def_class}.
	 * @param ctx the parse tree
	 */
	void enterDef_class(Dart2Parser.Def_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#def_class}.
	 * @param ctx the parse tree
	 */
	void exitDef_class(Dart2Parser.Def_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(Dart2Parser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(Dart2Parser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#def_function_void}.
	 * @param ctx the parse tree
	 */
	void enterDef_function_void(Dart2Parser.Def_function_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#def_function_void}.
	 * @param ctx the parse tree
	 */
	void exitDef_function_void(Dart2Parser.Def_function_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#def_function_datatype}.
	 * @param ctx the parse tree
	 */
	void enterDef_function_datatype(Dart2Parser.Def_function_datatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#def_function_datatype}.
	 * @param ctx the parse tree
	 */
	void exitDef_function_datatype(Dart2Parser.Def_function_datatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#def_if}.
	 * @param ctx the parse tree
	 */
	void enterDef_if(Dart2Parser.Def_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#def_if}.
	 * @param ctx the parse tree
	 */
	void exitDef_if(Dart2Parser.Def_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#ifContent}.
	 * @param ctx the parse tree
	 */
	void enterIfContent(Dart2Parser.IfContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#ifContent}.
	 * @param ctx the parse tree
	 */
	void exitIfContent(Dart2Parser.IfContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#elseIfContent}.
	 * @param ctx the parse tree
	 */
	void enterElseIfContent(Dart2Parser.ElseIfContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#elseIfContent}.
	 * @param ctx the parse tree
	 */
	void exitElseIfContent(Dart2Parser.ElseIfContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#elseContent}.
	 * @param ctx the parse tree
	 */
	void enterElseContent(Dart2Parser.ElseContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#elseContent}.
	 * @param ctx the parse tree
	 */
	void exitElseContent(Dart2Parser.ElseContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#def_for}.
	 * @param ctx the parse tree
	 */
	void enterDef_for(Dart2Parser.Def_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#def_for}.
	 * @param ctx the parse tree
	 */
	void exitDef_for(Dart2Parser.Def_forContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_Int_Increment}
	 * labeled alternative in {@link Dart2Parser#for_Increment}.
	 * @param ctx the parse tree
	 */
	void enterFor_Int_Increment(Dart2Parser.For_Int_IncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_Int_Increment}
	 * labeled alternative in {@link Dart2Parser#for_Increment}.
	 * @param ctx the parse tree
	 */
	void exitFor_Int_Increment(Dart2Parser.For_Int_IncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_var_Eq}
	 * labeled alternative in {@link Dart2Parser#for_Increment}.
	 * @param ctx the parse tree
	 */
	void enterFor_var_Eq(Dart2Parser.For_var_EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_var_Eq}
	 * labeled alternative in {@link Dart2Parser#for_Increment}.
	 * @param ctx the parse tree
	 */
	void exitFor_var_Eq(Dart2Parser.For_var_EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#def_while}.
	 * @param ctx the parse tree
	 */
	void enterDef_while(Dart2Parser.Def_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#def_while}.
	 * @param ctx the parse tree
	 */
	void exitDef_while(Dart2Parser.Def_whileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionBool}
	 * labeled alternative in {@link Dart2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConditionBool(Dart2Parser.ConditionBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionBool}
	 * labeled alternative in {@link Dart2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConditionBool(Dart2Parser.ConditionBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonBetweenTwoNormalVar}
	 * labeled alternative in {@link Dart2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterComparisonBetweenTwoNormalVar(Dart2Parser.ComparisonBetweenTwoNormalVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonBetweenTwoNormalVar}
	 * labeled alternative in {@link Dart2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitComparisonBetweenTwoNormalVar(Dart2Parser.ComparisonBetweenTwoNormalVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiCondition}
	 * labeled alternative in {@link Dart2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterMultiCondition(Dart2Parser.MultiConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiCondition}
	 * labeled alternative in {@link Dart2Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitMultiCondition(Dart2Parser.MultiConditionContext ctx);
}