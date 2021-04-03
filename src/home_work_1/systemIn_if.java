package home_work_1;
import java.util.Objects;
import java.util.Scanner;

public class systemIn_if {
    public static void main(String[] args) {
        String Anastasiya = "Анастасия";
        String Vasya = "Вася";
        Scanner data = new Scanner(System.in);
        System.out.println("Ввелите ваше имя.");
        String name = data.nextLine();
        if (Objects.equals(name,Vasya)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал.");
        }
        if (Objects.equals(name,Anastasiya)) {
            System.out.println("Я тебя так долго ждал.");
        }
        if (!Objects.equals(name,Anastasiya) && !Objects.equals(name,Vasya)) {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}