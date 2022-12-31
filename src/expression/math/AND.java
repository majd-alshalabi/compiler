package expression.math;

import expression.Expression;

public class AND extends MathLogic {
    public final Expression left,  right;

    public AND(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}