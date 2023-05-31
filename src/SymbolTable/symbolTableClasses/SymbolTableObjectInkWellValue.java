package SymbolTable.symbolTableClasses;

import ASTClasses.FlutterClasses.Widget.inkWell.InkWellBody;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectInkWellValue extends SymbolTableObjectValue {
    private List<SymbolTableObjectInkWellBodyValue> inkWellBodies;

    public SymbolTableObjectInkWellValue(int scope, int id, int parentId) {
        super(scope, id, parentId);
        inkWellBodies = new ArrayList<>();
    }

    public List<SymbolTableObjectInkWellBodyValue> getInkWellBodies() {
        return inkWellBodies;
    }

    public void setInkWellBodies(List<SymbolTableObjectInkWellBodyValue> inkWellBodies) {
        this.inkWellBodies = inkWellBodies;
    }

    public void addToList(SymbolTableObjectInkWellBodyValue inkWellBodies) {
        this.inkWellBodies.add(inkWellBodies);
    }

    public String openButton(boolean isParentColumn) {
        if (isParentColumn)return "<button type=\"button\" class=\"btn btn-outline-success\" ";
        return "<input type=\"text\">";
    }

    public String closeButton() {
        return "</button>";
    }
}

