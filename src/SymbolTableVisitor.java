import ASTClasses.program;
import SymbolTable.Scope.BaseScope;
import SymbolTable.Scope.GlobalScope;
import SymbolTable.SymbolTable;

import java.util.Stack;

public class SymbolTableVisitor {

    //to keep track of global scopes
    private Stack<BaseScope> globalStack;
    //we need a stack to keep track of Local scopes
    private Stack<BaseScope> scopeStack;

    private SymbolTable symbolTable;

    public SymbolTableVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        globalStack = new Stack<>();
        scopeStack = new Stack<>();
    }
    public void visit(program program) {

    }
}