package operators;

public class Multiplication extends AbstractOperator {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
    public String toString(){
        return "*";
    }
}
