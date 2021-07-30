package src.home_work_5;

public class testClass implements Comparable<testClass>{
    private int someNums;
    private String someText;

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

    public int compareTo(testClass o) {
        if (someNums > o.getSomeNums()) {
            return -1;
        } else {
            if (someNums < o.getSomeNums()) {
                return 1;
            } else {
                if (someNums == o.getSomeNums()) {
                    return 0;
                };
            }
        }
        return -2;
    }

    public int getSomeNums() {
        return someNums;
    }

    public String getSomeText() {
        return someText;
    }
}
