package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Boolean.boolExp;
import ASTClasses.DartClasses.exp;

public class SymbolTableObjectVarDefinitionValue extends SymbolTableObjectValue {
    private String value;

    public SymbolTableObjectVarDefinitionValue(int scope, int id, int parentId, String value) {
        super(scope, id, parentId);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}


