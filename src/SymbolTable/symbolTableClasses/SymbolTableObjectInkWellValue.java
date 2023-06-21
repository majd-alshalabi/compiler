package SymbolTable.symbolTableClasses;

import ASTClasses.FlutterClasses.Widget.inkWell.InkWell;
import ASTClasses.FlutterClasses.Widget.inkWell.InkWellBody;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectInkWellValue extends SymbolTableObjectValue {
    public InkWell getInkWell() {
        return inkWell;
    }

    public void setInkWell(InkWell inkWell) {
        this.inkWell = inkWell;
    }

    public boolean isParentList() {
        return isParentList;
    }

    public void setParentList(boolean parentList) {
        isParentList = parentList;
    }

    private InkWell inkWell;

    public SymbolTableObjectInkWellValue(int scope, int id, int parentId, InkWell inkWell, boolean isParentList) {
        super(scope, id, parentId);
        this.inkWell = inkWell;
        this.isParentList = isParentList;
    }

    private boolean isParentList;


    public String openButton(boolean isParentColumn) {
        String res = "";
        if(isParentList)
            res += "<div style=\"display: block;\"><button type=\"button\" class=\"btn btn-outline-success\" ";
        else
        res += "<div><button type=\"button\" class=\"btn btn-outline-success\" ";
        return  res ;
    }

    public String closeButton() {
        String res = "";
        res += "</button></div>";
//        if(isParentList)res += "</li>";
        return res;
    }
}

