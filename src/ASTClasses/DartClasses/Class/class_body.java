package ASTClasses.DartClasses.Class;

import ASTClasses.DartClasses.Boolean.boolVarDefnition;
import ASTClasses.DartClasses.Content.varDefinition;
import ASTClasses.DartClasses.Function.def_function_datatype;
import ASTClasses.DartClasses.Function.def_function_void;

public class class_body {
//    class_body:varDefinition
//         |boolVarDefnition
//         |def_function_datatype
//         |def_function_void
//         ;
    private varDefinition varDefinition;
    private boolVarDefnition boolVarDefnition;
    private def_function_datatype def_function_datatype;
    private def_function_void def_function_void;

    public ASTClasses.DartClasses.Content.varDefinition getVarDefinition() {
        return varDefinition;
    }

    public void setVarDefinition(ASTClasses.DartClasses.Content.varDefinition varDefinition) {
        this.varDefinition = varDefinition;
    }

    public ASTClasses.DartClasses.Boolean.boolVarDefnition getBoolVarDefnition() {
        return boolVarDefnition;
    }

    public void setBoolVarDefnition(ASTClasses.DartClasses.Boolean.boolVarDefnition boolVarDefnition) {
        this.boolVarDefnition = boolVarDefnition;
    }

    public ASTClasses.DartClasses.Function.def_function_datatype getDef_function_datatype() {
        return def_function_datatype;
    }

    public void setDef_function_datatype(ASTClasses.DartClasses.Function.def_function_datatype def_function_datatype) {
        this.def_function_datatype = def_function_datatype;
    }

    public ASTClasses.DartClasses.Function.def_function_void getDef_function_void() {
        return def_function_void;
    }

    public void setDef_function_void(ASTClasses.DartClasses.Function.def_function_void def_function_void) {
        this.def_function_void = def_function_void;
    }
}
