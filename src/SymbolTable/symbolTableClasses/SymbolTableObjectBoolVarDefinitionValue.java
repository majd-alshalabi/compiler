package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Boolean.boolExp;
import ASTClasses.DartClasses.Boolean.boolVarDefnition;

public class SymbolTableObjectBoolVarDefinitionValue extends SymbolTableObjectValue {
    private boolVarDefnition value;

    public SymbolTableObjectBoolVarDefinitionValue(int scope, int id, int parentId, boolVarDefnition value) {
        super(scope, id, parentId);
        this.value = value;
    }

    public boolVarDefnition getValue() {
        return value;
    }

    public void setValue(boolVarDefnition value) {
        this.value = value;
    }

    public String print(String name){
        String res = "var " + name + (value.getBoolExp() != null ?( " = " +  value.getBoolExp().print()) : "") + ";\n";
        return  res;
    }

}
