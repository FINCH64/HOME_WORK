package home_work_2.arrays;

public class ForOperation {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();
        printNotEvery(container);
    }

    public static void printEvery(int[] array) {
        for (int counter = 0;counter <= array.length - 1;counter++) {
            System.out.println(array[counter]);
        };
    }

    public static void printNotEvery(int[] array) {
        for (int counter = 0;counter <= array.length - 1;counter += 2) {
            System.out.println(array[counter]);
        }
    }

    public static void printEveryReverse(int[] array) {

        for (int counter = array.length - 1;counter >= 0;counter--) {
            System.out.println(array[counter]);
        };
    }
}
