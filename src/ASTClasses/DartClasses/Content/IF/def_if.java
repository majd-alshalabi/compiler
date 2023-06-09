package ASTClasses.DartClasses.Content.IF;

import ASTClasses.DartClasses.Content.Content;
import ASTClasses.DartClasses.Content.condition;

import java.util.List;

public class def_if {
//    def_if:IF_ OP condition CP  OBC ifContent CBC (ELSE_ IF_ OP condition CP  OBC elseIfContent CBC)* (ELSE_ OBC elseContent CBC)?;
    private condition ifCondition;
    private List<Content> contentList;

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }


    public ASTClasses.DartClasses.Content.condition getIfCondition() {
        return ifCondition;
    }

    public void setIfCondition(ASTClasses.DartClasses.Content.condition ifCondition) {
        this.ifCondition = ifCondition;
    }

}
