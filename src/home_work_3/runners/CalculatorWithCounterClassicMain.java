package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        float result = 0;
        float divisionBeforeGrade = 0;
        float divisionAfterGrade = 0;

        result = calc.multiply(15,7);
        calc.incrementCountOperation();
        result = calc.plus(4.1F,result);
        calc.incrementCountOperation();
        divisionBeforeGrade = calc.division(28,5);
        calc.incrementCountOperation();
        divisionAfterGrade = calc.setDegreeOfPositive(divisionBeforeGrade, 2);
        calc.incrementCountOperation();
        result = calc.plus(result, divisionAfterGrade);
        calc.incrementCountOperation();
        System.out.println(result);
        System.out.println(calc.getCountOperation());
    }
}
