package home_work_2.loops;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        System.out.println("Введите число.");
        Scanner dataFromConsole = new Scanner(System.in);
        long data = dataFromConsole.nextLong();
        if (data > 0) {
            System.out.println(data);
            loopNumberMultiplication(data);
        } else {
            if (data < 0 ) {
                System.out.println("Введите положительное число");
            } else {
                if (dataFromConsole.nextFloat() > 0) {
                    System.out.println("Введите целое число");
                }
                else {
                    System.out.println("Привет,это не число.");
                }
            }
        }
    }

    public static void loopNumberMultiplication(long data){
        long answerLong = 1;
        String answerString = "Вы ввели число: " + data + ", ";
        while (data > 0) {
            long numberImplicated = data % 10;
            answerLong = answerLong * numberImplicated;
            if (data > 10) {
                answerString = answerString + numberImplicated + " * ";
            } else {
                answerString = answerString + numberImplicated + " = " + answerLong;
            }
            data /= 10;
        }
        if (answerLong > 0 && answerLong <  2_147_483_647) {
            System.out.println(answerString);
        } else {
            System.out.println("Неверный ввод");
        }
    }
}
