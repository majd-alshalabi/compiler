package SymbolTable;

import SymbolTable.Scope.BaseScope;
import SymbolTable.Scope.Scope;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {

    private List<BaseScope> globalScopes = new ArrayList<BaseScope>();
    private List<BaseScope> localScopes = new ArrayList<BaseScope>();

    public List<BaseScope> getGlobalScopes() {
        return globalScopes;
    }

    public void setGlobalScopes(List<BaseScope> globalScopes) {
        this.globalScopes = globalScopes;
    }

    public List<BaseScope> getLocalScopes() {
        return localScopes;
    }

    public void setLocalScopes(List<BaseScope> scopeList) {
        this.localScopes = scopeList;
    }

    public void addGlobalScope(BaseScope scope) {
        this.globalScopes.add(scope);
    }

    public void addLocalScope(BaseScope scope) {
        this.localScopes.add(scope);
    }

    public List<Scope> getChildren(Scope scope) {

        return scope.getNestedScopes();
    }

    public void printTree(Scope scope, String s) {

        print(scope, s);
        System.out.println();
        System.out.print("{");
        for (Scope child : getChildren(scope)) {
            printTree(child, s + "\t");
        }
        System.out.print("}");
    }

    public void printGlobals() {
        for (int i = 0; i < globalScopes.size(); i++) {
            print(getGlobalScopes().get(i), "");
        }
    }

    public void print(Scope scope, String indent) {

        System.out.print(indent);
        System.out.printf("%10s" + "%4s" + "symbols: %2s", scope.getName(), "", scope.getSymbols());
    }

}
