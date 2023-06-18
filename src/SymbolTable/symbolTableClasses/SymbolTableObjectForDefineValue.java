package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.Content.For.IncrementType;
import ASTClasses.DartClasses.Content.For.def_for;

public class SymbolTableObjectForDefineValue extends SymbolTableObjectValue {
    public def_for getDef_if() {
        return def_if;
    }

    public void setDef_if(def_for def_if) {
        this.def_if = def_if;
    }

    private def_for def_if;

    public SymbolTableObjectForDefineValue(int scope, int id, int parentId, def_for condition) {
        super(scope, id, parentId);
        this.def_if = condition;
    }


    public String openIf() {
        String res = "";
        res += "for(" + "var " + def_if.getVarDefinition().getIDENTIFIER() + " = " + def_if.getVarDefinition().getExp().print() + ";" + def_if.getCondition().print() + ";";
        if(def_if.getFor_Increment().getFor_Int_Increment() != null){
            res += def_if.getFor_Increment().getFor_Int_Increment().getIDENTIFIER() + " " + (def_if.getFor_Increment().getFor_Int_Increment().getType() == IncrementType.Minus? "--" : "++");
        }else if(def_if.getFor_Increment().getFor_var_Eq() != null){
            res += def_if.getFor_Increment().getFor_var_Eq().getIDENTIFIER() + def_if.getFor_Increment().getFor_var_Eq().getEQFORNORMALMATH() + def_if.getFor_Increment().getFor_var_Eq().getExp().print();
        }
        res += "){";
        return res;
    }

    public String closeIf() {
        return "}";
    }
}
