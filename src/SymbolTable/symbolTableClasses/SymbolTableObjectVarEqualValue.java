package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Boolean.boolExp;
import ASTClasses.DartClasses.exp;

public class SymbolTableObjectVarEqualValue extends SymbolTableObjectValue {
    private exp value;

    public SymbolTableObjectVarEqualValue(int scope, int id, int parentId, exp value) {
        super(scope, id, parentId);
        this.value = value;
    }

    public exp getValue() {
        return value;
    }

    public void setValue(exp value) {
        this.value = value;
    }

    public String print(String name){
        String res =  name + " = " + value.print() + ";\n";
        return  res;
    }

}

