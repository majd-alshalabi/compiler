package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Content.IF.def_else_if;
import ASTClasses.DartClasses.Content.IF.def_if;

public class SymbolTableObjectIfDefineValue extends SymbolTableObjectValue {
    private def_if def_if;

    public SymbolTableObjectIfDefineValue(int scope, int id, int parentId, def_if condition) {
        super(scope, id, parentId);
        this.def_if = condition;
    }

    public def_if isCondition() {
        return def_if;
    }

    public void setCondition(def_if condition) {
        this.def_if = condition;
    }

    public String openIf() {
        String res = "";
        res += "if(" + def_if.getIfCondition().print() + "){";
        return res;
    }

    public String closeIf() {
        return "}";
    }
}

