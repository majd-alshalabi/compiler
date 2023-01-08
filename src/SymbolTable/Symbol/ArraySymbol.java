package SymbolTable.Symbol;

import SymbolTable.Scope.Scope;

import java.util.ArrayList;
import java.util.List;

public class ArraySymbol<T> implements Symbol {

    private String name;
    private List<T> elements;
    private String type;

    public ArraySymbol() {
        elements = new ArrayList<>();
    }

    public void setElements(List<T> elements) {
        this.elements = elements;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public List<T> getElements() {
        return elements;
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
        String value = "";

        for (T element : elements) {
            value += element.toString() + " ,";
        }
        if (!value.isEmpty())
            value = value.substring(0, value.length() - 1);

//        (elements == null ? "" : ", value='" + elements + '\'') +
        return "{" +
                "name='" + name + '\'' +
                "elements='[" + value + "]" + '\'' +
                "type='" + type + '\'' +
                '}';
    }
}
