package SymbolTable.symbolTableClasses;

import ASTClasses.DartClasses.GetDataAst;
import ASTClasses.FlutterClasses.Widget.NavigationRule;

public class SymbolTableObjectGetDataValue extends SymbolTableObjectValue {

    public GetDataAst getNavigationRule() {
        return navigationRule;
    }

    public void setNavigationRule(GetDataAst navigationRule) {
        this.navigationRule = navigationRule;
    }

    private GetDataAst navigationRule;

    public SymbolTableObjectGetDataValue(int scope, int id, int parentId, GetDataAst routeName) {
        super(scope, id, parentId);
        this.navigationRule = routeName;
    }

    public String getRouteName() {
        StringBuilder res = new StringBuilder("");
        String name = navigationRule.getName();

        res.append(" var " + name + "=localStorage.getItem(" + "'" + name + "'" + ");");
        res.append("console.log( "+ name + " );");

        return res.toString();
    }
}
