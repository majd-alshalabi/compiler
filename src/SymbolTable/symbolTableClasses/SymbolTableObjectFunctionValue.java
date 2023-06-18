package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Function.def_function_datatype;
import ASTClasses.DartClasses.Function.def_function_void;

public class SymbolTableObjectFunctionValue extends SymbolTableObjectValue {
    public def_function_void def_void_function;

    public SymbolTableObjectFunctionValue(int scope, int id, int parentId, def_function_void def_void_function) {
        super(scope, id, parentId);
        this.def_void_function = def_void_function;
    }

    public String openFunction() {
        StringBuilder res = new StringBuilder("function " + def_void_function.getIDENTIFIER().get(0) + "(");
        for (int i = 1; i < def_void_function.getIDENTIFIER().size(); i++) {
            res.append(def_void_function.getIDENTIFIER().get(i));
            if (i != def_void_function.getIDENTIFIER().size() - 1) res.append(",");
        }
        res.append("){");
        return res.toString();
    }

    public String closeFunction() {
        return "}";
    }

}

