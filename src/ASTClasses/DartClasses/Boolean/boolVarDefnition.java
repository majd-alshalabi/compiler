package ASTClasses.DartClasses.Boolean;

public class boolVarDefnition {
//boolVarDefnition: Bool_type IDENTIFIER (EQ boolExp | ) SC ;
    private String Bool_type;
    private String IDENTIFIER;
//    private boolExp boolExp;
    private String boolExp;

    public String getBool_type() {
        return Bool_type;
    }

    public void setBool_type(String bool_type) {
        Bool_type = bool_type;
    }

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
