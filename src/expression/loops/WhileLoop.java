package expression.loops;

import expression.Expression;

import java.util.List;

public record WhileLoop(List<Expression> expressionList) implements Expression {
    @Override
    public String getType() {
        return "For";
    }
}
