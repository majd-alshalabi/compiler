package SymbolTable.symbolTableClasses;

public abstract class SymbolTableObjectValue {


    private int scope ;
    private int id ;

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    private int parentId ;

    public SymbolTableObjectValue(int scope, int id, int parentId) {
        this.scope = scope;
        this.id = id;
        this.parentId = parentId;
    }


    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
