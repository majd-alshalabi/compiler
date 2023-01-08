package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.value;

import java.util.List;

public class defEnum {
//    defEnum : (ENUM_ IDENTIFIER OBC (value C*)* CBC SC )
private String ENUM_;
private String IDENTIFIER;
private List<ASTClasses.DartClasses.value> value;

    public String getENUM_() {
        return ENUM_;
    }

    public void setENUM_(String ENUM_) {
        this.ENUM_ = ENUM_;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public List<ASTClasses.DartClasses.value> getValue() {
        return value;
    }

    public void setValue(List<ASTClasses.DartClasses.value> value) {
        this.value = value;
    }
}
