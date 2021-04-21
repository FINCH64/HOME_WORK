package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long counter = 0;
    public float setDegreeOfPositive(float firstArg, int degree) {
        incrementCountOperation();
        return super.setDegreeOfPositive(firstArg,degree);
    }

    public float abs(float num) {
        incrementCountOperation();
        return super.abs(num);
    }
    public double squareRoot(double num) {
        incrementCountOperation();
        return super.squareRoot(num);
    }

    public float division(float firstArg, float secondArg) {
        incrementCountOperation();
        return super.division(firstArg,secondArg);
    }

    public float multiply(float firstArg, float secondArg) {
        incrementCountOperation();
        return super.multiply(firstArg,secondArg);
    }

    public float minus(float firstArg, float secondArg) {
        incrementCountOperation();
        return super.minus(firstArg,secondArg);
    }

    public float plus(float firstArg, float secondArg) {
        incrementCountOperation();
        return super.plus(firstArg,secondArg);
    }

    public void incrementCountOperation() {
        counter++;
    }

    public long getCountOperation() {
        return counter;
    }
}
