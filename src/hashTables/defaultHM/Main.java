package hashTables.defaultHM;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee manager = new Employee("MS", "Dhonii", 36);
        Employee assistant1 = new Employee("Virat", "Kohli", 32);
        Employee assistant2 = new Employee("KL", "Rahul", 27);
        Employee assistant3 = new Employee("James", "Anderson", 38);

        Map<String, Employee> map = new HashMap<>();

        map.put(manager.getLastName(), manager);
        map.put(assistant1.getLastName(), assistant1);
        map.put(assistant2.getLastName(), assistant2);
        map.put(assistant3.getLastName(), assistant3);

        Iterator<Employee> iterator = map.values().iterator();          // first method

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---------------------------------------------------------");
        map.forEach((k, v) -> System.out.println(v));                   // second method

        System.out.println("----------------------------------------------------------");
        System.out.println(map.containsKey("Kohli"));
        System.out.println(map.containsValue(manager));

    }

}
