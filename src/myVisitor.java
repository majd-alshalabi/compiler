import ASTClasses.DartClasses.Boolean.boolExp;
import ASTClasses.DartClasses.Boolean.boolVarDefnition;
import ASTClasses.DartClasses.Boolean.boolVarEq;
import ASTClasses.DartClasses.Class.class_body;
import ASTClasses.DartClasses.Class.def_class;
import ASTClasses.DartClasses.Content.*;
import ASTClasses.DartClasses.Content.For.*;
import ASTClasses.DartClasses.Content.IF.def_else;
import ASTClasses.DartClasses.Content.IF.def_else_if;
import ASTClasses.DartClasses.Content.IF.def_if;
import ASTClasses.DartClasses.Function.def_build_function;
import ASTClasses.DartClasses.Function.def_function_datatype;
import ASTClasses.DartClasses.Function.def_function_void;
import ASTClasses.DartClasses.GetDataAst;
import ASTClasses.DartClasses.exp;
import ASTClasses.DartClasses.value;
import ASTClasses.FlutterClasses.Widget.*;
import ASTClasses.FlutterClasses.Widget.Container.containerBody;
import ASTClasses.FlutterClasses.Widget.Container.defContainer;
import ASTClasses.FlutterClasses.Widget.Image.assetImage;
import ASTClasses.FlutterClasses.Widget.Image.image;
import ASTClasses.FlutterClasses.Widget.Image.imageBody;
import ASTClasses.FlutterClasses.Widget.ListView.listView;
import ASTClasses.FlutterClasses.Widget.ListView.listViewBody;
import ASTClasses.FlutterClasses.Widget.inkWell.InkWell;
import ASTClasses.FlutterClasses.Widget.inkWell.InkWellBody;
import ASTClasses.FlutterClasses.Widget.inkWell.InkWellChild;
import ASTClasses.FlutterClasses.Widget.inkWell.InkWellOnPressed;
import ASTClasses.FlutterClasses.Widget.textfield.*;
import ASTClasses.FlutterClasses.widget;

import java.util.ArrayList;
import java.util.List;

import ASTClasses.program;
import com.sun.jdi.Value;


public class myVisitor extends Base {
    @Override
    public program visitProgram(Dart2Parser.ProgramContext ctx) {
        program program = new program();

        if (ctx.def_class() != null) {
            List<def_class> li = new ArrayList<>();
            for (int i = 0; i < ctx.def_class().size(); i++) {
                li.add(visitDef_class(ctx.def_class().get(i)));
            }
            program.setDef_class(li);
        }
        return program;
    }

    @Override
    public def_class visitDef_class(Dart2Parser.Def_classContext ctx) {

        def_class def_class = new def_class();
        if (ctx.IDENTIFIER() != null) {
            List<String> IDENTIFIER = new ArrayList<>();
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                IDENTIFIER.add(ctx.IDENTIFIER().get(i).getText());
            }
            def_class.setIDENTIFIER(IDENTIFIER);
        }

        if (ctx.class_body() != null) {
            List<class_body> class_body = new ArrayList<>();
            for (int i = 0; i < ctx.class_body().size(); i++) {
                class_body.add(visitClass_body(ctx.class_body(i)));
            }
            def_class.setClass_body(class_body);
        }
        return def_class;
    }

    @Override
    public class_body visitClass_body(Dart2Parser.Class_bodyContext ctx) {

        class_body class_body = new class_body();

        if (ctx.varDefinition() != null) {
            class_body.setVarDefinition(visitVarDefinition(ctx.varDefinition()));
        }
        if (ctx.boolVarDefnition() != null) {
            class_body.setBoolVarDefnition(visitBoolVarDefnition(ctx.boolVarDefnition()));
        }
        if (ctx.def_function_datatype() != null) {
            class_body.setDef_function_datatype(visitDef_function_datatype(ctx.def_function_datatype()));
        }
        if (ctx.def_function_void() != null) {
            class_body.setDef_function_void(visitDef_function_void(ctx.def_function_void()));
        }
        if (ctx.def_build_function() != null) {
            class_body.setDef_build_function(visitDef_build_function(ctx.def_build_function()));
        }

        return class_body;
    }

    @Override
    public varDefinition visitVarDefinition(Dart2Parser.VarDefinitionContext ctx) {

        varDefinition varDefinition = new varDefinition();

        if (ctx.DataType() != null) {
            varDefinition.setDataType(ctx.DataType().getText());
        }
        if (ctx.IDENTIFIER() != null) {
            varDefinition.setIDENTIFIER(ctx.IDENTIFIER().getText());
        }
        if (ctx.exp() != null) {
            varDefinition.setExp(visitExp(ctx.exp()));
        }


        return varDefinition;
    }

    @Override
    public def_function_datatype visitDef_function_datatype(Dart2Parser.Def_function_datatypeContext ctx) {

        def_function_datatype def_function_datatype = new def_function_datatype();

        if (ctx.DataType() != null) {
            List<String> DataType = new ArrayList<>();
            for (int i = 0; i < ctx.DataType().size(); i++) {
                DataType.add(ctx.DataType().get(i).getText());
            }
            def_function_datatype.setDataType(DataType);
        }
        if (ctx.IDENTIFIER() != null) {
            List<String> IDENTIFIER = new ArrayList<>();
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                IDENTIFIER.add(ctx.IDENTIFIER().get(i).getText());
            }
            def_function_datatype.setIDENTIFIER(IDENTIFIER);
        }
        if (ctx.content() != null) {
            List<Content> content = new ArrayList<>();
            for (int i = 0; i < ctx.content().size(); i++) {
                content.add(visitContent(ctx.content(i)));
            }
            def_function_datatype.setContent(content);
        }
        if(ctx.exp() != null){
            def_function_datatype.setExp(visitExp(ctx.exp()));
        }

        return def_function_datatype;

    }

    @Override
    public def_function_void visitDef_function_void(Dart2Parser.Def_function_voidContext ctx) {
        def_function_void def_function_void = new def_function_void();
        if (ctx.DataType() != null) {
            List<String> DataType = new ArrayList<>();
            for (int i = 0; i < ctx.DataType().size(); i++) {
                DataType.add(ctx.DataType().get(i).getText());
            }
            def_function_void.setDataType(DataType);
        }
        if (ctx.IDENTIFIER() != null) {
            List<String> IDENTIFIER = new ArrayList<>();
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                IDENTIFIER.add(ctx.IDENTIFIER().get(i).getText());
            }
            def_function_void.setIDENTIFIER(IDENTIFIER);
        }
        if (ctx.content() != null) {
            List<Content> content = new ArrayList<>();
            for (int i = 0; i < ctx.content().size(); i++) {
                content.add(visitContent(ctx.content(i)));
            }
            def_function_void.setContent(content);
        }
        return def_function_void;
    }

    @Override
    public def_build_function visitDef_build_function(Dart2Parser.Def_build_functionContext ctx) {
        def_build_function def_build_function = new def_build_function();
        if (ctx.widget() != null) {
            def_build_function.setWidget(visitWidget(ctx.widget()));
        }
        return def_build_function;
    }

    @Override
    public Content visitContent(Dart2Parser.ContentContext ctx) {
        Content content = new Content();

        if (ctx.varDefinition() != null) {
            content.setVarDefinition(visitVarDefinition(ctx.varDefinition()));
        }

        if (ctx.varEQ() != null) {
            content.setVarEQ(visitVarEQ(ctx.varEQ()));
        }
        if (ctx.intIncrease() != null) {
            content.setIntIncrease(visitIntIncrease(ctx.intIncrease()));
        }
        if (ctx.boolVarDefnition() != null) {
            content.setBoolVarDefnition(visitBoolVarDefnition(ctx.boolVarDefnition()));
        }
        if (ctx.boolVarEq() != null) {
            content.setBoolVarEq(visitBoolVarEq(ctx.boolVarEq()));
        }
        if (ctx.def_if() != null) {
            content.setDef_if(visitDef_if(ctx.def_if()));
        }
        if (ctx.def_else() != null) {
            content.setDef_else(visitDef_else(ctx.def_else()));
        }
        if (ctx.def_else_if() != null) {
            content.setDef_else_if(visitDef_else_if(ctx.def_else_if()));
        }
        if (ctx.def_for() != null) {
            content.setDef_for(visitDef_for(ctx.def_for()));
        }
        if (ctx.def_while() != null) {
            content.setDef_while(visitDef_while(ctx.def_while()));
        }
        if (ctx.def_function_void() != null) {
            content.setDef_function_void(visitDef_function_void(ctx.def_function_void()));
        }
        if (ctx.def_function_datatype() != null) {
            content.setDef_function_datatype(visitDef_function_datatype(ctx.def_function_datatype()));
        }
        if (ctx.navigatorRule() != null) {
            content.setNavigatorRule(visitNavigatorRule(ctx.navigatorRule()));
        }
        if (ctx.def_switch() != null) {
            content.setDef_switch(visitDef_switch(ctx.def_switch()));
        } if (ctx.getData() != null) {
            content.setGetDataAst(visitGetData(ctx.getData()));
        }

        return content;
    }

    @Override
    public varEQ visitVarEQ(Dart2Parser.VarEQContext ctx) {
        varEQ varEQ = new varEQ();
        varEQ.setIDENTIFIER(ctx.IDENTIFIER().getText());
        varEQ.setExp(visitExp(ctx.exp()));
        return varEQ;
    }

    @Override
    public intIncrease visitIntIncrease(Dart2Parser.IntIncreaseContext ctx) {
        intIncrease intIncrease = new intIncrease();
        intIncrease.setIDENTIFIER(ctx.IDENTIFIER().getText());
        intIncrease.setType((ctx.PLPL() != null ? IncrementType.PL : IncrementType.Minus));
        return intIncrease;
    }

    @Override
    public boolVarEq visitBoolVarEq(Dart2Parser.BoolVarEqContext ctx) {
        boolVarEq boolVarEq = new boolVarEq();
        boolVarEq.setIDENTIFIER(ctx.IDENTIFIER().getText());
        boolVarEq.setBoolExp(visitBoolExp(ctx.boolExp()));

        return boolVarEq;
    }

    public exp visitExp(Dart2Parser.ExpContext ctx) {
        exp exp = new exp();
        if (ctx instanceof Dart2Parser.BetweenBracketContext) {
            exp = visitBetweenBracket((Dart2Parser.BetweenBracketContext) ctx);
        } else if (ctx instanceof Dart2Parser.VariableContext) {
            exp = visitVariable((Dart2Parser.VariableContext) ctx);
        } else if (ctx instanceof Dart2Parser.NumberContext) {
            exp = visitNumber((Dart2Parser.NumberContext) ctx);
        } else if (ctx instanceof Dart2Parser.MathematicsLogicContext) {
            exp = visitMathematicsLogic((Dart2Parser.MathematicsLogicContext) ctx);
        } else if (ctx instanceof Dart2Parser.DOUBLEContext) {
            exp = visitDOUBLE((Dart2Parser.DOUBLEContext) ctx);
        } else if (ctx instanceof Dart2Parser.StringContext) {
            exp = visitString((Dart2Parser.StringContext) ctx);
        }
        return exp;
    }

    public boolExp visitBoolExp(Dart2Parser.BoolExpContext ctx) {
        boolExp exp = new boolExp();
        if (ctx instanceof Dart2Parser.BoolMathematicsLogicContext) {
            exp = visitBoolMathematicsLogic((Dart2Parser.BoolMathematicsLogicContext) ctx);
        } else if (ctx instanceof Dart2Parser.BoolContext) {
            exp = visitBool((Dart2Parser.BoolContext) ctx);
        } else if (ctx instanceof Dart2Parser.BoolVariableContext) {
            exp = visitBoolVariable((Dart2Parser.BoolVariableContext) ctx);
        } else if (ctx instanceof Dart2Parser.BoolBetweenBracketContext) {
            exp = visitBoolBetweenBracket((Dart2Parser.BoolBetweenBracketContext) ctx);
        }
        return exp;
    }

    @Override
    public exp visitBetweenBracket(Dart2Parser.BetweenBracketContext ctx) {
        exp exp = new exp();
        exp.setBetweenBracket(visitExp(ctx.exp()));
        return exp;
    }

    @Override
    public exp visitVariable(Dart2Parser.VariableContext ctx) {
        exp exp = new exp();
        exp.setIDENTIFIER(ctx.IDENTIFIER().getText());
        return exp;
    }

    @Override
    public exp visitNumber(Dart2Parser.NumberContext ctx) {
        exp exp = new exp();
        exp.setNUMBER(Integer.parseInt(ctx.NUMBER().getText()));
        return exp;
    }

    @Override
    public exp visitMathematicsLogic(Dart2Parser.MathematicsLogicContext ctx) {
        exp exp = visitExp(ctx.exp(0));
        exp exp2 = visitExp(ctx.exp(1));
        exp exp3 = new exp();
        exp3.setMathMaticalSign(ctx.MathMaticalSign().getText());
        exp3.setExp(exp);
        exp3.setExp2(exp2);
        return exp3;
    }

    @Override
    public exp visitDOUBLE(Dart2Parser.DOUBLEContext ctx) {
        exp exp = new exp();
        exp.setDOUBLE(Double.parseDouble(ctx.DOUBLE().getText()));
        return exp;
    }

    @Override
    public exp visitString(Dart2Parser.StringContext ctx) {
        exp exp = new exp();
        exp.setSingleLineString(ctx.SingleLineString().getText());
        return exp;
    }


    @Override
    public boolExp visitBoolMathematicsLogic(Dart2Parser.BoolMathematicsLogicContext ctx) {
        boolExp exp = new boolExp();
        exp.setBoolExp(visitBoolExp(ctx.boolExp(0)));
        exp.setBoolExp2(visitBoolExp(ctx.boolExp(1)));
        exp.setBooleanSign(ctx.BooleanSign().getText());
        return exp;
    }

    @Override
    public boolExp visitBool(Dart2Parser.BoolContext ctx) {
        boolExp exp = new boolExp();
        exp.setBool_value(ctx.getText());
        return exp;
    }

    @Override
    public boolExp visitBoolVariable(Dart2Parser.BoolVariableContext ctx) {
        boolExp exp = new boolExp();
        exp.setIDENTIFIER(ctx.IDENTIFIER().getText());
        return exp;
    }

    @Override
    public boolExp visitBoolBetweenBracket(Dart2Parser.BoolBetweenBracketContext ctx) {
        boolExp exp = new boolExp();
        exp.setBoolBetweenBracket(visitBoolExp(ctx.boolExp()));
        return exp;
    }

    @Override
    public def_if visitDef_if(Dart2Parser.Def_ifContext ctx) {
        def_if def_if = new def_if();
        def_if.setIfCondition(visitCondition(ctx.condition()));
        List<Content> contentList = new ArrayList<>();
        for (int i = 0; i < ctx.content().size(); i++) {
            contentList.add(visitContent(ctx.content(i)));
        }
        def_if.setContentList(contentList);
        return def_if;
    }

    @Override
    public def_else_if visitDef_else_if(Dart2Parser.Def_else_ifContext ctx) {

        def_else_if def_if = new def_else_if();
        def_if.setElseIFCondition(visitCondition(ctx.condition()));
        List<Content> contentList = new ArrayList<>();
        for (int i = 0; i < ctx.content().size(); i++) {
            contentList.add(visitContent(ctx.content(i)));
        }
        def_if.setContentList(contentList);
        return def_if;
    }

    @Override
    public def_else visitDef_else(Dart2Parser.Def_elseContext ctx) {
        def_else def_if = new def_else();
        List<Content> contentList = new ArrayList<>();
        for (int i = 0; i < ctx.content().size(); i++) {
            contentList.add(visitContent(ctx.content(i)));
        }
        def_if.setContentList(contentList);
        return def_if;
    }


    @Override
    public def_for visitDef_for(Dart2Parser.Def_forContext ctx) {
        def_for def_for = new def_for();
        if (ctx.condition() != null)
            def_for.setCondition(visitCondition(ctx.condition()));
        if (ctx.for_Increment() != null) {
            for_Increment for_increment = visitFor_Increment(ctx.for_Increment());
            def_for.setFor_Increment(for_increment);
        }
        if (ctx.varDefinition() != null)
            def_for.setVarDefinition(visitVarDefinition(ctx.varDefinition()));
        List<Content> contentList = new ArrayList<>();
        for (int i = 0; i < ctx.content().size(); i++) {
            contentList.add(visitContent(ctx.content(i)));
        }
        def_for.setContent(contentList);
        return def_for;
    }

    for_Increment visitFor_Increment(Dart2Parser.For_IncrementContext ctx) {
        for_Increment for_increment = new for_Increment();
        if (ctx instanceof Dart2Parser.For_Int_IncrementContext) {
            for_increment.setFor_Int_Increment(visitFor_Int_Increment((Dart2Parser.For_Int_IncrementContext) ctx));
        } else if (ctx instanceof Dart2Parser.For_var_EqContext) {
            for_increment.setFor_var_Eq(visitFor_var_Eq((Dart2Parser.For_var_EqContext) ctx));
        }
        return for_increment;
    }

    @Override
    public for_Int_Increment visitFor_Int_Increment(Dart2Parser.For_Int_IncrementContext ctx) {
        for_Int_Increment for_Int_Increment = new for_Int_Increment();
        if (ctx.MM() != null) for_Int_Increment.setType(IncrementType.Minus);
        else for_Int_Increment.setType(IncrementType.PL);
        for_Int_Increment.setIDENTIFIER(ctx.IDENTIFIER().getText());
        return for_Int_Increment;
    }

    @Override
    public for_var_Eq visitFor_var_Eq(Dart2Parser.For_var_EqContext ctx) {
        for_var_Eq for_var_Eq = new for_var_Eq();
        for_var_Eq.setIDENTIFIER(ctx.IDENTIFIER().getText());
        if (ctx.EQFORNORMALMATH() != null)
            for_var_Eq.setEQFORNORMALMATH(ctx.EQFORNORMALMATH().getText());
        if (ctx.EQ() != null)
            for_var_Eq.setEQFORNORMALMATH(ctx.EQ().getText());
        if (ctx.exp() != null) {
            for_var_Eq.setExp(visitExp(ctx.exp()));
        }
        return for_var_Eq;
    }

    @Override
    public def_while visitDef_while(Dart2Parser.Def_whileContext ctx) {
        def_while def_while = new def_while();
        def_while.setCondition(visitCondition(ctx.condition()));
        List<Content> contentList = new ArrayList<>();
        for (int i = 0; i < ctx.content().size(); i++) {
            contentList.add(visitContent(ctx.content(i)));
        }
        def_while.setContent(contentList);
        return def_while;
    }

    public condition visitCondition(Dart2Parser.ConditionContext ctx) {
        condition condition = new condition();
        if (ctx instanceof Dart2Parser.ConditionBoolContext) {
            condition = visitConditionBool((Dart2Parser.ConditionBoolContext) ctx);
        } else if (ctx instanceof Dart2Parser.ComparisonBetweenTwoNormalVarContext) {
            condition = visitComparisonBetweenTwoNormalVar((Dart2Parser.ComparisonBetweenTwoNormalVarContext) ctx);
        } else if (ctx instanceof Dart2Parser.MultiConditionContext) {
            condition = visitMultiCondition((Dart2Parser.MultiConditionContext) ctx);
        }
        return condition;
    }

    @Override
    public condition visitConditionBool(Dart2Parser.ConditionBoolContext ctx) {
        condition condition = new condition();
        condition.setBoolExp(visitBoolExp(ctx.boolExp()));
        return condition;
    }

    @Override
    public condition visitComparisonBetweenTwoNormalVar(Dart2Parser.ComparisonBetweenTwoNormalVarContext ctx) {
        condition condition = new condition();
        condition.setExp(visitExp(ctx.exp(0)));
        condition.setExp2(visitExp(ctx.exp(1)));
        condition.setComparisonNormalVarSign(ctx.ComparisonNormalVarSign().getText());
        return condition;
    }

    @Override
    public condition visitMultiCondition(Dart2Parser.MultiConditionContext ctx) {
        condition condition = new condition();
        condition.setCondition(visitCondition(ctx.condition(0)));
        condition.setCondition(visitCondition(ctx.condition(1)));
        condition.setComparisonSign(ctx.ComparisonSign().getText());
        return condition;
    }

    @Override
    public def_object visitDef_object(Dart2Parser.Def_objectContext ctx) {
        def_object def_object = new def_object();
        if(ctx.IDENTIFIER() != null) {
            List<String> stringList = new ArrayList<>();
            ctx.IDENTIFIER().forEach(terminalNode -> {
                stringList.add(terminalNode.getText());
            });
            def_object.setIDENTIFIER(stringList);
        }if(ctx.exp() != null) {
            List<exp> stringList = new ArrayList<>();
            ctx.exp().forEach(terminalNode -> {
                stringList.add(visitExp(terminalNode));
            });
            def_object.setExps(stringList);
        }
        return def_object;
    }

    @Override
    public def_switch visitDef_switch(Dart2Parser.Def_switchContext ctx) {
        def_switch def_switch = new def_switch();
        if (ctx.switch_case() != null) {
            List<def_case> def_caseList = new ArrayList<>();
            for (int i = 0; i < ctx.switch_case().size(); i++) {
                def_caseList.add(visitSwitch_case(ctx.switch_case().get(i)));
            }
            def_switch.setDef_caseList(def_caseList);
        }
        if (ctx.switch_defult() != null) {
            def_switch.setDef_defult(visitSwitch_defult(ctx.switch_defult()));
        }
        if (ctx.IDENTIFIER() != null)
            def_switch.setIDENTIFIER(ctx.IDENTIFIER().getText());
        return def_switch;
    }

    @Override
    public def_case visitSwitch_case(Dart2Parser.Switch_caseContext ctx) {
        def_case def_case = new def_case();
        List<Content> contentList = new ArrayList<>();
        for (int i = 0; i < ctx.content().size(); i++) {
            Content content = visitContent(ctx.content(i));
            contentList.add(content);
        }
        def_case.setContentList(contentList);
        value value = visitValue(ctx.value());
        def_case.setValue(value);
        return def_case;
    }

    @Override
    public def_defult visitSwitch_defult(Dart2Parser.Switch_defultContext ctx) {
        def_defult def_defult = new def_defult();
        List<Content> contentList = new ArrayList<>();
        for (int i = 0; i < ctx.content().size(); i++) {
            Content content = visitContent(ctx.content(i));
            contentList.add(content);
        }
        def_defult.setContentList(contentList);
        return def_defult;
    }

    @Override
    public boolVarDefnition visitBoolVarDefnition(Dart2Parser.BoolVarDefnitionContext ctx) {

        boolVarDefnition boolVarDefnition = new boolVarDefnition();


        if (ctx.Bool_type() != null) {
            boolVarDefnition.setBool_type(ctx.Bool_type().getText());
        }
        if (ctx.IDENTIFIER() != null) {
            boolVarDefnition.setIDENTIFIER(ctx.IDENTIFIER().getText());
        }
        if (ctx.boolExp() != null) {
            boolVarDefnition.setBoolExp(visitBoolExp(ctx.boolExp()));
        }
        return boolVarDefnition;
    }


    @Override
    public value visitValue(Dart2Parser.ValueContext ctx) {

        value value = new value();

        if (ctx.SingleLineString() != null) {
            value.setSingleLineString(ctx.SingleLineString().getText());

        }
        if (ctx.DOUBLE() != null) {
            value.setDOUBLE(ctx.DOUBLE().getText());

        }
        if (ctx.NUMBER() != null) {
            value.setNUMBER(ctx.NUMBER().getText());

        }


        return value;
    }

    @Override
    public widget visitWidget(Dart2Parser.WidgetContext ctx) {

        widget widget = new widget();

        if (ctx.listView() != null) {
            widget.setListView(visitListView(ctx.listView()));
        }
        if (ctx.defColumn() != null) {
            widget.setDefColumn(visitDefColumn(ctx.defColumn()));
        }
        if (ctx.defRow() != null) {
            widget.setDefRow(visitDefRow(ctx.defRow()));
        }
        if (ctx.textField() != null) {
            widget.setTextField(visitTextField(ctx.textField()));
        }
        if (ctx.text() != null) {
            widget.setText(visitText(ctx.text()));
        }
        if (ctx.defContainer() != null) {
            widget.setDefContainer(visitDefContainer(ctx.defContainer()));
        }
        if (ctx.image() != null) {
            widget.setImage(visitImage(ctx.image()));
        }
        if (ctx.defInkWell() != null) {
            widget.setInkWell(visitDefInkWell(ctx.defInkWell()));
        }

        return widget;
    }

    @Override
    public defColumn visitDefColumn(Dart2Parser.DefColumnContext ctx) {

        defColumn defColumn = new defColumn();

        if (ctx.COLUMN_() != null) {
            defColumn.setCOLUMN_(ctx.COLUMN_().getText());

        }
        if (ctx.layoutBody() != null) {
            List<layoutBody> layoutBody = new ArrayList<>();
            for (int i = 0; i < ctx.layoutBody().size(); i++) {
                layoutBody.add(visitLayoutBody(ctx.layoutBody(i)));
            }
            defColumn.setLayoutBody(layoutBody);
        }

        return defColumn;
    }

    @Override
    public defRow visitDefRow(Dart2Parser.DefRowContext ctx) {
        defRow defRow = new defRow();

        if (ctx.ROW_() != null) {
            defRow.setROW_(ctx.ROW_().getText());

        }
        if (ctx.layoutBody() != null) {
            List<layoutBody> layoutBody = new ArrayList<>();
            for (int i = 0; i < ctx.layoutBody().size(); i++) {
                layoutBody.add(visitLayoutBody(ctx.layoutBody(i)));
            }
            defRow.setLayoutBody(layoutBody);
        }

        return defRow;
    }

    @Override
    public defContainer visitDefContainer(Dart2Parser.DefContainerContext ctx) {

        defContainer defContainer = new defContainer();

        if (ctx.CONTAINER_() != null) {
            defContainer.setCONTAINER_(ctx.CONTAINER_().getText());

        }
        if (ctx.containerBody() != null) {
            List<containerBody> containerBody = new ArrayList<>();
            for (int i = 0; i < ctx.containerBody().size(); i++) {
                containerBody.add(visitContainerBody(ctx.containerBody(i)));
            }
            defContainer.setContainerBody(containerBody);
        }

        return defContainer;
    }


    @Override
    public containerBody visitContainerBody(Dart2Parser.ContainerBodyContext ctx) {

        containerBody containerBody = new containerBody();

        if (ctx.CHILD_() != null) {
            containerBody.setCHILD_(ctx.CHILD_().getText());

        }
        if (ctx.WIDGET() != null) {
            containerBody.setWIDGET(ctx.WIDGET().getText());

        }
        if (ctx.widget() != null) {
            containerBody.setWidget(visitWidget(ctx.widget()));
        }
        if (ctx.PADDING_() != null) {
            containerBody.setPADDING_(ctx.PADDING_().getText());

        }
        if (ctx.PADDING_value() != null) {
            containerBody.setPADDING_value(ctx.PADDING_value().getText());

        }
        if (ctx.WIDTH_() != null) {
            containerBody.setWIDTH_(ctx.WIDTH_().getText());

        }
        if (ctx.NUMBER() != null) {
            containerBody.setNUMBER(ctx.NUMBER().getText());

        }

        return containerBody;
    }

    @Override
    public InkWell visitDefInkWell(Dart2Parser.DefInkWellContext ctx) {
        InkWell inkWell = new InkWell();
        List<InkWellBody> inkWellBodyList = new ArrayList<>();
        if (ctx.inkWellBody() != null) {
            ctx.inkWellBody().forEach(inkWellBodyContext -> {
                InkWellBody bodyItem = (InkWellBody) visitInkWellBody(inkWellBodyContext);
                inkWellBodyList.add(bodyItem);
            });
        }
        inkWell.setInkWellBodyList(inkWellBodyList);
        return inkWell;
    }

    @Override
    public InkWellBody visitInkWellBody(Dart2Parser.InkWellBodyContext ctx) {
        if (ctx.widget() != null) {
            InkWellChild bodyItem = new InkWellChild();
            bodyItem.setWidget(visitWidget(ctx.widget()));
            return bodyItem;
        } else if (ctx.ONPRESSED() != null) {
            InkWellOnPressed bodyItem = new InkWellOnPressed();
            List<Content> contentList = new ArrayList<>();
            ctx.content().forEach(contentContext -> {
                contentList.add(visitContent(contentContext));
            });
            bodyItem.setContentList(contentList);
            return bodyItem;
        }
        return null;
    }

    @Override
    public listView visitListView(Dart2Parser.ListViewContext ctx) {
        listView listView = new listView();
        if(ctx.layoutBody() != null)listView.setLayoutBody(visitLayoutBody(ctx.layoutBody()));
        return listView;
    }
    @Override
    public layoutBody visitLayoutBody(Dart2Parser.LayoutBodyContext ctx) {

        layoutBody layoutBody = new layoutBody();

        if (ctx.CHILDREN_() != null) {
            layoutBody.setCHILDREN_(ctx.CHILDREN_().getText());

        }
        if (ctx.WIDGET() != null) {
            layoutBody.setWIDGET(ctx.WIDGET().getText());

        }
        if (ctx.widget() != null) {
            List<widget> widget = new ArrayList<>();
            for (int i = 0; i < ctx.widget().size(); i++) {
                widget.add(visitWidget(ctx.widget(i)));
            }
            layoutBody.setWidget(widget);
        }

        return layoutBody;
    }

    @Override
    public text visitText(Dart2Parser.TextContext ctx) {
        text myText = new text();
        myText.setSingleLineString(ctx.getChild(2).getText());
        return myText;
    }

    @Override
    public textField visitTextField(Dart2Parser.TextFieldContext ctx) {
        textField textField = new textField();
        List<textFieldProperties> elements = new ArrayList<>();

        for (int i = 0; i < ctx.textFieldProperties().size(); i++) {
            if (ctx.textFieldProperties(i) != null) {
                elements.add((textFieldProperties) this.visitTextFieldProperties(ctx.textFieldProperties(i)));
            }
        }
        if (ctx.TextField() != null) {
            textField.setTExtField(ctx.TextField().getText());
        }

        textField.setTextFieldProperties(elements);
        return textField;
    }


    @Override
    public textFieldProperties visitTextFieldProperties(Dart2Parser.TextFieldPropertiesContext ctx) {


        textFieldProperties textFieldProperties = new textFieldProperties();

        if (ctx.textFieldTextProperty() != null) {
            textFieldProperties.setTextFieldTextProperty(visitTextFieldTextProperty(ctx.textFieldTextProperty()));
        }
        if (ctx.textFieldControllerProperty() != null) {
            textFieldProperties.setTextFieldControllerProperty(visitTextFieldControllerProperty(ctx.textFieldControllerProperty()));
        }
        if (ctx.textFieldDecorationProperty() != null) {
            textFieldProperties.setTextFieldDecorationProperty(visitTextFieldDecorationProperty(ctx.textFieldDecorationProperty()));
        }
        if (ctx.textFieldOnChangedProperty() != null) {
            textFieldProperties.setTextFieldOnChangedProperty(visitTextFieldOnChangedProperty(ctx.textFieldOnChangedProperty()));
        }
        if (ctx.textFieldOnEditingCompleteProperty() != null) {
            textFieldProperties.setTextFieldOnEditingCompleteProperty(visitTextFieldOnEditingCompleteProperty(ctx.textFieldOnEditingCompleteProperty()));
        }


        return textFieldProperties;
    }

    @Override
    public textFieldTextProperty visitTextFieldTextProperty(Dart2Parser.TextFieldTextPropertyContext ctx) {
        return null;
    }

    @Override
    public textFieldControllerProperty visitTextFieldControllerProperty(Dart2Parser.TextFieldControllerPropertyContext ctx) {
        textFieldControllerProperty controllerProperty = new textFieldControllerProperty();
        controllerProperty.setCONTROLLER("controller");
        controllerProperty.setIDENTIFIER(ctx.IDENTIFIER().getText());
        return controllerProperty;
    }

    @Override
    public textFieldDecorationProperty visitTextFieldDecorationProperty(Dart2Parser.TextFieldDecorationPropertyContext ctx) {
        return null;
    }

    @Override
    public textFieldOnChangedProperty visitTextFieldOnChangedProperty(Dart2Parser.TextFieldOnChangedPropertyContext ctx) {
        return null;
    }

    @Override
    public textFieldOnEditingCompleteProperty visitTextFieldOnEditingCompleteProperty(Dart2Parser.TextFieldOnEditingCompletePropertyContext ctx) {
        return null;
    }

    @Override
    public image visitImage(Dart2Parser.ImageContext ctx) {
        image image = new image();
        if (ctx.IMAGE_() != null) {
            image.setIMAGE_(ctx.IMAGE_().getText());
        }
        if (ctx.assetImage() != null) {
            image.setAssetImage(visitAssetImage(ctx.assetImage()));
        }

        List<imageBody> imageBody = new ArrayList<>();
        for (int i = 0; i < ctx.imageBody().size(); i++) {
            imageBody.add(visitImageBody(ctx.imageBody(i)));
        }
        image.setImageBody(imageBody);

        return image;
    }

    @Override
    public assetImage visitAssetImage(Dart2Parser.AssetImageContext ctx) {
        assetImage myAssetImage = new assetImage();
        myAssetImage.setSingleLineString(ctx.SingleLineString().getText());
        myAssetImage.setIMAGE("Image");
        return myAssetImage;
    }

    @Override
    public imageBody visitImageBody(Dart2Parser.ImageBodyContext ctx) {
        imageBody imageBody = new imageBody();
        if (ctx.HEIGHT_() != null) {
            imageBody.setHEIGHT_(ctx.HEIGHT_().getText());
            imageBody.setNUMBER(ctx.NUMBER().getText());
        }
        if (ctx.WIDTH_() != null) {
            imageBody.setHEIGHT_(ctx.WIDTH_().getText());
            imageBody.setNUMBER(ctx.NUMBER().getText());
        }
        return imageBody;
    }

    @Override
    public NavigationRule visitNavigatorRule(Dart2Parser.NavigatorRuleContext ctx) {
        NavigationRule navigationRule = new NavigationRule();
        navigationRule.setDef_object(visitDef_object(ctx.def_object()));
        return navigationRule;
    }

    @Override
    public GetDataAst visitGetData(Dart2Parser.GetDataContext ctx) {
        GetDataAst getDataAst = new GetDataAst();
        getDataAst.setName(ctx.IDENTIFIER().getText());
        return getDataAst;
    }

}
