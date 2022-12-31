
package expression.math;

import expression.Expression;

public class Multiplication extends MathLogic {
    public final Expression left,  right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}