package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Boolean.boolExp;

public class SymbolTableObjectBoolVarEqualValue extends SymbolTableObjectValue {
    private boolExp value;

    public SymbolTableObjectBoolVarEqualValue(int scope, int id, int parentId, boolExp value) {
        super(scope, id, parentId);
        this.value = value;
    }

    public boolExp getValue() {
        return value;
    }

    public void setValue(boolExp value) {
        this.value = value;
    }

    public String print(String name){
        String res =  name + " = " + value.print() + ";\n";
        return  res;
    }

}
