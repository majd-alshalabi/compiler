package ASTClasses.DartClasses.Boolean;

public class boolExp {
//    boolExp : boolExp BooleanSign boolExp # BoolMathematicsLogic
//        | OP boolExp CP # BoolBetweenBracket
//        | Bool_value # Bool
//        | IDENTIFIER # BoolVariable ;
    private boolExp boolExp;
    private String BooleanSign;
    private String Bool_value;
    private String IDENTIFIER;

    public ASTClasses.DartClasses.Boolean.boolExp getBoolExp() {
        return boolExp;
    }

    public void setBoolExp(ASTClasses.DartClasses.Boolean.boolExp boolExp) {
        this.boolExp = boolExp;
    }

    public String getBooleanSign() {
        return BooleanSign;
    }

    public void setBooleanSign(String booleanSign) {
        BooleanSign = booleanSign;
    }

    public String getBool_value() {
        return Bool_value;
    }

    public void setBool_value(String bool_value) {
        Bool_value = bool_value;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
}
