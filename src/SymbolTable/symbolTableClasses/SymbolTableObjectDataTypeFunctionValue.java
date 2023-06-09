package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Function.def_function_datatype;

public class SymbolTableObjectDataTypeFunctionValue extends SymbolTableObjectValue {
    public ASTClasses.DartClasses.Function.def_function_datatype def_function_datatype;

    public SymbolTableObjectDataTypeFunctionValue(int scope, int id, int parentId, def_function_datatype def_function_datatype) {
        super(scope, id, parentId);
        this.def_function_datatype = def_function_datatype;
    }
    public String openFunction() {
        StringBuilder res = new StringBuilder("function " + def_function_datatype.getIDENTIFIER().get(0) + "(");
        for (int i = 1; i < def_function_datatype.getIDENTIFIER().size(); i++) {
            res.append(def_function_datatype.getIDENTIFIER().get(i));
            if (i != def_function_datatype.getIDENTIFIER().size() - 1) res.append(",");
        }
        res.append("){");
        return res.toString();
    }

    public String closeFunction() {

        return "return " + def_function_datatype.getExp().print() + "; \n}";
    }

}
