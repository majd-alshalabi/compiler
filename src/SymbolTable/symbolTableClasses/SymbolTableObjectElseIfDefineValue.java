package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Content.For.def_for;
import ASTClasses.DartClasses.Content.IF.def_else;
import ASTClasses.DartClasses.Content.IF.def_else_if;

public class SymbolTableObjectElseIfDefineValue extends SymbolTableObjectValue {
    public def_else_if getDef_if() {
        return def_if;
    }

    public void setDef_if(def_else_if def_if) {
        this.def_if = def_if;
    }

    private def_else_if def_if;

    public SymbolTableObjectElseIfDefineValue(int scope, int id, int parentId, def_else_if condition) {
        super(scope, id, parentId);
        this.def_if = condition;
    }


    public String openIf() {
        String res = "";
        res += "else if(" + def_if.getElseIFCondition().print() + "){";
        return res;
    }

    public String closeIf() {
        return "}";
    }
}

