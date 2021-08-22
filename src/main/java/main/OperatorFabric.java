package main;

import operators.*;

public class OperatorFabric {
    public AbstractOperator getOperator(char c) throws RuntimeException {
        switch (c){
            case '+': return new Addition();
            case '-': return new Subtraction();
            case '*': return new Multiplication();
            case '/': return new Division();
            default: throw new RuntimeException("Invalid operator");
        }
    }
}
