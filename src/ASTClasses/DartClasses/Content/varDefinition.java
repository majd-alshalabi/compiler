package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.exp;
import code_generation.DataTypeEnum;

import java.beans.Expression;
import java.util.Objects;

public class varDefinition {
//    varDefinition: DataType IDENTIFIER (EQ exp |) SC ;
    private String DataType;
    private String IDENTIFIER;
//    private exp exp ;
    private exp exp ;

    public String getDataType() {
        return DataType;
    }
    public DataTypeEnum getDataTypeAsEnum(){
        if(Objects.equals(DataType, "int"))return DataTypeEnum.Integer;
        if(Objects.equals(DataType, "String"))return DataTypeEnum.STRING;
        if(Objects.equals(DataType, "double"))return DataTypeEnum.Double;
        return DataTypeEnum.Double;
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
