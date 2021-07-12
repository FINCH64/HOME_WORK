package src.home_work_5;

public class testClass {
    public int someNums;
    public String someText;

    testClass(int nums) {
        this.someNums = nums;
    }

    testClass(int nums, String someText) {
        this.someNums = nums;
        this.someText = someText;
    }

    testClass(String someText) {
        this.someText = someText;
    }

    public int getSomeNums() {
        return someNums;
    }

    public String getSomeText() {
        return someText;
    }
}
