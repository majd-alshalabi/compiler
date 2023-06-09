package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.Content.For.IncrementType;

public class intIncrease {
    //intIncrease: IDENTIFIER (PLPL | MM)  SC ;
    private String IDENTIFIER;

    public IncrementType getType() {
        return type;
    }

    public void setType(IncrementType type) {
        this.type = type;
    }

    private IncrementType type;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

}
