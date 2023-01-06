package ASTClasses.DartClasses.Content.IF;

import ASTClasses.DartClasses.Content.content;

import java.util.List;

public class elseIfContent {
//    elseIfContent : content*;
    private List<content> content;

    public List<ASTClasses.DartClasses.Content.content> getContent() {
        return content;
    }

    public void setContent(List<ASTClasses.DartClasses.Content.content> content) {
        this.content = content;
    }
}
