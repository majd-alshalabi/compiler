package ASTClasses.DartClasses;

public class elements {
//    elements : value | IDENTIFIER;
private value value;
private String  IDENTIFIER;

    public ASTClasses.DartClasses.value getValue() {
        return value;
    }

    public void setValue(ASTClasses.DartClasses.value value) {
        this.value = value;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
}
