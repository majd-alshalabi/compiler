package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.Boolean.boolExp;
import ASTClasses.DartClasses.exp;

public class condition {

    public ASTClasses.DartClasses.Content.condition getCondition2() {
        return condition2;
    }

    public void setCondition2(ASTClasses.DartClasses.Content.condition condition2) {
        this.condition2 = condition2;
    }

    public String getComparisonSign() {
        return ComparisonSign;
    }

    public void setComparisonSign(String comparisonSign) {
        ComparisonSign = comparisonSign;
    }
    private condition condition;
    private condition condition2;
    private String ComparisonSign;
    private exp exp;
    private exp exp2;
    private String ComparisonNormalVarSign;
    private boolExp boolExp;

    public String getComparisonNormalVarSign() {
        return ComparisonNormalVarSign;
    }

    public void setComparisonNormalVarSign(String comparisonNormalVarSign) {
        ComparisonNormalVarSign = comparisonNormalVarSign;
    }

    public ASTClasses.DartClasses.exp getExp2() {
        return exp2;
    }

    public void setExp2(ASTClasses.DartClasses.exp exp2) {
        this.exp2 = exp2;
    }



    public ASTClasses.DartClasses.Content.condition getCondition() {
        return condition;
    }

    public void setCondition(ASTClasses.DartClasses.Content.condition condition) {
        this.condition = condition;
    }

    public ASTClasses.DartClasses.exp getExp() {
        return exp;
    }

    public void setExp(ASTClasses.DartClasses.exp exp) {
        this.exp = exp;
    }

    public ASTClasses.DartClasses.Boolean.boolExp getBoolExp() {
        return boolExp;
    }

    public void setBoolExp(ASTClasses.DartClasses.Boolean.boolExp boolExp) {
        this.boolExp = boolExp;
    }

    public String print() {
        if (condition != null && condition2 != null && ComparisonSign != null) {
            return condition.print() + " " + ComparisonSign + " " + condition2.print();
        }
        else if (exp != null && exp2 != null && ComparisonNormalVarSign != null) {
            return exp.print() + " " + ComparisonNormalVarSign + " " + exp2.print();
        }
        else if (boolExp != null) {
            return boolExp.print();
        }
        return "";
    }
}
