package hashTables.problems;

import java.util.*;

public class DuplicateProblem {

    public static void main(String[] args) {

        Employee manager = new Employee("MS", "Dhonii", 36);
        Employee assistant1 = new Employee("Virat", "Kohli", 32);
        Employee assistant2 = new Employee("KL", "Rahul", 27);
        Employee assistant3 = new Employee("James", "Anderson", 38);
        Employee assistant4 = new Employee("KL", "Rahul", 27);

        LinkedList<Employee> employeeList = new LinkedList<>();

        employeeList.add(manager);
        employeeList.add(assistant1);
        employeeList.add(assistant2);
        employeeList.add(assistant3);
        employeeList.add(assistant4);

        employeeList.forEach(e -> System.out.println(e));
        System.out.println("------------------------------------------------------------");

        HashMap<Integer, Employee> result = new HashMap<>();

        ListIterator<Employee> iterator = employeeList.listIterator();
        List<Employee> removeList = new ArrayList<>();

        while (iterator.hasNext()) {

            Employee employee = iterator.next();

            if (result.containsKey(employee.getId())) {
                removeList.add(employee);
            } else {
                result.put(employee.getId(), employee);
            }

        }

        for (Employee employee : removeList) {
            employeeList.remove(employee);
        }

        employeeList.forEach(e -> System.out.println(e));

    }

}
