package main;

import operators.Operator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a operator");
        char operator = in.next().charAt(0);
        System.out.println("Your operator is " + operator);
        System.out.println("Input limit for numbers (not bigger than ...)");
        int limit = in.nextInt();
        System.out.println("Your limit is " + limit);
        System.out.println("Input how much examples do you need");
        int numExamples = in.nextInt();

        for (int i = 0; i < numExamples; i++) {
            OperatorFabric operatorFabric = new OperatorFabric();
            Operator operator1 = operatorFabric.getOperator(operator);
            Equation eq = new Equation(limit, limit, operator1);
            System.out.println(eq.returnEquation());
        }

    }
}
