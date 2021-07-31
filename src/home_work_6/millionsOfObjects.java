package src.home_work_6;

import src.home_work_6.Comparators.AnimalAgeAndNickComparator;
import src.home_work_6.Comparators.AnimalAgeComparator;
import src.home_work_6.Comparators.PersonPassAndNameComparator;
import src.home_work_6.Comparators.PersonPassComparator;

import java.util.*;

public class millionsOfObjects {

    private List<Person> linkedPersonList = new LinkedList<>();
    private List<Person> arrayPersonList = new ArrayList<>();
    private Set<Person> hashPersonSet = new HashSet<>();
    private Set<Person> treePersonSetSortedByPass = new TreeSet<>(new PersonPassComparator());
    private Set<Person> treePersonSetSortedByPassAndName = new TreeSet<>(new PersonPassAndNameComparator());
    private List<Animal> linkedAnimalList = new LinkedList<>();
    private List<Animal> arrayAnimalList = new ArrayList<>();
    private Set<Animal> hashAnimalSet = new HashSet<>();
    private Set<Animal> treeAnimalSetSortedByAge = new TreeSet<>(new AnimalAgeComparator());
    private Set<Animal> treeAnimalSetSortedByAgeAndNick = new TreeSet<>(new AnimalAgeAndNickComparator());
    private int leverOfClass;
    private int leverOfCollection;
    long time;
    private static final char[] pool = {
            'a','b','c','d','e','f','g',
            'h','i','j','k','l','m','n',
            'o','p','q','r','s','t','u',
            'v','w','x','y','z'};

    private Random rnd;

    public void generatePersonObjects() {
        leverOfClass = 1;
        int countOfObjects;
        System.out.println("������� ����������� �������?");
        Scanner scan = new Scanner(System.in);
        countOfObjects = scan.nextInt();
        System.out.println("����� ��������� ���������?\n1-LinkedList\n2-ArrayList\n3-HashSet\n4-TreeSet sorted by Pass\n5-TreeSet sorted by pass and name\n ������� ����� ���������:");
        switch (scan.nextInt()) {
            case 1:
                time = System.currentTimeMillis();
                for (int i = 0; i < countOfObjects; i++) {
                    Person personObject = new Person(getStr((int) (Math.random() * 10)),getStr((int) (Math.random() * 5) + 5));
                    linkedPersonList.add(personObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("��������: Filling LinkedList with Person. ������: " + time + " ��.");
                leverOfCollection = 1;
                break;
            case 2:
                time = System.currentTimeMillis();
                for (int i = 0; i < countOfObjects; i++) {
                    Person personObject = new Person(getStr((int) (Math.random() * 10)), getStr((int) (Math.random() * 5) + 5));
                    arrayPersonList.add(personObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("��������: Filling ArrayList with Person. ������: " + time + " ��.");
                leverOfCollection = 2;
                break;
            case 3:
                time = System.currentTimeMillis();
                for (int i = 0; i < countOfObjects; i++) {
                    Person personObject = new Person(getStr((int) (Math.random() * 10)), getStr((int) (Math.random() * 5) + 5));
                    hashPersonSet.add(personObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("��������: Filling HashSet with Person. ������: " + time + " ��.");
                leverOfCollection = 3;
                break;
            case 4:
                time = System.currentTimeMillis();
                for (int i = 0; i < countOfObjects; i++) {
                    Person personObject = new Person(getStr((int) (Math.random() * 10)), getStr((int) (Math.random() * 5) + 5));
                    treePersonSetSortedByPass.add(personObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("��������: Filling TreeSet sorted by pass with Person. ������: " + time + " ��.");
                leverOfCollection = 4;
                break;
            case 5:
                time = System.currentTimeMillis();
                for (int i = 0; i < countOfObjects; i++) {
                    Person personObject = new Person(getStr((int) (Math.random() * 10)), getStr((int) (Math.random() * 5) + 5));
                    treePersonSetSortedByPassAndName.add(personObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("��������: Filling TreeSet sorted by pass and name with Person. ������: " + time + " ��.");
                leverOfCollection = 5;
                break;
            default:
                System.out.println("�������� ����� ��������.");
                leverOfCollection = 6;
                break;
        }
        iterateSortAndDeletePersonObjects();
    }

    public void generateAnimalObjects() {
        leverOfClass = 2;
        int countOfObjects;
        System.out.println("������� ����������� �������?");
        Scanner scan = new Scanner(System.in);
        countOfObjects = scan.nextInt();
        System.out.println("����� ��������� ���������?\n1-LinkedList\n2-ArrayList\n3-HashSet\n4-TreeSet sorted by Pass\n5-TreeSet sorted by pass and name\n ������� ����� ���������:");
        switch (scan.nextInt()) {
            case 1:
                time = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {
                    Animal animalObject = new Animal(Integer.toString((int) (Math.random() * 15)),getStr((int) (Math.random() * 10)));
                    linkedAnimalList.add(animalObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("��������: Filling LinkedList with Animal. ������: " + time + " ��.");
                leverOfCollection = 1;
                break;
            case 2:
                time = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {
                    Animal animalObject = new Animal(Integer.toString((int) (Math.random() * 15)),getStr((int) (Math.random() * 10)));
                    arrayAnimalList.add(animalObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("��������: Filling ArrayList with Animal. ������: " + time + " ��.");
                leverOfCollection = 2;
                break;
            case 3:
                time = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {
                    Animal animalObject = new Animal(Integer.toString((int) (Math.random() * 15)),getStr((int) (Math.random() * 10)));
                    hashAnimalSet.add(animalObject);

                }
                time = System.currentTimeMillis() - time;
                System.out.println("��������: Filling HashSet with Animal. ������: " + time + " ��.");
                leverOfCollection = 3;
                break;
            case 4:
                time = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {
                    Animal animalObject = new Animal(Integer.toString((int) (Math.random() * 15)),getStr((int) (Math.random() * 10)));
                    treeAnimalSetSortedByAge.add(animalObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("��������: Filling TreeSet sorted by age with Animal. ������: " + time + " ��.");
                leverOfCollection = 4;
                break;
            case 5:
                time = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {
                    Animal animalObject = new Animal(Integer.toString((int) (Math.random() * 15)),getStr((int) (Math.random() * 10)));
                    treeAnimalSetSortedByAgeAndNick.add(animalObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("��������: Filling TreeSet sorted by age and Nick with Animal. ������: " + time + " ��.");
                leverOfCollection = 5;
                break;
            default:
                System.out.println("�������� ����� ��������.");
                leverOfCollection = 6;
                break;
        }
        iterateSortAndDeleteAnimalObjects();
    }

    public void iterateSortAndDeletePersonObjects() {
        Scanner scan = new Scanner(System.in);
        System.out.println("����������� �����:\n1-Iterator\n2-BasicLoop\n������� ����� ��������:");
        switch(scan.nextInt()) {
            case 1:
                switch(leverOfCollection) {
                    case 1:
                        Iterator<Person> linkedPersonIterator = linkedPersonList.iterator();
                        time = System.currentTimeMillis();
                        while (linkedPersonIterator.hasNext()) {
                            if (linkedPersonIterator.next().getPassword().length() > 25){
                                linkedPersonIterator.remove();//������� ���� ����� �� �������,����� ���� �������� �� ��� ������,���� �������� ��� ����������
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� linkedPersonList ����� Iterator. ������: " + time + " ��.");
                        time = System.currentTimeMillis();
                        linkedPersonList.sort(new PersonPassComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting LinkedList of Person by pass. ������: " + time + " ��.");

                        time = System.currentTimeMillis();
                        linkedPersonList.sort(new PersonPassAndNameComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting LinkedList of Person by pass and name. ������: " + time + " ��.");
                        linkedPersonIterator = linkedPersonList.iterator();
                        time = System.currentTimeMillis();
                        while (linkedPersonIterator.hasNext()) {
                            Person n = linkedPersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                linkedPersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� linkedPersonList ����� Iterator. ������: " + time + " ��.");
                        break;
                    case 2:
                        Iterator<Person> arrayPersonIterator = arrayPersonList.iterator();
                        time = System.currentTimeMillis();
                        while (arrayPersonIterator.hasNext()) {
                            if (arrayPersonIterator.next().getPassword().length() > 25){
                                arrayPersonIterator.remove();//������� ���� ����� �� �������,����� ���� �������� �� ��� ������,���� �������� ��� ����������
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� arrayPersonList ����� Iterator. ������: " + time + " ��.");
                        time = System.currentTimeMillis();
                        arrayPersonList.sort(new PersonPassComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting ArrayList of Person by pass. ������: " + time + " ��.");

                        time = System.currentTimeMillis();
                        arrayPersonList.sort(new PersonPassAndNameComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting ArrayList of Person by pass and name. ������: " + time + " ��.");
                        arrayPersonIterator = arrayPersonList.iterator();
                        time = System.currentTimeMillis();
                        while (arrayPersonIterator.hasNext()) {
                            Person n = arrayPersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                arrayPersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� arrayPersonList ����� Iterator. ������: " + time + " ��.");

                        break;
                    case 3:
                        Iterator<Person> hashPersonIterator = hashPersonSet.iterator();
                        time = System.currentTimeMillis();
                        while (hashPersonIterator.hasNext()) {
                            if (hashPersonIterator.next().getPassword().length() > 25){
                                hashPersonIterator.remove();//������� ���� ����� �� �������,����� ���� �������� �� ��� ������,���� �������� ��� ����������
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� hashPersonSet ����� Iterator. ������: " + time + " ��.");
                        hashPersonIterator = hashPersonSet.iterator();
                        time = System.currentTimeMillis();
                        while (hashPersonIterator.hasNext()) {
                            Person n = hashPersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                hashPersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� hashPersonSet ����� Iterator. ������: " + time + " ��.");
                        break;
                    case 4:
                    case 5:
                        Iterator<Person> treePersonIterator = treePersonSetSortedByPass.iterator();
                        time = System.currentTimeMillis();
                        while (treePersonIterator.hasNext()) {
                            if (treePersonIterator.next().getPassword().length() > 25){
                                treePersonIterator.remove();//������� ���� ����� �� �������,����� ���� �������� �� ��� ������,���� �������� ��� ����������
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� treePersonSet ����� Iterator. ������: " + time + " ��.");
                        treePersonIterator = treePersonSetSortedByPass.iterator();
                        time = System.currentTimeMillis();
                        while (treePersonIterator.hasNext()) {
                            Person n = treePersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                treePersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� treePersonSet ����� Iterator. ������: " + time + " ��.");
                        break;
                    default:
                        System.out.println("�������� ����� ��������.");
                        break;
                }
                break;
            case 2:
                switch (leverOfCollection) {
                    case 1:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < linkedPersonList.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� linkedPersonList ����� BasicLoop. ������: " + time + " ��.");

                        time = System.currentTimeMillis();
                        linkedPersonList.sort(new PersonPassComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting LinkedList of Person by pass. ������: " + time + " ��.");

                        time = System.currentTimeMillis();
                        linkedPersonList.sort(new PersonPassAndNameComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting LinkedList of Person by pass and name. ������: " + time + " ��.");
                        Iterator<Person> linkedPersonIterator = linkedPersonList.iterator();
                        time = System.currentTimeMillis();
                        while (linkedPersonIterator.hasNext()) {
                            Person n = linkedPersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                linkedPersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� linkedPersonList ����� Iterator. ������: " + time + " ��.");break;
                    case 2:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < arrayPersonList.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� arrayPersonList ����� BasicLoop. ������: " + time + " ��.");
                        time = System.currentTimeMillis();
                        arrayPersonList.sort(new PersonPassComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting ArrayList of Person by pass. ������: " + time + " ��.");

                        time = System.currentTimeMillis();
                        arrayPersonList.sort(new PersonPassAndNameComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting ArrayList of Person by pass and name. ������: " + time + " ��.");
                        Iterator<Person> arrayPersonIterator = arrayPersonList.iterator();
                        time = System.currentTimeMillis();
                        while (arrayPersonIterator.hasNext()) {
                            Person n = arrayPersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                arrayPersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� arrayPersonList ����� Iterator. ������: " + time + " ��.");

                        break;
                    case 3:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < hashPersonSet.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� hashPersonSet ����� BasicLoop. ������: " + time + " ��.");
                        Iterator<Person> hashPersonIterator = hashPersonSet.iterator();
                        time = System.currentTimeMillis();
                        while (hashPersonIterator.hasNext()) {
                            Person n = hashPersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                hashPersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� hashPersonSet ����� Iterator. ������: " + time + " ��.");

                        break;
                    case 4:
                    case 5:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < treePersonSetSortedByPass.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� treePersonSet ����� BasicLoop. ������: " + time + " ��.");
                        Iterator<Person> treePersonIterator = treePersonSetSortedByPass.iterator();
                        time = System.currentTimeMillis();
                        while (treePersonIterator.hasNext()) {
                            Person n = treePersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                treePersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� treePersonSet ����� Iterator. ������: " + time + " ��.");

                        break;
                    default:
                        System.out.println("�������� ����� ��������.");
                        break;
                }
                break;
            default:
                System.out.println("�������� ����� ��������.");
                break;
        }
    }

    public void iterateSortAndDeleteAnimalObjects() {
        Scanner scan = new Scanner(System.in);
        System.out.println("����������� �����:\n1-Iterator\n2-BasicLoop\n������� ����� ��������:");
        switch(scan.nextInt()) {
            case 1:
                switch (leverOfCollection) {
                    case 1:
                        Iterator<Animal> linkedAnimalIterator = linkedAnimalList.iterator();
                        time = System.currentTimeMillis();
                        while (linkedAnimalIterator.hasNext()) {
                            if ((int)linkedAnimalIterator.next().getAge().length() > 25){
                                linkedAnimalIterator.remove();//������� ���� ����� �� �������,����� ���� �������� �� ��� ������,���� �������� ��� ����������
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� linkedAnimalList ����� Iterator. ������: " + time + " ��.");
                        time = System.currentTimeMillis();
                        linkedAnimalList.sort(new AnimalAgeComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting LinkedList of Animal by age. ������: " + time + " ��.");

                        time = System.currentTimeMillis();
                        linkedAnimalList.sort(new AnimalAgeAndNickComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting LinkedList of Animal by age and nick. ������: " + time + " ��.");
                        linkedAnimalIterator = linkedAnimalList.iterator();
                        time = System.currentTimeMillis();
                        while (linkedAnimalIterator.hasNext()) {
                            Animal n = linkedAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                linkedAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� linkedAnimalList ����� Iterator. ������: " + time + " ��.");
                        break;
                    case 2:
                        Iterator<Animal> arrayAnimalIterator = arrayAnimalList.iterator();
                        time = System.currentTimeMillis();
                        while (arrayAnimalIterator.hasNext()) {
                            if ((int)arrayAnimalIterator.next().getAge().length() > 25){
                                arrayAnimalIterator.remove();//������� ���� ����� �� �������,����� ���� �������� �� ��� ������,���� �������� ��� ����������
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� arrayAnimalList ����� Iterator. ������: " + time + " ��.");
                        time = System.currentTimeMillis();
                        arrayAnimalList.sort(new AnimalAgeComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting ArrayList of Animal by age. ������: " + time + " ��.");

                        time = System.currentTimeMillis();
                        arrayAnimalList.sort(new AnimalAgeAndNickComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting ArrayList of Animal by age and nick. ������: " + time + " ��.");
                        arrayAnimalIterator = arrayAnimalList.iterator();
                        time = System.currentTimeMillis();
                        while (arrayAnimalIterator.hasNext()) {
                            Animal n = arrayAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                arrayAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� arrayAnimalList ����� Iterator. ������: " + time + " ��.");

                        break;
                    case 3:
                        Iterator<Animal> hashAnimalIterator = hashAnimalSet.iterator();
                        time = System.currentTimeMillis();
                        while (hashAnimalIterator.hasNext()) {
                            if ((int)hashAnimalIterator.next().getAge().length() > 25){
                                hashAnimalIterator.remove();//������� ���� ����� �� �������,����� ���� �������� �� ��� ������,���� �������� ��� ����������
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� hashAnimalSet ����� Iterator. ������: " + time + " ��.");
                        hashAnimalIterator = hashAnimalSet.iterator();
                        time = System.currentTimeMillis();
                        while (hashAnimalIterator.hasNext()) {
                            Animal n = hashAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                hashAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� hashArrayList ����� Iterator. ������: " + time + " ��.");


                        break;
                    case 4:
                    case 5:
                        Iterator<Animal> treeAnimalIterator = treeAnimalSetSortedByAge.iterator();
                        time = System.currentTimeMillis();
                        while (treeAnimalIterator.hasNext()) {
                            if ((int)treeAnimalIterator.next().getAge().length() > 25){
                                treeAnimalIterator.remove();//������� ���� ����� �� �������,����� ���� �������� �� ��� ������,���� �������� ��� ����������
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� treeAnimalSet ����� Iterator. ������: " + time + " ��.");
                        treeAnimalIterator = treeAnimalSetSortedByAge.iterator();
                        time = System.currentTimeMillis();
                        while (treeAnimalIterator.hasNext()) {
                            Animal n = treeAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                treeAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� treeArrayList ����� Iterator. ������: " + time + " ��.");
                        break;

                    default:
                        System.out.println("�������� ����� ��������.");
                        break;


                }
                break;
            case 2:
                switch (leverOfCollection) {
                    case 1:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < linkedAnimalList.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� linkedAnimalList ����� BasicLoop. ������: " + time + " ��.");
                        time = System.currentTimeMillis();
                        linkedAnimalList.sort(new AnimalAgeComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting LinkedList of Animal by age. ������: " + time + " ��.");

                        time = System.currentTimeMillis();
                        linkedAnimalList.sort(new AnimalAgeAndNickComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting LinkedList of Animal by age and nick. ������: " + time + " ��.");
                        Iterator<Animal> linkedAnimalIterator = linkedAnimalList.iterator();
                        time = System.currentTimeMillis();
                        while (linkedAnimalIterator.hasNext()) {
                            Animal n = linkedAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                linkedAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� linkedAnimalList ����� Iterator. ������: " + time + " ��.");
                        break;
                    case 2:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < arrayAnimalList.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� arrayAnimalList ����� BasicLoop. ������: " + time + " ��.");
                        time = System.currentTimeMillis();
                        arrayAnimalList.sort(new AnimalAgeComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting ArrayList of Animal by age. ������: " + time + " ��.");

                        time = System.currentTimeMillis();
                        arrayAnimalList.sort(new AnimalAgeAndNickComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: Sorting ArrayList of Animal by age and nick. ������: " + time + " ��.");
                        Iterator<Animal> arrayAnimalIterator = arrayAnimalList.iterator();
                        time = System.currentTimeMillis();
                        while (arrayAnimalIterator.hasNext()) {
                            Animal n = arrayAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                arrayAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� arrayAnimalList ����� Iterator. ������: " + time + " ��.");

                        break;
                    case 3:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < hashAnimalSet.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� hashAnimalSet ����� BasicLoop. ������: " + time + " ��.");
                        Iterator<Animal> hashAnimalIterator = hashAnimalSet.iterator();
                        time = System.currentTimeMillis();
                        while (hashAnimalIterator.hasNext()) {
                            Animal n = hashAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                hashAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� hashArrayList ����� Iterator. ������: " + time + " ��.");

                        break;
                    case 4:
                    case 5:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < treeAnimalSetSortedByAge.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: ������������ �� treeAnimalSet ����� BasicLoop. ������: " + time + " ��.");
                        Iterator<Animal> treeAnimalIterator = treeAnimalSetSortedByAge.iterator();
                        time = System.currentTimeMillis();
                        while (treeAnimalIterator.hasNext()) {
                            Animal n = treeAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                treeAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("��������: �������� ���� ��������� treeArrayList ����� Iterator. ������: " + time + " ��.");
                        break;

                    default:
                        System.out.println("�������� ����� ��������.");
                        break;


                }
                break;
            default:
                System.out.println("�������� ����� ��������.");
                break;
        }
    }
    
    public millionsOfObjects () { rnd = new Random(); }

    public char getChar() { return pool[rnd.nextInt(pool.length)]; }

    public String getStr(int sz) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sz; i++)
            sb.append(getChar());
        return new String(sb);
    }

    public void startWork() {
        Scanner scan = new Scanner(System.in);
        System.out.println("� ����� ������� ��������?\n1-Person\n2-Animal\n������� ����� ������:");
        switch(scan.nextInt()) {
            case 1:
                generatePersonObjects();
                break;
            case 2:
                generateAnimalObjects();
                break;
            default:
                break;
        }
        System.out.println("���������� ������?\n1-��\n2-���");
        switch(scan.nextInt()) {
            case 1:
                startWork();
                break;
        }


    }

    public static void main(String[] args) {
        millionsOfObjects tp = new millionsOfObjects ();
        tp.startWork();
        //hashPersonSet.sort(new PersonPassComparator()); HashSet �� ����������� ������������,��� ������� ������� ������ ����������������,�� ����� ������� � TreeSet

    }
}
