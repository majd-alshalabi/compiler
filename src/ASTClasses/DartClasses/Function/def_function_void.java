package ASTClasses.DartClasses.Function;

import ASTClasses.DartClasses.Content.Content;
import ASTClasses.FlutterClasses.widget;

import java.util.List;

public class def_function_void {
    private List<String> IDENTIFIER;
    private List<String> DataType ;
    private List<Content> content ;

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

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }
}

