package home_work_2.loops;

public class loop5 {
    public static void main(String[] args) {
    multiplyUntilOverflow(3);
        multiplyUntilOverflow(188);
        multiplyUntilOverflow(-19);
    }

    public static void multiplyUntilOverflow(long arg) {
        long minValue = -9223372036854775807L;
        long maxValue = 9223372036854775807L;
        long numBeforeOverflow = 1;
        long numAfterOverflow = 0;
        while (numBeforeOverflow*arg >= minValue && numBeforeOverflow*arg <= maxValue) {
            System.out.println("1");
            numBeforeOverflow *= arg;
        };
        System.out.println("До переполнения:" + numBeforeOverflow);
        numAfterOverflow = numBeforeOverflow * arg;
        System.out.println("После переполнения:" + numAfterOverflow);
    }
}
