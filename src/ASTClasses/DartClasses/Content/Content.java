package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.Boolean.boolVarDefnition;
import ASTClasses.DartClasses.Boolean.boolVarEq;
import ASTClasses.DartClasses.Content.For.def_for;
import ASTClasses.DartClasses.Content.IF.def_else;
import ASTClasses.DartClasses.Content.IF.def_else_if;
import ASTClasses.DartClasses.Content.IF.def_if;
import ASTClasses.DartClasses.Function.def_function_datatype;
import ASTClasses.DartClasses.Function.def_function_void;
import ASTClasses.DartClasses.GetDataAst;
import ASTClasses.FlutterClasses.Widget.NavigationRule;
import ASTClasses.FlutterClasses.widget;

public class Content {
    private varDefinition varDefinition;
    private varEQ varEQ;
    private intIncrease intIncrease;
    private boolVarDefnition boolVarDefnition ;
    private boolVarEq boolVarEq;
    private def_if def_if;

    public GetDataAst getGetDataAst() {
        return getDataAst;
    }

    public void setGetDataAst(GetDataAst getDataAst) {
        this.getDataAst = getDataAst;
    }

    private GetDataAst getDataAst;

    public ASTClasses.DartClasses.Content.IF.def_else_if getDef_else_if() {
        return def_else_if;
    }

    public void setDef_else_if(ASTClasses.DartClasses.Content.IF.def_else_if def_else_if) {
        this.def_else_if = def_else_if;
    }

    public ASTClasses.DartClasses.Content.IF.def_else getDef_else() {
        return def_else;
    }

    public void setDef_else(ASTClasses.DartClasses.Content.IF.def_else def_else) {
        this.def_else = def_else;
    }

    private def_else_if def_else_if;
    private def_else def_else;
    private def_for def_for;
    private def_while def_while;
    private def_switch def_switch;
    private def_object def_object;
    private def_function_void def_function_void;
    private def_function_datatype def_function_datatype;
    private NavigationRule navigatorRule;


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

    public ASTClasses.DartClasses.Content.def_switch getDef_switch() {
        return def_switch;
    }

    public void setDef_switch(ASTClasses.DartClasses.Content.def_switch def_switch) {
        this.def_switch = def_switch;
    }

    public ASTClasses.DartClasses.Content.def_object getDef_object() {
        return def_object;
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

    public NavigationRule getNavigatorRule() {
        return navigatorRule;
    }

    public void setNavigatorRule(NavigationRule navigatorRule) {
        this.navigatorRule = navigatorRule;
    }
}
