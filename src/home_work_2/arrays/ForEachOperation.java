package home_work_2.arrays;

public class ForEachOperation {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole();
        printEveryReverse(container);
    }

    public static void printEvery(int[] array) {
        for (int arg : array) {
            System.out.println(arg);
        }

    }

    public static void printNotEvery(int[] array) {
        int counter = 0;
        for (int arg : array) {
            if (counter%2 == 0) {
                System.out.println(arg);
            }
            counter++;
        }
    }

    public static void printEveryReverse(int[] array) {
        int[] reversedArray = reverse(array);
        for (int arg : array) {
            System.out.println(arg);
        }
    }

    public static int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}
