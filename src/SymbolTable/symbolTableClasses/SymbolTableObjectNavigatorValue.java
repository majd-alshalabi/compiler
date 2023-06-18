package SymbolTable.symbolTableClasses;

import ASTClasses.FlutterClasses.Widget.NavigationRule;

import java.util.ArrayList;
import java.util.List;

public class SymbolTableObjectNavigatorValue extends SymbolTableObjectValue {

    public NavigationRule getNavigationRule() {
        return navigationRule;
    }

    public void setNavigationRule(NavigationRule navigationRule) {
        this.navigationRule = navigationRule;
    }

    private NavigationRule navigationRule;

    public SymbolTableObjectNavigatorValue(int scope, int id, int parentId , NavigationRule routeName) {
        super(scope, id, parentId);
        this.navigationRule = routeName;
    }

    public String getRouteName() {
        StringBuilder res = new StringBuilder("window.location.href='" + navigationRule.getDef_object().getIDENTIFIER().get(0) + ".html");
        for(int i = 0 ; i < navigationRule.getDef_object().getExps().size() ; i++)
        {
            if(i == 0) res.append("?");
            else res.append("&");
            res.append(navigationRule.getDef_object().getIDENTIFIER().get(i + 1)).append(":");
            res.append(navigationRule.getDef_object().getExps().get(i).print());
        }
        res.append("';");
        return res.toString();
    }
}
