package home_work_1;
import java.util.Scanner;

public class dop_zadanie_1 {
    public static void main(String[] args) {
        boolean sleepy;
        Scanner weekdayAnswer = new Scanner(System.in);
        System.out.println("Это рабочий день?(true/false)");
        boolean weekday = weekdayAnswer.nextBoolean();
        if (!weekday) {
            sleepy = sleepIn(weekday,true);
        } else {
            Scanner vacationAnswer = new Scanner(System.in);
            System.out.println("У вас отпуск?(true/false)");
            boolean vacation = vacationAnswer.nextBoolean();
            sleepy = sleepIn(weekday,vacation);
        }
        if (sleepy) {
            System.out.println("Можно и поспать");
        } else {if (!sleepy) {
                    System.out.println("Пора на работу");
                }
        }
    }
    public static boolean sleepIn(boolean weekday, boolean vacation){
        boolean isItPossible = false;
        if (!weekday) {
            isItPossible = true;
        } else {
           if (vacation) {
               isItPossible = true;
           }
        }
        return isItPossible;
    }
}