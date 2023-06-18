package ASTClasses.DartClasses;

import java.util.ArrayList;
import java.util.List;

public class exp {

    public void setExp2(ASTClasses.DartClasses.exp exp2) {
        this.exp2 = exp2;
    }


    public void setBetweenBracket(ASTClasses.DartClasses.exp betweenBracket) {
        BetweenBracket = betweenBracket;
    }

    private exp BetweenBracket;
    private exp exp;
    private exp exp2;
    private String MathMaticalSign;
    private String IDENTIFIER;

    public Integer getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(Integer NUMBER) {
        this.NUMBER = NUMBER;
    }

    public Double getDOUBLE() {
        return DOUBLE;
    }

    public void setDOUBLE(Double DOUBLE) {
        this.DOUBLE = DOUBLE;
    }

    private Integer NUMBER;
    private Double DOUBLE;
    private String SingleLineString;

    public ASTClasses.DartClasses.exp getExp() {
        return exp;
    }

    public void setExp(ASTClasses.DartClasses.exp exp) {
        this.exp = exp;
    }


    public void setMathMaticalSign(String mathMaticalSign) {
        MathMaticalSign = mathMaticalSign;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getSingleLineString() {
        return SingleLineString;
    }

    public void setSingleLineString(String singleLineString) {
        SingleLineString = singleLineString;
    }
    public String print() {
        if (BetweenBracket != null) {
            return "(" + BetweenBracket.print() + ")";
        }
        else if (exp != null && exp2 != null && MathMaticalSign != null) {
            return exp.print() + MathMaticalSign + exp2.print();
        }
        else if (DOUBLE != null) {
            return DOUBLE.toString();
        }
        else if (SingleLineString != null) {
            return '\'' + SingleLineString.substring(1,SingleLineString.length() -1) + '\'';
        }
        else if (NUMBER != null) {
            return NUMBER.toString();
        }
        else if (IDENTIFIER != null) {
            return IDENTIFIER;
        }
        return "";
    }

    public String getDataForSemantic(){
        if (BetweenBracket != null) {
            return BetweenBracket.getDataForSemantic();
        }
        else if (exp != null && exp2 != null && MathMaticalSign != null) {
            return exp.getDataForSemantic() + MathMaticalSign + exp2.getDataForSemantic();
        }
        else if (DOUBLE != null) {
            return DOUBLE.toString();
        }
        else if (SingleLineString != null) {
            return '\'' + SingleLineString.substring(1,SingleLineString.length() -1) + '\'';
        }
        else if (NUMBER != null) {
            return NUMBER.toString();
        }
        else if (IDENTIFIER != null) {
            return IDENTIFIER;
        }
        return  "";
    }
}
