package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Boolean.boolExp;
import ASTClasses.DartClasses.Boolean.boolVarEq;

public class SymbolTableObjectBoolVarEqualValue extends SymbolTableObjectValue {
    private boolVarEq value;

    public SymbolTableObjectBoolVarEqualValue(int scope, int id, int parentId, boolVarEq value) {
        super(scope, id, parentId);
        this.value = value;
    }

    public boolVarEq getValue() {
        return value;
    }

    public void setValue(boolVarEq value) {
        this.value = value;
    }

    public String print(String name){
        String res =  name + " = " + value.getBoolExp().print() + ";\n";
        return  res;
    }

}
