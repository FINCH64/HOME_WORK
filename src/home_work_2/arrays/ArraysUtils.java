package home_work_2.arrays;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
    int[] container = arrayRandom(5,15);
    }

    public static int[] arrayFromConsole() {
        Scanner sizeAndData = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = sizeAndData.nextInt();
        int[] arrayCons = new int[size];
        for (int i = 0;i < size;i++) {
            System.out.println("Введите " + (i+1) + " элемент массива:");
            arrayCons[i] = sizeAndData.nextInt();
        }
        return arrayCons;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] arrayRand = new int[size];
        for (int i = 0;i < size;i++) {
            arrayRand[i] = (int) (Math.random() * maxValueExclusion);
        }
        return arrayRand;
    }
}
