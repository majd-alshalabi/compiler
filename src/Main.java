import ASTClasses.program;
import code_generation.CodeGeneration;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try {
            String src = "test.dart";
            CharStream cs = fromFileName(src);
            Dart2Lexer lexer = new Dart2Lexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            Dart2Parser parser = new Dart2Parser(token);
            ParseTree tree = parser.program();

            myVisitor myVisitor = new myVisitor();
            program program = (program) myVisitor.visit(tree);

            ASTVisitor astVisitor =new ASTVisitor();
            astVisitor.visit(program);

            CodeGeneration codeGeneration = new CodeGeneration(astVisitor.symbolTable.getMap());
            codeGeneration.generate();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}