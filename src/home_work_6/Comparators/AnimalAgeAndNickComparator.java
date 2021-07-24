package src.home_work_6.Comparators;

import src.home_work_6.Animal;

import java.util.Comparator;

public class AnimalAgeAndNickComparator implements Comparator<Animal> {
    public int compare(Animal firstAnimal, Animal secondAnimal) {
        if (Integer.parseInt (firstAnimal.getAge()) < Integer.parseInt (secondAnimal.getAge())) {
            return 1;
        } else if (Integer.parseInt (firstAnimal.getAge()) > Integer.parseInt (secondAnimal.getAge())) {
            return -1;
        } else {
            if (firstAnimal.getNick().compareTo(secondAnimal.getNick()) < 0) {
            return -1;
            } else {
                if (firstAnimal.getNick().compareTo(secondAnimal.getNick()) > 0) {
                    return 1;
                } else {
                        return 0;
                }
            }
        }
        }
    }