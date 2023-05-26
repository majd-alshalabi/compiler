import ASTClasses.DartClasses.Boolean.boolExp;
import ASTClasses.DartClasses.Boolean.boolVarDefnition;
import ASTClasses.DartClasses.Boolean.boolVarEq;
import ASTClasses.DartClasses.Class.class_body;
import ASTClasses.DartClasses.Class.def_class;
import ASTClasses.DartClasses.Class.importClass;
import ASTClasses.DartClasses.Content.*;
import ASTClasses.DartClasses.Content.For.def_for;
import ASTClasses.DartClasses.Content.For.for_Increment;
import ASTClasses.DartClasses.Content.IF.def_if;
import ASTClasses.DartClasses.Content.IF.elseIfContent;
import ASTClasses.DartClasses.Content.IF.ifContent;
import ASTClasses.DartClasses.Function.def_function_datatype;
import ASTClasses.DartClasses.Function.def_function_void;
import  java.util.concurrent.ThreadLocalRandom;
import ASTClasses.DartClasses.exp;
import ASTClasses.DartClasses.value;
import ASTClasses.FlutterClasses.Widget.Container.containerBody;
import ASTClasses.FlutterClasses.Widget.Container.defContainer;
import ASTClasses.FlutterClasses.Widget.Container.defExpanded;
import ASTClasses.FlutterClasses.Widget.Image.assetImage;
import ASTClasses.FlutterClasses.Widget.Image.image;
import ASTClasses.FlutterClasses.Widget.Image.imageBody;
import ASTClasses.FlutterClasses.Widget.ListView.listView;
import ASTClasses.FlutterClasses.Widget.ListView.listViewBody;
import ASTClasses.FlutterClasses.Widget.defColumn;
import ASTClasses.FlutterClasses.Widget.defRow;
import ASTClasses.FlutterClasses.Widget.layoutBody;
import ASTClasses.FlutterClasses.Widget.text;
import ASTClasses.FlutterClasses.Widget.textfield.*;
import ASTClasses.FlutterClasses.widget;
import ASTClasses.program;
import SymbolTable.symbolTableClasses.*;

import java.io.FileWriter;
import java.io.IOException;

public class ASTVisitor {

    SymbolTable symbolTable = new SymbolTable();
    FileWriter fw ;
    public void visit(program program) {
        String space = "\t\t";
        try {
            fw = new FileWriter("output.txt");
            writeToFile("Program:" + "\n\t {");
            if(program.getImportClass() != null) {
                for (int i = 0; i < program.getImportClass().size(); i++) {
                    visit(program.getImportClass().get(i), space + '\t');
                }
            }
            if(program.getDef_function_void() != null)
            {
                for (int i = 0; i < program.getDef_function_void().size(); i++) {
                    visit(program.getDef_function_void().get(i), space + '\t',0,-1);
                }
            }
            if(program.getDef_class() != null)
            {
                visit( program.getDef_class() ,space);
            }
            if(program.getDef_function_datatype().size() > 0)
            {
                for (int i = 0; i < program.getDef_function_datatype().size(); i++) {
                    visit(program.getDef_function_datatype().get(i), space + '\t',-1,0);
                }
            }
            writeToFile("\n\t}");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Dart ----------------------------------------------------------------------
    public void visit(def_class def_class, String Space) {
        final int classId = ThreadLocalRandom.current().nextInt();
        writeToFile("\n" + Space + def_class.getCLASS_()+":"+def_class.getIDENTIFIER().get(0));
        addToSymbolTable(-1,new SymbolTableObject(SymbolTableRowType.Class,def_class.getIDENTIFIER().get(0),new SymbolTableObjectClassValue( 0 , classId ,-1)));
        if (def_class.getEXTENDS_() != null) {
            writeToFile("\n" + Space + def_class.getEXTENDS_()+":"+def_class.getIDENTIFIER().get(1));
        }
        if (def_class.getWITH_() != null) {
            writeToFile("\n" + Space + def_class.getWITH_());
            for(int i = 2 ; i<def_class.getIDENTIFIER().size() ; i++){
                writeToFile("\n" + Space + def_class.getIDENTIFIER().get(i));
            }
        }
        if (def_class.getClass_body() != null) {
            for (int i = 0; i < def_class.getClass_body() .size(); i++) {
                visit(def_class.getClass_body().get(i), Space , classId,0);
            }
        }
    }


    public void visit(importClass importClass, String Space) {
        if(importClass.getIMPORT_() != null){
            writeToFile("\n" + Space +  importClass.getIMPORT_()+":"+importClass.getSingleLineString());
        }
    }
    public void visit(class_body class_body, String Space , int parentId , int scope) {
        if (class_body.getVarDefinition() != null) {
            visit(class_body.getVarDefinition(), Space , parentId , scope);
        }
        if (class_body.getBoolVarDefnition() != null) {
            visit(class_body.getBoolVarDefnition(), Space,parentId , scope);
        }
        if (class_body.getDef_function_datatype()!= null) {
            visit(class_body.getDef_function_datatype(), Space,parentId,scope);
        }
        if (class_body.getDef_function_void()!= null) {
            visit(class_body.getDef_function_void(), Space,parentId,scope);
        }
    }

    public void visit(boolVarDefnition boolVarDefnition, String Space , int parentId , int scope ) {
        final int id = ThreadLocalRandom.current().nextInt();

        writeToFile("\n" + Space + boolVarDefnition.getBool_type() + boolVarDefnition.getIDENTIFIER()+ boolVarDefnition.getBoolExp());
        addToSymbolTable(parentId ,new SymbolTableObject( SymbolTableRowType.VarDefinition,boolVarDefnition.getIDENTIFIER(),new SymbolTableObjectBoolVarDefinitionValue(scope + 1,id,parentId,boolVarDefnition.getBoolExp())) );

    }
    public void visit(varDefinition varDefinition, String Space , int parenId , int scope) {
        final int id = ThreadLocalRandom.current().nextInt();

        writeToFile("\n\t" + Space + varDefinition.getDataType() +":"+ varDefinition.getIDENTIFIER());
        System.out.println(varDefinition.getExp());
        System.out.println("dsfsdaf");
        System.out.println(varDefinition.getExp());

        addToSymbolTable(parenId,new SymbolTableObject(SymbolTableRowType.VarDefinition,varDefinition.getIDENTIFIER(),new SymbolTableObjectVarDefinitionValue(scope,id,parenId,varDefinition. getExp())));
//        if (varDefinition. getExp() != null) {
//            visit(varDefinition. getExp(), Space);
//        }
    }

    public void visit(def_function_datatype def_function_datatype, String Space , int parentId , int scope) {
        if(def_function_datatype.getDataType() != null){
            final int id = ThreadLocalRandom.current().nextInt();

            writeToFile("\n" + Space + def_function_datatype.getDataType().get(0) + ":" + def_function_datatype.getIDENTIFIER().get(0));
            addToSymbolTable(parentId ,new SymbolTableObject(SymbolTableRowType.Function,def_function_datatype.getIDENTIFIER().get(0), new SymbolTableObjectFunctionValue(scope,id,parentId)) );
            if(def_function_datatype.getDataType().size() > 1){
                System.out.print("\n"+Space+"\tattribute: (");
                for (int i = 1; i < def_function_datatype.getDataType().size(); i++) {
                    writeToFile("\n\t" + Space + def_function_datatype.getDataType().get(i) +":"+ def_function_datatype.getIDENTIFIER().get(i));
                    addToSymbolTable(parentId ,new SymbolTableObject(SymbolTableRowType.Function,def_function_datatype.getIDENTIFIER().get(0), new SymbolTableObjectFunctionValue(scope,id,parentId)));
                }
                System.out.print("\n"+Space+"\t)");
            }
            if (def_function_datatype.getContent() != null) {
                System.out.print("\n"+Space+"\tbody: {");
                for (int i = 0; i < def_function_datatype.getContent() .size(); i++) {
                    visit(def_function_datatype.getContent().get(i), Space,id,scope + 1);
                }
                System.out.print("\n"+Space+"\t}");
            }
            writeToFile("\n\t" + Space + def_function_datatype.getRETURN_()+":"+def_function_datatype.getExp());
        }
    }

    public void visit(def_function_void def_function_void, String Space,int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();
        if(def_function_void.getVOID_() != null) {
            writeToFile("\n" + Space + def_function_void.getVOID_() + ":" + def_function_void.getIDENTIFIER().get(0));
            addToSymbolTable(parentId ,new SymbolTableObject(SymbolTableRowType.Function,def_function_void.getIDENTIFIER().get(0), new SymbolTableObjectFunctionValue(scope,id,parentId)));
        }

        if(def_function_void.getDataType().size() > 0) {
            System.out.print("\n"+Space+"\tattribute: (");
            for (int i = 0; i < def_function_void.getDataType().size(); i++) {
                final int id2 = ThreadLocalRandom.current().nextInt();

                writeToFile("\n\t\t" + Space + def_function_void.getDataType().get(i) +":"+ def_function_void.getIDENTIFIER().get(i+1));
                addToSymbolTable(id,new SymbolTableObject(SymbolTableRowType.VarDefinition,def_function_void.getIDENTIFIER().get(i+1),new SymbolTableObjectVarDefinitionValue(scope,id2,id,null)));
            }
            System.out.print("\n"+Space+"\t)");
        }

        if (def_function_void.getContent().size() > 0) {
            System.out.print("\n"+Space+"\tbody: {");
            for (int i = 0; i < def_function_void.getContent() .size(); i++) {
                visit(def_function_void.getContent().get(i), Space + '\t',id,scope + 1);
            }
            System.out.print("\n"+Space+"\t}");
        }
    }

    public void visit(exp exp, String Space) {
        writeToFile("\n");
        if (exp. getExp() != null) {
            visit(exp. getExp(), Space);
        }
        writeToFile("\n" + Space + exp.getDOUBLE() );
        writeToFile("\n" + Space + exp.getIDENTIFIER() );
        writeToFile("\n" + Space + exp.getMathMaticalSign());
        writeToFile("\n" + Space + exp.getNUMBER());
        writeToFile("\n" + Space + exp.getSingleLineString());
        writeToFile("\n" + Space + exp.getNULL_() );

    }
    public void visit(content content, String Space,int parentId , int scope ) {
        if (content.getVarDefinition()  != null) {

            visit(content.getVarDefinition() , Space,parentId,scope);
        }
        if (content.getVarEQ()  != null) {
            visit(content. getVarEQ() , Space,parentId , scope);
        }
        if (content.getIntIncrease()  != null) {
            visit(content. getIntIncrease() , Space);
        }
        if (content.getBoolVarDefnition()  != null) {
            visit(content. getBoolVarDefnition(), Space,parentId , scope);
        }
        if (content.getBoolVarEq()  != null) {
            visit(content. getBoolVarEq(), Space,parentId ,scope);
        }
        if (content.getDef_if()  != null) {
            visit(content. getDef_if(), Space,parentId,scope);
        }
        if (content. getDef_for()  != null) {
            visit(content.  getDef_for(), Space , parentId , scope);
        }
        if (content. getDef_while()  != null) {
            visit(content.  getDef_while(), Space , parentId , scope);
        }
        if (content. getDefArray()  != null) {
            visit(content.  getDefArray(), Space);
        }
        if (content. getDef_switch()  != null) {
            visit(content.  getDef_switch(), Space);
        }
        if (content. getDef_object()  != null) {
            visit(content.  getDef_object(), Space);
        }
        if (content. getDef_function_void()  != null) {
            visit(content.  getDef_function_void(), Space ,parentId, scope);
        }
        if (content. getDef_function_datatype()  != null) {
            visit(content.  getDef_function_datatype(), Space,parentId,scope);
        }
        if(content.getWidget() != null){
            visit(content.getWidget(), Space,parentId,scope);
        }

    }
    public void visit(varEQ varEQ, String Space,int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();

        writeToFile("\n" + Space + varEQ. getIDENTIFIER());
        addToSymbolTable(parentId,new SymbolTableObject(SymbolTableRowType.VarDefinition,varEQ.getIDENTIFIER(),new SymbolTableObjectVarEqualValue(scope,id,parentId,"")));
//        if (varEQ.getExp()  != null) {
//            visit(varEQ.getExp(), Space);
//        }
    }
    public void visit(intIncrease intIncrease, String Space) {
        if(intIncrease.getIDENTIFIER() !=null) {
            writeToFile(intIncrease.getIDENTIFIER());
        }
        writeToFile("\n" + Space +intIncrease .getPLPL());
        writeToFile("\n" + Space +intIncrease .getMM());

    }
    public void visit(boolVarEq boolVarEq, String Space , int parentId , int scope) {
        final int id = ThreadLocalRandom.current().nextInt();

        writeToFile("\n" + Space +boolVarEq .getIDENTIFIER());
        addToSymbolTable(parentId,new SymbolTableObject(SymbolTableRowType.VarEqual,boolVarEq .getIDENTIFIER(),new SymbolTableObjectVarEqualValue(scope,id,parentId,boolVarEq .getBoolExp())));
    }
    public void visit(def_if def_if, String Space , int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();

        if (def_if . getCondition()  != null) {
            visit(def_if . getCondition(), Space , id ,scope);
        }
        writeToFile("\n" + Space + def_if.getIF_());

        if (def_if . getIfContent()  != null) {
            visit(def_if .getIfContent() , Space, id ,scope);
        }
        writeToFile("\n" + Space + def_if.getELSE_());
        if (def_if . getElseIfContent()  != null) {
            visit(def_if . getElseIfContent(), Space , parentId , scope + 1);
        }

    }
    public void visit(condition condition, String Space , int parentId , int scope) {

        if (condition . getCondition()  != null) {
            visit(condition. getCondition(), Space,parentId , scope);
        }
        if (condition  . getExp()  != null) {
            visit(condition  .getExp() , Space);
        }
        if (condition. getBoolExp()  != null) {
            visit( condition. getBoolExp(), Space,parentId , scope);
        }

    }
    public void visit(boolExp boolExp, String Space, int parentId, int scope) {
        final int id = ThreadLocalRandom.current().nextInt();

        if (boolExp . getBoolExp()  != null) {
            visit(boolExp . getBoolExp(), Space,parentId,scope);
        }
        writeToFile("\n" + Space + boolExp .getBooleanSign());
        writeToFile("\n" + Space + boolExp .getBool_value());
        writeToFile("\n" + Space + boolExp .getIDENTIFIER());

    }
    public void visit(ifContent ifContent, String Space , int parentId , int scope ) {

        if (ifContent . getContent()  != null) {
            for (int i = 0; i < ifContent . getContent() .size(); i++) {
                visit(ifContent . getContent().get(i), Space,parentId , scope + 1);
            }
        }


    }
    public void visit(elseIfContent elseIfContent, String Space , int parentId , int scope ) {

        if (elseIfContent. getContent()  != null) {
            for (int i = 0; i < elseIfContent . getContent() .size(); i++) {
                visit(elseIfContent . getContent().get(i), Space , parentId , scope);
            }
        }


    }
    public void visit(def_for def_for, String Space , int parentId, int scope ) {
        writeToFile("\n" + Space + def_for . getFOR_());
        if (def_for. getVarDefinition()  != null) {
            visit(def_for. getVarDefinition(), Space , parentId , scope);
        }
        if (def_for. getCondition()  != null) {
            visit(def_for. getCondition(), Space , parentId , scope);
        }
        if (def_for. getFor_Increment()  != null) {
            visit(def_for. getFor_Increment(), Space);
        }
        if (def_for.getContent()  != null) {
            for (int i = 0; i < def_for.getContent() .size(); i++) {
                visit(def_for.getContent().get(i), Space , parentId , scope);
            }
        }


    }
    public void visit(for_Increment for_Increment, String Space) {
        writeToFile("\n" + Space + for_Increment .getIDENTIFIER());
        if (for_Increment. getExp() != null) {
            visit(for_Increment. getExp(), Space);
        }


    }
    public void visit(def_while def_while, String Space , int parentId , int scope ) {
        writeToFile("\n" + Space + def_while .getWHILE_());
        if (def_while. getCondition()!= null) {
            visit(def_while. getCondition(), Space, parentId , scope);
        }
        if (def_while.getContent()  != null) {
            for (int i = 0; i < def_while.getContent().size(); i++) {
                visit(def_while.getContent().get(i), Space, parentId , scope +1  );
            }
        }

    }
    public void visit(defArray defArray, String Space) {
        writeToFile("\n" + Space + defArray .getDataType() +defArray .getIDENTIFIER());
        writeToFile("\n" + Space + defArray .getNUMBERS()+defArray .getNEW_());

        if (defArray.getValue()  != null){
            for (int i = 0; i < defArray.getValue().size(); i++) {
                visit(defArray.getValue().get(i), Space);
            }
        }


    }
    public void visit(value value , String Space) {
        writeToFile("\n" + Space + value .getSingleLineString());
        writeToFile("\n" + Space + value .getDOUBLE());
        writeToFile("\n" + Space + value .getNUMBER());
    }
    public void visit(def_switch def_switch , String Space) {
        writeToFile("\n" + Space + def_switch .getSWITCH_());
        writeToFile("\n" + Space + def_switch.getIDENTIFIER());
        writeToFile("\n" + Space + def_switch.getCASE_());

    }
    public void visit(def_object def_object , String Space) {
        writeToFile("\n" + Space + def_object .getDataType() );
        writeToFile("\n" + Space + def_object.getIDENTIFIER() );
        writeToFile("\n" + Space + def_object.getNEW_());
        writeToFile("\n" + Space + def_object.getWIDGET());
       /* if (def_object. getWidget()!= null) {
            visit(def_object. getWidget(), Space);
        }*/
    }
    //EndDart ----------------------------------------------------------------------



    //FlutterClasses ----------------------------------------------------------------------
    public void visit(widget widget, String space , int parentId , int scope) {
        if (widget.getDefColumn() != null) {
            visit(widget.getDefColumn(), space + '\t'  , parentId ,  scope + 1);
        }
        if (widget.getDefContainer() != null) {
            visit(widget.getDefContainer(), space + '\t' , parentId ,  scope + 1);
        }
        if (widget.getDefExpanded() != null) {
            visit(widget.getDefExpanded(), space + '\t' , parentId , scope + 1);
        }
        if (widget.getText() != null) {
            visit(widget.getText(), space + '\t' , parentId , scope + 1 );
        }
        if (widget.getDefRow() != null) {
            visit(widget.getDefRow(), space + '\t' , parentId ,scope + 1);
        }
        if (widget.getImage() != null) {
            visit(widget.getImage(), space + '\t' , parentId ,scope + 1);
        }
        if (widget.getListView() != null) {
            visit(widget.getListView(), space + '\t' , parentId , scope + 1);
        }
        if (widget.getTextField() != null) {
            visit(widget.getTextField(), space + '\t' , parentId ,scope + 1 );
        }
    }

        //Container ----------------------------------------------------------------------
        public void visit(defContainer defContainer, String space  , int parentId , int scope ) {
            if (defContainer.getCONTAINER_() != null) {
                writeToFile("\n" + space + defContainer.getCONTAINER_() + ":");
            }
            final int id = ThreadLocalRandom.current().nextInt();

            if (defContainer.getContainerBody() != null) {
                for (int i = 0; i < defContainer.getContainerBody().size(); i++) {
                    visit(defContainer.getContainerBody().get(i), space + '\t' , id ,scope);
                }
            }
        }

        public void visit(defExpanded defExpanded, String space ,int parentId , int scope) {
            if (defExpanded.getEXPANDED_() != null) {
                writeToFile("\n" + space + defExpanded.getEXPANDED_() + ":");
            }
            final int id = ThreadLocalRandom.current().nextInt();

            if (defExpanded.getContainerBody() != null) {
                for (int i = 0; i < defExpanded.getContainerBody().size(); i++) {
                    visit(defExpanded.getContainerBody().get(i), space + '\t',id,scope);
                }
            }
        }

        public void visit(containerBody containerBody, String space,int parentId , int scope ) {
            if (containerBody.getCHILD_() != null) {
                writeToFile("\n" + space + containerBody.getCHILD_() + ":");
            }
            if (containerBody.getNUMBER() != null) {
                writeToFile("\n" + space + containerBody.getNUMBER() + ":");
            }
            if (containerBody.getPADDING_() != null) {
                writeToFile("\n" + space + containerBody.getPADDING_() + ":");
            }
            if (containerBody.getPADDING_value() != null) {
                writeToFile("\n" + space + containerBody.getPADDING_value() + ":");
            }
            if (containerBody.getWIDGET() != null) {
                writeToFile("\n" + space + containerBody.getWIDGET() + ":");
            }
            if (containerBody.getWidget() != null) {
                visit(containerBody.getWidget(), space + '\t',parentId,scope);
            }
            if (containerBody.getWIDTH_() != null) {
                writeToFile("\n" + space + containerBody.getWIDTH_() + ":");
            }
        }
        //End Container ----------------------------------------------------------------------

        //Image ----------------------------------------------------------------------
        public void visit(image image, String space , int parentId , int scope ) {
            final int id = ThreadLocalRandom.current().nextInt();

            if (image.getIMAGE_() != null) {
                writeToFile("\n" + space + image.getIMAGE_() + ":");
                addToSymbolTable(parentId,new SymbolTableObject(SymbolTableRowType.Image,"Image",new SymbolTableObjectImageValue(scope,id,parentId)));
            }

            if (image.getAssetImage() != null) {
                visit(image.getAssetImage(), space + '\t' ,id,  parentId );
            }


            if (image.getImageBody() != null) {
                for (int i = 0; i < image.getImageBody().size(); i++) {
                    visit(image.getImageBody().get(i), space + '\t' , id , scope);
                }
            }
        }

        public void visit(assetImage assetImage, String space ,int id , int parentId ) {
            if (assetImage.getIMAGE() != null) {
                writeToFile("\n" + space + assetImage.getIMAGE() + ":");
            }

            if (assetImage.getASSETIMAGE_() != null) {
                writeToFile("\n" + space + assetImage.getASSETIMAGE_() + ":");
            }
            if (assetImage.getSingleLineString() != null) {
                writeToFile("\n" + space + assetImage.getSingleLineString() + ":");
                updateAlreadyAddedImageValue(id , parentId,assetImage.getSingleLineString().substring(1,assetImage.getSingleLineString().length()-2));
            }
        }

        public void visit(imageBody imageBody, String space , int parentId , int scope ) {
            if (imageBody.getHEIGHT_() != null) {
                writeToFile("\n" + space + imageBody.getHEIGHT_() + ":");
            }

            if (imageBody.getNUMBER() != null) {
                writeToFile(imageBody.getNUMBER() );
            }
            if (imageBody.getWIDTH_() != null) {
                writeToFile("\n" + space + imageBody.getWIDTH_() + ":");
            }
        }
        //End Image ----------------------------------------------------------------------

        //ListView ----------------------------------------------------------------------
        public void visit(listView listView, String space , int parentId , int scope) {
            if (listView.getLISTVIEW_() != null) {
                writeToFile("\n" + space + listView.getLISTVIEW_() + ":");
            }
            final int id = ThreadLocalRandom.current().nextInt();

            if (listView.getListViewBody() != null) {
                for (int i = 0; i < listView.getListViewBody().size(); i++) {
                    visit(listView.getListViewBody().get(i), space + '\t' , id , scope);
                }
            }
        }

        public void visit(listViewBody listViewBody, String space, int parentId , int scope) {
            if (listViewBody.getCONTROLLER() != null) {
                writeToFile("\n" + space + listViewBody.getCONTROLLER() + ":");
            }

            if (listViewBody.getIDENTIFIER() != null) {
                writeToFile("\n" + space + listViewBody.getIDENTIFIER() + ":");
            }
            if (listViewBody.getLayoutBody() != null) {
                for (int i = 0; i < listViewBody.getLayoutBody().size(); i++) {
                    visit(listViewBody.getLayoutBody().get(i), space + '\t' , parentId , scope);
                }
            }
        }
        //EndListView ----------------------------------------------------------------------

        //textfield ----------------------------------------------------------------------
        public void visit(textField textField, String space , int parentId , int scope) {
            final int id = ThreadLocalRandom.current().nextInt();

            if (textField.getTExtField() != null) {
                writeToFile("\n" + space + textField.getTExtField() + ":");
                addToSymbolTable(parentId,new SymbolTableObject(SymbolTableRowType.TextField,"TextField",new SymbolTableObjectTextFieldValue(scope,id,parentId)));
            }

            if (textField.getTextFieldProperties() != null) {
                for (int i = 0; i < textField.getTextFieldProperties().size(); i++) {
                    visit(textField.getTextFieldProperties().get(i), space + '\t' ,id , parentId ,scope );
                }

            }

        }

        public void visit(textFieldProperties textFieldProperties, String space , int id , int parentId , int scope ) {
            if (textFieldProperties.getTextFieldControllerProperty() != null) {
                visit(textFieldProperties.getTextFieldControllerProperty(), space + '\t' , id , parentId, scope);
            }
            if (textFieldProperties.getTextFieldDecorationProperty() != null) {
                visit(textFieldProperties.getTextFieldDecorationProperty(), space + '\t' , id ,parentId,scope);
            }

            if (textFieldProperties.getTextFieldTextProperty() != null) {
                visit(textFieldProperties.getTextFieldTextProperty(), space + '\t' , id , parentId , scope);
            }

            if (textFieldProperties.getTextFieldOnChangedProperty() != null) {
                visit(textFieldProperties.getTextFieldOnChangedProperty(), space + '\t' , id , parentId ,scope);
            }

            if (textFieldProperties.getTextFieldOnEditingCompleteProperty() != null) {
                visit(textFieldProperties.getTextFieldOnEditingCompleteProperty(), space + '\t' , id , parentId ,scope);
            }
        }

        public void visit(inputDecorationIconProperty inputDecorationIconProperty, String space ,int id , int parentId , int scope ) {
            if (inputDecorationIconProperty.getICON() != null) {
                writeToFile("\n" + space + inputDecorationIconProperty.getICON() + ":");
            }

            if (inputDecorationIconProperty.getIDENTIFIER() != null) {
                writeToFile("\n" + space + inputDecorationIconProperty.getIDENTIFIER() + ":");
                addToAlreadyAddedValueSymbolTable(id , parentId,new SymbolTableColumnAttribute(inputDecorationIconProperty.getICON(),inputDecorationIconProperty.getIDENTIFIER()));
            }
        }

        public void visit(inputDecorationLabelTextProperty inputDecorationLabelTextProperty, String space ,int id , int parentId , int scope ) {
            if (inputDecorationLabelTextProperty.getLABELTEXT() != null) {
                writeToFile("\n" + space + inputDecorationLabelTextProperty.getLABELTEXT() + ":");
            }
            if (inputDecorationLabelTextProperty.getSingleLineString() != null) {
                writeToFile("\n" + space + inputDecorationLabelTextProperty.getSingleLineString() + ":");
                addToAlreadyAddedValueSymbolTable(id , parentId,new SymbolTableColumnAttribute(inputDecorationLabelTextProperty.getLABELTEXT(),inputDecorationLabelTextProperty.getSingleLineString()));

            }

        }

        public void visit(inputDecorationProperties inputDecorationProperties, String space ,int id , int parentId , int scope ) {
            if (inputDecorationProperties.getInputDecorationHelperTextProperty() != null) {
                visit(inputDecorationProperties.getInputDecorationLabelTextProperty(), space + '\t' ,id , parentId , scope);
            }

            if (inputDecorationProperties.getInputDecorationIconProperty() != null) {
                visit(inputDecorationProperties.getInputDecorationIconProperty(), space + '\t' ,id , parentId , scope);
            }

            if (inputDecorationProperties.getInputDecorationHelperTextProperty() != null) {
                visit(inputDecorationProperties.getInputDecorationHelperTextProperty(), space + '\t' ,id , parentId ,scope);
            }

            if (inputDecorationProperties.getInputDecorationLabelTextProperty() != null) {
                visit(inputDecorationProperties.getInputDecorationHintTextProperty(), space + '\t' ,id , parentId ,scope);
            }
        }

        public void visit(textFieldControllerProperty textFieldControllerProperty, String space , int id , int parentId , int scope) {
            if (textFieldControllerProperty.getCONTROLLER() != null) {
                writeToFile("\n" + space + textFieldControllerProperty.getCONTROLLER() + ":");
            }
            if (textFieldControllerProperty.getIDENTIFIER() != null) {
                writeToFile("\n" + space + textFieldControllerProperty.getIDENTIFIER() + ":");
                addToAlreadyAddedValueSymbolTable(id , parentId,new SymbolTableColumnAttribute(textFieldControllerProperty.getCONTROLLER(),textFieldControllerProperty.getIDENTIFIER()));

            }
        }

        public void visit(textFieldDecorationProperty textFieldDecorationProperty, String space , int id , int parentId , int scope) {
        if (textFieldDecorationProperty.getDECORATION() != null) {
            writeToFile("\n" + space + textFieldDecorationProperty.getDECORATION() + ":");
        }

        if (textFieldDecorationProperty.getInputDecorationProperties() != null) {
            visit(textFieldDecorationProperty.getInputDecorationProperties(), space + '\t' , id , parentId , scope);

        }
    }

        public void visit(textFieldOnChangedProperty textFieldOnChangedProperty, String space , int id , int parentId, int scope ) {
            if (textFieldOnChangedProperty.getIDENTIFIER() != null) {
                writeToFile("\n" + space + textFieldOnChangedProperty.getIDENTIFIER() + ":");
            }

            if (textFieldOnChangedProperty.getONCHANGED() != null) {
                writeToFile("\n" + space + textFieldOnChangedProperty.getONCHANGED() + ":");
            }
        }

        public void visit(textFieldOnEditingCompleteProperty textFieldOnEditingCompleteProperty, String space , int id , int parentId , int scope ) {
        if (textFieldOnEditingCompleteProperty.getIDENTIFIER() != null) {
            writeToFile("\n" + space + textFieldOnEditingCompleteProperty.getIDENTIFIER() + ":");
        }

        if (textFieldOnEditingCompleteProperty.getONEDITINGCOMPLETE() != null) {
            writeToFile("\n" + space + textFieldOnEditingCompleteProperty.getONEDITINGCOMPLETE() + ":");
        }
    }

        public void visit(textFieldTextProperty textFieldTextProperty, String space , int id , int parentId , int scope ) {
            if (textFieldTextProperty.getText() != null) {
                writeToFile("\n" + space + textFieldTextProperty.getText() + ":");
            }

            if (textFieldTextProperty.getSingleLineString() != null) {
                writeToFile("\n" + space + textFieldTextProperty.getSingleLineString() + ":");
            }
    }

        public void visit(inputDecorationHelperTextProperty inputDecorationHelperTextProperty, String space , int id , int parentId , int scope) {
            if (inputDecorationHelperTextProperty.getHELPERTEXT() != null) {
                writeToFile("\n" + space + inputDecorationHelperTextProperty.getHELPERTEXT() + ":");
            }

            if (inputDecorationHelperTextProperty.getSingleLineString() != null) {
                writeToFile("\n" + space + inputDecorationHelperTextProperty.getSingleLineString() + ":");
            }
        }

        public void visit(inputDecorationHintTextProperty inputDecorationHintTextProperty, String space , int id , int parentId , int scope ) {
        if (inputDecorationHintTextProperty.getHINTTEXT() != null) {
            writeToFile("\n" + space + inputDecorationHintTextProperty.getHINTTEXT() + ":");
        }

        if (inputDecorationHintTextProperty.getSingleLineString() != null) {
            writeToFile("\n" + space + inputDecorationHintTextProperty.getSingleLineString() + ":");
        }
    }

        //Endtextfield ----------------------------------------------------------------------


    public void visit(layoutBody layoutBody, String space , int parentId , int scope) {
        if (layoutBody.getCHILDREN_() != null) {
            writeToFile("\n" + space + layoutBody.getCHILDREN_() + ":[");
        }

        if (layoutBody.getWIDGET() != null) {
            writeToFile("\n" + space + layoutBody.getWIDGET() + ":");
        }

        if (layoutBody.getWidget() != null) {
            for (int i = 0; i < layoutBody.getWidget().size(); i++) {
                visit(layoutBody.getWidget().get(i), space + '\t', parentId , scope);
            }
        }
        if (layoutBody.getCHILDREN_() != null) {
            writeToFile("\n" + space + "]");
        }
    }

    public void visit(defRow defRow, String space , int parentId , int scope ) {
        final int id = ThreadLocalRandom.current().nextInt();

        if (defRow.getROW_() != null) {
            writeToFile("\n" + space + defRow.getROW_() + ":");
            addToSymbolTable(parentId,new SymbolTableObject(SymbolTableRowType.Row,"Row",new SymbolTableObjectRowValue(scope,id,parentId)));
        }

        if (defRow.getLayoutBody() != null) {
            for (int i = 0; i < defRow.getLayoutBody().size(); i++) {
                visit(defRow.getLayoutBody().get(i), space + '\t' , id , scope);
            }
        }
    }

    public void visit(defColumn defColumn, String space  ,int parentId , int scope ) {
        final int id = ThreadLocalRandom.current().nextInt();
        if (defColumn.getCOLUMN_() != null) {
            writeToFile("\n" + space + defColumn.getCOLUMN_() + ":");
            addToSymbolTable(parentId,new SymbolTableObject(SymbolTableRowType.Column,"Column",new SymbolTableObjectColumnValue(scope,id,parentId)));

        }

        if (defColumn.getLayoutBody() != null) {
            for (int i = 0; i < defColumn.getLayoutBody().size(); i++) {
                visit(defColumn.getLayoutBody().get(i), space + '\t' , id , scope);
            }
        }

    }

    public void visit(text text, String space , int parentId , int scope ) {
        final int id = ThreadLocalRandom.current().nextInt();

        if (text.getTEXT_() != null) {
            writeToFile("\n" + space + text.getTEXT_() + ":");
        }

        if (text.getSingleLineString() != null) {
            writeToFile("\n" + space + text.getSingleLineString() + ":");
        }
        addToSymbolTable(parentId,new SymbolTableObject(SymbolTableRowType.Text,"Text",new SymbolTableObjectTextValue(scope,id,parentId,text.getSingleLineString())));

    }

    //End FlutterClasses ----------------------------------------------------------------------

    public void writeToFile(String anyString){
            try {
                fw.append(anyString);

            } catch (IOException e) {
                System.out.println("error" + e.getMessage());

            }
            System.out.print(anyString);
        }
        public void addToSymbolTable(Integer parentId,  SymbolTableObject object){
            symbolTable.addToList(parentId , object);
        } public void addToAlreadyAddedValueSymbolTable(Integer id,Integer parentId,  SymbolTableColumnAttribute object){
            symbolTable.addToAlreadyAddedValueSymbolTable(id , parentId ,object);
        }public void updateAlreadyAddedImageValue(Integer id,Integer parentId,String assetName){
            symbolTable.updateAlreadyAddedImageValue(id , parentId ,assetName);
        }

}