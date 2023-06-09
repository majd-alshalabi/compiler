package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Content.IF.def_else_if;
import ASTClasses.DartClasses.Content.def_while;

public class SymbolTableObjectWhileDefineValue extends SymbolTableObjectValue {

    public def_while getDef_if() {
        return def_if;
    }

    public void setDef_if(def_while def_if) {
        this.def_if = def_if;
    }

    private def_while def_if;

    public SymbolTableObjectWhileDefineValue(int scope, int id, int parentId, def_while condition) {
        super(scope, id, parentId);
        this.def_if = condition;
    }


    public String openIf() {
        String res = "";
        res += "while(" + def_if.getCondition().print() + "){";
        return res;
    }

    public String closeIf() {
        return "}";
    }
}
