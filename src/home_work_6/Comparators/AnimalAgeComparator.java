package src.home_work_6.Comparators;

import src.home_work_6.Animal;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    public int compare(Animal firstAnimal, Animal secondAnimal ) {
        if ( Integer.parseInt (firstAnimal.getAge()) < Integer.parseInt (secondAnimal.getAge())) {
            return 1;
        }   else if (Integer.parseInt (firstAnimal.getAge()) > Integer.parseInt (secondAnimal.getAge())) {
            return -1;
        }   else {
            return 0;
        }
    }
}
