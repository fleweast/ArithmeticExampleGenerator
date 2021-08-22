package main;

import operators.Operator;
import utils.RandomUtil;

public class Equation {
    int a;
    int b;
    int c;
    String symbol;
    Operator operator;

    public Equation(int limitA, int limitB, Operator operator){
        this.a = RandomUtil.between(0, limitA);
        this.b = RandomUtil.between(0, limitB);
        this.operator = operator;
    }

    public String returnEquation(){
        c = operator.calculate(a, b);
        symbol = operator.toString();
        return (a + symbol + b + " = " + c);
    }
}
