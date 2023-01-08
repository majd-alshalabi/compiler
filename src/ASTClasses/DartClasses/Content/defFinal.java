package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.Boolean.boolVarDefnition;
import ASTClasses.DartClasses.exp;

public class defFinal {
//    defFinal : FINAL_ (varDefinition | boolVarDefnition | defArray)
//         | FINAL_ IDENTIFIER (EQ exp |) SC;
 private String FINAL_;
private varDefinition varDefinition;
private ASTClasses.DartClasses.Boolean.boolVarDefnition boolVarDefnition;
private  defArray defArray;
private String IDENTIFIER;
private ASTClasses.DartClasses.exp exp;

    public exp getExp() {
        return exp;
    }

    public void setExp(exp exp) {
        this.exp = exp;
    }

    public String getFINAL_() {
        return FINAL_;
    }

    public void setFINAL_(String FINAL_) {
        this.FINAL_ = FINAL_;
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

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
}
