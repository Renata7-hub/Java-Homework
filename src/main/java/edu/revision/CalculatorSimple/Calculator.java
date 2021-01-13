package edu.revision.CalculatorSimple;

import java.util.List;

public class Calculator {
    private List<CalculationOperation> operations;

    public Calculator(List<CalculationOperation> operation) {
        this.operations = operation;
    }

    public double evaluate(int a, int b, char operation) {
        for (int i = 0; i < operations.size(); i++ ) {
            if (operations.get(i).getSymbol() == operation) {
                return operations.get(i).evaluate(a, b);
            }
        }
        throw new RuntimeException("Operation not found " + operations);
    }
}
