package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Boolean.boolExp;

public class SymbolTableObjectBoolVarDefinitionValue extends SymbolTableObjectValue {
    private String value;

    public SymbolTableObjectBoolVarDefinitionValue(int scope, int id, int parentId, String value) {
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
