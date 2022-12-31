package expression;

import expression.Expression;
import expression.Variable;
import expression.VariableDeclaration;
import expression.ifs.ELSE;
import expression.ifs.ELSEIF;
import expression.ifs.IF;
import expression.math.*;
import expression.variableValue.*;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor {

    List<Expression> li ;
    public Map<String , Pair<VariableValue , Integer > > values ;

    public ExpressionProcessor(List<Expression> li)
    {
        this.li = li ;
        values = new HashMap<>();
    }

    public List<String> getResult(){
        List<String> evaluation  = new ArrayList<>();
        evaInner(li,0);
        return evaluation ;
    }
    private VariableValue getEvaResult(Expression e , int level){
        VariableValue value = null;
        if(e instanceof NumberValue)
        {
            value = (NumberValue) e;
        }
        else if(e instanceof StringValue)
        {
            value = (StringValue) e;
        }
        else if(e instanceof DoubleValue)
        {
            value = (DoubleValue) e;
        }
        else if(e instanceof BooleanValue)
        {
            value = (BooleanValue)e;
        }
        else if(e instanceof Variable)
        {
            Variable v = (Variable) e;
            value = values.get(v.id()).a;
        }
        else if(e instanceof Addition)
        {
            Addition addition = (Addition) e;
            VariableValue left = getEvaResult(addition.left(),level);
            VariableValue right = getEvaResult(addition.right(),level);
            if(left instanceof NumberValue && right instanceof NumberValue)
            {
                NumberValue num1 = (NumberValue)left;
                NumberValue num2 = (NumberValue)right;
                value = new NumberValue(num1.number() + num2.number());
            }
            else if(left instanceof DoubleValue && right instanceof DoubleValue)
            {
                DoubleValue val1 = (DoubleValue)left;
                DoubleValue val2 = (DoubleValue)right;
                value = new DoubleValue(val1.value() + val2.value());
            }
            else if(left instanceof StringValue && right instanceof StringValue)
            {
                StringValue val1 = (StringValue)left;
                StringValue val2 = (StringValue)right;
                value = new StringValue(val1.value() + val2.value());
            }
        }
        else if(e instanceof Multiplication)
        {
            Multiplication multiplication = (Multiplication) e;
            VariableValue left = getEvaResult(multiplication.left(),level);
            VariableValue right = getEvaResult(multiplication.right(),level);
            if(left instanceof NumberValue && right instanceof NumberValue)
            {
                NumberValue num1 = (NumberValue)left;
                NumberValue num2 = (NumberValue)right;
                value = new NumberValue(num1.number() * num2.number());
            }
        }
        else if(e instanceof Divide)
        {
            Divide divide = (Divide) e;
            VariableValue left = getEvaResult(divide.left(),level);
            VariableValue right = getEvaResult(divide.right(),level);
            if(left instanceof NumberValue && right instanceof NumberValue)
            {
                NumberValue num1 = (NumberValue)left;
                NumberValue num2 = (NumberValue)right;
                value = new NumberValue(num1.number() / num2.number());
            }
        }
        else if(e instanceof Minus)
        {
            Minus minus = (Minus) e;
            VariableValue left = getEvaResult(minus.left(),level);
            VariableValue right = getEvaResult(minus.right(),level);
            if(left instanceof NumberValue && right instanceof NumberValue)
            {
                NumberValue num1 = (NumberValue)left;
                NumberValue num2 = (NumberValue)right;
                value = new NumberValue(num1.number() - num2.number());
            }
        }
        else if(e instanceof OR or)
        {
            VariableValue left = getEvaResult(or.left(),level);
            VariableValue right = getEvaResult(or.right(),level);
            if(left instanceof BooleanValue bool1 && right instanceof BooleanValue bool2)
            {
                value = new BooleanValue(bool1.value() | bool2.value());
            }
        }
        else if(e instanceof AND and)
        {
            VariableValue left = getEvaResult(and.left(),level);
            VariableValue right = getEvaResult(and.right(),level);
            if(left instanceof BooleanValue bool1 && right instanceof BooleanValue bool2)
            {
                value = new BooleanValue(bool1.value() & bool2.value());
            }
        }
        else if(e instanceof XOR xor)
        {
            VariableValue left = getEvaResult(xor.left(),level);
            VariableValue right = getEvaResult(xor.right(),level);
            if(left instanceof BooleanValue bool1 && right instanceof BooleanValue bool2)
            {
                value = new BooleanValue(bool1.value() ^ bool2.value());
            }
        }
        return value;
    }

    public void evaInner(List<Expression> expressionList , int level){
        for (Expression expression:
             expressionList) {
            if(expression instanceof VariableDeclaration)
            {
                VariableDeclaration e = (VariableDeclaration) expression;
                VariableValue temp = getEvaResult(e.value(),level);
//                System.out.println(temp);
                /// TODO handle same variable name in multi s
                values.put(e.id().id(),new Pair<>(temp , level));
            }
            else if(expression instanceof VariableEQ){
                VariableEQ e = (VariableEQ) expression;
                VariableValue temp = getEvaResult(e.value(),level);
//                System.out.println(temp);
                values.replace(e.id().id(),new Pair<>(temp ,  values.get(e.id().id()).b));
            }
            else if(expression instanceof IF)
            {
                evaInner(((IF) expression).expressionList(),level + 1);
            }
            else if(expression instanceof ELSEIF)
            {
                evaInner(((ELSEIF) expression).expressionList,level + 1);
            }
            else if(expression instanceof ELSE)
            {
                evaInner(((ELSE) expression).expressionList,level + 1);
            }
        }
    }
}
