package edu.revision.CalculatorSimple;

public class Division implements CalculationOperation {
    @Override
    public double evaluate(int a, int b) {
        double resultDivision = 0;
        if (b != 0) {
            resultDivision = (double) a / b;
        } else{
            System.out.println("Division from zero is denied");
        }
        return resultDivision;
    }

    @Override
    public char getSymbol() {
        return '/';
    }
}
