
package expression.math;

        import expression.Expression;

public class Divide extends MathLogic {
        public final Expression left,  right;

        public Divide(Expression left, Expression right) {
                this.left = left;
                this.right = right;
        }
}