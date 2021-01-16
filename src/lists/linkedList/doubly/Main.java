package lists.linkedList.doubly;

public class Main {

    public static void main (String[] args) {

        Employee manager = new Employee("Rahul", "Male", 28);
        Employee assistant = new Employee("Dravid", "Male", 50);
        Employee admin = new Employee("Sourav", "Male", 50);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        System.out.println(employeeLinkedList.isEmpty());  // before adding employees

        employeeLinkedList.addNodeToFront(manager);
        employeeLinkedList.addNodeToFront(assistant);

        System.out.println(employeeLinkedList.getSize());
        System.out.println(employeeLinkedList.isEmpty());   // after adding employees to front

        employeeLinkedList.print();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        employeeLinkedList.addNodeToEnd(admin);

        employeeLinkedList.print();                         // after adding employee to end
        System.out.println();
        System.out.println(employeeLinkedList.getSize());
        System.out.println("-----------------------------------------------------------------------------------------");

        employeeLinkedList.removeNodeFromFront();

        employeeLinkedList.print();                         // after removing employee from front
        System.out.println();
        System.out.println(employeeLinkedList.getSize());
        System.out.println("-----------------------------------------------------------------------------------------");

        employeeLinkedList.removeNodeFromLast();

        employeeLinkedList.print();                         // after removing employee from last
        System.out.println();
        System.out.println(employeeLinkedList.getSize());
        System.out.println("-----------------------------------------------------------------------------------------");

        employeeLinkedList.addBefore(assistant, manager);   // case 1: when only one employee is present

        employeeLinkedList.print();                         // after adding employee before existing employee
        System.out.println();
        System.out.println(employeeLinkedList.getSize());
        System.out.println("-----------------------------------------------------------------------------------------");

        employeeLinkedList.addBefore(new Employee("Virat", "Male", 32), manager); // case 2 : when multiple employees are present

        employeeLinkedList.print();                         // after adding employee before existing employee
        System.out.println();
        System.out.println(employeeLinkedList.getSize());
        System.out.println("-----------------------------------------------------------------------------------------");

    }

}
