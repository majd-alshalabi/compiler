package ASTClasses.DartClasses.Boolean;

public class boolVarEq {
//    boolVarEq : IDENTIFIER ((EQFORBOOLEANMATH | EQ) boolExp | ) SC;
    private String IDENTIFIER;
    private String boolExp;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getBoolExp() {
        return boolExp;
    }

    public void setBoolExp(String boolExp) {
        this.boolExp = boolExp;
    }
}
