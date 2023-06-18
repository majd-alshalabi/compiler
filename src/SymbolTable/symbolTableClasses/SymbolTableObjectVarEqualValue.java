package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Boolean.boolExp;
import ASTClasses.DartClasses.Content.varEQ;
import ASTClasses.DartClasses.exp;

public class SymbolTableObjectVarEqualValue extends SymbolTableObjectValue {
    private varEQ value;

    public SymbolTableObjectVarEqualValue(int scope, int id, int parentId, varEQ value) {
        super(scope, id, parentId);
        this.value = value;
    }

    public varEQ getValue() {
        return value;
    }

    public void setValue(varEQ value) {
        this.value = value;
    }

    public String print(String name){
        String res =  name + " = " + value.getExp().print() + ";\n";
        return  res;
    }

}

