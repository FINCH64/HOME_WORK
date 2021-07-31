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
        System.out.println("Сколько экземпляров создать?");
        Scanner scan = new Scanner(System.in);
        countOfObjects = scan.nextInt();
        System.out.println("Какую коллекцию заполнить?\n1-LinkedList\n2-ArrayList\n3-HashSet\n4-TreeSet sorted by Pass\n5-TreeSet sorted by pass and name\n Введите номер коллекции:");
        switch (scan.nextInt()) {
            case 1:
                time = System.currentTimeMillis();
                for (int i = 0; i < countOfObjects; i++) {
                    Person personObject = new Person(getStr((int) (Math.random() * 10)),getStr((int) (Math.random() * 5) + 5));
                    linkedPersonList.add(personObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("Операция: Filling LinkedList with Person. Заняла: " + time + " мс.");
                leverOfCollection = 1;
                break;
            case 2:
                time = System.currentTimeMillis();
                for (int i = 0; i < countOfObjects; i++) {
                    Person personObject = new Person(getStr((int) (Math.random() * 10)), getStr((int) (Math.random() * 5) + 5));
                    arrayPersonList.add(personObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("Операция: Filling ArrayList with Person. Заняла: " + time + " мс.");
                leverOfCollection = 2;
                break;
            case 3:
                time = System.currentTimeMillis();
                for (int i = 0; i < countOfObjects; i++) {
                    Person personObject = new Person(getStr((int) (Math.random() * 10)), getStr((int) (Math.random() * 5) + 5));
                    hashPersonSet.add(personObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("Операция: Filling HashSet with Person. Заняла: " + time + " мс.");
                leverOfCollection = 3;
                break;
            case 4:
                time = System.currentTimeMillis();
                for (int i = 0; i < countOfObjects; i++) {
                    Person personObject = new Person(getStr((int) (Math.random() * 10)), getStr((int) (Math.random() * 5) + 5));
                    treePersonSetSortedByPass.add(personObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("Операция: Filling TreeSet sorted by pass with Person. Заняла: " + time + " мс.");
                leverOfCollection = 4;
                break;
            case 5:
                time = System.currentTimeMillis();
                for (int i = 0; i < countOfObjects; i++) {
                    Person personObject = new Person(getStr((int) (Math.random() * 10)), getStr((int) (Math.random() * 5) + 5));
                    treePersonSetSortedByPassAndName.add(personObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("Операция: Filling TreeSet sorted by pass and name with Person. Заняла: " + time + " мс.");
                leverOfCollection = 5;
                break;
            default:
                System.out.println("Неверный номер операции.");
                leverOfCollection = 6;
                break;
        }
        iterateSortAndDeletePersonObjects();
    }

    public void generateAnimalObjects() {
        leverOfClass = 2;
        int countOfObjects;
        System.out.println("Сколько экземпляров создать?");
        Scanner scan = new Scanner(System.in);
        countOfObjects = scan.nextInt();
        System.out.println("Какую коллекцию заполнить?\n1-LinkedList\n2-ArrayList\n3-HashSet\n4-TreeSet sorted by Pass\n5-TreeSet sorted by pass and name\n Введите номер коллекции:");
        switch (scan.nextInt()) {
            case 1:
                time = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {
                    Animal animalObject = new Animal(Integer.toString((int) (Math.random() * 15)),getStr((int) (Math.random() * 10)));
                    linkedAnimalList.add(animalObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("Операция: Filling LinkedList with Animal. Заняла: " + time + " мс.");
                leverOfCollection = 1;
                break;
            case 2:
                time = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {
                    Animal animalObject = new Animal(Integer.toString((int) (Math.random() * 15)),getStr((int) (Math.random() * 10)));
                    arrayAnimalList.add(animalObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("Операция: Filling ArrayList with Animal. Заняла: " + time + " мс.");
                leverOfCollection = 2;
                break;
            case 3:
                time = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {
                    Animal animalObject = new Animal(Integer.toString((int) (Math.random() * 15)),getStr((int) (Math.random() * 10)));
                    hashAnimalSet.add(animalObject);

                }
                time = System.currentTimeMillis() - time;
                System.out.println("Операция: Filling HashSet with Animal. Заняла: " + time + " мс.");
                leverOfCollection = 3;
                break;
            case 4:
                time = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {
                    Animal animalObject = new Animal(Integer.toString((int) (Math.random() * 15)),getStr((int) (Math.random() * 10)));
                    treeAnimalSetSortedByAge.add(animalObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("Операция: Filling TreeSet sorted by age with Animal. Заняла: " + time + " мс.");
                leverOfCollection = 4;
                break;
            case 5:
                time = System.currentTimeMillis();
                for (int i = 0; i < 1000000; i++) {
                    Animal animalObject = new Animal(Integer.toString((int) (Math.random() * 15)),getStr((int) (Math.random() * 10)));
                    treeAnimalSetSortedByAgeAndNick.add(animalObject);
                }
                time = System.currentTimeMillis() - time;
                System.out.println("Операция: Filling TreeSet sorted by age and Nick with Animal. Заняла: " + time + " мс.");
                leverOfCollection = 5;
                break;
            default:
                System.out.println("Неверный номер операции.");
                leverOfCollection = 6;
                break;
        }
        iterateSortAndDeleteAnimalObjects();
    }

    public void iterateSortAndDeletePersonObjects() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Итерировать через:\n1-Iterator\n2-BasicLoop\nВведите номер операции:");
        switch(scan.nextInt()) {
            case 1:
                switch(leverOfCollection) {
                    case 1:
                        Iterator<Person> linkedPersonIterator = linkedPersonList.iterator();
                        time = System.currentTimeMillis();
                        while (linkedPersonIterator.hasNext()) {
                            if (linkedPersonIterator.next().getPassword().length() > 25){
                                linkedPersonIterator.remove();//вставил хоть какое то условие,чтобы цикл итерации не был пустым,хотя нарушить его невозможно
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по linkedPersonList через Iterator. Заняла: " + time + " мс.");
                        time = System.currentTimeMillis();
                        linkedPersonList.sort(new PersonPassComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting LinkedList of Person by pass. Заняла: " + time + " мс.");

                        time = System.currentTimeMillis();
                        linkedPersonList.sort(new PersonPassAndNameComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting LinkedList of Person by pass and name. Заняла: " + time + " мс.");
                        linkedPersonIterator = linkedPersonList.iterator();
                        time = System.currentTimeMillis();
                        while (linkedPersonIterator.hasNext()) {
                            Person n = linkedPersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                linkedPersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов linkedPersonList через Iterator. Заняла: " + time + " мс.");
                        break;
                    case 2:
                        Iterator<Person> arrayPersonIterator = arrayPersonList.iterator();
                        time = System.currentTimeMillis();
                        while (arrayPersonIterator.hasNext()) {
                            if (arrayPersonIterator.next().getPassword().length() > 25){
                                arrayPersonIterator.remove();//вставил хоть какое то условие,чтобы цикл итерации не был пустым,хотя нарушить его невозможно
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по arrayPersonList через Iterator. Заняла: " + time + " мс.");
                        time = System.currentTimeMillis();
                        arrayPersonList.sort(new PersonPassComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting ArrayList of Person by pass. Заняла: " + time + " мс.");

                        time = System.currentTimeMillis();
                        arrayPersonList.sort(new PersonPassAndNameComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting ArrayList of Person by pass and name. Заняла: " + time + " мс.");
                        arrayPersonIterator = arrayPersonList.iterator();
                        time = System.currentTimeMillis();
                        while (arrayPersonIterator.hasNext()) {
                            Person n = arrayPersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                arrayPersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов arrayPersonList через Iterator. Заняла: " + time + " мс.");

                        break;
                    case 3:
                        Iterator<Person> hashPersonIterator = hashPersonSet.iterator();
                        time = System.currentTimeMillis();
                        while (hashPersonIterator.hasNext()) {
                            if (hashPersonIterator.next().getPassword().length() > 25){
                                hashPersonIterator.remove();//вставил хоть какое то условие,чтобы цикл итерации не был пустым,хотя нарушить его невозможно
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по hashPersonSet через Iterator. Заняла: " + time + " мс.");
                        hashPersonIterator = hashPersonSet.iterator();
                        time = System.currentTimeMillis();
                        while (hashPersonIterator.hasNext()) {
                            Person n = hashPersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                hashPersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов hashPersonSet через Iterator. Заняла: " + time + " мс.");
                        break;
                    case 4:
                    case 5:
                        Iterator<Person> treePersonIterator = treePersonSetSortedByPass.iterator();
                        time = System.currentTimeMillis();
                        while (treePersonIterator.hasNext()) {
                            if (treePersonIterator.next().getPassword().length() > 25){
                                treePersonIterator.remove();//вставил хоть какое то условие,чтобы цикл итерации не был пустым,хотя нарушить его невозможно
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по treePersonSet через Iterator. Заняла: " + time + " мс.");
                        treePersonIterator = treePersonSetSortedByPass.iterator();
                        time = System.currentTimeMillis();
                        while (treePersonIterator.hasNext()) {
                            Person n = treePersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                treePersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов treePersonSet через Iterator. Заняла: " + time + " мс.");
                        break;
                    default:
                        System.out.println("Неверный номер операции.");
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
                        System.out.println("Операция: Итерирование по linkedPersonList через BasicLoop. Заняла: " + time + " мс.");

                        time = System.currentTimeMillis();
                        linkedPersonList.sort(new PersonPassComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting LinkedList of Person by pass. Заняла: " + time + " мс.");

                        time = System.currentTimeMillis();
                        linkedPersonList.sort(new PersonPassAndNameComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting LinkedList of Person by pass and name. Заняла: " + time + " мс.");
                        Iterator<Person> linkedPersonIterator = linkedPersonList.iterator();
                        time = System.currentTimeMillis();
                        while (linkedPersonIterator.hasNext()) {
                            Person n = linkedPersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                linkedPersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов linkedPersonList через Iterator. Заняла: " + time + " мс.");break;
                    case 2:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < arrayPersonList.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по arrayPersonList через BasicLoop. Заняла: " + time + " мс.");
                        time = System.currentTimeMillis();
                        arrayPersonList.sort(new PersonPassComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting ArrayList of Person by pass. Заняла: " + time + " мс.");

                        time = System.currentTimeMillis();
                        arrayPersonList.sort(new PersonPassAndNameComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting ArrayList of Person by pass and name. Заняла: " + time + " мс.");
                        Iterator<Person> arrayPersonIterator = arrayPersonList.iterator();
                        time = System.currentTimeMillis();
                        while (arrayPersonIterator.hasNext()) {
                            Person n = arrayPersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                arrayPersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов arrayPersonList через Iterator. Заняла: " + time + " мс.");

                        break;
                    case 3:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < hashPersonSet.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по hashPersonSet через BasicLoop. Заняла: " + time + " мс.");
                        Iterator<Person> hashPersonIterator = hashPersonSet.iterator();
                        time = System.currentTimeMillis();
                        while (hashPersonIterator.hasNext()) {
                            Person n = hashPersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                hashPersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов hashPersonSet через Iterator. Заняла: " + time + " мс.");

                        break;
                    case 4:
                    case 5:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < treePersonSetSortedByPass.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по treePersonSet через BasicLoop. Заняла: " + time + " мс.");
                        Iterator<Person> treePersonIterator = treePersonSetSortedByPass.iterator();
                        time = System.currentTimeMillis();
                        while (treePersonIterator.hasNext()) {
                            Person n = treePersonIterator.next();
                            if (n.getNick().length()>= 0) {
                                treePersonIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов treePersonSet через Iterator. Заняла: " + time + " мс.");

                        break;
                    default:
                        System.out.println("Неверный номер операции.");
                        break;
                }
                break;
            default:
                System.out.println("Неверный номер операции.");
                break;
        }
    }

    public void iterateSortAndDeleteAnimalObjects() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Итерировать через:\n1-Iterator\n2-BasicLoop\nВведите номер операции:");
        switch(scan.nextInt()) {
            case 1:
                switch (leverOfCollection) {
                    case 1:
                        Iterator<Animal> linkedAnimalIterator = linkedAnimalList.iterator();
                        time = System.currentTimeMillis();
                        while (linkedAnimalIterator.hasNext()) {
                            if ((int)linkedAnimalIterator.next().getAge().length() > 25){
                                linkedAnimalIterator.remove();//вставил хоть какое то условие,чтобы цикл итерации не был пустым,хотя нарушить его невозможно
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по linkedAnimalList через Iterator. Заняла: " + time + " мс.");
                        time = System.currentTimeMillis();
                        linkedAnimalList.sort(new AnimalAgeComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting LinkedList of Animal by age. Заняла: " + time + " мс.");

                        time = System.currentTimeMillis();
                        linkedAnimalList.sort(new AnimalAgeAndNickComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting LinkedList of Animal by age and nick. Заняла: " + time + " мс.");
                        linkedAnimalIterator = linkedAnimalList.iterator();
                        time = System.currentTimeMillis();
                        while (linkedAnimalIterator.hasNext()) {
                            Animal n = linkedAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                linkedAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов linkedAnimalList через Iterator. Заняла: " + time + " мс.");
                        break;
                    case 2:
                        Iterator<Animal> arrayAnimalIterator = arrayAnimalList.iterator();
                        time = System.currentTimeMillis();
                        while (arrayAnimalIterator.hasNext()) {
                            if ((int)arrayAnimalIterator.next().getAge().length() > 25){
                                arrayAnimalIterator.remove();//вставил хоть какое то условие,чтобы цикл итерации не был пустым,хотя нарушить его невозможно
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по arrayAnimalList через Iterator. Заняла: " + time + " мс.");
                        time = System.currentTimeMillis();
                        arrayAnimalList.sort(new AnimalAgeComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting ArrayList of Animal by age. Заняла: " + time + " мс.");

                        time = System.currentTimeMillis();
                        arrayAnimalList.sort(new AnimalAgeAndNickComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting ArrayList of Animal by age and nick. Заняла: " + time + " мс.");
                        arrayAnimalIterator = arrayAnimalList.iterator();
                        time = System.currentTimeMillis();
                        while (arrayAnimalIterator.hasNext()) {
                            Animal n = arrayAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                arrayAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов arrayAnimalList через Iterator. Заняла: " + time + " мс.");

                        break;
                    case 3:
                        Iterator<Animal> hashAnimalIterator = hashAnimalSet.iterator();
                        time = System.currentTimeMillis();
                        while (hashAnimalIterator.hasNext()) {
                            if ((int)hashAnimalIterator.next().getAge().length() > 25){
                                hashAnimalIterator.remove();//вставил хоть какое то условие,чтобы цикл итерации не был пустым,хотя нарушить его невозможно
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по hashAnimalSet через Iterator. Заняла: " + time + " мс.");
                        hashAnimalIterator = hashAnimalSet.iterator();
                        time = System.currentTimeMillis();
                        while (hashAnimalIterator.hasNext()) {
                            Animal n = hashAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                hashAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов hashArrayList через Iterator. Заняла: " + time + " мс.");


                        break;
                    case 4:
                    case 5:
                        Iterator<Animal> treeAnimalIterator = treeAnimalSetSortedByAge.iterator();
                        time = System.currentTimeMillis();
                        while (treeAnimalIterator.hasNext()) {
                            if ((int)treeAnimalIterator.next().getAge().length() > 25){
                                treeAnimalIterator.remove();//вставил хоть какое то условие,чтобы цикл итерации не был пустым,хотя нарушить его невозможно
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по treeAnimalSet через Iterator. Заняла: " + time + " мс.");
                        treeAnimalIterator = treeAnimalSetSortedByAge.iterator();
                        time = System.currentTimeMillis();
                        while (treeAnimalIterator.hasNext()) {
                            Animal n = treeAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                treeAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов treeArrayList через Iterator. Заняла: " + time + " мс.");
                        break;

                    default:
                        System.out.println("Неверный номер операции.");
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
                        System.out.println("Операция: Итерирование по linkedAnimalList через BasicLoop. Заняла: " + time + " мс.");
                        time = System.currentTimeMillis();
                        linkedAnimalList.sort(new AnimalAgeComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting LinkedList of Animal by age. Заняла: " + time + " мс.");

                        time = System.currentTimeMillis();
                        linkedAnimalList.sort(new AnimalAgeAndNickComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting LinkedList of Animal by age and nick. Заняла: " + time + " мс.");
                        Iterator<Animal> linkedAnimalIterator = linkedAnimalList.iterator();
                        time = System.currentTimeMillis();
                        while (linkedAnimalIterator.hasNext()) {
                            Animal n = linkedAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                linkedAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов linkedAnimalList через Iterator. Заняла: " + time + " мс.");
                        break;
                    case 2:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < arrayAnimalList.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по arrayAnimalList через BasicLoop. Заняла: " + time + " мс.");
                        time = System.currentTimeMillis();
                        arrayAnimalList.sort(new AnimalAgeComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting ArrayList of Animal by age. Заняла: " + time + " мс.");

                        time = System.currentTimeMillis();
                        arrayAnimalList.sort(new AnimalAgeAndNickComparator());
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Sorting ArrayList of Animal by age and nick. Заняла: " + time + " мс.");
                        Iterator<Animal> arrayAnimalIterator = arrayAnimalList.iterator();
                        time = System.currentTimeMillis();
                        while (arrayAnimalIterator.hasNext()) {
                            Animal n = arrayAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                arrayAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов arrayAnimalList через Iterator. Заняла: " + time + " мс.");

                        break;
                    case 3:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < hashAnimalSet.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по hashAnimalSet через BasicLoop. Заняла: " + time + " мс.");
                        Iterator<Animal> hashAnimalIterator = hashAnimalSet.iterator();
                        time = System.currentTimeMillis();
                        while (hashAnimalIterator.hasNext()) {
                            Animal n = hashAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                hashAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов hashArrayList через Iterator. Заняла: " + time + " мс.");

                        break;
                    case 4:
                    case 5:
                        time = System.currentTimeMillis();
                        for (int i = 0; i < treeAnimalSetSortedByAge.size(); i++) {

                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Итерирование по treeAnimalSet через BasicLoop. Заняла: " + time + " мс.");
                        Iterator<Animal> treeAnimalIterator = treeAnimalSetSortedByAge.iterator();
                        time = System.currentTimeMillis();
                        while (treeAnimalIterator.hasNext()) {
                            Animal n = treeAnimalIterator.next();
                            if (n.getNick().length()>= 0) {
                                treeAnimalIterator.remove();
                            }
                        }
                        time = System.currentTimeMillis() - time;
                        System.out.println("Операция: Удаление всех элементов treeArrayList через Iterator. Заняла: " + time + " мс.");
                        break;

                    default:
                        System.out.println("Неверный номер операции.");
                        break;


                }
                break;
            default:
                System.out.println("Неверный номер операции.");
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
        System.out.println("С каким классом работать?\n1-Person\n2-Animal\nВведите номер класса:");
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
        System.out.println("Продолжить работу?\n1-Да\n2-Нет");
        switch(scan.nextInt()) {
            case 1:
                startWork();
                break;
        }


    }

    public static void main(String[] args) {
        millionsOfObjects tp = new millionsOfObjects ();
        tp.startWork();
        //hashPersonSet.sort(new PersonPassComparator()); HashSet не сортируется компаратором,при желании хранить данные отсортированными,их лучше хранить в TreeSet

    }
}
