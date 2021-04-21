package home_work_3.runners;

import home_work_3.calcs.simple.CalculationWithOperator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;


public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        double result = 0;
        result = calc.plusDouble(calc.plus(4.1F,calc.multiply(15,7)),calc.setDegreeOfPositive(calc.division(28,5), 2));
        System.out.println(result);
    }
}
