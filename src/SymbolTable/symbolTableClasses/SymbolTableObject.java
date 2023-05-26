package SymbolTable.symbolTableClasses;

public class SymbolTableObject {
    private SymbolTableRowType type;
    private String name;
    private SymbolTableObjectValue value;

    public SymbolTableObject(SymbolTableRowType type, String name, SymbolTableObjectValue value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public SymbolTableObjectValue getValue() {
        return value;
    }

    public void setValue(SymbolTableObjectValue value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SymbolTableRowType getType() {
        return type;
    }

    public void setType(SymbolTableRowType type) {
        this.type = type;
    }
}

