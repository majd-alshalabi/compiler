package expression.math;

import expression.Expression;

public class Addition extends MathLogic {
    public final Expression left,  right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
