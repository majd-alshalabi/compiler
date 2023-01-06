package expression.widgets;

import expression.Expression;

abstract public class Widget implements Expression {
    @Override
    public String getType() {
        return "widgets";
    }
}
