package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.exp;

import java.beans.Expression;

public class varDefinition {
//    varDefinition: DataType IDENTIFIER (EQ exp |) SC ;
    private String DataType;
    private String IDENTIFIER;
//    private exp exp ;
    private exp exp ;

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

    public exp getExp() {
        return exp;
    }

    public void setExp(exp exp) {
        this.exp = exp;
    }
}
