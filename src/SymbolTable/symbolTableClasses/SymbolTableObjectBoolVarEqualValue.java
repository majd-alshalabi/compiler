package SymbolTable.symbolTableClasses;

public class SymbolTableObjectBoolVarEqualValue extends SymbolTableObjectValue {
    private String value;

    public SymbolTableObjectBoolVarEqualValue(int scope, int id, int parentId, String value) {
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
