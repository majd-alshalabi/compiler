package ASTClasses.DartClasses.Content.For;

import ASTClasses.DartClasses.exp;

public class for_Increment {
//    for_Increment: IDENTIFIER (PLPL | MM) # for_Int_Increment
//            | IDENTIFIER ((EQFORNORMALMATH | EQ) exp | )  # for_var_Eq
//            ;

    private for_var_Eq for_var_Eq;
    private for_Int_Increment for_Int_Increment;

    public ASTClasses.DartClasses.Content.For.for_var_Eq getFor_var_Eq() {
        return for_var_Eq;
    }

    public void setFor_var_Eq(ASTClasses.DartClasses.Content.For.for_var_Eq for_var_Eq) {
        this.for_var_Eq = for_var_Eq;
    }

    public ASTClasses.DartClasses.Content.For.for_Int_Increment getFor_Int_Increment() {
        return for_Int_Increment;
    }

    public void setFor_Int_Increment(ASTClasses.DartClasses.Content.For.for_Int_Increment for_Int_Increment) {
        this.for_Int_Increment = for_Int_Increment;
    }
}
