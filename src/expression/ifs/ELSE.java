package expression.ifs;

import expression.Expression;

import java.util.List;

public class ELSE implements Expression {
    public final List<Expression> expressionList;

    public ELSE(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    @Override
    public String getType() {
        return "ELSE";
    }
}
