package expression.ifs;

import expression.Expression;

import java.util.List;

public class ELSEIF implements Expression {
    public final List<Expression> expressionList;

    public ELSEIF(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    @Override
    public String getType() {
        return "ELSEIF";
    }
}
