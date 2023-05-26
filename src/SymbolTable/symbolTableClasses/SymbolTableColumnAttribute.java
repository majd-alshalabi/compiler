package SymbolTable.symbolTableClasses;

public class SymbolTableColumnAttribute {
    private String name;
    private String value;
    public SymbolTableColumnAttribute(String name, String value){
        this.name  = name;
        this.value  = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
