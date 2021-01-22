package hashTables.openAddressing;

public class Main {

    public static void main(String[] args) {

        Employee manager = new Employee("MS", "Dhonii", 36);
        Employee assistant1 = new Employee("Virat", "Kohli", 32);
        Employee assistant2 = new Employee("KL", "Rahul", 27);
        Employee assistant3 = new Employee("James", "Anderson", 38);

        LinearProbing ht = new LinearProbing();

        ht.put(manager.getLastName(), manager);
        ht.put(assistant1.getLastName(), assistant1);
        ht.put(assistant2.getLastName(), assistant2);
        ht.put(assistant3.getLastName(), assistant3);
        ht.print();
        System.out.println("--------------------------------------------------------");

        System.out.println(ht.get(manager.getLastName()));
        System.out.println("--------------------------------------------------------");

        ht.remove(manager.getLastName());
        ht.print();

    }

}
