package home_work_2.arrays;

public class DoWhileOperation {
    public static void main(String[] args) {
       int[] container = ArraysUtils.arrayFromConsole();
       printEveryReverse(container);
    }

    public static void printEvery(int[] array) {
        int counter = 0;
        do {
            System.out.println(array[counter]);
            counter++;
        } while (counter <= array.length - 1);
    }

    public static void printNotEvery(int[] array) {
        int counter = 0;
        do {
            System.out.println(array[counter]);
            counter += 2;
        } while (counter <= array.length - 1);
    }

    public static void printEveryReverse(int[] array) {
        int counter = array.length - 1;
        do {
            System.out.println(array[counter]);
            counter--;
        } while (counter >= 0);
    }
}
