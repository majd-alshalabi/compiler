package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Boolean.boolExp;

public class SymbolTableObjectBoolVarDefinitionValue extends SymbolTableObjectValue {
    private boolExp value;

    public SymbolTableObjectBoolVarDefinitionValue(int scope, int id, int parentId, boolExp value) {
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
        String res = "var " + name + " = " + value.print() + ";\n";
        return  res;
    }

}
