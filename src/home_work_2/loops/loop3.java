package home_work_2.loops;

import java.util.Scanner;

public class loop3 {
        public static void main(String[] args) {
            Scanner dataFromConsole = new Scanner(System.in);
            System.out.println("Введите число.");
            float number = dataFromConsole.nextFloat();
            System.out.println("Введите целочисленную степень.");
            int exponent = dataFromConsole.nextInt();

            if (exponent > 0) {
                loopNumberMultiplication(exponent,number);
            } else {
                if (exponent < 0 ) {
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

        public static void loopNumberMultiplication(long exponent, float number){
            float answerFloat = number;
            String answerString = "Вы ввели число: " + number + ", " + "Степень: " + exponent + ", " + number + " ^ " + exponent + " = " ;
            if (number >= 0) {
                for (int i = 1; i < exponent; i++) {
                    answerFloat *= number;
                }
            } else { if (exponent%2 == 1) {
                    for (int i = 1; i < exponent; i++) {
                        answerFloat *= number;
                    }
                    } else if (exponent%2 == 0) {
                    for (int i = 1; i < exponent; i++) {
                        answerFloat *= number;
                    }
                    answerFloat *= -1;
                    }
            }
            answerString = answerString + answerFloat;
            System.out.println(answerString);
        }
    }
