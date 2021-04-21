package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public float division(float firstArg, float secondArg) {
        float result = 0;
        result = firstArg/secondArg;
        return result;
    }

    public float multiply(float firstArg, float secondArg) {
        float result = 0;
        result = firstArg*secondArg;
        return result;
    }

    public float minus(float firstArg, float secondArg) {
        float result = 0;
        result = firstArg-secondArg;
        return result;
    }

    @Override
    public float plus(float firstArg, float secondArg) {
        float result = 0;
        result = firstArg+secondArg;
        return result;
    }

    public double plusDouble(double firstArg, double secondArg) {
        double result = 0;
        result = firstArg+secondArg;
        return result;
    }

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
