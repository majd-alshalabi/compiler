package SymbolTable.symbolTableClasses;

public class SymbolTableObjectVarEqualValue extends SymbolTableObjectValue {
    private String value;

    public SymbolTableObjectVarEqualValue(int scope, int id, int parentId, String value) {
        super(scope, id, parentId);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

