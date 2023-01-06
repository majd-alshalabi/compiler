package expression.widgets;

import java.util.ArrayList;
import java.util.List;

public class ListOfWidgets extends Widget {
    public List<Widget> widgetList ;
    public ListOfWidgets(){
        widgetList = new ArrayList<>();
    }
    public ListOfWidgets(List<Widget> widgetList) {
        this.widgetList = widgetList;
    }
}
