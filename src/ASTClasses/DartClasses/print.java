package ASTClasses.DartClasses;

import java.util.List;

public class print {
//    print: PRINT OP (elements C*)* CP SC;
    private String PRINT;
    private List<elements> elements;

    public List<elements> getElements() {
        return elements;
    }

    public void setElements(List<elements> elements) {
        this.elements = elements;
    }

    public String getPRINT() {
        return PRINT;
    }

    public void setPRINT(String PRINT) {
        this.PRINT = PRINT;
    }
}
