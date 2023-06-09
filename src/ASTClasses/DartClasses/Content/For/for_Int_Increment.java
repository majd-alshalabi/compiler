package ASTClasses.DartClasses.Content.For;

public class for_Int_Increment {
    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public IncrementType getType() {
        return type;
    }

    public void setType(IncrementType type) {
        this.type = type;
    }

    //    for_Increment: IDENTIFIER (PLPL | MM) # for_Int_Increment
//            | IDENTIFIER ((EQFORNORMALMATH | EQ) exp | )  # for_var_Eq
//            ;
    private String IDENTIFIER;
    private IncrementType type;
}
