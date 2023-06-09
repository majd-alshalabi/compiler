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

    public boolExp getBoolExp() {
        return boolExp;
    }

    public void setBoolExp(boolExp boolExp) {
        this.boolExp = boolExp;
    }
}
