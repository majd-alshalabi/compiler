package ASTClasses.DartClasses.Class;

import java.util.List;

public class def_class {
//    def_class:CLASS_ IDENTIFIER ( | EXTENDS_ IDENTIFIER ) ( | WITH_ (IDENTIFIER C*)*) OBC class_body*  CBC;
    private List<String> IDENTIFIER;
    private List<class_body> class_body;

    public List<String> getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(List<String> IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public List<ASTClasses.DartClasses.Class.class_body> getClass_body() {
        return class_body;
    }

    public void setClass_body(List<ASTClasses.DartClasses.Class.class_body> class_body) {
        this.class_body = class_body;
    }
}
