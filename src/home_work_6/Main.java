package src.home_work_6;

import src.home_work_6.Comparators.AnimalAgeAndNickComparator;
import src.home_work_6.Comparators.AnimalAgeComparator;
import src.home_work_6.Comparators.PersonPassAndNameComparator;
import src.home_work_6.Comparators.PersonPassComparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Андрей","aaaaa7");
        Person secondPerson = new Person("Артём","aaaaa2");
        Person thirdPerson = new Person("Аня","aaaaa2");
        Person fourthPerson = new Person("Валера","aaaaa234");
        Person fifthPerson = new Person("Яша","aaaaa21345");

        List<Person> personArr = new ArrayList<>();
        personArr.add(firstPerson);
        personArr.add(secondPerson);
        personArr.add(thirdPerson);
        personArr.add(fourthPerson);
        personArr.add(fifthPerson);
        Collections.sort(personArr,new PersonPassComparator());
        System.out.println("--------PassSort--------");
        for (Person human:
             personArr) {
            System.out.println(human.getPassword() + "; " + human.getNick());
        }

        System.out.println("--------PassAndNameSort--------");

        Collections.sort(personArr,new PersonPassAndNameComparator());
        for (Person human:
                personArr) {
            System.out.println(human.getPassword() + "; " + human.getNick());
        }

        Animal firstAnimal = new Animal("8","Вася");
        Animal secondAnimal = new Animal("7","Олег");
        Animal thirdAnimal = new Animal("5","Аркадий");
        Animal fourthAnimal = new Animal("5","Артём");
        Animal fifthAnimal = new Animal("5","Алина");

        List<Animal> animalArr = new ArrayList<>();
        animalArr.add(firstAnimal);
        animalArr.add(secondAnimal);
        animalArr.add(thirdAnimal);
        animalArr.add(fourthAnimal);
        animalArr.add(fifthAnimal);

        Collections.sort(animalArr,new AnimalAgeComparator());
        System.out.println("--------AgeSort--------");
        for (Animal animal:
                animalArr) {
            System.out.println(animal.getAge() + "; " + animal.getNick());
        }

        Collections.sort(animalArr,new AnimalAgeAndNickComparator());
        System.out.println("--------AgeAndNickSort--------");
        for (Animal animal:
                animalArr) {
            System.out.println(animal.getAge() + "; " + animal.getNick());
        }


    }
}
