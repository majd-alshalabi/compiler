
package expression.math;

import expression.Expression;

public class Minus extends MathLogic {
    public final Expression left,  right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}