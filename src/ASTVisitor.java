import ASTClasses.DartClasses.Boolean.boolVarDefnition;
import ASTClasses.DartClasses.Boolean.boolVarEq;
import ASTClasses.DartClasses.Class.class_body;
import ASTClasses.DartClasses.Class.def_class;
import ASTClasses.DartClasses.Content.*;
import ASTClasses.DartClasses.Content.For.IncrementType;
import ASTClasses.DartClasses.Content.For.def_for;
import ASTClasses.DartClasses.Content.For.for_Increment;
import ASTClasses.DartClasses.Content.IF.def_else;
import ASTClasses.DartClasses.Content.IF.def_else_if;
import ASTClasses.DartClasses.Content.IF.def_if;
import ASTClasses.DartClasses.Function.def_build_function;
import ASTClasses.DartClasses.Function.def_function_datatype;
import ASTClasses.DartClasses.Function.def_function_void;

import java.util.concurrent.ThreadLocalRandom;

import ASTClasses.DartClasses.GetDataAst;
import ASTClasses.DartClasses.exp;
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
import ASTClasses.program;
import SymbolTable.symbolTableClasses.*;

import java.io.FileWriter;
import java.io.IOException;

public class ASTVisitor {

    SymbolTable symbolTable = new SymbolTable();
    FileWriter fw;

    public void visit(program program) {
        try {
            fw = new FileWriter("output.txt");
            if (program.getDef_class() != null) {
                for (int i = 0; i < program.getDef_class().size(); i++) {
                    visit(program.getDef_class().get(i));
                }
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Dart ----------------------------------------------------------------------
    public void visit(def_class def_class) {
        final int classId = ThreadLocalRandom.current().nextInt();
        addToSymbolTable(-1, new SymbolTableObject(SymbolTableRowType.Class, def_class.getIDENTIFIER().get(0), new SymbolTableObjectClassValue(0, classId, -1, def_class)));

        if (def_class.getClass_body() != null) {
            for (int i = 0; i < def_class.getClass_body().size(); i++) {
                visit(def_class.getClass_body().get(i), classId, 0);
            }
        }
    }

    public void visit(class_body class_body, int parentId, int scope) {
        if (class_body.getVarDefinition() != null) {
            visit(class_body.getVarDefinition(), parentId, scope);
        }
        if (class_body.getBoolVarDefnition() != null) {
            visit(class_body.getBoolVarDefnition(), parentId, scope);
        }
        if (class_body.getDef_function_datatype() != null) {
            visit(class_body.getDef_function_datatype(), parentId, scope);
        }
        if (class_body.getDef_function_void() != null) {
            visit(class_body.getDef_function_void(), parentId, scope);
        }
        if (class_body.getDef_build_function() != null) {
            visit(class_body.getDef_build_function(), parentId, scope);
        }
    }

    public void visit(boolVarDefnition boolVarDefnition, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.BoolVarDefinition, boolVarDefnition.getIDENTIFIER(), new SymbolTableObjectBoolVarDefinitionValue(scope + 1, id, parentId, boolVarDefnition)));

    }

    public void visit(varDefinition varDefinition, int parenId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();

        addToSymbolTable(parenId, new SymbolTableObject(SymbolTableRowType.VarDefinition, varDefinition.getIDENTIFIER(), new SymbolTableObjectVarDefinitionValue(scope, id, parenId, varDefinition)));
        if (varDefinition.getExp() != null) {
            visit(varDefinition.getExp());
        }
    }

    public void visit(def_function_datatype def_function_datatype, int parentId, int scope) {
        if (def_function_datatype.getDataType() != null) {
            final int id = ThreadLocalRandom.current().nextInt();

            addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.FunctionDatatype, def_function_datatype.getIDENTIFIER().get(0), new SymbolTableObjectDataTypeFunctionValue(scope, id, parentId, def_function_datatype)));
            if (def_function_datatype.getContent() != null) {
                for (int i = 0; i < def_function_datatype.getContent().size(); i++) {
                    visit(def_function_datatype.getContent().get(i), id, scope + 1);
                }
            }
        }
    }

    public void visit(def_function_void def_function_void, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.Function, def_function_void.getIDENTIFIER().get(0), new SymbolTableObjectFunctionValue(scope, id, parentId, def_function_void)));

        if (def_function_void.getContent().size() > 0) {
            for (int i = 0; i < def_function_void.getContent().size(); i++) {
                visit(def_function_void.getContent().get(i), id, scope + 1);
            }
        }
    }

    public void visit(def_build_function def_build_function, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.buildFunction, "buildFunction", new SymbolTableObjectBuildFunctionValue(scope, id, parentId)));


        if (def_build_function.getWidget() != null) {
            visit(def_build_function.getWidget(), id, scope + 1, false);
        }
    }

    public void visit(exp exp) {
    }

    public void visit(Content content, int parentId, int scope) {
        if (content.getVarDefinition() != null) {

            visit(content.getVarDefinition(), parentId, scope);
        }
        if (content.getVarEQ() != null) {
            visit(content.getVarEQ(), parentId, scope);
        }
        if (content.getIntIncrease() != null) {
            visit(content.getIntIncrease(), parentId, scope);
        }
        if (content.getBoolVarDefnition() != null) {
            visit(content.getBoolVarDefnition(), parentId, scope);
        }
        if (content.getBoolVarEq() != null) {
            visit(content.getBoolVarEq(), parentId, scope);
        }
        if (content.getDef_if() != null) {
            visit(content.getDef_if(), parentId, scope);
        }
        if (content.getDef_else() != null) {
            visit(content.getDef_else(), parentId, scope);
        }
        if (content.getDef_else_if() != null) {
            visit(content.getDef_else_if(), parentId, scope);
        }
        if (content.getDef_for() != null) {
            visit(content.getDef_for(), parentId, scope);
        }
        if (content.getDef_while() != null) {
            visit(content.getDef_while(), parentId, scope);
        }
        if (content.getDef_switch() != null) {
            visit(content.getDef_switch(), parentId, scope);
        }
        if (content.getDef_function_void() != null) {
            visit(content.getDef_function_void(), parentId, scope);
        }
        if (content.getDef_function_datatype() != null) {
            visit(content.getDef_function_datatype(), parentId, scope);
        }
        if (content.getNavigatorRule() != null) {
            visit(content.getNavigatorRule(), parentId, scope);
        }if (content.getGetDataAst() != null) {
            visit(content.getGetDataAst(), parentId, scope);
        }

    }

    public void visit(varEQ varEQ, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.VarEqual, varEQ.getIDENTIFIER(), new SymbolTableObjectVarEqualValue(scope, id, parentId, varEQ)));
//        if (varEQ.getExp()  != null) {
//            visit(varEQ.getExp());
//        }
    }

    public void visit(intIncrease intIncrease, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.Increment, intIncrease.getIDENTIFIER(), new SymbolTableObjectIncrementValue(scope, id, parentId, intIncrease)));
    }

    public void visit(boolVarEq boolVarEq, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();

        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.BoolVarEqual, boolVarEq.getIDENTIFIER(), new SymbolTableObjectBoolVarEqualValue(scope, id, parentId, boolVarEq)));
    }

    public void visit(def_if def_if, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();

        if (def_if.getContentList() != null) {
            for (int i = 0; i < def_if.getContentList().size(); i++) {
                visit(def_if.getContentList().get(i), id, scope + 1);
            }
        }

        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.IF, "IF", new SymbolTableObjectIfDefineValue(scope, id, parentId, def_if)));
    }

    public void visit(def_else def_else, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        if (def_else.getContentList() != null) {
            for (int i = 0; i < def_else.getContentList().size(); i++) {
                visit(def_else.getContentList().get(i), id, scope + 1);
            }
        }
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.Else, "Else", new SymbolTableObjectElseDefineValue(scope, id, parentId, def_else)));
    }

    public void visit(def_else_if def_else_if, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();

        if (def_else_if.getContentList() != null) {
            for (int i = 0; i < def_else_if.getContentList().size(); i++) {
                visit(def_else_if.getContentList().get(i), id, scope + 1);
            }
        }
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.ElseIf, "Else If", new SymbolTableObjectElseIfDefineValue(scope, id, parentId, def_else_if)));
    }

    public void visit(def_for def_for, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();

        if (def_for.getContent() != null) {
            for (int i = 0; i < def_for.getContent().size(); i++) {
                visit(def_for.getContent().get(i), id, scope);
            }
        }
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.For, "For", new SymbolTableObjectForDefineValue(scope, id, parentId, def_for)));
    }

    public void visit(def_while def_while, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        if (def_while.getContent() != null) {
            for (int i = 0; i < def_while.getContent().size(); i++) {
                visit(def_while.getContent().get(i), id, scope + 1);
            }
        }
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.While, "While", new SymbolTableObjectWhileDefineValue(scope, id, parentId, def_while)));
    }

    public void visit(def_switch def_switch, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        if (def_switch.getDef_caseList() != null) {
            for (int i = 0; i < def_switch.getDef_caseList().size(); i++) {
                visit(def_switch.getDef_caseList().get(i), id, scope + 1);
            }
        }
        if (def_switch.getDef_defult() != null) {
            visit(def_switch.getDef_defult(), id, scope);
        }
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.Switch, "Switch", new SymbolTableObjectSwitchDefineValue(scope, id, parentId, def_switch)));
    }

    public void visit(def_case def_case, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        if (def_case.getContentList() != null) {
            for (int i = 0; i < def_case.getContentList().size(); i++) {
                visit(def_case.getContentList().get(i), id, scope + 1);
            }
        }
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.SwitchCase, "SwitchCase", new SymbolTableObjectSwitchCaseDefineValue(scope, id, parentId, def_case)));
    }

    public void visit(def_defult def_defult, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        if (def_defult.getContentList() != null) {
            for (int i = 0; i < def_defult.getContentList().size(); i++) {
                visit(def_defult.getContentList().get(i), id, scope + 1);
            }
        }
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.SwitchDefault, "SwitchDefault", new SymbolTableObjectSwitchDefultDefineValue(scope, id, parentId, def_defult)));
    }

    //FlutterClasses ----------------------------------------------------------------------
    public void visit(widget widget, int parentId, int scope, boolean isParentList) {
        if (widget.getDefColumn() != null) {
            visit(widget.getDefColumn(), parentId, scope + 1, isParentList);
        }
        if (widget.getDefContainer() != null) {
            visit(widget.getDefContainer(), parentId, scope + 1, isParentList);
        }
        if (widget.getText() != null) {
            visit(widget.getText(), parentId, scope + 1, isParentList);
        }
        if (widget.getDefRow() != null) {
            visit(widget.getDefRow(), parentId, scope + 1, isParentList);
        }
        if (widget.getImage() != null) {
            visit(widget.getImage(), parentId, scope + 1, isParentList);
        }
        if (widget.getListView() != null) {
            visit(widget.getListView(), parentId, scope + 1, isParentList);
        }
        if (widget.getTextField() != null) {
            visit(widget.getTextField(), parentId, scope + 1, isParentList);
        }
        if (widget.getInkWell() != null) {
            visit(widget.getInkWell(), parentId, scope + 1, isParentList);
        }
    }


    //Container ----------------------------------------------------------------------
    public void visit(defContainer defContainer, int parentId, int scope, boolean isParentList) {
        final int id = ThreadLocalRandom.current().nextInt();

        if (defContainer.getContainerBody() != null) {
            for (int i = 0; i < defContainer.getContainerBody().size(); i++) {
                visit(defContainer.getContainerBody().get(i), id, scope);
            }
        }
    }

    public void visit(containerBody containerBody, int parentId, int scope) {
        if (containerBody.getWidget() != null) {
            visit(containerBody.getWidget(), parentId, scope, false);
        }
    }
    //End Container ----------------------------------------------------------------------

    //Image ----------------------------------------------------------------------
    public void visit(image image, int parentId, int scope, boolean isParentList) {
        final int id = ThreadLocalRandom.current().nextInt();

        if (image.getIMAGE_() != null) {
            addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.Image, "Image", new SymbolTableObjectImageValue(scope, id, parentId, image, isParentList)));
        }
    }

    //End Image ----------------------------------------------------------------------

    //ListView ----------------------------------------------------------------------
    public void visit(listView listView, int parentId, int scope, boolean isParentList) {
        final int id = ThreadLocalRandom.current().nextInt();
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.ListView, "ListView", new SymbolTableObjectListViewValue(scope, id, parentId, listView, isParentList)));
        if (listView.getLayoutBody() != null) {
            visit(listView.getLayoutBody(), id, scope + 1, true);
        }
    }
    //EndListView ----------------------------------------------------------------------

    //textfield ----------------------------------------------------------------------
    public void visit(InkWell inkWell, int parentId, int scope, boolean isParentList) {
        final int id = ThreadLocalRandom.current().nextInt();
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.InkWell, "InkWell", new SymbolTableObjectInkWellValue(scope, id, parentId, inkWell, isParentList)));
        if (inkWell.getInkWellBodyList() != null) {
            for (int i = 0; i < inkWell.getInkWellBodyList().size(); i++) {
                visit(inkWell.getInkWellBodyList().get(i), id, scope);
            }

        }

    }

    public void visit(InkWellBody inkWellBody, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        if (inkWellBody instanceof InkWellOnPressed) {
            addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.InkWellBody, "onPress", new SymbolTableObjectInkWellBodyValue(scope, id, parentId, InkWellBodyType.onPress)));
            ((InkWellOnPressed) inkWellBody).getContentList().forEach(content -> {
                visit(content, id, scope + 1);
            });
        } else if (inkWellBody instanceof InkWellChild) {
            addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.InkWellBody, "child", new SymbolTableObjectInkWellBodyValue(scope, id, parentId, InkWellBodyType.child)));
            visit(((InkWellChild) inkWellBody).getWidget(), parentId, scope, false);
        }

    }

    public void visit(textField textField, int parentId, int scope, boolean isParentList) {
        final int id = ThreadLocalRandom.current().nextInt();

        if (textField.getTExtField() != null) {
            addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.TextField, "TextField", new SymbolTableObjectTextFieldValue(scope, id, parentId, textField, isParentList)));
        }
    }
    //Endtextfield ----------------------------------------------------------------------


    public void visit(layoutBody layoutBody, int parentId, int scope, boolean isParenList) {
        if (layoutBody.getWidget() != null) {
            for (int i = 0; i < layoutBody.getWidget().size(); i++) {
                visit(layoutBody.getWidget().get(i), parentId, scope, isParenList);
            }
        }
    }

    public void visit(defRow defRow, int parentId, int scope, boolean isParentList) {
        final int id = ThreadLocalRandom.current().nextInt();

        if (defRow.getROW_() != null) {
            addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.Row, "Row", new SymbolTableObjectRowValue(scope, id, parentId, defRow, isParentList)));
        }

        if (defRow.getLayoutBody() != null) {
            for (int i = 0; i < defRow.getLayoutBody().size(); i++) {
                visit(defRow.getLayoutBody().get(i), id, scope, false);
            }
        }
    }

    public void visit(defColumn defColumn, int parentId, int scope, boolean isParentList) {
        final int id = ThreadLocalRandom.current().nextInt();
        if (defColumn.getCOLUMN_() != null) {
            addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.Column, "Column", new SymbolTableObjectColumnValue(scope, id, parentId, defColumn, isParentList)));
        }

        if (defColumn.getLayoutBody() != null) {
            for (int i = 0; i < defColumn.getLayoutBody().size(); i++) {
                visit(defColumn.getLayoutBody().get(i), id, scope, false);
            }
        }

    }

    public void visit(NavigationRule navigationRule, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.Navigator, "Navigator", new SymbolTableObjectNavigatorValue(scope, id, parentId, navigationRule)));
    }

    public void visit(GetDataAst getDataAst, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.GetData, "GetData", new SymbolTableObjectGetDataValue(scope, id, parentId, getDataAst)));
    }

    public void visit(text text, int parentId, int scope, boolean isParentList) {
        final int id = ThreadLocalRandom.current().nextInt();
        addToSymbolTable(parentId, new SymbolTableObject(SymbolTableRowType.Text, "Text", new SymbolTableObjectTextValue(scope, id, parentId, text, isParentList)));

    }

    //End FlutterClasses ----------------------------------------------------------------------

    public void addToSymbolTable(Integer parentId, SymbolTableObject object) {
        symbolTable.addToList(parentId, object);
    }


}