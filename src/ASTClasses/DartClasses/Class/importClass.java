package ASTClasses.DartClasses.Class;

public class importClass {
//    importClass: IMPORT_ SingleLineString SC;
    private String IMPORT_;
    private String SingleLineString;

    public String getIMPORT_() {
        return IMPORT_;
    }

    public void setIMPORT_(String IMPORT_) {
        this.IMPORT_ = IMPORT_;
    }

    public String getSingleLineString() {
        return SingleLineString;
    }

    public void setSingleLineString(String singleLineString) {
        SingleLineString = singleLineString;
    }
}
