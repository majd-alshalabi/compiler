package ASTClasses.DartClasses;

public class value {
//    value : SingleLineString |  DOUBLE | NUMBER  ;
private String SingleLineString;
private String DOUBLE;
private String NUMBER;

    public String getSingleLineString() {
        return SingleLineString;
    }

    public void setSingleLineString(String singleLineString) {
        SingleLineString = singleLineString;
    }

    public String getDOUBLE() {
        return DOUBLE;
    }

    public void setDOUBLE(String DOUBLE) {
        this.DOUBLE = DOUBLE;
    }

    public String getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(String NUMBER) {
        this.NUMBER = NUMBER;
    }
}
