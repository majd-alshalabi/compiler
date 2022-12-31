
package expression.math;

import expression.Expression;

public class XOR extends MathLogic {
    public final Expression left,  right;

    public XOR(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}