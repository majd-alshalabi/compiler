package ASTClasses.DartClasses.Function;

import ASTClasses.DartClasses.Content.content;

import java.util.List;

public class def_function_datatype {
//    def_function_datatype:DataType IDENTIFIER OP (DataType IDENTIFIER C*)* CP OBC content* RETURN_ exp SC CBC;
    private List<String> DataType;
    private List<String> IDENTIFIER;
    private List<content> content;
    private String RETURN_;
    private ASTClasses.DartClasses.exp exp;

    public List<String> getDataType() {
        return DataType;
    }

    public void setDataType(List<String> dataType) {
        DataType = dataType;
    }

    public List<String> getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(List<String> IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public List<ASTClasses.DartClasses.Content.content> getContent() {
        return content;
    }

    public void setContent(List<ASTClasses.DartClasses.Content.content> content) {
        this.content = content;
    }

    public String getRETURN_() {
        return RETURN_;
    }

    public void setRETURN_(String RETURN_) {
        this.RETURN_ = RETURN_;
    }

    public ASTClasses.DartClasses.exp getExp() {
        return exp;
    }

    public void setExp(ASTClasses.DartClasses.exp exp) {
        this.exp = exp;
    }
}
