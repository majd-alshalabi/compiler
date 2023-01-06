package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.exp;

public class varEQ {
//    varEQ : IDENTIFIER ((EQFORNORMALMATH | EQ) exp | ) SC;
    private String IDENTIFIER;
    private exp exp;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public ASTClasses.DartClasses.exp getExp() {
        return exp;
    }

    public void setExp(ASTClasses.DartClasses.exp exp) {
        this.exp = exp;
    }
}
