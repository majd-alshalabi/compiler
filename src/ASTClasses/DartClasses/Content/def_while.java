package ASTClasses.DartClasses.Content;

import java.util.List;

public class def_while {
//    def_while:WHILE_ OP condition CP OBC content* CBC;
    private String WHILE_;
    private condition condition;
    private List<Content> content;

    public String getWHILE_() {
        return WHILE_;
    }

    public void setWHILE_(String WHILE_) {
        this.WHILE_ = WHILE_;
    }

    public ASTClasses.DartClasses.Content.condition getCondition() {
        return condition;
    }

    public void setCondition(ASTClasses.DartClasses.Content.condition condition) {
        this.condition = condition;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }
}
