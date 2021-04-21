package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculationWithOperator implements ICalculator {
    @Override
    public double plusDouble(double firstArg, double secondArg) {
        double result = 0;
        result = firstArg+secondArg;
        return result;
    }

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

    public float plus(float firstArg, float secondArg) {
        float result = 0;
        result = firstArg+secondArg;
        return result;
    }

    public float setDegreeOfPositive(float firstArg, int degree) {
        float result = firstArg;
        if (degree == 0) {
            result = 1;
        } else {
            if (degree >= 1) {
                for(int i = 0;i < degree - 1;i++) {
                    result *= firstArg;
                }
            } else {
                for(int i = 0;i > degree;i--) {
                    result *= firstArg;
                }
                result = 1/result;
            }
        }
        return result;
    }

    public float abs(float num) {
        float result = 0;
        if (num < 1) {
            result = num * -1;
        } else {
            result = num;
        }
        return result;
    }
     public double squareRoot(double num) {
        double result = 0;
        result = Math.sqrt(num);
        return result;
     }
}

