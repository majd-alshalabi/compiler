package SymbolTable.symbolTableClasses;

import ASTClasses.FlutterClasses.Widget.defColumn;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectColumnValue extends SymbolTableObjectValue {
    public SymbolTableObjectColumnValue(int scope, int id, int parentId, defColumn column, boolean isParentList) {
        super(scope, id, parentId);
        this.column = column;
        this.isParentList = isParentList;
    }

    public defColumn getColumn() {
        return column;
    }

    public void setColumn(defColumn column) {
        this.column = column;
    }

    private defColumn column;
    public boolean isParentList() {
        return isParentList;
    }

    public void setParentList(boolean parentList) {
        isParentList = parentList;
    }

    private boolean isParentList;



    public String openColumn(boolean isParentColumn){
        String res = "";
//        if(isParentList)res += "<li>";
        if (isParentColumn || isParentList)res += "<div style=\"display: block;\">";
        else res += "<div>";
        return  res;
    }
    public String closeColumn(){
        String res = "";
        res += "</div>";
//        if(isParentList)res += "</li>";
        return res;
    }
}



