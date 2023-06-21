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
	 * Enter a parse tree produced by the {@code DOUBLE}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDOUBLE(Dart2Parser.DOUBLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DOUBLE}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDOUBLE(Dart2Parser.DOUBLEContext ctx);
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
	 * Enter a parse tree produced by {@link Dart2Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Dart2Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Dart2Parser.ValueContext ctx);
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
	 * Enter a parse tree produced by {@link Dart2Parser#def_build_function}.
	 * @param ctx the parse tree
	 */
	void enterDef_build_function(Dart2Parser.Def_build_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#def_build_function}.
	 * @param ctx the parse tree
	 */
	void exitDef_build_function(Dart2Parser.Def_build_functionContext ctx);
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
	 * Enter a parse tree produced by {@link Dart2Parser#def_else_if}.
	 * @param ctx the parse tree
	 */
	void enterDef_else_if(Dart2Parser.Def_else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#def_else_if}.
	 * @param ctx the parse tree
	 */
	void exitDef_else_if(Dart2Parser.Def_else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#def_else}.
	 * @param ctx the parse tree
	 */
	void enterDef_else(Dart2Parser.Def_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#def_else}.
	 * @param ctx the parse tree
	 */
	void exitDef_else(Dart2Parser.Def_elseContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#def_object}.
	 * @param ctx the parse tree
	 */
	void enterDef_object(Dart2Parser.Def_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#def_object}.
	 * @param ctx the parse tree
	 */
	void exitDef_object(Dart2Parser.Def_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#def_switch}.
	 * @param ctx the parse tree
	 */
	void enterDef_switch(Dart2Parser.Def_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#def_switch}.
	 * @param ctx the parse tree
	 */
	void exitDef_switch(Dart2Parser.Def_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(Dart2Parser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(Dart2Parser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#switch_defult}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_defult(Dart2Parser.Switch_defultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#switch_defult}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_defult(Dart2Parser.Switch_defultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#widget}.
	 * @param ctx the parse tree
	 */
	void enterWidget(Dart2Parser.WidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#widget}.
	 * @param ctx the parse tree
	 */
	void exitWidget(Dart2Parser.WidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#defColumn}.
	 * @param ctx the parse tree
	 */
	void enterDefColumn(Dart2Parser.DefColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#defColumn}.
	 * @param ctx the parse tree
	 */
	void exitDefColumn(Dart2Parser.DefColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#defRow}.
	 * @param ctx the parse tree
	 */
	void enterDefRow(Dart2Parser.DefRowContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#defRow}.
	 * @param ctx the parse tree
	 */
	void exitDefRow(Dart2Parser.DefRowContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#defContainer}.
	 * @param ctx the parse tree
	 */
	void enterDefContainer(Dart2Parser.DefContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#defContainer}.
	 * @param ctx the parse tree
	 */
	void exitDefContainer(Dart2Parser.DefContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#containerBody}.
	 * @param ctx the parse tree
	 */
	void enterContainerBody(Dart2Parser.ContainerBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#containerBody}.
	 * @param ctx the parse tree
	 */
	void exitContainerBody(Dart2Parser.ContainerBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#defInkWell}.
	 * @param ctx the parse tree
	 */
	void enterDefInkWell(Dart2Parser.DefInkWellContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#defInkWell}.
	 * @param ctx the parse tree
	 */
	void exitDefInkWell(Dart2Parser.DefInkWellContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#inkWellBody}.
	 * @param ctx the parse tree
	 */
	void enterInkWellBody(Dart2Parser.InkWellBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#inkWellBody}.
	 * @param ctx the parse tree
	 */
	void exitInkWellBody(Dart2Parser.InkWellBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#listView}.
	 * @param ctx the parse tree
	 */
	void enterListView(Dart2Parser.ListViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#listView}.
	 * @param ctx the parse tree
	 */
	void exitListView(Dart2Parser.ListViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#layoutBody}.
	 * @param ctx the parse tree
	 */
	void enterLayoutBody(Dart2Parser.LayoutBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#layoutBody}.
	 * @param ctx the parse tree
	 */
	void exitLayoutBody(Dart2Parser.LayoutBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(Dart2Parser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(Dart2Parser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#textField}.
	 * @param ctx the parse tree
	 */
	void enterTextField(Dart2Parser.TextFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#textField}.
	 * @param ctx the parse tree
	 */
	void exitTextField(Dart2Parser.TextFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldProperties(Dart2Parser.TextFieldPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#textFieldProperties}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldProperties(Dart2Parser.TextFieldPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#textFieldTextProperty}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldTextProperty(Dart2Parser.TextFieldTextPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#textFieldTextProperty}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldTextProperty(Dart2Parser.TextFieldTextPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#textFieldControllerProperty}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldControllerProperty(Dart2Parser.TextFieldControllerPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#textFieldControllerProperty}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldControllerProperty(Dart2Parser.TextFieldControllerPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#textFieldDecorationProperty}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldDecorationProperty(Dart2Parser.TextFieldDecorationPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#textFieldDecorationProperty}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldDecorationProperty(Dart2Parser.TextFieldDecorationPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#inputDecorationProperties}.
	 * @param ctx the parse tree
	 */
	void enterInputDecorationProperties(Dart2Parser.InputDecorationPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#inputDecorationProperties}.
	 * @param ctx the parse tree
	 */
	void exitInputDecorationProperties(Dart2Parser.InputDecorationPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#inputDecorationLabelTextProperty}.
	 * @param ctx the parse tree
	 */
	void enterInputDecorationLabelTextProperty(Dart2Parser.InputDecorationLabelTextPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#inputDecorationLabelTextProperty}.
	 * @param ctx the parse tree
	 */
	void exitInputDecorationLabelTextProperty(Dart2Parser.InputDecorationLabelTextPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#inputDecorationHintTextProperty}.
	 * @param ctx the parse tree
	 */
	void enterInputDecorationHintTextProperty(Dart2Parser.InputDecorationHintTextPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#inputDecorationHintTextProperty}.
	 * @param ctx the parse tree
	 */
	void exitInputDecorationHintTextProperty(Dart2Parser.InputDecorationHintTextPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#inputDecorationHelperTextProperty}.
	 * @param ctx the parse tree
	 */
	void enterInputDecorationHelperTextProperty(Dart2Parser.InputDecorationHelperTextPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#inputDecorationHelperTextProperty}.
	 * @param ctx the parse tree
	 */
	void exitInputDecorationHelperTextProperty(Dart2Parser.InputDecorationHelperTextPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#inputDecorationIconProperty}.
	 * @param ctx the parse tree
	 */
	void enterInputDecorationIconProperty(Dart2Parser.InputDecorationIconPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#inputDecorationIconProperty}.
	 * @param ctx the parse tree
	 */
	void exitInputDecorationIconProperty(Dart2Parser.InputDecorationIconPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#textFieldOnChangedProperty}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldOnChangedProperty(Dart2Parser.TextFieldOnChangedPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#textFieldOnChangedProperty}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldOnChangedProperty(Dart2Parser.TextFieldOnChangedPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#textFieldOnEditingCompleteProperty}.
	 * @param ctx the parse tree
	 */
	void enterTextFieldOnEditingCompleteProperty(Dart2Parser.TextFieldOnEditingCompletePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#textFieldOnEditingCompleteProperty}.
	 * @param ctx the parse tree
	 */
	void exitTextFieldOnEditingCompleteProperty(Dart2Parser.TextFieldOnEditingCompletePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(Dart2Parser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(Dart2Parser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#assetImage}.
	 * @param ctx the parse tree
	 */
	void enterAssetImage(Dart2Parser.AssetImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#assetImage}.
	 * @param ctx the parse tree
	 */
	void exitAssetImage(Dart2Parser.AssetImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#imageBody}.
	 * @param ctx the parse tree
	 */
	void enterImageBody(Dart2Parser.ImageBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#imageBody}.
	 * @param ctx the parse tree
	 */
	void exitImageBody(Dart2Parser.ImageBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#navigatorRule}.
	 * @param ctx the parse tree
	 */
	void enterNavigatorRule(Dart2Parser.NavigatorRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#navigatorRule}.
	 * @param ctx the parse tree
	 */
	void exitNavigatorRule(Dart2Parser.NavigatorRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#getData}.
	 * @param ctx the parse tree
	 */
	void enterGetData(Dart2Parser.GetDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#getData}.
	 * @param ctx the parse tree
	 */
	void exitGetData(Dart2Parser.GetDataContext ctx);
}