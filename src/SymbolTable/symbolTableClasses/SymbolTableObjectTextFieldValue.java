package SymbolTable.symbolTableClasses;

import ASTClasses.FlutterClasses.Widget.inkWell.InkWellBody;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectTextFieldValue extends SymbolTableObjectValue {
    private final List<SymbolTableColumnAttribute> value;

    public SymbolTableObjectTextFieldValue(int scope, int id, int parentId) {
        super(scope, id, parentId);
        this.value = new ArrayList<>();
    }

    public List<SymbolTableColumnAttribute> getValue() {
        return value;
    }

    public void setValue(SymbolTableColumnAttribute value) {
        this.value.add(value);
    }

    public String openTextField( boolean isParentColumn){
        if (isParentColumn)return "<input type=\"text\" style=\"display: block;\">";
        return "<input type=\"text\">";
    }
}

