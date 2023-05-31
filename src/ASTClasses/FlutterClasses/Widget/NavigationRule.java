package ASTClasses.FlutterClasses.Widget;

import ASTClasses.DartClasses.Content.varDefinition;

import java.util.ArrayList;
import java.util.List;

public class NavigationRule {
    private String routeName ;

    private List<varDefinition> list = new ArrayList<>();


    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public List<varDefinition> getList() {
        return list;
    }

    public void setList(List<varDefinition> list) {
        this.list = list;
    }
}
