package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Content.def_case;
import ASTClasses.DartClasses.Content.def_defult;

public class SymbolTableObjectSwitchCaseDefineValue extends SymbolTableObjectValue {

    private ASTClasses.DartClasses.Content.def_case def_case;

    public SymbolTableObjectSwitchCaseDefineValue(int scope, int id, int parentId, def_case def_case) {
        super(scope, id, parentId);
        this.def_case = def_case;
    }


    public String openIf() {
        String res = "";
        res += "case " + def_case.getValue().print() + ":\n{";
        return res;
    }

    public String closeIf() {
        return "}";
    }
}
