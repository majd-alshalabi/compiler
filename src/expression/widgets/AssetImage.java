package expression.widgets;

import expression.Expression;

public class AssetImage implements Expression {
    public final Expression path ;

    public AssetImage(Expression path) {
        this.path = path;
    }

    @Override
    public String getType() {
        return "AssetImage";
    }
}
