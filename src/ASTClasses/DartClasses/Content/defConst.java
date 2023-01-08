package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.Boolean.boolVarDefnition;
import ASTClasses.DartClasses.exp;

public class defConst {

//    defConst : CONST_ (varDefinition | boolVarDefnition | defArray)
    private String CONST_;

    public ASTClasses.DartClasses.exp getExp() {
        return exp;
    }

    public void setExp(ASTClasses.DartClasses.exp exp) {
        this.exp = exp;
    }

    private ASTClasses.DartClasses.exp exp;

    public String getCONST_() {
        return CONST_;
    }

    public void setCONST_(String CONST_) {
        this.CONST_ = CONST_;
    }

    public ASTClasses.DartClasses.Content.varDefinition getVarDefinition() {
        return varDefinition;
    }

    public void setVarDefinition(ASTClasses.DartClasses.Content.varDefinition varDefinition) {
        this.varDefinition = varDefinition;
    }

    public ASTClasses.DartClasses.Boolean.boolVarDefnition getBoolVarDefnition() {
        return boolVarDefnition;
    }

    public void setBoolVarDefnition(ASTClasses.DartClasses.Boolean.boolVarDefnition boolVarDefnition) {
        this.boolVarDefnition = boolVarDefnition;
    }

    public ASTClasses.DartClasses.Content.defArray getDefArray() {
        return defArray;
    }

    public void setDefArray(ASTClasses.DartClasses.Content.defArray defArray) {
        this.defArray = defArray;
    }

    private varDefinition varDefinition;
    private ASTClasses.DartClasses.Boolean.boolVarDefnition boolVarDefnition;
    private defArray defArray;
}
