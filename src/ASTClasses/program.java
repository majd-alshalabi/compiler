package ASTClasses;

import ASTClasses.DartClasses.Class.def_class;
import ASTClasses.DartClasses.Class.importClass;
import ASTClasses.DartClasses.Function.def_function_datatype;
import ASTClasses.DartClasses.Function.def_function_void;

import java.util.List;

public class program {
    //    program : importClass* ( def_class | (def_function_void | def_function_datatype)*) ;
    private List<importClass> importClass;
    private def_class def_class;
    private List<def_function_void> def_function_void;
    private List<def_function_datatype> def_function_datatype;

    public List<ASTClasses.DartClasses.Class.importClass> getImportClass() {
        return importClass;
    }

    public void setImportClass(List<ASTClasses.DartClasses.Class.importClass> importClass) {
        this.importClass = importClass;
    }

    public ASTClasses.DartClasses.Class.def_class getDef_class() {
        return def_class;
    }

    public void setDef_class(ASTClasses.DartClasses.Class.def_class def_class) {
        this.def_class = def_class;
    }

    public List<def_function_void> getDef_function_void() {
        return def_function_void;
    }

    public void setDef_function_void(List<def_function_void> def_function_void) {
        this.def_function_void = def_function_void;
    }

    public List<ASTClasses.DartClasses.Function.def_function_datatype> getDef_function_datatype() {
        return def_function_datatype;
    }

    public void setDef_function_datatype(List<ASTClasses.DartClasses.Function.def_function_datatype> def_function_datatype) {
        this.def_function_datatype = def_function_datatype;
    }
}
