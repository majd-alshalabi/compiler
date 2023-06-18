package ASTClasses.DartClasses.Content;

import java.util.List;

public class def_switch {
//    def_switch:
//    SWITCH_ OP IDENTIFIER CP OBC (CASE_ (SingleLineString | DOUBLE | NUMBER) CO switch_body BREAK_ SC)*  (DEFAULT_ CO switch_body)* CBC;
    private String IDENTIFIER;

    List<def_case> def_caseList ;

    public List<def_case> getDef_caseList() {
        return def_caseList;
    }

    public void setDef_caseList(List<def_case> def_caseList) {
        this.def_caseList = def_caseList;
    }

    public ASTClasses.DartClasses.Content.def_defult getDef_defult() {
        return def_defult;
    }

    public void setDef_defult(ASTClasses.DartClasses.Content.def_defult def_defult) {
        this.def_defult = def_defult;
    }

    def_defult def_defult;

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }
}
