package src.home_work_5;

import java.util.Comparator;

class TestComparator implements Comparator<testClass> {

    public int compare(testClass a,testClass b) {
        if(a.getSomeNums()< b.getSomeNums())
            return 1;
        else if(b.getSomeNums()< a.getSomeNums())
            return -1;
        else
            return 0;
    }
}

