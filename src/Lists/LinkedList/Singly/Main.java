package Lists.LinkedList.Singly;

public class Main {

    public static void main (String[] args) {

        Employee manager = new Employee("Rahul", "Male", 28);
        Employee assistant = new Employee("Dravid", "Male", 50);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        System.out.println(employeeLinkedList.isEmpty());  // before adding employees

        employeeLinkedList.addNode(manager);
        employeeLinkedList.addNode(assistant);

        System.out.println(employeeLinkedList.getSize());
        System.out.println(employeeLinkedList.isEmpty());   // after adding employees

        employeeLinkedList.print();
        System.out.println("----------------------------------");

        employeeLinkedList.removeNode();
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.print();

    }

}
