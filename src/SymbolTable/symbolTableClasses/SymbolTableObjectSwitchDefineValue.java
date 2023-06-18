package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Content.def_case;
import ASTClasses.DartClasses.Content.def_switch;
import ASTClasses.DartClasses.Content.def_while;

public class SymbolTableObjectSwitchDefineValue extends SymbolTableObjectValue {

    private def_switch def_switch;

    public SymbolTableObjectSwitchDefineValue(int scope, int id, int parentId, def_switch def_switch) {
        super(scope, id, parentId);
        this.def_switch = def_switch;
    }


    public String openIf() {
        String res = "";
        res += "switch(" + def_switch.getIDENTIFIER() + "){";
        return res;
    }

    public String closeIf() {
        return "}";
    }
}
