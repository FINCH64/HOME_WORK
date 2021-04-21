package home_work_3.calcs.api;

public interface ICalculator {
    double plusDouble(double firstArg, double secondArg);
    float division(float firstArg, float secondArg);
    float multiply(float firstArg, float secondArg);
    float minus(float firstArg, float secondArg);
    float plus(float firstArg, float secondArg);
    float setDegreeOfPositive(float firstArg, int degree);
    float abs(float num);
    double squareRoot(double num);
}
