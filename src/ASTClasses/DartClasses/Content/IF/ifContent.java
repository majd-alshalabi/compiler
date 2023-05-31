package ASTClasses.DartClasses.Content.IF;

import ASTClasses.DartClasses.Content.Content;

import java.util.List;

public class ifContent {
//    ifContent : content*;
    private List<Content> content;

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }
}
