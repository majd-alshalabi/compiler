package ASTClasses.DartClasses;

import code_generation.CodeGenerationModel;
import code_generation.DataTypeEnum;

import java.util.*;

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

    public ASTClasses.DartClasses.exp getBetweenBracket() {
        return BetweenBracket;
    }

    public ASTClasses.DartClasses.exp getExp2() {
        return exp2;
    }

    public String getMathMaticalSign() {
        return MathMaticalSign;
    }

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
        } else if (exp != null && exp2 != null && MathMaticalSign != null) {
            return exp.print() + MathMaticalSign + exp2.print();
        } else if (DOUBLE != null) {
            return DOUBLE.toString();
        } else if (SingleLineString != null) {
            return '\'' + SingleLineString.substring(1, SingleLineString.length() - 1) + '\'';
        } else if (NUMBER != null) {
            return NUMBER.toString();
        } else if (IDENTIFIER != null) {
            return IDENTIFIER;
        }
        return "";
    }

    private boolean checkIfValid(Object object, DataTypeEnum model) {
        if (object instanceof String && model != DataTypeEnum.STRING) return false;
        if (object instanceof Double && model != DataTypeEnum.Double) return false;
        if (object instanceof Integer && model != DataTypeEnum.Integer) return false;
        if (object instanceof Boolean && model != DataTypeEnum.BOOLEAN) return false;
        return true;
    }

    public Object doMath(Object exp, Object exp2, String sign, DataTypeEnum dataType) {
        if (Objects.equals(sign, "+")) {
            if (dataType == DataTypeEnum.STRING) return (String) exp + (String) exp2;
            if (dataType == DataTypeEnum.Double) return (Double) exp + (Double) exp2;
            if (dataType == DataTypeEnum.Integer) return (Integer) exp + (Integer) exp2;
            return null;
        }
        if (Objects.equals(sign, "-")) {
            if (dataType == DataTypeEnum.STRING) return null;
            if (dataType == DataTypeEnum.Double) return (Double) exp - (Double) exp2;
            if (dataType == DataTypeEnum.Integer) return (Integer) exp * (Integer) exp2;
            return null;
        }
        if (Objects.equals(sign, "*")) {
            if (dataType == DataTypeEnum.STRING) return null;
            if (dataType == DataTypeEnum.Double) return (Double) exp * (Double) exp2;
            if (dataType == DataTypeEnum.Integer) return (Integer) exp * (Integer) exp2;
            return null;
        }
        if (Objects.equals(sign, "/")) {
            if (dataType == DataTypeEnum.STRING) return null;
            if (dataType == DataTypeEnum.Double) return (Double) exp / (Double) exp2;
            if (dataType == DataTypeEnum.Integer) return (Integer) exp / (Integer) exp2;
            return null;
        }
        return null;
    }

    public Object getValue(DataTypeEnum model , HashMap<String,Object>map) {

        if (BetweenBracket != null) {
            Object res = BetweenBracket.getValue(model,map);
            if (!checkIfValid(res, model)) return null;
            return res;
        } else if (exp != null && exp2 != null && MathMaticalSign != null) {
            Object res = exp.getValue(model,map);
            Object res2 = exp2.getValue(model,map);
            if (!checkIfValid(res, model)) return null;
            if (!checkIfValid(res2, model)) return null;
            return doMath(res, res2, MathMaticalSign, model);
        } else if (DOUBLE != null) {
            return DOUBLE;
        } else if (SingleLineString != null) {
            return SingleLineString.substring(1, SingleLineString.length() - 1);
        } else if (NUMBER != null) {
            return NUMBER;
        } else if (IDENTIFIER != null) {
            if(map.containsKey(IDENTIFIER))
            {
                if(checkIfValid(map.get(IDENTIFIER),model)){
                    return map.get(IDENTIFIER);
                }
                else{
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public String getDataForSemantic() {
        if (BetweenBracket != null) {
            return BetweenBracket.getDataForSemantic();
        } else if (exp != null && exp2 != null && MathMaticalSign != null) {
            return exp.getDataForSemantic() + MathMaticalSign + exp2.getDataForSemantic();
        } else if (DOUBLE != null) {
            return DOUBLE.toString();
        } else if (SingleLineString != null) {
            return '\'' + SingleLineString.substring(1, SingleLineString.length() - 1) + '\'';
        } else if (NUMBER != null) {
            return NUMBER.toString();
        } else if (IDENTIFIER != null) {
            return IDENTIFIER;
        }
        return "";
    }
}
