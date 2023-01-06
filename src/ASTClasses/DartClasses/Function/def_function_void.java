package ASTClasses.DartClasses.Function;

import ASTClasses.DartClasses.Content.content;

import java.util.List;

public class def_function_void {
//def_function_void:VOID_ IDENTIFIER OP (DataType IDENTIFIER C*)* CP OBC content* CBC;
    private String VOID_;
    private String IDENTIFIER;
    private String DataType;
    private List<content> content;

    public String getVOID_() {
        return VOID_;
    }

    public void setVOID_(String VOID_) {
        this.VOID_ = VOID_;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getDataType() {
        return DataType;
    }

    public void setDataType(String dataType) {
        DataType = dataType;
    }

    public List<ASTClasses.DartClasses.Content.content> getContent() {
        return content;
    }

    public void setContent(List<ASTClasses.DartClasses.Content.content> content) {
        this.content = content;
    }
}
