package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculationWithOperator implements ICalculator {
    @Override
    public float setDegreeOfPositive(float firstArg, int degree) {
        float result = firstArg;
        result = (float) Math.pow(firstArg, degree);
        return result;
    }

    public float abs(float num) {
        float result = 0;
        result = Math.abs(num);
        return result;
    }
    public double squareRoot(double num) {
        double result = 0;
        result = Math.sqrt(num);
        return result;
    }
}
