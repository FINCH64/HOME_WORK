package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.simple.CalculationWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite(new CalculationWithOperator());
        double result = 0;
        result = calc.plus(calc.plus(4.1F,calc.multiply(15,7)),calc.setDegreeOfPositive(calc.division(28,5), 2));
        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }}
