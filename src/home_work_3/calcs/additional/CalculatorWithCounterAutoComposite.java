package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculationWithOperator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoComposite {
    private CalculationWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;
    private long counter = 0;
    public CalculatorWithCounterAutoComposite(CalculationWithOperator myClass) {
        calc1 = myClass;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy myClass) {
        calc2 = myClass;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends myClass) {
        calc3 = myClass;
    }

    public float division(float firstArg, float secondArg) {
        if (calc1 != null) {
            incrementCountOperation();
            return calc1.division(firstArg,secondArg);
        } else {
            if (calc2 != null) {
                incrementCountOperation();
                return calc2.division(firstArg,secondArg);
            } else {
                if (calc3 != null) {
                    incrementCountOperation();
                    return calc3.division(firstArg,secondArg);
                }
            }
        }
        return 0;
    }

    public float multiply(float firstArg, float secondArg) {
        if (calc1 != null) {
            incrementCountOperation();
            return calc1.multiply(firstArg,secondArg);
        } else {
            if (calc2 != null) {
                incrementCountOperation();
                return calc2.multiply(firstArg,secondArg);
            } else {
                if (calc3 != null) {
                    incrementCountOperation();
                    return calc3.multiply(firstArg,secondArg);
                }
            }
        }
        return 0;
    }

    public float minus(float firstArg, float secondArg) {
        if (calc1 != null) {
            incrementCountOperation();
            return calc1.minus(firstArg,secondArg);
        } else {
            if (calc2 != null) {
                incrementCountOperation();
                return calc2.minus(firstArg,secondArg);
            } else {
                if (calc3 != null) {
                    incrementCountOperation();
                    return calc3.minus(firstArg,secondArg);
                }
            }
        }
        return 0;
    }

    public float plus(float firstArg, float secondArg) {
        if (calc1 != null) {
            incrementCountOperation();
            return calc1.plus(firstArg,secondArg);
        } else {
            if (calc2 != null) {
                incrementCountOperation();
                return (float) calc2.plus(firstArg,secondArg);
            } else {
                if (calc3 != null) {
                    incrementCountOperation();
                    return calc3.plus(firstArg,secondArg);
                }
            }
        }
        return 0;
    }

    public float setDegreeOfPositive(float firstArg, int degree) {
        if (calc1 != null) {
            incrementCountOperation();
            return calc1.setDegreeOfPositive(firstArg,degree);
        } else {
            if (calc2 != null) {
                incrementCountOperation();
                return (float) calc2.setDegreeOfPositive(firstArg,degree);
            } else {
                if (calc3 != null) {
                    incrementCountOperation();
                    return calc3.setDegreeOfPositive(firstArg,degree);
                }
            }
        }
        return 0;
    }

    public float abs(float num) {
        if (calc1 != null) {
            incrementCountOperation();
            return calc1.abs(num);
        } else {
            if (calc2 != null) {
                incrementCountOperation();
                return calc2.abs(num);
            } else {
                if (calc3 != null) {
                    incrementCountOperation();
                    return calc3.abs(num);
                }
            }
        }
        return 0;
    }
    public double squareRoot(double num) {
        if (calc1 != null) {
            incrementCountOperation();
            return calc1.squareRoot(num);
        } else {
            if (calc2 != null) {
                incrementCountOperation();
                return calc2.squareRoot(num);
            } else {
                if (calc3 != null) {
                    incrementCountOperation();
                    return calc3.squareRoot(num);
                }
            }
        }
        return 0;
    }

    public void incrementCountOperation() {
        counter++;
    }

    public long getCountOperation() {
        return counter;
    }
}
