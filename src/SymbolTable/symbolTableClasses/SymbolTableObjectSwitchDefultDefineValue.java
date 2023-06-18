package SymbolTable.symbolTableClasses;

public class SymbolTableObjectSwitchDefultDefineValue extends SymbolTableObjectValue {

    private ASTClasses.DartClasses.Content.def_defult def_defult;

    public SymbolTableObjectSwitchDefultDefineValue(int scope, int id, int parentId, ASTClasses.DartClasses.Content.def_defult def_defult) {
        super(scope, id, parentId);
        this.def_defult = def_defult;
    }


    public String openIf() {
        String res = "";
        res += "default :\n{";
        return res;
    }

    public String closeIf() {
        return "}";
    }
}
