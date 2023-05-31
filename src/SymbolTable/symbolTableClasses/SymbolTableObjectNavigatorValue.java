package SymbolTable.symbolTableClasses;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectNavigatorValue extends SymbolTableObjectValue {
    private String routeName ;

    public SymbolTableObjectNavigatorValue(int scope, int id, int parentId , String routeName) {
        super(scope, id, parentId);
        this.routeName = routeName;
    }

//    public String openColumn(boolean isParentColumn) {
//        if (isParentColumn) return "<div style=\"display: block;\">";
//        return "<div>";
//    }
//
//    public String closeColumn() {
//        return "</div>";
//    }

    public String getRouteName() {
        return "window.location.href='" + routeName + ".html';"  ;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }
}
