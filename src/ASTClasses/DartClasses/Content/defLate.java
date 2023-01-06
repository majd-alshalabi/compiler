package ASTClasses.DartClasses.Content;

public class defLate {
//    defLate :  LATE_ (varDefinition | varDefinition | defArray)
 private String LATE_;
private varDefinition varDefinition;
private ASTClasses.DartClasses.Boolean.boolVarDefnition boolVarDefnition;
private defArray defArray;
private String IDENTIFIER;

    public String getLATE_() {
        return LATE_;
    }

    public void setLATE_(String LATE_) {
        this.LATE_ = LATE_;
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

    public ASTClasses.DartClasses.exp getExp() {
        return exp;
    }

    public void setExp(ASTClasses.DartClasses.exp exp) {
        this.exp = exp;
    }

    private ASTClasses.DartClasses.exp exp;
}
