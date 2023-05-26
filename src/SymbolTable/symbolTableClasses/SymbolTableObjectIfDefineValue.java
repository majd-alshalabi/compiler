package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Boolean.boolExp;

public class SymbolTableObjectIfDefineValue extends SymbolTableObjectValue {
    private boolExp condition;

    public SymbolTableObjectIfDefineValue(int scope, int id, int parentId, boolExp condition) {
        super(scope, id, parentId);
        this.condition = condition;
    }

    public boolExp  isCondition() {
        return condition;
    }

    public void setCondition(boolExp condition) {
        this.condition = condition;
    }
}
