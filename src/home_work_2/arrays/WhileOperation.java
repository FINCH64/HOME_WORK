package home_work_2.arrays;

public class WhileOperation {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();
        printEveryReverse(container);
    }

    public static void printEvery(int[] array) {
        int counter = 0;
        while (counter <= array.length - 1) {
            System.out.println(array[counter]);
            counter++;
        };
    }

    public static void printNotEvery(int[] array) {
        int counter = 0;
        while (counter <= array.length - 1) {
            System.out.println(array[counter]);
            counter += 2;
        }
    }

    public static void printEveryReverse(int[] array) {
        int counter = array.length - 1;
        while (counter >= 0) {
            System.out.println(array[counter]);
            counter--;
        };
    }
}
