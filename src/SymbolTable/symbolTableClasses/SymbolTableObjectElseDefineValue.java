package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Content.IF.def_else;

public class SymbolTableObjectElseDefineValue extends SymbolTableObjectValue {


    public def_else getDef_if() {
        return def_if;
    }

    public void setDef_if(def_else def_if) {
        this.def_if = def_if;
    }

    private def_else def_if;

    public SymbolTableObjectElseDefineValue(int scope, int id, int parentId, def_else condition) {
        super(scope, id, parentId);
        this.def_if = condition;
    }


    public String openIf() {
        String res = "";
        res += "else {";
        return res;
    }

    public String closeIf() {
        return "}";
    }
}
