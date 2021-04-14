package home_work_2.arrays;

public class IArraysOperation {
    public static void main(String[] args) {
        int[] randomArray = ArraysUtils.arrayRandom(8,20);
        DoWhileOperation.printEvery(randomArray);
        System.out.println("-----------");
        DoWhileOperation.printNotEvery(randomArray);
        System.out.println("-----------");
        DoWhileOperation.printEveryReverse(randomArray);
        System.out.println("-----------");
        WhileOperation.printEvery(randomArray);
        System.out.println("-----------");
        WhileOperation.printNotEvery(randomArray);
        System.out.println("-----------");
        WhileOperation.printEveryReverse(randomArray);DoWhileOperation.printEvery(randomArray);
        System.out.println("-----------");
        ForOperation.printEvery(randomArray);
        System.out.println("-----------");
        ForOperation.printNotEvery(randomArray);
        System.out.println("-----------");
        ForOperation.printEveryReverse(randomArray);
        System.out.println("-----------");
        ForEachOperation.printEvery(randomArray);
        System.out.println("-----------");
        ForEachOperation.printNotEvery(randomArray);
        System.out.println("-----------");
        ForEachOperation.printEveryReverse(randomArray);
    }
}
