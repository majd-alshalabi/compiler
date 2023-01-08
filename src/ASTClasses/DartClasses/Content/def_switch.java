package ASTClasses.DartClasses.Content;

public class def_switch {
//    def_switch:
//    SWITCH_ OP IDENTIFIER CP OBC (CASE_ (SingleLineString |  DOUBLE | NUMBER) CO switch_body BREAK_ SC)*  (DEFAULT_ CO switch_body)* CBC;
    private String SWITCH_;
    private String IDENTIFIER;
    private String CASE_;

    public String getSWITCH_() {
        return SWITCH_;
    }

    public void setSWITCH_(String SWITCH_) {
        this.SWITCH_ = SWITCH_;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getCASE_() {
        return CASE_;
    }

    public void setCASE_(String CASE_) {
        this.CASE_ = CASE_;
    }
}
