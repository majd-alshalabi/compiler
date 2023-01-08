package ASTClasses.DartClasses;

import java.util.ArrayList;
import java.util.List;

public class exp {
/*
* exp : exp MathMaticalSign exp # MathematicsLogic /// math between expression
    | OP exp CP # BetweenBracket /// expression in brackets
    | IDENTIFIER # Variable /// variable
    | NUMBER # Number
    |  DOUBLE #  DOUBLE
    | SingleLineString # String  /// number
    | NULL_ # Null // NULL
     ;

* */
    private exp exp ;
    private String MathMaticalSign;
    private String IDENTIFIER;
    private String NUMBER;
    private String DOUBLE;
    private String  SingleLineString;
    private String NULL_;


    public ASTClasses.DartClasses.exp getExp() {
        return exp;
    }

    public void setExp(ASTClasses.DartClasses.exp exp) {
        this.exp = exp;
    }

    public String getMathMaticalSign() {
        return MathMaticalSign;
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

    public String getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(String NUMBER) {
        this.NUMBER = NUMBER;
    }

    public String getDOUBLE() {
        return DOUBLE;
    }

    public void setDOUBLE(String DOUBLE) {
        this.DOUBLE = DOUBLE;
    }

    public String getSingleLineString() {
        return SingleLineString;
    }

    public void setSingleLineString(String singleLineString) {
        SingleLineString = singleLineString;
    }

    public String getNULL_() {
        return NULL_;
    }

    public void setNULL_(String NULL_) {
        this.NULL_ = NULL_;
    }
}
