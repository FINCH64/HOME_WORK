package home_work_2.arrays;

import java.util.Arrays;

public class arrays2_4 {
    public static void main(String[] args) {
    int[] data = ArraysUtils.arrayRandom(5,20);
    String stringData = "";
        for (int arg:data) {
            stringData += arg + " ";
        }
        System.out.println(stringData);
    System.out.println(sumOfPositiveEven(data));
    System.out.println(maxEvenIndex(data));

        stringData = "";
        for (int arg:downAverageElements(data)) {
            stringData += arg + " ";
        }
        System.out.println(stringData);

        stringData = "";
        for (int arg:twoLowestElements(data)) {
            stringData += arg + " ";
        }
        System.out.println(stringData);
        stringData = "";
        for (int arg:deleteInterval(data, 0, 12)) {
            stringData += arg + " ";
        }
        System.out.println(stringData);
    System.out.println(sumOfNums(data));
    }

    public static int sumOfPositiveEven(int[] array) {
        int result = 0;
        for(int i = 0;i < array.length - 1;i++) {
            if (array[i]%2 == 0 && array[i] > 0) {
                result += array[i];
            }
        }
        return result;
    }

    public static int maxEvenIndex(int[] array) {
        int result = 0;
        for(int i = 0;i < array.length - 1;i += 2) {
            if(i == 0) {
                result = array[i];
            } else {
                if(array[i] > result){
                    result = array[i];
                }
            }
        }
        return result;
    }

    public static int[] downAverageElements(int[] array) {
        int[] resultArray = new int[array.length];
        int arraySum = 0;
        int arrayAverage = 0;
        int counter = 0;
        for (int arg:array) {
            arraySum +=arg;
        }
        arrayAverage = arraySum/array.length;
        for (int arg:array) {
            if(arg < arrayAverage) {
                resultArray[counter] = arg;
                counter++;
            }
        }
        return resultArray;
    }

    public static int[] twoLowestElements(int[] array) {
        int[] resultArray = new int[2];
        int counter = 0;
        int minElement = array[0];
        int[] copyOfArray = new int [array.length];
        for (int i = 0;i < copyOfArray.length - 1;i++) {
            if (copyOfArray[i] < minElement) {
                minElement = copyOfArray[i];
                counter = i;
            }
        }
        copyOfArray[counter] = copyOfArray[counter+1];
        resultArray[0] = minElement;
        minElement = copyOfArray[0];
        for (int i = 0;i < copyOfArray.length - 1;i++) {
            if (copyOfArray[i] < minElement) {
                minElement = copyOfArray[i];
                counter = i;
            }
        }
        resultArray[1] = copyOfArray[counter];
        return resultArray;
    }

    public static int[] deleteInterval(int[] array, int minInterval, int maxInterval) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 0;i < arrayCopy.length - 1;i++) {
            if (arrayCopy[i] < maxInterval && arrayCopy[i] > minInterval) {
                arrayCopy[i] = 0;
                for (int a = i+1; a < arrayCopy.length; a++) {
//                    if(a-1 < 0) {
//                        a++;
//                    }
                    arrayCopy[a-1] = arrayCopy[a];
                    arrayCopy[a] = 0;
                }
                if (i != 0) {
                    i--;
                }
            }
        }
        return  arrayCopy;
    }

    public static int sumOfNums(int[] array) {
        int result = 0;
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        for (int i = 0;i <arrayCopy.length;i++) {
            while(arrayCopy[i] > 0) {
                result +=arrayCopy[i]%10;
                arrayCopy[i] = arrayCopy[i]/10;
            }
        }
        return result;
    }
}
