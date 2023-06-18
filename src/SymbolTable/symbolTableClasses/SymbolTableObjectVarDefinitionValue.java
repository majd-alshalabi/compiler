package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Boolean.boolExp;
import ASTClasses.DartClasses.Content.varDefinition;
import ASTClasses.DartClasses.exp;

public class SymbolTableObjectVarDefinitionValue extends SymbolTableObjectValue {
    private varDefinition value;

    public SymbolTableObjectVarDefinitionValue(int scope, int id, int parentId, varDefinition value) {
        super(scope, id, parentId);
        this.value = value;
    }

    public varDefinition getValue() {
        return value;
    }

    public void setValue(varDefinition value) {
        this.value = value;
    }

    public String print(String name){
        String res = "var " + name + (value.getExp() != null ? (" = " +  value.getExp().print()) : "")+ ";\n";
        return  res;
    }
}


