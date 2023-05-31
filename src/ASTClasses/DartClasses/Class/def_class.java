package ASTClasses.DartClasses.Class;

import java.util.List;

public class def_class {
//    def_class:CLASS_ IDENTIFIER ( | EXTENDS_ IDENTIFIER ) ( | WITH_ (IDENTIFIER C*)*) OBC class_body*  CBC;
    private String CLASS_;
    private List<String> IDENTIFIER;
    private String EXTENDS_;
    private String WITH_;
    private List<class_body> class_body;


    public String getCLASS_() {
        return CLASS_;
    }

    public void setCLASS_(String CLASS_) {
        this.CLASS_ = CLASS_;
    }

    public List<String> getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(List<String> IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public String getEXTENDS_() {
        return EXTENDS_;
    }

    public void setEXTENDS_(String EXTENDS_) {
        this.EXTENDS_ = EXTENDS_;
    }

    public String getWITH_() {
        return WITH_;
    }

    public void setWITH_(String WITH_) {
        this.WITH_ = WITH_;
    }

    public List<ASTClasses.DartClasses.Class.class_body> getClass_body() {
        return class_body;
    }

    public void setClass_body(List<ASTClasses.DartClasses.Class.class_body> class_body) {
        this.class_body = class_body;
    }
}
