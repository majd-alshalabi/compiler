package expression.array;

import expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class Array implements Expression {
    public final List<Expression> expressions = new ArrayList<>();
    @Override
    public String getType() {
        return "Array";
    }
}
