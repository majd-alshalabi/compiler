
package expression.math;

import expression.Expression;

public class OR extends MathLogic {
    public final Expression left,  right;

    public OR(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}