package ASTClasses.DartClasses.Content;

public class varDefinition {
//    varDefinition: DataType IDENTIFIER (EQ exp |) SC ;
    private String DataType;
    private String IDENTIFIER;
    private ASTClasses.DartClasses.exp exp ;

    public String getDataType() {
        return DataType;
    }

    public void setDataType(String dataType) {
        DataType = dataType;
    }

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
