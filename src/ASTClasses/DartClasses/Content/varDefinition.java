package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.exp;

public class varDefinition {
//    varDefinition: DataType IDENTIFIER (EQ exp |) SC ;
    private String DataType;
    private String IDENTIFIER;
//    private exp exp ;
    private String exp ;

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

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
}
