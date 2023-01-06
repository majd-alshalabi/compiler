package ASTClasses.DartClasses.Boolean;

public class boolVarEq {
//    boolVarEq : IDENTIFIER ((EQFORBOOLEANMATH | EQ) boolExp | ) SC;
    private String IDENTIFIER;
    private boolExp boolExp;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public ASTClasses.DartClasses.Boolean.boolExp getBoolExp() {
        return boolExp;
    }

    public void setBoolExp(ASTClasses.DartClasses.Boolean.boolExp boolExp) {
        this.boolExp = boolExp;
    }
}
