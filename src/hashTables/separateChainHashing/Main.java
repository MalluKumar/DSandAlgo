package hashTables.separateChainHashing;

public class Main {

    public static void main(String[] args) {

        Employee manager = new Employee("MS", "Dhonii", 36);
        Employee assistant1 = new Employee("Virat", "Kohli", 32);
        Employee assistant2 = new Employee("KL", "Rahul", 27);
        Employee assistant3 = new Employee("James", "Anderson", 38);

        SeparateChainHashing ht = new SeparateChainHashing();

        ht.add(manager.getLastName(), manager);
        ht.add(assistant1.getLastName(), assistant1);
        ht.add(assistant2.getLastName(), assistant2);
        ht.add(assistant3.getLastName(), assistant3);
        ht.print();
        System.out.println("--------------------------------------------------------");

        System.out.println(ht.get(manager.getLastName()));
        System.out.println("--------------------------------------------------------");

        ht.remove(assistant2.getLastName());
        ht.print();

    }

}
