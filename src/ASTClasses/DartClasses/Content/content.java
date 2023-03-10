package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.Boolean.boolVarDefnition;
import ASTClasses.DartClasses.Boolean.boolVarEq;
import ASTClasses.DartClasses.Content.For.def_for;
import ASTClasses.DartClasses.Content.IF.def_if;
import ASTClasses.DartClasses.Function.def_function_datatype;
import ASTClasses.DartClasses.Function.def_function_void;
import ASTClasses.FlutterClasses.widget;

public class content {
//    content: varDefinition
//        | varEQ
//        | intIncrease
//        | boolVarDefnition
//        | boolVarEq
//        | def_if
//        | def_for
//        | def_while
//        | defArray
//        | def_switch
//        | def_object
//        | def_function_void
//        | def_function_datatype
//        | defSet
//        | defMap
//        | assignOneElement
//        | defConst
//        | defFinal
//        | defLate
//        | defDynamic
//        | defEnum
//        | widget
//        ;

    private varDefinition varDefinition;
    private varEQ varEQ;
    private intIncrease intIncrease;
    private boolVarDefnition boolVarDefnition ;
    private boolVarEq boolVarEq;
    private def_if def_if;
    private def_for def_for;
    private def_while def_while;
    private defArray defArray;
    private def_switch def_switch;
    private def_object def_object;
    private def_function_void def_function_void;
    private def_function_datatype def_function_datatype;
    private defSet defSet;
    private defMap defMap;
    private assignOneElement assignOneElement;
    private defConst defConst;
    private defFinal defFinal;
    private defLate defLate;
    private defDynamic defDynamic;
    private defEnum defEnum;
    private widget widget;

    public ASTClasses.FlutterClasses.widget getWidget() {
        return widget;
    }

    public void setWidget(widget widget) {
        this.widget = widget;
    }

    public ASTClasses.DartClasses.Content.varDefinition getVarDefinition() {
        return varDefinition;
    }

    public void setVarDefinition(ASTClasses.DartClasses.Content.varDefinition varDefinition) {
        this.varDefinition = varDefinition;
    }

    public ASTClasses.DartClasses.Content.varEQ getVarEQ() {
        return varEQ;
    }

    public void setVarEQ(ASTClasses.DartClasses.Content.varEQ varEQ) {
        this.varEQ = varEQ;
    }

    public ASTClasses.DartClasses.Content.intIncrease getIntIncrease() {
        return intIncrease;
    }

    public void setIntIncrease(ASTClasses.DartClasses.Content.intIncrease intIncrease) {
        this.intIncrease = intIncrease;
    }

    public boolVarDefnition getBoolVarDefnition() {
        return boolVarDefnition;
    }

    public void setBoolVarDefnition(boolVarDefnition boolVarDefnition) {
        this.boolVarDefnition = boolVarDefnition;
    }

    public boolVarEq getBoolVarEq() {
        return boolVarEq;
    }

    public void setBoolVarEq(boolVarEq boolVarEq) {
        this.boolVarEq = boolVarEq;
    }

    public def_if getDef_if() {
        return def_if;
    }

    public void setDef_if(def_if def_if) {
        this.def_if = def_if;
    }

    public def_for getDef_for() {
        return def_for;
    }

    public void setDef_for(def_for def_for) {
        this.def_for = def_for;
    }

    public ASTClasses.DartClasses.Content.def_while getDef_while() {
        return def_while;
    }

    public void setDef_while(ASTClasses.DartClasses.Content.def_while def_while) {
        this.def_while = def_while;
    }

    public ASTClasses.DartClasses.Content.defArray getDefArray() {
        return defArray;
    }

    public void setDefArray(ASTClasses.DartClasses.Content.defArray defArray) {
        this.defArray = defArray;
    }

    public ASTClasses.DartClasses.Content.def_switch getDef_switch() {
        return def_switch;
    }

    public void setDef_switch(ASTClasses.DartClasses.Content.def_switch def_switch) {
        this.def_switch = def_switch;
    }

    public ASTClasses.DartClasses.Content.def_object getDef_object() {
        return def_object;
    }

    public void setDef_object(ASTClasses.DartClasses.Content.def_object def_object) {
        this.def_object = def_object;
    }

    public def_function_void getDef_function_void() {
        return def_function_void;
    }

    public void setDef_function_void(def_function_void def_function_void) {
        this.def_function_void = def_function_void;
    }

    public def_function_datatype getDef_function_datatype() {
        return def_function_datatype;
    }

    public void setDef_function_datatype(def_function_datatype def_function_datatype) {
        this.def_function_datatype = def_function_datatype;
    }

    public ASTClasses.DartClasses.Content.defSet getDefSet() {
        return defSet;
    }

    public void setDefSet(ASTClasses.DartClasses.Content.defSet defSet) {
        this.defSet = defSet;
    }

    public ASTClasses.DartClasses.Content.defMap getDefMap() {
        return defMap;
    }

    public void setDefMap(ASTClasses.DartClasses.Content.defMap defMap) {
        this.defMap = defMap;
    }

    public ASTClasses.DartClasses.Content.assignOneElement getAssignOneElement() {
        return assignOneElement;
    }

    public void setAssignOneElement(ASTClasses.DartClasses.Content.assignOneElement assignOneElement) {
        this.assignOneElement = assignOneElement;
    }

    public ASTClasses.DartClasses.Content.defConst getDefConst() {
        return defConst;
    }

    public void setDefConst(ASTClasses.DartClasses.Content.defConst defConst) {
        this.defConst = defConst;
    }

    public ASTClasses.DartClasses.Content.defFinal getDefFinal() {
        return defFinal;
    }

    public void setDefFinal(ASTClasses.DartClasses.Content.defFinal defFinal) {
        this.defFinal = defFinal;
    }

    public ASTClasses.DartClasses.Content.defLate getDefLate() {
        return defLate;
    }

    public void setDefLate(ASTClasses.DartClasses.Content.defLate defLate) {
        this.defLate = defLate;
    }

    public ASTClasses.DartClasses.Content.defDynamic getDefDynamic() {
        return defDynamic;
    }

    public void setDefDynamic(ASTClasses.DartClasses.Content.defDynamic defDynamic) {
        this.defDynamic = defDynamic;
    }

    public ASTClasses.DartClasses.Content.defEnum getDefEnum() {
        return defEnum;
    }

    public void setDefEnum(ASTClasses.DartClasses.Content.defEnum defEnum) {
        this.defEnum = defEnum;
    }
}
