package expression.widgets;

import expression.Expression;

public class Container extends Widget{
    public Widget widget;
    public Expression width ;
    public Expression height ;
    public Container(){}
    public Container(Widget widget, Expression width, Expression height) {
        this.widget = widget;
        this.width = width;
        this.height = height;
    }
//    final
}
