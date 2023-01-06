package ASTClasses.DartClasses.Content.IF;

import ASTClasses.DartClasses.Content.condition;

public class def_if {
//    def_if:IF_ OP condition CP  OBC ifContent CBC (ELSE_ IF_ OP condition CP  OBC elseIfContent CBC)* (ELSE_ OBC elseContent CBC)?;
    private String IF_;
    private condition condition;
    private ifContent ifContent;
    private String ELSE_;
    private elseIfContent elseIfContent;

    public String getIF_() {
        return IF_;
    }

    public void setIF_(String IF_) {
        this.IF_ = IF_;
    }

    public ASTClasses.DartClasses.Content.condition getCondition() {
        return condition;
    }

    public void setCondition(ASTClasses.DartClasses.Content.condition condition) {
        this.condition = condition;
    }

    public ASTClasses.DartClasses.Content.IF.ifContent getIfContent() {
        return ifContent;
    }

    public void setIfContent(ASTClasses.DartClasses.Content.IF.ifContent ifContent) {
        this.ifContent = ifContent;
    }

    public String getELSE_() {
        return ELSE_;
    }

    public void setELSE_(String ELSE_) {
        this.ELSE_ = ELSE_;
    }

    public ASTClasses.DartClasses.Content.IF.elseIfContent getElseIfContent() {
        return elseIfContent;
    }

    public void setElseIfContent(ASTClasses.DartClasses.Content.IF.elseIfContent elseIfContent) {
        this.elseIfContent = elseIfContent;
    }
}
