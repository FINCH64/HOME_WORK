package home_work_1;

import java.util.Scanner;

public class systemIn_switch {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Ввелите ваше имя.");
        String name = data.nextLine();
        switch (name) {
            case("Вася"): {
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал.");
                break;
            }
            case("Анастасия"): {
                System.out.println("Я тебя так долго ждал.");
                break;
            }
            default: {
                System.out.println("Добрый день, а вы кто?");
                break;
            }
        }
    }
}
