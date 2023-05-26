package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.exp;

public class varEQ {
//    varEQ : IDENTIFIER ((EQFORNORMALMATH | EQ) exp | ) SC;
    private String IDENTIFIER;
    private String exp;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
}
