package ASTClasses.DartClasses.Boolean;

public class boolExp {
    public ASTClasses.DartClasses.Boolean.boolExp getBoolBetweenBracket() {
        return BoolBetweenBracket;
    }

    public void setBoolBetweenBracket(ASTClasses.DartClasses.Boolean.boolExp boolBetweenBracket) {
        BoolBetweenBracket = boolBetweenBracket;
    }

    public ASTClasses.DartClasses.Boolean.boolExp getBoolExp2() {
        return boolExp2;
    }

    public void setBoolExp2(ASTClasses.DartClasses.Boolean.boolExp boolExp2) {
        this.boolExp2 = boolExp2;
    }

    //    boolExp : boolExp BooleanSign boolExp # BoolMathematicsLogic
//        | OP boolExp CP # BoolBetweenBracket
//        | Bool_value # Bool
//        | IDENTIFIER # BoolVariable ;
    private boolExp BoolBetweenBracket;
    private boolExp boolExp;
    private boolExp boolExp2;
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

    public String print() {
        if (BoolBetweenBracket != null) {
            return "(" + BoolBetweenBracket.print() + ")";
        }
        else if (boolExp != null && boolExp2 != null && BooleanSign != null) {
            return boolExp.print() + BooleanSign + boolExp2.print();
        }
        else if (Bool_value != null) {
            return Bool_value;
        }
        else if (IDENTIFIER != null) {
            return IDENTIFIER;
        }
        return "";
    }

}
