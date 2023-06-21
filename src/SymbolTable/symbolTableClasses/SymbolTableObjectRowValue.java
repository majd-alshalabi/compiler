package SymbolTable.symbolTableClasses;

import ASTClasses.FlutterClasses.Widget.defRow;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectRowValue extends SymbolTableObjectValue {
    private defRow row;

    public SymbolTableObjectRowValue(int scope, int id, int parentId, defRow row, boolean isParentList) {
        super(scope, id, parentId);
        this.row = row;
        this.isParentList = isParentList;
    }

    public defRow getRow() {
        return row;
    }

    public void setRow(defRow row) {
        this.row = row;
    }

    public boolean isParentList() {
        return isParentList;
    }

    public void setParentList(boolean parentList) {
        isParentList = parentList;
    }

    private boolean isParentList;

    public String openRow(boolean isParentColumn){
         String res = "";
//         if(isParentList)res += "<li>";
        if (isParentColumn || isParentList)res += "<div style=\"display: block; display: flex; \">";
        else res += "<div style=\"display: flex;\">";
        return res;
    }
    public String closeRow(){
        String res = "";
        res += "</div>";
//        if(isParentList)res += "</li>";
        return res;
    }
}
