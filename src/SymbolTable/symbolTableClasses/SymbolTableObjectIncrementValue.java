package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Boolean.boolExp;
import ASTClasses.DartClasses.Content.intIncrease;

public class SymbolTableObjectIncrementValue extends SymbolTableObjectValue {
    public ASTClasses.DartClasses.Content.intIncrease getIntIncrease() {
        return intIncrease;
    }

    public void setIntIncrease(ASTClasses.DartClasses.Content.intIncrease intIncrease) {
        this.intIncrease = intIncrease;
    }

    private intIncrease intIncrease;

    public SymbolTableObjectIncrementValue(int scope, int id, int parentId, intIncrease value) {
        super(scope, id, parentId);
        this.intIncrease = value;
    }


    public String print() {
        return intIncrease.getIDENTIFIER() + " " + intIncrease.getType().toString() + " ;";
    }

}
