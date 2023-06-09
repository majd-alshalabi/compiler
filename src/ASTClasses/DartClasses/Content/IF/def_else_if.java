package ASTClasses.DartClasses.Content.IF;

import ASTClasses.DartClasses.Content.Content;
import ASTClasses.DartClasses.Content.condition;

import java.util.List;

public class def_else_if {
    public condition getElseIFCondition() {
        return elseIFCondition;
    }

    public void setElseIFCondition(condition elseIFCondition) {
        this.elseIFCondition = elseIFCondition;
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    //    def_if:IF_ OP condition CP  OBC ifContent CBC (ELSE_ IF_ OP condition CP  OBC elseIfContent CBC)* (ELSE_ OBC elseContent CBC)?;
    private condition elseIFCondition;

    private List<Content> contentList;


}
