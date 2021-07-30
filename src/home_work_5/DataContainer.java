package src.home_work_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class DataContainer<T>{
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

    public String toString(T[] data) {
        String result = "";
        for (int i = 0;i < data.length;i++) {
            if (data[i] != null)
            result += data[i] + ", ";
        }
        return result;
    }

    public void Sort(DataContainer<testClass> data) {
        int resultInt = 0;
        int counterOfLowerElement;
        for (int i = 0;i < data.Data.length;i++) {
            counterOfLowerElement = i;
            for (int a = i;a < data.Data.length;a++) {
                resultInt = data.Data[counterOfLowerElement].compareTo(data.Data[a]);
                if (resultInt == -1) {
                    counterOfLowerElement = a;
                }
            }
            testClass a = data.Data[i];
            data.Data[i] = data.Data[counterOfLowerElement];
            data.Data[counterOfLowerElement] = a;
        }

    }

    public static void Sort(DataContainer data,Comparator comp) {
        int resultInt = 0;
        int counterOfLowerElement;
        for (int i = 0;i < data.Data.length;i++) {
            counterOfLowerElement = i;
            for (int a = i;a < data.Data.length;a++) {
                resultInt = comp.compare(data.Data[counterOfLowerElement], data.Data[a]);
                if (resultInt == -1) {
                    counterOfLowerElement = a;
                }
            }
            Object a = data.Data[i];
            data.Data[i] = data.Data[counterOfLowerElement];
            data.Data[counterOfLowerElement] = a;
        }
    }

    public void Sort(Comparator<T> comparator) {
        int resultInt = 0;
        T lowerResultT1;
        int counterOfLowerElement;
        for (int i = 0;i < this.Data.length;i++) {
            counterOfLowerElement = i;
            lowerResultT1 = this.Data[i];
            for (int a = i;a < this.Data.length;a++) {
                resultInt = comparator.compare(lowerResultT1, this.Data[a]);
                    if (resultInt == -1) {
                        lowerResultT1 = this.Data[a];
                        counterOfLowerElement = a;
                    }
            }
            if(counterOfLowerElement != 0 || counterOfLowerElement != i) { // передвигает элементы вперед,на освободившееся место наименьшего элемента,емли таковой был
                for (int num = counterOfLowerElement;num > i;num--) {
                    this.Data[num] = this.Data[num - 1];
                }
            }
            this.Data[i] = lowerResultT1;
        }
    }


    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        for (int counter = 0;counter < 5;counter++) {
            arr[counter] = (int) Math.round(Math.random() * 100);
        }
        DataContainer<Integer> Content = new DataContainer(arr);
        Content.addElement(((int) Math.round(Math.random() * 100)));
        Comparator<Integer> comp = new TestComparator();
//        Content.Sort(comp);
        Content.Sort(Content,comp);
        System.out.println(Content.toString(Content.getItems()));
        int testClassCount = 6;
        testClass[] newArray = new testClass[testClassCount];
        for (int counter = 0;counter < testClassCount;counter++) {
            newArray[counter] = new testClass((int) Math.round(Math.random() * 100));
        }
        DataContainer<testClass> newContent = new DataContainer(newArray);
        newContent.Sort(newContent);

    }



}
