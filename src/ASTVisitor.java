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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ASTVisitor {

    File output = new File("test.dart");

    public void visit(program program) {
        String space = "\t\t";
        try {
            FileWriter fw = new FileWriter("output.txt");
            visit("Program:" + "\n\t {", fw);
            if(program.getImportClass() != null) {
                for (int i = 0; i < program.getImportClass().size(); i++) {
                    visit(program.getImportClass().get(i), space, fw);
                }
            }
            if(program.getDef_function_void() != null)
            {
                for (int i = 0; i < program.getDef_function_void().size(); i++) {
                    visit(program.getDef_function_void().get(i), space, fw);
                }
            }
            if(program.getDef_class() != null)
            {
                visit( program.getDef_class() ,space, fw);
            }
            if(program.getDef_function_datatype().size() > 0)
            {
                for (int i = 0; i < program.getDef_function_datatype().size(); i++) {
                    visit(program.getDef_function_datatype().get(i), space, fw);
                }
            }
            visit("\n\t}", fw);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Dart ----------------------------------------------------------------------
    public void visit(def_class def_class, String Space, FileWriter fw) {
        visit("\n" + Space + def_class.getCLASS_()+":"+def_class.getIDENTIFIER().get(0) , fw);
        if (def_class.getEXTENDS_() != null) {
            visit("\n" + Space + def_class.getEXTENDS_()+":"+def_class.getIDENTIFIER().get(1), fw);
        }
        if (def_class.getWITH_() != null) {
            visit("\n" + Space + def_class.getWITH_(), fw);
            for(int i = 2 ; i<def_class.getIDENTIFIER().size() ; i++){
                visit("\n" + Space + def_class.getIDENTIFIER().get(i) , fw);
            }
        }
        if (def_class.getClass_body() != null) {
            for (int i = 0; i < def_class.getClass_body() .size(); i++) {
                visit(def_class.getClass_body().get(i), Space, fw);
            }
        }
        if (def_class.getImportClass() != null) {
            for (int i = 0; i < def_class.getImportClass() .size(); i++) {
                visit(def_class.getImportClass().get(i), Space, fw);
            }
        }
    }


    public void visit(importClass importClass, String Space, FileWriter fw) {
        if(importClass.getIMPORT_() != null){
            visit("\n" + Space +  importClass.getIMPORT_()+":"+importClass.getSingleLineString() , fw);
        }
    }
    public void visit(class_body class_body, String Space, FileWriter fw) {
        if (class_body.getVarDefinition() != null) {
            visit(class_body.getVarDefinition(), Space, fw);
        }
        if (class_body.getBoolVarDefnition() != null) {
            visit(class_body.getBoolVarDefnition(), Space, fw);
        }
        if (class_body.getDef_function_datatype()!= null) {
            visit(class_body.getDef_function_datatype(), Space, fw);
        }
        if (class_body.getDef_function_void()!= null) {
            visit(class_body.getDef_function_void(), Space, fw);
        }
    }

    public void visit(boolVarDefnition boolVarDefnition, String Space, FileWriter fw) {
        visit("\n" + Space + boolVarDefnition.getBool_type() + boolVarDefnition.getIDENTIFIER()+ boolVarDefnition.getBoolExp(), fw);


    }
    public void visit(varDefinition varDefinition, String Space, FileWriter fw) {
        visit("\n\t" + Space + varDefinition.getDataType() +":"+ varDefinition.getIDENTIFIER(), fw);
        if (varDefinition. getExp() != null) {
            visit(varDefinition. getExp(), Space, fw);
        }
    }

    public void visit(def_function_datatype def_function_datatype, String Space, FileWriter fw) {
        if(def_function_datatype.getDataType() != null){
            visit("\n" + Space + def_function_datatype.getDataType().get(0) + ":" + def_function_datatype.getIDENTIFIER().get(0), fw);
            if(def_function_datatype.getDataType().size() > 1){
                System.out.print("\n"+Space+"\tattribute: (");
                for (int i = 1; i < def_function_datatype.getDataType().size(); i++) {
                    visit("\n\t" + Space + def_function_datatype.getDataType().get(i) +":"+ def_function_datatype.getIDENTIFIER().get(i), fw);
                }
                System.out.print("\n"+Space+"\t)");
            }
            if (def_function_datatype.getContent() != null) {
                System.out.print("\n"+Space+"\tbody: {");
                for (int i = 0; i < def_function_datatype.getContent() .size(); i++) {
                    visit(def_function_datatype.getContent().get(i), Space, fw);
                }
                System.out.print("\n"+Space+"\t}");
            }
            visit("\n\t" + Space + def_function_datatype.getRETURN_()+":"+def_function_datatype.getExp(), fw);
        }
    }

    public void visit(def_function_void def_function_void, String Space, FileWriter fw) {
        if(def_function_void.getVOID_() != null) {
            visit("\n" + Space + def_function_void.getVOID_() + ":" + def_function_void.getIDENTIFIER().get(0), fw);
        }

        if(def_function_void.getDataType().size() > 0){
            System.out.print("\n"+Space+"\tattribute: (");
            for (int i = 0; i < def_function_void.getDataType().size(); i++) {
//                System.out.println(i);
                visit("\n\t" + Space + def_function_void.getDataType().get(i) +":"+ def_function_void.getIDENTIFIER().get(i+1), fw);
            }
            System.out.print("\n"+Space+"\t)");
        }

        if (def_function_void.getContent().size() > 0) {
            System.out.print("\n"+Space+"\tbody: {");
            for (int i = 0; i < def_function_void.getContent() .size(); i++) {
                visit(def_function_void.getContent().get(i), Space, fw);
            }
            System.out.print("\n"+Space+"\t}");
        }
    }

    public void visit(exp exp, String Space, FileWriter fw) {
        visit("\n", fw);
        if (exp. getExp() != null) {
            visit(exp. getExp(), Space, fw);
        }
        visit("\n" + Space + exp.getDOUBLE() , fw);
        visit("\n" + Space + exp.getIDENTIFIER() , fw);
        visit("\n" + Space + exp.getMathMaticalSign() , fw);
        visit("\n" + Space + exp.getNUMBER() , fw);
        visit("\n" + Space + exp.getSingleLineString() , fw);
        visit("\n" + Space + exp.getNULL_() , fw);

    }
    public void visit(content content, String Space, FileWriter fw) {
        if (content.getVarDefinition()  != null) {
            visit(content.getVarDefinition() , Space, fw);
        }
        if (content.getVarEQ()  != null) {
            visit(content. getVarEQ() , Space, fw);
        }
        if (content.getIntIncrease()  != null) {
            visit(content. getIntIncrease() , Space, fw);
        }
        if (content.getBoolVarDefnition()  != null) {
            visit(content. getBoolVarDefnition(), Space, fw);
        }
        if (content.getBoolVarEq()  != null) {
            visit(content. getBoolVarEq(), Space, fw);
        }
        if (content.getDef_if()  != null) {
            visit(content. getDef_if(), Space, fw);
        }
        if (content. getDef_for()  != null) {
            visit(content.  getDef_for(), Space, fw);
        }
        if (content. getDef_while()  != null) {
            visit(content.  getDef_while(), Space, fw);
        }
        if (content. getDefArray()  != null) {
            visit(content.  getDefArray(), Space, fw);
        }
        if (content. getDef_switch()  != null) {
            visit(content.  getDef_switch(), Space, fw);
        }
        if (content. getDef_object()  != null) {
            visit(content.  getDef_object(), Space, fw);
        }
        if (content. getDef_function_void()  != null) {
            visit(content.  getDef_function_void(), Space, fw);
        }
        if (content. getDef_function_datatype()  != null) {
            visit(content.  getDef_function_datatype(), Space, fw);
        }
        if (content. getDefSet()  != null) {
            visit(content.  getDefSet(), Space, fw);
        }
        if (content. getDefMap()  != null) {
            visit(content.  getDefMap(), Space, fw);
        }
        if (content. getAssignOneElement()  != null) {
            visit(content.  getAssignOneElement(), Space, fw);
        }
        if (content. getDefConst()  != null) {
            visit(content.  getDefConst(), Space, fw);
        }
        if (content. getDefFinal()  != null) {
            visit(content.  getDefFinal(), Space, fw);
        }
        if (content. getDefLate()  != null) {
            visit(content. getDefLate(), Space, fw);
        }
        if (content. getDefDynamic()  != null) {
            visit(content. getDefDynamic(), Space, fw);
        }
        if (content. getDefEnum()  != null) {
            visit(content. getDefEnum(), Space, fw);
        }
        if(content.getWidget() != null){
            visit(content.getWidget(), Space, fw);
        }

    }
    public void visit(varEQ varEQ, String Space, FileWriter fw) {
        visit("\n" + Space + varEQ. getIDENTIFIER() , fw);
        if (varEQ . getExp()  != null) {
            visit(varEQ . getExp(), Space, fw);
        }

    }
    public void visit(intIncrease intIncrease, String Space, FileWriter fw) {
        if(intIncrease.getIDENTIFIER() !=null) {
            visit(intIncrease.getIDENTIFIER() , fw);
        }
        visit("\n" + Space +intIncrease .getPLPL() , fw);
        visit("\n" + Space +intIncrease .getMM() , fw);

    }
    public void visit(boolVarEq boolVarEq, String Space, FileWriter fw) {

        visit("\n" + Space +boolVarEq .getIDENTIFIER() , fw);
        visit("\n" + Space +boolVarEq .getBoolExp() , fw);

    }
    public void visit(def_if def_if, String Space, FileWriter fw) {

        visit("\n" + Space + def_if.getIF_(), fw);
        if (def_if . getCondition()  != null) {
            visit(def_if . getCondition(), Space, fw);
        }
        if (def_if . getIfContent()  != null) {
            visit(def_if .getIfContent() , Space, fw);
        }
        visit("\n" + Space + def_if.getELSE_(), fw);
        if (def_if . getElseIfContent()  != null) {
            visit(def_if . getElseIfContent(), Space, fw);
        }

    }
    public void visit(condition condition, String Space, FileWriter fw) {

        if (condition . getCondition()  != null) {
            visit(condition. getCondition(), Space, fw);
        }
        if (condition  . getExp()  != null) {
            visit(condition  .getExp() , Space, fw);
        }
        if (condition. getBoolExp()  != null) {
            visit( condition. getBoolExp(), Space, fw);
        }

    }
    public void visit(boolExp boolExp, String Space, FileWriter fw) {

        if (boolExp . getBoolExp()  != null) {
            visit(boolExp . getBoolExp(), Space, fw);
        }
        visit("\n" + Space + boolExp .getBooleanSign() , fw);
        visit("\n" + Space + boolExp .getBool_value(), fw);
        visit("\n" + Space + boolExp .getIDENTIFIER() ,fw);

    }
    public void visit(ifContent ifContent, String Space, FileWriter fw) {

        if (ifContent . getContent()  != null) {
            for (int i = 0; i < ifContent . getContent() .size(); i++) {
                visit(ifContent . getContent().get(i), Space, fw);
            }
        }


    }
    public void visit(elseIfContent elseIfContent, String Space, FileWriter fw) {

        if (elseIfContent. getContent()  != null) {
            for (int i = 0; i < elseIfContent . getContent() .size(); i++) {
                visit(elseIfContent . getContent().get(i), Space, fw);
            }
        }


    }
    public void visit(def_for def_for, String Space, FileWriter fw) {
        visit("\n" + Space + def_for . getFOR_(), fw);
        if (def_for. getVarDefinition()  != null) {
            visit(def_for. getVarDefinition(), Space, fw);
        }
        if (def_for. getCondition()  != null) {
            visit(def_for. getCondition(), Space, fw);
        }
        if (def_for. getFor_Increment()  != null) {
            visit(def_for. getFor_Increment(), Space, fw);
        }
        if (def_for.getContent()  != null) {
            for (int i = 0; i < def_for.getContent() .size(); i++) {
                visit(def_for.getContent().get(i), Space, fw);
            }
        }


    }
    public void visit(for_Increment for_Increment, String Space, FileWriter fw) {
        visit("\n" + Space + for_Increment .getIDENTIFIER() , fw);
        if (for_Increment. getExp() != null) {
            visit(for_Increment. getExp(), Space, fw);
        }


    }
    public void visit(def_while def_while, String Space, FileWriter fw) {
        visit("\n" + Space + def_while .getWHILE_() , fw);
        if (def_while. getCondition()!= null) {
            visit(def_while. getCondition(), Space, fw);
        }
        if (def_while.getContent()  != null) {
            for (int i = 0; i < def_while.getContent().size(); i++) {
                visit(def_while.getContent().get(i), Space, fw);
            }
        }

    }
    public void visit(defArray defArray, String Space, FileWriter fw) {
        visit("\n" + Space + defArray .getDataType() +defArray .getIDENTIFIER(), fw);
        visit("\n" + Space + defArray .getNUMBERS()+defArray .getNEW_(), fw);

        if (defArray.getValue()  != null){
            for (int i = 0; i < defArray.getValue().size(); i++) {
                visit(defArray.getValue().get(i), Space, fw);
            }
        }


    }
    public void visit(value value , String Space, FileWriter fw) {
        visit("\n" + Space + value .getSingleLineString() , fw);
        visit("\n" + Space + value .getDOUBLE() , fw);
        visit("\n" + Space + value .getNUMBER(), fw);
    }
    public void visit(def_switch def_switch , String Space, FileWriter fw) {
        visit("\n" + Space + def_switch .getSWITCH_() , fw);
        visit("\n" + Space + def_switch.getIDENTIFIER() , fw);
        visit("\n" + Space + def_switch.getCASE_(), fw);

    }
    public void visit(def_object def_object , String Space, FileWriter fw) {
        visit("\n" + Space + def_object .getDataType() , fw);
        visit("\n" + Space + def_object.getIDENTIFIER() , fw);
        visit("\n" + Space + def_object.getNEW_(), fw);
        visit("\n" + Space + def_object.getWIDGET(), fw);
       /* if (def_object. getWidget()!= null) {
            visit(def_object. getWidget(), Space, fw);
        }*/
    }
    public void visit(defSet DefSet, String Space, FileWriter fw) {
        visit("\n" + Space + DefSet .getVAR_() , fw);
        visit("\n" + Space + DefSet.getIDENTIFIER() , fw);
        if (DefSet. getValue()!= null) {
            visit(DefSet. getValue(), Space, fw);
        }
        visit("\n" + Space + DefSet.getDataType(), fw);
        visit("\n" + Space + DefSet.getSET_(), fw);
        visit("\n" + Space + DefSet.getFINAL_(), fw);
        visit("\n" + Space + DefSet.getCONST_(), fw);
    }
    public void visit(defMap defMap, String Space, FileWriter fw) {
        visit("\n" + Space + defMap .getVAR_() , fw);
        visit("\n" + Space + defMap.getIDENTIFIER() , fw);
        if (defMap. getValue()!= null) {
            visit(defMap. getValue(), Space, fw);
        }
        visit("\n" + Space + defMap.getMAP_(), fw);
        visit("\n" + Space + defMap.getDataType(), fw);
    }
    public void visit(assignOneElement assignOneElement, String Space, FileWriter fw) {
        visit("\n" + Space + assignOneElement .getIDENTIFIER() , fw);

    }
    public void visit(defConst getDefConst, String Space, FileWriter fw) {
        visit("\n" + Space + getDefConst.getCONST_() , fw);
        if (getDefConst. getExp()!= null) {
            visit(getDefConst .getExp(), Space, fw);
        }
        if (getDefConst. getVarDefinition()!= null) {
            visit(getDefConst .getVarDefinition(), Space, fw);
        }
        if (getDefConst. getBoolVarDefnition()!= null) {
            visit(getDefConst .getBoolVarDefnition(), Space, fw);
        }
        if (getDefConst. getDefArray()!= null) {
            visit(getDefConst .getDefArray(), Space, fw);
        }
    }
    public void visit(defFinal defFinal, String Space, FileWriter fw) {
        visit("\n" + Space + defFinal . getFINAL_() , fw);
        if (defFinal. getVarDefinition()!= null) {
            visit(defFinal .getVarDefinition(), Space, fw);
        }
        if (defFinal. getBoolVarDefnition()!= null) {
            visit(defFinal .getBoolVarDefnition(), Space, fw);
        }
        if (defFinal. getDefArray()!= null) {
            visit(defFinal .getDefArray(), Space, fw);
        }
        if (defFinal. getExp()!= null) {
            visit(defFinal .getExp(), Space, fw);
        }
        visit("\n" + Space + defFinal .getIDENTIFIER() , fw);

    }
    public void visit(defLate defLate , String Space, FileWriter fw) {
        visit("\n" + Space + defLate .getLATE_() , fw);
        if (defLate. getVarDefinition()!= null) {
            visit(defLate .getVarDefinition(), Space, fw);
        }
        if (defLate. getBoolVarDefnition()!= null) {
            visit(defLate .getBoolVarDefnition(), Space, fw);
        }
        if (defLate. getDefArray()!= null) {
            visit(defLate .getDefArray(), Space, fw);
        }
        if (defLate.getExp() != null) {
            visit(defLate .getExp(), Space, fw);
        }
        visit("\n" + Space + defLate .getIDENTIFIER() , fw);
    }
    public void visit(defDynamic defDynamic, String Space, FileWriter fw) {
        visit("\n" + Space + defDynamic .getIDENTIFIER() , fw);
        visit("\n" + Space + defDynamic . getDYNAMIC_(), fw);
        if (defDynamic.getExp() != null) {
            visit(defDynamic .getExp(), Space, fw);
        }
    }
    public void visit(defEnum  defEnum, String Space, FileWriter fw) {
        visit("\n" + Space + defEnum .getIDENTIFIER() , fw);
        visit("\n" + Space + defEnum . getENUM_(), fw);
        if (defEnum.getValue() != null) {
            for (int i = 0; i < defEnum .getValue().size(); i++) {
                visit(defEnum .getValue().get(i), Space, fw);
            }

        }
    }
    //EndDart ----------------------------------------------------------------------



    //FlutterClasses ----------------------------------------------------------------------
    public void visit(widget widget, String space, FileWriter fw) {
        if (widget.getDefColumn() != null) {
            visit(widget.getDefColumn(), space, fw);
        }
        if (widget.getDefContainer() != null) {
            visit(widget.getDefContainer(), space, fw);
        }
        if (widget.getDefExpanded() != null) {
            visit(widget.getDefExpanded(), space, fw);
        }
        if (widget.getText() != null) {
            visit(widget.getText(), space, fw);
        }
        if (widget.getDefRow() != null) {
            visit(widget.getDefRow(), space, fw);
        }
        if (widget.getImage() != null) {
            visit(widget.getImage(), space, fw);
        }
        if (widget.getListView() != null) {
            visit(widget.getListView(), space, fw);
        }
        if (widget.getTextField() != null) {
            visit(widget.getTextField(), space, fw);
        }
    }

        //Container ----------------------------------------------------------------------
        public void visit(defContainer defContainer, String space, FileWriter fw) {
            if (defContainer.getCONTAINER_() != null) {
                visit("\n" + space + defContainer.getCONTAINER_() + ":", fw);
            }

            if (defContainer.getContainerBody() != null) {
                for (int i = 0; i < defContainer.getContainerBody().size(); i++) {
                    visit(defContainer.getContainerBody().get(i), space, fw);
                }
            }
        }

        public void visit(defExpanded defExpanded, String space, FileWriter fw) {
            if (defExpanded.getEXPANDED_() != null) {
                visit("\n" + space + defExpanded.getEXPANDED_() + ":", fw);
            }

            if (defExpanded.getContainerBody() != null) {
                for (int i = 0; i < defExpanded.getContainerBody().size(); i++) {
                    visit(defExpanded.getContainerBody().get(i), space, fw);
                }
            }
        }

        public void visit(containerBody containerBody, String space, FileWriter fw) {
            if (containerBody.getCHILD_() != null) {
                visit("\n" + space + containerBody.getCHILD_() + ":", fw);
            }
            if (containerBody.getNUMBER() != null) {
                visit("\n" + space + containerBody.getNUMBER() + ":", fw);
            }
            if (containerBody.getPADDING_() != null) {
                visit("\n" + space + containerBody.getPADDING_() + ":", fw);
            }
            if (containerBody.getPADDING_value() != null) {
                visit("\n" + space + containerBody.getPADDING_value() + ":", fw);
            }
            if (containerBody.getWIDGET() != null) {
                visit("\n" + space + containerBody.getWIDGET() + ":", fw);
            }
            if (containerBody.getWidget() != null) {
                visit(containerBody.getWidget(), space, fw);
            }
            if (containerBody.getWIDTH_() != null) {
                visit("\n" + space + containerBody.getWIDTH_() + ":", fw);
            }
        }
        //End Container ----------------------------------------------------------------------

        //Image ----------------------------------------------------------------------
        public void visit(image image, String space, FileWriter fw) {
            if (image.getIMAGE_() != null) {
                visit("\n" + space + image.getIMAGE_() + ":", fw);
            }

            if (image.getAssetImage() != null) {
                visit(image.getAssetImage(), space, fw);
            }

            if (image.getImageBody() != null) {
                for (int i = 0; i < image.getImageBody().size(); i++) {
                    visit(image.getImageBody().get(i), space, fw);
                }
            }
        }

        public void visit(assetImage assetImage, String space, FileWriter fw) {
            if (assetImage.getIMAGE() != null) {
                visit("\n" + space + assetImage.getIMAGE() + ":", fw);
            }

            if (assetImage.getASSETIMAGE_() != null) {
                visit("\n" + space + assetImage.getASSETIMAGE_() + ":", fw);
            }
            if (assetImage.getSingleLineString() != null) {
                visit("\n" + space + assetImage.getSingleLineString() + ":", fw);
            }
        }

        public void visit(imageBody imageBody, String space, FileWriter fw) {
            if (imageBody.getHEIGHT_() != null) {
                visit("\n" + space + imageBody.getHEIGHT_() + ":", fw);
            }

            if (imageBody.getNUMBER() != null) {
                visit(imageBody.getNUMBER() , fw);
            }
            if (imageBody.getWIDTH_() != null) {
                visit("\n" + space + imageBody.getWIDTH_() + ":", fw);
            }
        }
        //End Image ----------------------------------------------------------------------

        //ListView ----------------------------------------------------------------------
        public void visit(listView listView, String space, FileWriter fw) {
            if (listView.getLISTVIEW_() != null) {
                visit("\n" + space + listView.getLISTVIEW_() + ":", fw);
            }

            if (listView.getListViewBody() != null) {
                for (int i = 0; i < listView.getListViewBody().size(); i++) {
                    visit(listView.getListViewBody().get(i), space, fw);
                }
            }
        }

        public void visit(listViewBody listViewBody, String space, FileWriter fw) {
            if (listViewBody.getCONTROLLER() != null) {
                visit("\n" + space + listViewBody.getCONTROLLER() + ":", fw);
            }

            if (listViewBody.getIDENTIFIER() != null) {
                visit("\n" + space + listViewBody.getIDENTIFIER() + ":", fw);
            }
            if (listViewBody.getLayoutBody() != null) {
                for (int i = 0; i < listViewBody.getLayoutBody().size(); i++) {
                    visit(listViewBody.getLayoutBody().get(i), space, fw);
                }
            }
        }
        //EndListView ----------------------------------------------------------------------

        //textfield ----------------------------------------------------------------------
        public void visit(textField textField, String space, FileWriter fw) {
            if (textField.getTExtField() != null) {
                visit("\n" + space + textField.getTExtField() + ":", fw);
            }

            if (textField.getTextFieldProperties() != null) {
                for (int i = 0; i < textField.getTextFieldProperties().size(); i++) {
                    visit(textField.getTextFieldProperties().get(i), space, fw);
                }

            }

        }

        public void visit(textFieldProperties textFieldProperties, String space, FileWriter fw) {
            if (textFieldProperties.getTextFieldControllerProperty() != null) {
                visit(textFieldProperties.getTextFieldControllerProperty(), space, fw);
            }

            if (textFieldProperties.getTextFieldDecorationProperty() != null) {
                visit(textFieldProperties.getTextFieldDecorationProperty(), space, fw);
            }

            if (textFieldProperties.getTextFieldTextProperty() != null) {
                visit(textFieldProperties.getTextFieldTextProperty(), space, fw);
            }

            if (textFieldProperties.getTextFieldOnChangedProperty() != null) {
                visit(textFieldProperties.getTextFieldOnChangedProperty(), space, fw);
            }

            if (textFieldProperties.getTextFieldOnEditingCompleteProperty() != null) {
                visit(textFieldProperties.getTextFieldOnEditingCompleteProperty(), space, fw);
            }
        }

        public void visit(inputDecorationIconProperty inputDecorationIconProperty, String space, FileWriter fw) {
            if (inputDecorationIconProperty.getICON() != null) {
                visit("\n" + space + inputDecorationIconProperty.getICON() + ":", fw);
            }

            if (inputDecorationIconProperty.getIDENTIFIER() != null) {
                visit("\n" + space + inputDecorationIconProperty.getIDENTIFIER() + ":", fw);
            }
        }

        public void visit(inputDecorationLabelTextProperty inputDecorationLabelTextProperty, String space, FileWriter fw) {
            if (inputDecorationLabelTextProperty.getLABELTEXT() != null) {
                visit("\n" + space + inputDecorationLabelTextProperty.getLABELTEXT() + ":", fw);
            }
            if (inputDecorationLabelTextProperty.getSingleLineString() != null) {
                visit("\n" + space + inputDecorationLabelTextProperty.getSingleLineString() + ":", fw);
            }

        }

        public void visit(inputDecorationProperties inputDecorationProperties, String space, FileWriter fw) {
            if (inputDecorationProperties.getInputDecorationHelperTextProperty() != null) {
                visit(inputDecorationProperties.getInputDecorationLabelTextProperty(), space, fw);
            }

            if (inputDecorationProperties.getInputDecorationIconProperty() != null) {
                visit(inputDecorationProperties.getInputDecorationIconProperty(), space, fw);
            }

            if (inputDecorationProperties.getInputDecorationHelperTextProperty() != null) {
                visit(inputDecorationProperties.getInputDecorationHelperTextProperty(), space, fw);
            }

            if (inputDecorationProperties.getInputDecorationLabelTextProperty() != null) {
                visit(inputDecorationProperties.getInputDecorationHintTextProperty(), space, fw);
            }
        }

        public void visit(textFieldControllerProperty textFieldControllerProperty, String space, FileWriter fw) {
            if (textFieldControllerProperty.getCONTROLLER() != null) {
                visit("\n" + space + textFieldControllerProperty.getCONTROLLER() + ":", fw);
            }

            if (textFieldControllerProperty.getIDENTIFIER() != null) {
                visit("\n" + space + textFieldControllerProperty.getIDENTIFIER() + ":", fw);
            }
        }

        public void visit(textFieldDecorationProperty textFieldDecorationProperty, String space, FileWriter fw) {
        if (textFieldDecorationProperty.getDECORATION() != null) {
            visit("\n" + space + textFieldDecorationProperty.getDECORATION() + ":", fw);
        }

        if (textFieldDecorationProperty.getInputDecorationProperties() != null) {
            visit(textFieldDecorationProperty.getInputDecorationProperties(), space, fw);
        }
    }

        public void visit(textFieldOnChangedProperty textFieldOnChangedProperty, String space, FileWriter fw) {
            if (textFieldOnChangedProperty.getIDENTIFIER() != null) {
                visit("\n" + space + textFieldOnChangedProperty.getIDENTIFIER() + ":", fw);
            }

            if (textFieldOnChangedProperty.getONCHANGED() != null) {
                visit("\n" + space + textFieldOnChangedProperty.getONCHANGED() + ":", fw);
            }
        }

        public void visit(textFieldOnEditingCompleteProperty textFieldOnEditingCompleteProperty, String space, FileWriter fw) {
        if (textFieldOnEditingCompleteProperty.getIDENTIFIER() != null) {
            visit("\n" + space + textFieldOnEditingCompleteProperty.getIDENTIFIER() + ":", fw);
        }

        if (textFieldOnEditingCompleteProperty.getONEDITINGCOMPLETE() != null) {
            visit("\n" + space + textFieldOnEditingCompleteProperty.getONEDITINGCOMPLETE() + ":", fw);
        }
    }

        public void visit(textFieldTextProperty textFieldTextProperty, String space, FileWriter fw) {
            if (textFieldTextProperty.getText() != null) {
                visit("\n" + space + textFieldTextProperty.getText() + ":", fw);
            }

            if (textFieldTextProperty.getSingleLineString() != null) {
                visit("\n" + space + textFieldTextProperty.getSingleLineString() + ":", fw);
            }
    }

        public void visit(inputDecorationHelperTextProperty inputDecorationHelperTextProperty, String space, FileWriter fw) {
            if (inputDecorationHelperTextProperty.getHELPERTEXT() != null) {
                visit("\n" + space + inputDecorationHelperTextProperty.getHELPERTEXT() + ":", fw);
            }

            if (inputDecorationHelperTextProperty.getSingleLineString() != null) {
                visit("\n" + space + inputDecorationHelperTextProperty.getSingleLineString() + ":", fw);
            }
        }

        public void visit(inputDecorationHintTextProperty inputDecorationHintTextProperty, String space, FileWriter fw) {
        if (inputDecorationHintTextProperty.getHINTTEXT() != null) {
            visit("\n" + space + inputDecorationHintTextProperty.getHINTTEXT() + ":", fw);
        }

        if (inputDecorationHintTextProperty.getSingleLineString() != null) {
            visit("\n" + space + inputDecorationHintTextProperty.getSingleLineString() + ":", fw);
        }
    }

        //Endtextfield ----------------------------------------------------------------------


    public void visit(layoutBody layoutBody, String space, FileWriter fw) {
        if (layoutBody.getCHILDREN_() != null) {
            visit("\n" + space + layoutBody.getCHILDREN_() + ":", fw);
        }

        if (layoutBody.getMainAxisAlignment_() != null) {
            visit("\n" + space + layoutBody.getMainAxisAlignment_() + ":", fw);
        }

        if (layoutBody.getMainAxisAlignment_value() != null) {
            visit("\n" + space + layoutBody.getMainAxisAlignment_value() + ":", fw);
        }

        if (layoutBody.getWIDGET() != null) {
            visit("\n" + space + layoutBody.getWIDGET() + ":", fw);
        }

        if (layoutBody.getWidget() != null) {
            for (int i = 0; i < layoutBody.getWidget().size(); i++) {
                visit(layoutBody.getWidget().get(i), space, fw);
            }
        }
    }

    public void visit(defRow defRow, String space, FileWriter fw) {
//        System.out.println("we are here");
        if (defRow.getROW_() != null) {
            visit("\n" + space + defRow.getROW_() + ":", fw);
        }

        if (defRow.getLayoutBody() != null) {
            for (int i = 0; i < defRow.getLayoutBody().size(); i++) {
                visit(defRow.getLayoutBody().get(i), space, fw);
            }
        }
    }

    public void visit(defColumn defColumn, String space, FileWriter fw) {
        if (defColumn.getCOLUMN_() != null) {
            visit("\n" + space + defColumn.getCOLUMN_() + ":", fw);
        }

        if (defColumn.getLayoutBody() != null) {
            for (int i = 0; i < defColumn.getLayoutBody().size(); i++) {
                visit(defColumn.getLayoutBody().get(i), space, fw);
            }
        }
    }

    public void visit(text text, String space, FileWriter fw) {
        if (text.getTEXT_() != null) {
            visit("\n" + space + text.getTEXT_() + ":", fw);
        }

        if (text.getSingleLineString() != null) {
            visit("\n" + space + text.getSingleLineString() + ":", fw);
        }
    }

    //End FlutterClasses ----------------------------------------------------------------------

    public void visit (String anyString, FileWriter fileWriter){
            try {

                fileWriter.append(anyString);

            } catch (IOException e) {
                System.out.println("error" + e.getMessage());

            }
            System.out.print(anyString);
        }

}