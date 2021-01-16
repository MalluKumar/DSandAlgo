package lists.arrayList;

import java.util.ArrayList;
import java.util.List;

public class TestPerson {

    public static void main (String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Virat", "Kohli", 26));
        persons.add(new Person("Rohit", "Sharma", 24));
        persons.add(new Person("MS", "Dhoni", 14));
        persons.add(new Person("KL", "Rahul", 10));

        persons.forEach(person -> System.out.println(person));
        System.out.println("---------------------------------------------");

        persons.set(3, new Person("Rahul", "Dravid", 44));
        persons.forEach(person -> {System.out.println(person);});
        System.out.println("----------------------------------------------");

        Person[] personArray = persons.toArray(new Person[persons.size()]);

        for (Person person : personArray) {
            System.out.println(person);
        }
        System.out.println("-----------------------------------------------");

        persons.remove(0);

        persons.forEach(person -> System.out.println(person));
        System.out.println("-----------------------------------------------");

        System.out.println(persons.contains(new Person("Rohit", "Sharma", 24)));
        System.out.println(persons.indexOf(new Person("MS", "Dhoni", 14)));

        System.out.println("------------------------------------------------");

    }

}
