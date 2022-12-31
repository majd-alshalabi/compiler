
package expression.math;

import expression.Expression;

public class Remainder extends MathLogic {
    public final Expression left,  right;

    public Remainder(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}