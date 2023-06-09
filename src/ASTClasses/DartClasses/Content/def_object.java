package ASTClasses.DartClasses.Content;

import ASTClasses.DartClasses.exp;
import ASTClasses.FlutterClasses.widget;

import java.util.List;

public class def_object {
    public List<String> getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(List<String> IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }


    //      DataType OP (DataType IDENTIFIER C*)* CP SC
    private List<String> IDENTIFIER;

    public List<exp> getExps() {
        return exps;
    }

    public void setExps(List<exp> exps) {
        this.exps = exps;
    }

    private List<exp> exps;
}

