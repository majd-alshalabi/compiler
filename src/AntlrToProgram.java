import expression.Expression;
import expression.Program;
import expression.Variable;
import expression.math.Addition;
import expression.math.Divide;
import expression.math.Minus;
import expression.math.Multiplication;
import expression.variableValue.*;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends Dart2ParserBaseVisitor<Program>{
    public List<String> semanticError;

    @Override
    public Program visitProgram(Dart2Parser.ProgramContext ctx) {
        Program program = new Program();
        semanticError = new ArrayList<>();
        AntlrToExpression antlrToExpression = new AntlrToExpression(semanticError);
        for(int i = 0 ; i < ctx.getChildCount() ; i++)
        {
            Expression child = antlrToExpression.visit(ctx.getChild(i));
            program.addToTheExpressionList(child);
        }
        return program;
    }
}
