package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.value;

public class defMap {

// : (VAR_ IDENTIFIER EQ OBC (value CO value C*)* CBC SC)
//            | (VAR_ IDENTIFIER EQ MAP_ LT DataType C DataType GT OB CB)
//    ;
    private  String VAR_;
    private String IDENTIFIER;
    private ASTClasses.DartClasses.value value;
    private String MAP_;
    private String DataType;

    public String getVAR_() {
        return VAR_;
    }

    public void setVAR_(String VAR_) {
        this.VAR_ = VAR_;
    }

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

    public String getMAP_() {
        return MAP_;
    }

    public void setMAP_(String MAP_) {
        this.MAP_ = MAP_;
    }

    public String getDataType() {
        return DataType;
    }

    public void setDataType(String dataType) {
        DataType = dataType;
    }
}
