package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.Boolean.boolExp;
import ASTClasses.DartClasses.exp;

public class condition {
    private condition condition;
    private exp exp;
    private boolExp boolExp;

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
}
