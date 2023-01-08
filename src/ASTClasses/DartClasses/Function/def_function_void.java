package ASTClasses.DartClasses.Function;

import ASTClasses.DartClasses.Content.content;

import java.util.ArrayList;
import java.util.List;

public class def_function_void {
//def_function_void:VOID_ IDENTIFIER OP (DataType IDENTIFIER C*)* CP OBC content* CBC;
    private String VOID_;
    private List<String> IDENTIFIER;
    private List<String> DataType ;
    private List<content> content ;

    public String getVOID_() {
        return VOID_;
    }

    public void setVOID_(String VOID_) {
        this.VOID_ = VOID_;
    }

    public List<String> getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(List<String> IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public List<String> getDataType() {
        return DataType;
    }

    public void setDataType(List<String> dataType) {
        DataType = dataType;
    }

    public List<content> getContent() {
        return content;
    }

    public void setContent(List<content> content) {
        this.content = content;
    }
}
