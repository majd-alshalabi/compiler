package expression.ifs;

import expression.Expression;

import java.util.List;

public record IF(List<Expression> expressionList) implements Expression {

    @Override
    public String getType() {
        return "IF";
    }
}
