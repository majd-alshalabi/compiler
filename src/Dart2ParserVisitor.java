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
	 * Visit a parse tree produced by the {@code DOUBLE}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDOUBLE(Dart2Parser.DOUBLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(Dart2Parser.StringContext ctx);
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
	 * Visit a parse tree produced by {@link Dart2Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Dart2Parser.ValueContext ctx);
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
	 * Visit a parse tree produced by {@link Dart2Parser#def_build_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_build_function(Dart2Parser.Def_build_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#def_function_datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_function_datatype(Dart2Parser.Def_function_datatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#def_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_if(Dart2Parser.Def_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#def_else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_else_if(Dart2Parser.Def_else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#def_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_else(Dart2Parser.Def_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#def_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_for(Dart2Parser.Def_forContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_Int_Increment}
	 * labeled alternative in {@link Dart2Parser#for_Increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_Int_Increment(Dart2Parser.For_Int_IncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_var_Eq}
	 * labeled alternative in {@link Dart2Parser#for_Increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_var_Eq(Dart2Parser.For_var_EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#def_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_while(Dart2Parser.Def_whileContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#def_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_object(Dart2Parser.Def_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#def_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_switch(Dart2Parser.Def_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(Dart2Parser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#switch_defult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_defult(Dart2Parser.Switch_defultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(Dart2Parser.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#defColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefColumn(Dart2Parser.DefColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#defRow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefRow(Dart2Parser.DefRowContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#defContainer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefContainer(Dart2Parser.DefContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#containerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerBody(Dart2Parser.ContainerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#defInkWell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefInkWell(Dart2Parser.DefInkWellContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#inkWellBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInkWellBody(Dart2Parser.InkWellBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#listView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListView(Dart2Parser.ListViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#layoutBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayoutBody(Dart2Parser.LayoutBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(Dart2Parser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#textField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextField(Dart2Parser.TextFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#textFieldProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldProperties(Dart2Parser.TextFieldPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#textFieldTextProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldTextProperty(Dart2Parser.TextFieldTextPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#textFieldControllerProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldControllerProperty(Dart2Parser.TextFieldControllerPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#textFieldDecorationProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldDecorationProperty(Dart2Parser.TextFieldDecorationPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#inputDecorationProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecorationProperties(Dart2Parser.InputDecorationPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#inputDecorationLabelTextProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecorationLabelTextProperty(Dart2Parser.InputDecorationLabelTextPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#inputDecorationHintTextProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecorationHintTextProperty(Dart2Parser.InputDecorationHintTextPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#inputDecorationHelperTextProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecorationHelperTextProperty(Dart2Parser.InputDecorationHelperTextPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#inputDecorationIconProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDecorationIconProperty(Dart2Parser.InputDecorationIconPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#textFieldOnChangedProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldOnChangedProperty(Dart2Parser.TextFieldOnChangedPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#textFieldOnEditingCompleteProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFieldOnEditingCompleteProperty(Dart2Parser.TextFieldOnEditingCompletePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(Dart2Parser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#assetImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssetImage(Dart2Parser.AssetImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#imageBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageBody(Dart2Parser.ImageBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#navigatorRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigatorRule(Dart2Parser.NavigatorRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Dart2Parser#getData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetData(Dart2Parser.GetDataContext ctx);
}