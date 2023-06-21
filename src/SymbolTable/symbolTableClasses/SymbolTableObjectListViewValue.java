package SymbolTable.symbolTableClasses;

import ASTClasses.FlutterClasses.Widget.ListView.listView;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectListViewValue extends SymbolTableObjectValue {
    public ASTClasses.FlutterClasses.Widget.ListView.listView getListView() {
        return listView;
    }

    public void setListView(ASTClasses.FlutterClasses.Widget.ListView.listView listView) {
        this.listView = listView;
    }

    private ASTClasses.FlutterClasses.Widget.ListView.listView listView;


    public boolean isParentList() {
        return isParentList;
    }

    public void setParentList(boolean parentList) {
        isParentList = parentList;
    }

    public SymbolTableObjectListViewValue(int scope, int id, int parentId, ASTClasses.FlutterClasses.Widget.ListView.listView listView, boolean isParentList) {
        super(scope, id, parentId);
        this.listView = listView;
        this.isParentList = isParentList;
    }

    private boolean isParentList;


    public String openColumn(boolean isParentColumn){
        String res = "";
//        if(isParentList)res += "<li>";
        if (isParentColumn || isParentList)res += "<div style=\"display: block;\"><div style=\"overflow-y: scroll; height:200px;\">\n";
        else res += "<div><div style=\"overflow-y: scroll; height:400px;\">\n" ;
        return  res;
    }
    public String closeColumn(){
        String res = "";
        res += " </ul> </div> </div>";
//        if(isParentList) res += "</li>";
        return res ;
    }
}



