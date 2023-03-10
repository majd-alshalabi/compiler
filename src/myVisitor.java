import ASTClasses.DartClasses.Boolean.boolVarDefnition;
import ASTClasses.DartClasses.Boolean.boolVarEq;
import ASTClasses.DartClasses.Class.class_body;
import ASTClasses.DartClasses.Class.def_class;
import ASTClasses.DartClasses.Class.importClass;
import ASTClasses.DartClasses.Content.*;
import ASTClasses.DartClasses.Content.For.def_for;
import ASTClasses.DartClasses.Content.IF.def_if;
import ASTClasses.DartClasses.Function.def_function_datatype;
import ASTClasses.DartClasses.Function.def_function_void;
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

import java.util.ArrayList;
import java.util.List;

import ASTClasses.program;


public class myVisitor  extends  Base {
    public String ConvertArray(List<String> listVariable) {
        String str = "";
        for (int i = 0; i < listVariable.size(); i++) {
            str = str + listVariable.get(i);
        }
        return str;
    }

    public String ConvertArrayForAction(List<String> listVariable) {
        String str = listVariable.get(0);
        for (int i = 1; i < listVariable.size(); i++) {
            str = str + "." + listVariable.get(i);
        }
        return str;
    }

    @Override
    public program visitProgram(Dart2Parser.ProgramContext ctx) {
        program program=new program();
        if (ctx.importClass() != null) {
            List<importClass> importClass = new ArrayList<>();
            for (int i = 0; i < ctx.importClass().size(); i++) {
                importClass.add(visitImportClass(ctx.importClass(i)));
            }
            program.setImportClass(importClass);
        }

        if (ctx.def_class() != null) {
            program.setDef_class(visitDef_class(ctx.def_class()));
        }else{
            System.out.println("You are not print the defClass");
        }

        if (ctx.def_function_void() != null) {
            List<def_function_void> def_function_void = new ArrayList<>();
            for (int i = 0; i < ctx.def_function_void().size(); i++) {
                def_function_void.add(visitDef_function_void(ctx.def_function_void(i)));
            }
            program.setDef_function_void(def_function_void);
        }

        if (ctx.def_function_datatype() != null) {
            List<def_function_datatype> def_function_datatype  = new ArrayList<>();
            for (int i = 0; i < ctx.def_function_datatype().size(); i++) {
                def_function_datatype.add(visitDef_function_datatype(ctx.def_function_datatype(i)));
            }
            program.setDef_function_datatype(def_function_datatype);
        }else{
            System.out.println("there is not def_function_dataType");
        }
        return program;
    }

    @Override
    public def_class visitDef_class(Dart2Parser.Def_classContext ctx) {

        def_class def_class = new def_class();

        if (ctx.importClass() != null) {
            List<importClass> importClass  = new ArrayList<>();
            for (int i = 0; i < ctx.importClass().size(); i++) {
                importClass.add(visitImportClass(ctx.importClass(i)));
            }
            def_class.setImportClass(importClass);
        }

        if (ctx.CLASS_() != null) {
            def_class.setCLASS_(ctx.CLASS_().getText());
        }

        if (ctx.IDENTIFIER() != null) {
            List<String> IDENTIFIER = new ArrayList<>();
            for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {
                IDENTIFIER.add(ctx.IDENTIFIER().get(i).getText());
            }
            def_class.setIDENTIFIER(IDENTIFIER);
        }

        if (ctx.EXTENDS_() != null) {
            def_class.setEXTENDS_(ctx.EXTENDS_().getText());
        }
        if (ctx.WITH_() != null) {
            def_class.setWITH_(ctx.WITH_().getText());
        }

        if (ctx.class_body() != null) {
            List<class_body> class_body  = new ArrayList<>();
            for (int i = 0; i < ctx.class_body().size(); i++) {
                class_body.add(visitClass_body(ctx.class_body(i)));
            }
            def_class.setClass_body(class_body);
        }
        return def_class;
    }

    @Override
    public class_body visitClass_body(Dart2Parser.Class_bodyContext ctx) {

        class_body class_body=new class_body();

        if (ctx. varDefinition() != null) {
            class_body.setVarDefinition(visitVarDefinition(ctx.varDefinition()));
        }
        if (ctx. boolVarDefnition() != null) {
            class_body.setBoolVarDefnition(visitBoolVarDefnition(ctx.boolVarDefnition()));
        }
        if (ctx. def_function_datatype() != null) {
            class_body.setDef_function_datatype(visitDef_function_datatype(ctx.def_function_datatype()));
        }
        if (ctx. def_function_void() != null) {
            class_body.setDef_function_void(visitDef_function_void(ctx.def_function_void()));
        }

        return class_body;
    }

    @Override
    public varDefinition visitVarDefinition(Dart2Parser.VarDefinitionContext ctx) {

        varDefinition varDefinition=new varDefinition();

        if (ctx.DataType() != null) {
            varDefinition.setDataType(ctx.DataType().getText());
        }
        if (ctx.IDENTIFIER() != null) {
            varDefinition.setIDENTIFIER(ctx.IDENTIFIER().getText());
        }
      //  if (ctx.exp() != null) {
        //    varDefinition.setExp(visitExp(ctx.exp()));
        //}


        return varDefinition;
    }

    @Override
    public def_function_datatype visitDef_function_datatype(Dart2Parser.Def_function_datatypeContext ctx){

        def_function_datatype def_function_datatype=new def_function_datatype();

       // if (ctx. DataType() != null) {
         //  def_function_datatype.setDataType(ctx. DataType().getText());
        //}
        //if (ctx. IDENTIFIER() != null) {
          //  def_function_datatype.setIDENTIFIER(ctx. IDENTIFIER().getText());
        //}

        return def_function_datatype;

    }

    @Override
    public def_function_void visitDef_function_void(Dart2Parser.Def_function_voidContext ctx){
        def_function_void def_function_void=new def_function_void();

        if (ctx.VOID_() != null) {
            def_function_void.setVOID_(ctx.VOID_().getText());
        }
        if (ctx.DataType() != null) {
            List<String> DataType = new ArrayList<>();
            for(int i=0 ; i< ctx.DataType().size() ; i++){
                DataType.add(ctx.DataType().get(i).getText());
            }
            def_function_void.setDataType(DataType);
        }
        if (ctx.IDENTIFIER() != null) {
            List<String> IDENTIFIER = new ArrayList<>();
            for(int i=0 ; i< ctx.IDENTIFIER().size() ; i++){
                IDENTIFIER.add(ctx.IDENTIFIER().get(i).getText());
            }
            def_function_void.setIDENTIFIER(IDENTIFIER);
        }
        if (ctx.content() != null) {
            List<content> content  = new ArrayList<>();
            for (int i = 0; i < ctx.content().size(); i++) {
                content.add(visitContent(ctx.content(i)));
            }
            def_function_void.setContent(content);
        }
        return def_function_void;
    }

    @Override
    public content visitContent(Dart2Parser.ContentContext ctx) {
        content content=new content();

        if (ctx. varDefinition() != null) {
            content.setVarDefinition(visitVarDefinition(ctx.varDefinition()));
        }

        if (ctx. varEQ() != null) {
            content.setVarEQ(visitVarEQ(ctx.varEQ()));
        }
        if (ctx. intIncrease() != null) {
            content.setIntIncrease(visitIntIncrease(ctx.intIncrease()));
        }
        if (ctx. boolVarDefnition() != null) {
            content.setBoolVarDefnition(visitBoolVarDefnition(ctx.boolVarDefnition()));
        }
        if (ctx. boolVarEq() != null) {
            content.setBoolVarEq(visitBoolVarEq(ctx.boolVarEq()));
        }
        if (ctx. def_if() != null) {
            content.setDef_if(visitDef_if(ctx.def_if()));
        }
        if (ctx. def_for() != null) {
            content.setDef_for(visitDef_for(ctx.def_for()));
        }
        if (ctx. def_while() != null) {
            content.setDef_while(visitDef_while(ctx.def_while()));
        }
        if (ctx. defArray() != null) {
            content.setDefArray(visitDefArray(ctx.defArray()));
        }
        if (ctx. defArray() != null) {
            content.setDefArray(visitDefArray(ctx.defArray()));
        }
        if (ctx. def_object() != null) {
            content.setDef_object(visitDef_object(ctx.def_object()));
        }
        if (ctx. def_function_void() != null) {
            content.setDef_function_void(visitDef_function_void(ctx.def_function_void()));
        }
        if (ctx. def_function_datatype() != null) {
            content.setDef_function_datatype(visitDef_function_datatype(ctx.def_function_datatype()));
        }
        if (ctx. defSet() != null) {
            content.setDefSet(visitDefSet(ctx.defSet()));
        }
        if (ctx. defMap() != null) {
            content.setDefMap(visitDefMap(ctx.defMap()));
        }
        if (ctx. assignOneElement() != null) {
            content.setAssignOneElement(visitAssignOneElement(ctx.assignOneElement()));
        }
        if (ctx. defConst() != null) {
            content.setDefConst(visitDefConst(ctx.defConst()));
        }
        if (ctx. defFinal() != null) {
            content.setDefFinal(visitDefFinal(ctx.defFinal()));
        }
        if (ctx. defLate() != null) {
            content.setDefLate(visitDefLate(ctx.defLate()));
        }
        if (ctx. defDynamic() != null) {
            content.setDefDynamic(visitDefDynamic(ctx.defDynamic()));
        }
        if (ctx. defEnum() != null) {
            content.setDefEnum(visitDefEnum(ctx.defEnum()));
        }
        if(ctx.widget() != null) {
            content.setWidget(visitWidget(ctx.widget()));
        }

        return content;
    }

    @Override
    public varEQ visitVarEQ(Dart2Parser.VarEQContext ctx){
        varEQ varEQ=new varEQ();
        /////////////////////
        ////////////////////
        return varEQ;
    }

    @Override
    public intIncrease visitIntIncrease(Dart2Parser.IntIncreaseContext ctx){
        intIncrease intIncrease=new intIncrease();
        /////////////

        ///////////
        return intIncrease;
    }

    @Override
    public boolVarEq visitBoolVarEq(Dart2Parser.BoolVarEqContext ctx){
        boolVarEq  boolVarEq =new boolVarEq ();
        /////////////

        ///////////
        return boolVarEq ;
    }

    @Override
    public def_if visitDef_if(Dart2Parser.Def_ifContext ctx){
        def_if  def_if =new def_if ();
        /////////////

        ///////////
        return def_if ;
    }

    @Override
    public def_for visitDef_for(Dart2Parser.Def_forContext ctx){
        def_for  def_for =new def_for ();
        /////////////

        ///////////
        return def_for ;
    }

    @Override
    public def_while visitDef_while(Dart2Parser.Def_whileContext ctx){
        def_while  def_while =new def_while ();
        /////////////

        ///////////
        return def_while ;
    }

    @Override
    public defArray visitDefArray(Dart2Parser.DefArrayContext ctx){
        defArray  defArray =new defArray ();
        /////////////

        ///////////
        return defArray ;
    }

    @Override
    public def_object visitDef_object(Dart2Parser.Def_objectContext ctx){
        def_object  def_object =new def_object ();
        /////////////

        ///////////
        return def_object ;
    }

    @Override
    public defSet visitDefSet(Dart2Parser.DefSetContext ctx){
        defSet  defSet =new defSet();
        /////////////

        ///////////
        return defSet ;
    }

    @Override
    public defMap visitDefMap(Dart2Parser.DefMapContext ctx){
        defMap  defMap =new defMap();
        /////////////

        ///////////
        return defMap ;

    }

    @Override
    public assignOneElement visitAssignOneElement(Dart2Parser.AssignOneElementContext ctx){
        assignOneElement assignOneElement  =new assignOneElement ();
        /////////////

        ///////////
        return assignOneElement  ;
    }

    @Override
    public defConst  visitDefConst(Dart2Parser.DefConstContext ctx){
        defConst  defConst =new defConst ();
        /////////////

        ///////////
        return defConst   ;
    }

    @Override
    public defFinal visitDefFinal(Dart2Parser.DefFinalContext ctx){
        defFinal defFinal =new defFinal();
        /////////////

        ///////////
        return defFinal;
    }

    @Override
    public defLate visitDefLate(Dart2Parser.DefLateContext ctx){
        defLate defLate =new defLate();
        /////////////

        ///////////
        return defLate;
    }

    @Override
    public defDynamic visitDefDynamic(Dart2Parser.DefDynamicContext ctx){
        defDynamic defDynamic =new defDynamic();
        /////////////

        ///////////
        return defDynamic;
    }



    @Override
    public importClass visitImportClass(Dart2Parser.ImportClassContext ctx){
        importClass importClass=new importClass();

        if (ctx.IMPORT_() != null) {
            importClass.setIMPORT_(ctx.IMPORT_().getText());
        }
        if (ctx.SingleLineString() != null) {
            importClass.setSingleLineString(ctx.SingleLineString().getText());
        }

        return importClass;
    }




    @Override
    public boolVarDefnition visitBoolVarDefnition(Dart2Parser.BoolVarDefnitionContext ctx){

        boolVarDefnition boolVarDefnition=new boolVarDefnition();


        if (ctx.Bool_type() != null) {
            boolVarDefnition.setBool_type(ctx.Bool_type().getText());
        }
        if (ctx.IDENTIFIER() != null) {
            boolVarDefnition.setIDENTIFIER(ctx.IDENTIFIER().getText());
        }
       // if (ctx.boolExp() != null) {
         //   boolVarDefnition.setBoolExp(visitBoolExp(ctx.boolExp()));
        //}

        return boolVarDefnition;



    }


    @Override
    public value visitValue(Dart2Parser.ValueContext ctx) {

        value value=new value();

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
    public defEnum visitDefEnum(Dart2Parser.DefEnumContext ctx) {

        defEnum defEnum=new defEnum();

        if (ctx.ENUM_() != null) {
            defEnum.setENUM_(ctx.ENUM_().getText());

        }
        if (ctx.IDENTIFIER() != null) {
            defEnum.setENUM_(ctx.IDENTIFIER().getText());

        }
        if (ctx.value() != null) {
            List<value> value = new ArrayList<>();
            for (int i = 0; i < ctx.value().size(); i++) {
                value.add(visitValue(ctx.value(i)));
            }
            defEnum.setValue(value);
        }

        return defEnum;
    }

    @Override
    public widget visitWidget(Dart2Parser.WidgetContext ctx) {

        widget widget=new widget();

        if (ctx. listView() != null) {
            widget.setListView(visitListView(ctx.listView()));
        }
        if (ctx. defColumn() != null) {
            widget.setDefColumn(visitDefColumn(ctx.defColumn()));
        }
        if (ctx.defRow () != null) {
            widget.setDefRow(visitDefRow(ctx.defRow()));
        }
        if (ctx.textField () != null) {
            widget.setTextField(visitTextField(ctx.textField()));
        }
        if (ctx.text () != null) {
            widget.setText(visitText(ctx.text()));
        }
        if (ctx.defContainer () != null) {
            widget.setDefContainer(visitDefContainer(ctx.defContainer()));
        }
        if (ctx.defExpanded() != null) {
            widget.setDefExpanded(visitDefExpanded(ctx.defExpanded()));
        }
        if (ctx.image () != null) {
            widget.setImage(visitImage(ctx.image()));
        }

        return widget;
    }

    @Override
    public defColumn visitDefColumn(Dart2Parser.DefColumnContext ctx) {

        defColumn defColumn=new defColumn();

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
        defRow defRow=new defRow();

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

        defContainer defContainer=new defContainer();

        if (ctx.CONTAINER_ ()!= null) {
            defContainer.setCONTAINER_(ctx.CONTAINER_ ().getText());

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
    public defExpanded visitDefExpanded(Dart2Parser.DefExpandedContext ctx) {
        return null;
    }

    @Override
    public containerBody visitContainerBody(Dart2Parser.ContainerBodyContext ctx) {

        containerBody containerBody=new containerBody();

        if (ctx.CHILD_ ()!= null) {
            containerBody.setCHILD_(ctx.CHILD_ ().getText());

        }
        if (ctx.WIDGET()!= null) {
            containerBody.setWIDGET(ctx.WIDGET ().getText());

        }
        if (ctx.widget () != null) {
            containerBody.setWidget(visitWidget(ctx.widget()));
        }
        if (ctx.PADDING_ ()!= null) {
            containerBody.setPADDING_(ctx.PADDING_ ().getText());

        }
        if (ctx.PADDING_value ()!= null) {
            containerBody.setPADDING_value(ctx.PADDING_value ().getText());

        }
        if (ctx.WIDTH_ ()!= null) {
            containerBody.setWIDTH_(ctx.WIDTH_ ().getText());

        }
        if (ctx.NUMBER ()!= null) {
            containerBody.setNUMBER(ctx.NUMBER ().getText());

        }

        return containerBody;
    }

    @Override
    public listView visitListView(Dart2Parser.ListViewContext ctx) {
        listView listView=new listView();

        if (ctx.LISTVIEW_ ()!= null) {
            listView.setLISTVIEW_(ctx.LISTVIEW_ ().getText());

        }
        if (ctx.listViewBody() != null) {
            List<listViewBody> listViewBody = new ArrayList<>();
            for (int i = 0; i < ctx.listViewBody().size(); i++) {
                listViewBody.add(visitListViewBody(ctx.listViewBody(i)));
            }
            listView.setListViewBody(listViewBody);
        }

        return listView;
    }

    @Override
    public listViewBody visitListViewBody(Dart2Parser.ListViewBodyContext ctx) {

        listViewBody listViewBody=new listViewBody();

        if (ctx.layoutBody() != null) {
            List<layoutBody> layoutBody = new ArrayList<>();
            for (int i = 0; i < ctx.layoutBody().size(); i++) {
                layoutBody.add(visitLayoutBody(ctx.layoutBody(i)));
            }
            listViewBody.setLayoutBody(layoutBody);
        }
        if (ctx.CONTROLLER ()!= null) {
            listViewBody.setCONTROLLER(ctx.CONTROLLER ().getText());

        }
        if (ctx.IDENTIFIER ()!= null) {
            listViewBody.setIDENTIFIER(ctx.IDENTIFIER ().getText());

        }
        return listViewBody;
    }

    @Override
    public layoutBody visitLayoutBody(Dart2Parser.LayoutBodyContext ctx) {

        layoutBody layoutBody=new layoutBody();

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
        if (ctx.MainAxisAlignment_() != null) {
            layoutBody.setMainAxisAlignment_(ctx.MainAxisAlignment_().getText());

        }
        if (ctx.MainAxisAlignment_value() != null) {
            layoutBody.setMainAxisAlignment_value(ctx.MainAxisAlignment_value().getText());

        }

        return layoutBody;
    }

    @Override
    public text visitText(Dart2Parser.TextContext ctx) {
        text myText = new text();
        myText.setTEXT_(ctx.getText());
        return  myText;
    }

    @Override
    public textField visitTextField(Dart2Parser.TextFieldContext ctx) {
           textField textField=new textField();
        List<textFieldProperties> elements = new ArrayList<>();

        for (int i=0; i<ctx.textFieldProperties().size();i++){
            if (ctx.textFieldProperties(i)!=null)
            {
                elements.add((textFieldProperties)this.visitTextFieldProperties(ctx.textFieldProperties(i)));
            }
        }
        if (ctx.TextField() != null) {
            textField.setTExtField(ctx.TextField().getText());
        }

        textField.setTextFieldProperties(elements);
        return textField ;
    }


    @Override
    public textFieldProperties visitTextFieldProperties(Dart2Parser.TextFieldPropertiesContext ctx) {


        textFieldProperties textFieldProperties=new textFieldProperties();

        if (ctx. textFieldTextProperty() != null) {
            textFieldProperties.setTextFieldTextProperty(visitTextFieldTextProperty(ctx.textFieldTextProperty()));
        }
        if (ctx. textFieldControllerProperty() != null) {
            textFieldProperties.setTextFieldControllerProperty(visitTextFieldControllerProperty(ctx.textFieldControllerProperty()));
        }
        if (ctx. textFieldDecorationProperty() != null) {
            textFieldProperties.setTextFieldDecorationProperty(visitTextFieldDecorationProperty(ctx.textFieldDecorationProperty()));
        }
        if (ctx. textFieldOnChangedProperty() != null) {
            textFieldProperties.setTextFieldOnChangedProperty(visitTextFieldOnChangedProperty(ctx.textFieldOnChangedProperty()));
        }
        if (ctx. textFieldOnEditingCompleteProperty() != null) {
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
        return null;
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
        if (ctx. assetImage() != null) {
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
        myAssetImage.setIMAGE(ctx.getText());
        return myAssetImage;
    }

    @Override
    public imageBody visitImageBody(Dart2Parser.ImageBodyContext ctx) {
        imageBody imageBody = new imageBody();
        if(ctx.HEIGHT_() != null)
        {
            imageBody.setHEIGHT_(ctx.HEIGHT_().getText());
            imageBody.setNUMBER(ctx.NUMBER().getText());
        }if(ctx.WIDTH_() != null)
        {
            imageBody.setHEIGHT_(ctx.WIDTH_().getText());
            imageBody.setNUMBER(ctx.NUMBER().getText());
        }
        return imageBody;
    }

}
