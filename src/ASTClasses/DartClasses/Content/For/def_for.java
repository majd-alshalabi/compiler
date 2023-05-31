package ASTClasses.DartClasses.Content.For;

import ASTClasses.DartClasses.Content.condition;
import ASTClasses.DartClasses.Content.Content;
import ASTClasses.DartClasses.Content.varDefinition;

import java.util.List;

public class def_for {
//    def_for:FOR_ OP varDefinition  condition? SC for_Increment? CP OBC content* CBC;
    private String FOR_;
    private varDefinition varDefinition;
    private condition condition;
    private for_Increment for_Increment;
    private List<Content> content;

    public String getFOR_() {
        return FOR_;
    }

    public void setFOR_(String FOR_) {
        this.FOR_ = FOR_;
    }

    public ASTClasses.DartClasses.Content.varDefinition getVarDefinition() {
        return varDefinition;
    }

    public void setVarDefinition(ASTClasses.DartClasses.Content.varDefinition varDefinition) {
        this.varDefinition = varDefinition;
    }

    public ASTClasses.DartClasses.Content.condition getCondition() {
        return condition;
    }

    public void setCondition(ASTClasses.DartClasses.Content.condition condition) {
        this.condition = condition;
    }

    public ASTClasses.DartClasses.Content.For.for_Increment getFor_Increment() {
        return for_Increment;
    }

    public void setFor_Increment(ASTClasses.DartClasses.Content.For.for_Increment for_Increment) {
        this.for_Increment = for_Increment;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }
}
