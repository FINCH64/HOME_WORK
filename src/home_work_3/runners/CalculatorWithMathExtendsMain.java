package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double result = 0;
        result = calc.plus(calc.plus(4.1F,calc.multiply(15,7)),calc.setDegreeOfPositive(calc.division(28,5), 2));
        System.out.println(result);
    }
}
