package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.value;
import com.sun.jdi.Value;

import java.util.List;

public class def_case {

    public ASTClasses.DartClasses.value getValue() {
        return value;
    }

    public void setValue(ASTClasses.DartClasses.value value) {
        this.value = value;
    }

    private value value ;
    List<Content> contentList;

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }


}
