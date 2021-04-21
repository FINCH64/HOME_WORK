package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface {

    private final ICalculator calc1;

    private long counter = 0;

    public CalculatorWithCounterAutoCompositeInterface(ICalculator myClass) {
        calc1 = myClass;
    }

    double plusDouble(double firstArg, double secondArg){
        incrementCountOperation();
        return calc1.plusDouble(firstArg,secondArg);
    }

    public float division(float firstArg, float secondArg) {
            incrementCountOperation();
            return calc1.division(firstArg,secondArg);
    }

    public float multiply(float firstArg, float secondArg) {
        incrementCountOperation();
        return calc1.multiply(firstArg,secondArg);
    }

    public float minus(float firstArg, float secondArg) {
        incrementCountOperation();
        return calc1.minus(firstArg,secondArg);
    }

    public float plus(float firstArg, float secondArg) {
        incrementCountOperation();
        return calc1.plus(firstArg,secondArg);
    }

    public float setDegreeOfPositive(float firstArg, int degree) {
        incrementCountOperation();
        return calc1.division(firstArg,degree);
    }

    public float abs(float num) {
        incrementCountOperation();
        return calc1.abs(num);
    }
    public double squareRoot(double num) {
        incrementCountOperation();
        return calc1.squareRoot(num);
    }

    public void incrementCountOperation() {
        counter++;
    }

    public long getCountOperation() {
        return counter;
    }
}
