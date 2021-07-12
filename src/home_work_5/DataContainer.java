package src.home_work_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer <T> {
    private T[] Data;

    DataContainer(T[] data){
        this.Data = data;
    }

    DataContainer(){
        this.Data = null;
    }
    public int addElement(T element) {
        int counter = 0;
        for ( T currentData : this.Data) {
            if (Objects.equals(currentData,null) && counter < this.Data.length) {
                this.Data[counter] = element;
                return counter;
            }
            counter++;
        }
        this.Data = Arrays.copyOf(this.Data,this.Data.length + 1);
        this.Data[this.Data.length - 1] = element;
        return this.Data.length - 1;
    }

    public void removeElementByContent(T deletedData) {
        int counter = 0;
        for (T data : Data) {
            counter++;
            if(Objects.equals(data,deletedData)) {
                this.removeElementByIndex(counter);
            }
        }
    }

    public boolean removeElementByIndex(int index) {
        if (Data[index] != null) {
            Data[index] = null;
            for (int a = index; a < Data.length; a++) {
                Data[a + 1] = Data[a];
            }
            this.Data = Arrays.copyOf(this.Data,this.Data.length - 1);
            return true;
        } else {
            return false;
        }
    }

    public T getByIndex(int index) {
        if (index < this.Data.length) {
            return this.Data[index];
        } else {
            System.out.println("Нет такого элемента.");
            return null;
        }
    }

    public T[] getItems() {
        for (int i = 0;i < this.Data.length;i++) {

        }
        return this.Data;
    }

    public static String toString(testClass[] data) {
        String result = "";
        for (int i = 0;i < data.length;i++) {
            if (data[i] != null)
            result += data[i].getSomeNums() + ", ";
        }
        return result;
    }

    public void Sort(Comparator<T> comparator) {
        int resultInt = 0;
        T resultT1;
        T resultT2;
        int counterOfLowerElement;
        for (int i = 0;i < this.Data.length;i++) {
            resultT1 = null;
            resultT2 = null;
            counterOfLowerElement = 0;
            for (int a = 0;a <this.Data.length;a++) {
                resultInt = comparator.compare(Data[i], Data[a]);
                if (resultInt == 1 || resultInt == 0) {
                    resultT1 = this.Data[a];
                    resultT2 = this.Data[i];
                    counterOfLowerElement = a;
                }
            }
            this.Data[i] = resultT1;
            this.Data[counterOfLowerElement] = resultT2;
        }
    }


    public static void main(String[] args) {
        int testClassesCount = 5;
        Object[] arr = new testClass[testClassesCount];
        for (int counter = 0;counter < testClassesCount;counter++) {
            testClass test = new testClass((int) Math.round(Math.random() * 100));
            arr[counter] = test;
        }
        DataContainer Content = new DataContainer(arr);
        Content.addElement(new testClass((int) Math.round(Math.random() * 100)));
        Comparator<testClass> comp = new TestComparator();
        Content.Sort(comp);
        System.out.println(Content.toString((testClass[]) Content.getItems()));


    }



}
