package ASTClasses;

import ASTClasses.DartClasses.Class.def_class;
import ASTClasses.DartClasses.Class.importClass;
import ASTClasses.DartClasses.Function.def_function_datatype;
import ASTClasses.DartClasses.Function.def_function_void;

import java.util.List;

public class program {
    //    program : importClass* ( def_class | (def_function_void | def_function_datatype)*) ;
    private List<def_class> def_class;

    public List<ASTClasses.DartClasses.Class.def_class> getDef_class() {
        return def_class;
    }

    public void setDef_class(List<ASTClasses.DartClasses.Class.def_class> def_class) {
        this.def_class = def_class;
    }

}
