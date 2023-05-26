package SymbolTable.symbolTableClasses;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectColumnValue extends SymbolTableObjectValue {
    private List<SymbolTableColumnAttribute> value;

    public SymbolTableObjectColumnValue(int scope, int id, int parentId) {
        super(scope, id, parentId);
        this.value = new ArrayList<>();
    }

    public List<SymbolTableColumnAttribute> getValue() {
        return value;
    }

    public void setValue(SymbolTableColumnAttribute value) {
        this.value.add(value);
    }

    public String openColumn(boolean isParentColumn){
        if (isParentColumn)return "<div style=\"display: block;\">";
        return "<div>";
    }
    public String closeColumn(){
        return "</div>";
    }
}



