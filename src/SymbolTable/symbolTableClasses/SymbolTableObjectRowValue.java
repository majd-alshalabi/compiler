package SymbolTable.symbolTableClasses;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectRowValue extends SymbolTableObjectValue {
    private List<SymbolTableColumnAttribute> value;

    public SymbolTableObjectRowValue(int scope, int id, int parentId) {
        super(scope, id, parentId);
        this.value = new ArrayList();
    }

    public List<SymbolTableColumnAttribute> getValue() {
        return value;
    }

    public void setValue(SymbolTableColumnAttribute value) {
        this.value.add(value);
    }
    public String openRow(boolean isParentColumn){
        if (isParentColumn)return "<div style=\"display: block; display: flex; \">";
        return "<div style=\"display: flex;\">";
    }
    public String closeRow(){
        return "</div>";
    }
}
