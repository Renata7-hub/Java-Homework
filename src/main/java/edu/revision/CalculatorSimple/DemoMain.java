package edu.revision.CalculatorSimple;

import java.util.ArrayList;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) {
        List<CalculationOperation> calculatorOperation = new ArrayList<>();

        calculatorOperation.add(new Multiplication());
        calculatorOperation.add(new Division());

        Calculator c = new Calculator(calculatorOperation);

        System.out.println(c.evaluate(2,5,'*'));
        System.out.println(c.evaluate(2,5,'/'));
      //  System.out.println(c.evaluate(2,0,'/'));
      //  System.out.println(c.evaluate(2,5,'-'));


    }
}
