package ASTClasses.DartClasses.Content.For;

public enum IncrementType {
    PL, Minus;
    @Override
    public String toString() {
        switch(this) {
            case PL: return "++";
            case Minus: return "--";
            default: throw new IllegalArgumentException();
        }
    }
}
