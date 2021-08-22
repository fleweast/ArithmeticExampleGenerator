package operators;

public class Addition extends AbstractOperator {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }

    public String toString(){
        return "+";
    }
}
