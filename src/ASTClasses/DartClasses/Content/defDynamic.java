package ASTClasses.DartClasses.Content;

public class defDynamic {
//    defDynamic : DYNAMIC_ IDENTIFIER (EQ exp |) SC;

    private String DYNAMIC_;
    private String IDENTIFIER;
    private ASTClasses.DartClasses.exp exp;

    public String getDYNAMIC_() {
        return DYNAMIC_;
    }

    public void setDYNAMIC_(String DYNAMIC_) {
        this.DYNAMIC_ = DYNAMIC_;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public ASTClasses.DartClasses.exp getExp() {
        return exp;
    }

    public void setExp(ASTClasses.DartClasses.exp exp) {
        this.exp = exp;
    }
}
