package ASTClasses.DartClasses.Content;

public class assignOneElement {
//    assignOneElement : IDENTIFIER OB value CB EQ value SC;
private String IDENTIFIER;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public ASTClasses.DartClasses.value getValue() {
        return value;
    }

    public void setValue(ASTClasses.DartClasses.value value) {
        this.value = value;
    }

    private ASTClasses.DartClasses.value value;
}
