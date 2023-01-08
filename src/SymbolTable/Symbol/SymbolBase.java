package SymbolTable.Symbol;

import SymbolTable.Scope.Scope;

public class SymbolBase implements Symbol{

    private String name;
    private String value;
    private String type;

    public void setValue(String value) {
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public Scope getScope() {

        return null;
    }

    @Override
    public void setScope(Scope scope) {

    }

    @Override
    public int getInsertionOrderNumber() {

        return 0;
    }

    @Override
    public void setInsertionOrderNumber(int i) {


    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                (value == null ? "" : ", value='" + value + '\'') +
                "type='" + type + '\'' +
                '}';
    }
}
