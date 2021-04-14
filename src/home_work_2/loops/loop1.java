package home_work_2.loops;
import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        System.out.println("Введите число.");
        Scanner dataFromConsole = new Scanner(System.in);
        loopMultiplicationNoRecursion(dataFromConsole.nextLong());
    }

    public static void loopMultiplicationNoRecursion(long data) {
        if (data > 0 && data <  2_147_483_647) {
            long answerLong = 1;
            String answerString = "Вы ввели: " + data + ", ";
            for (long i = 1;i <= data;i++) {
                answerLong *= i;
                if (i == data) {
                    answerString = answerString + i;
                } else {
                    answerString = answerString + i + " * ";
                }
            };
            answerString = answerString + " = " + answerLong;
            if (answerLong < 2_147_483_647) {
                System.out.println(answerString);
            } else {
                System.out.println("Неверное значение");
            }
        } else {
            System.out.println("Неверное значение");
        }
    }
}
