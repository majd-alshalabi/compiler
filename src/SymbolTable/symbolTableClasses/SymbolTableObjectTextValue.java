package SymbolTable.symbolTableClasses;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectTextValue extends SymbolTableObjectValue {
    private String value;

    public SymbolTableObjectTextValue(int scope, int id, int parentId, String res) {
        super(scope, id, parentId);
        this.value = res;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String openText(boolean isParentColumn){
        String sub = this.getValue().substring(1,this.getValue().length() - 2);
        if (isParentColumn)return "<Text style=\"display: block;\">" + sub;
        return "<Text>" + sub;
    }
    public String closeText(){
        return "</Text>";
    }
}


