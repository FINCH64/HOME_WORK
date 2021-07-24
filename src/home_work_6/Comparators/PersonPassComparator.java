package src.home_work_6.Comparators;

import src.home_work_6.Person;

import java.util.Comparator;

public class PersonPassComparator implements Comparator<Person> {
    public int compare(Person firstPerson, Person secondPerson ) {
        if (firstPerson.getPassword().length() < secondPerson.getPassword().length()) {
            return 1;
        }   else if (secondPerson.getPassword().length() < firstPerson.getPassword().length()) {
            return -1;
        }   else {
            return 0;
        }
    }
}
