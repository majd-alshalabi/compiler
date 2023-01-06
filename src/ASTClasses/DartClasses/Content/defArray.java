package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.value;

import java.util.List;

public class defArray {
//    defArray:
//    DataType IDENTIFIER OB NUMBER CB EQ NEW_ DataType OB NUMBER* CB
//    |DataType IDENTIFIER OB NUMBER CB EQ OBC (value C*)* CBC
//    |DataType IDENTIFIER OB  NUMBER CB EQ OB (value C*)* CB
//    ;
    private String DataType;
    private String IDENTIFIER;
    private String NUMBER;
    private String NEW_;
    private List<String> NUMBERS;
    private List<value> value;

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

    public String getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(String NUMBER) {
        this.NUMBER = NUMBER;
    }

    public String getNEW_() {
        return NEW_;
    }

    public void setNEW_(String NEW_) {
        this.NEW_ = NEW_;
    }

    public List<String> getNUMBERS() {
        return NUMBERS;
    }

    public void setNUMBERS(List<String> NUMBERS) {
        this.NUMBERS = NUMBERS;
    }

    public List<ASTClasses.DartClasses.value> getValue() {
        return value;
    }

    public void setValue(List<ASTClasses.DartClasses.value> value) {
        this.value = value;
    }
}
