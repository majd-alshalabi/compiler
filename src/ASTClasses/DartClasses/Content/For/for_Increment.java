package ASTClasses.DartClasses.Content.For;

import ASTClasses.DartClasses.exp;

public class for_Increment {
//    for_Increment: IDENTIFIER (PLPL | MM) # for_Int_Increment
//            | IDENTIFIER ((EQFORNORMALMATH | EQ) exp | )  # for_var_Eq
//            ;

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
