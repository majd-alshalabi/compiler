package SymbolTable.symbolTableClasses;

public class SymbolTableObjectInkWellBodyValue extends SymbolTableObjectValue {
    private InkWellBodyType type ;
    public SymbolTableObjectInkWellBodyValue(int scope, int id, int parentId, InkWellBodyType type) {
        super(scope, id, parentId);
        this.type = type;
    }


    public InkWellBodyType getType() {
        return type;
    }

    public void setType(InkWellBodyType type) {
        this.type = type;
    }

    public String open() {
        if(type == InkWellBodyType.onPress){
            return "onclick=\"";
        }
        else return ">";
    }

    public String close() {
        if(type == InkWellBodyType.onPress){
            return "\"";
        }
        else return "";
    }
}

