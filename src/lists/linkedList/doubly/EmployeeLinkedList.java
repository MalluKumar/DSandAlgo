package lists.linkedList.doubly;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addNodeToFront(Employee employee) {                 // adding employee to front or head

        EmployeeNode node = new EmployeeNode(employee);

        if (isEmpty()) {
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;

    }

    public void addNodeToEnd(Employee employee) {

        EmployeeNode employeeNode = new EmployeeNode(employee);

        if (isEmpty()) {
            head = employeeNode;
        } else {
            tail.setNext(employeeNode);
            employeeNode.setPrevious(tail);
            employeeNode.setNext(null);                     // optional
        }

        tail = employeeNode;
        size++;

    }

    public boolean addBefore (Employee newEmployee, Employee existingEmployee) {

        if (isEmpty()) {
            return false;
        }

        EmployeeNode currentEmployeeNode = head;

        EmployeeNode newNode = new EmployeeNode(newEmployee);

        while (currentEmployeeNode.getNext() != null && ! currentEmployeeNode.getEmployee().equals(existingEmployee)) {
            currentEmployeeNode = currentEmployeeNode.getNext();
        }

        if (currentEmployeeNode == null) {
            return false;
        } else {
            if (head == currentEmployeeNode) {
                head = newNode;
            } else {
                currentEmployeeNode.getPrevious().setNext(newNode);
            }

            newNode.setPrevious(currentEmployeeNode.getPrevious());
            currentEmployeeNode.setPrevious(newNode);
            newNode.setNext(currentEmployeeNode);
            size++;
            return true;

        }

     }

    public EmployeeNode removeNodeFromFront() {                      // removing employee at head

        EmployeeNode removeNode = head;

        if (! isEmpty()) {
            if (head.getNext() != null) {
                head.getNext().setPrevious(null);
                head = head.getNext();
                removeNode.setNext(null);                      // optional
            } else {
                head = null;
                tail = null;
            }
            size--;
            return removeNode;
        } else {
            return null;
        }

    }

    public EmployeeNode removeNodeFromLast() {

        EmployeeNode removeNode = tail;

        if (isEmpty()) {
            return null;
        }

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        return removeNode;

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        EmployeeNode employeeNode = head;

        System.out.print("head --> ");
        while (employeeNode != null) {
            System.out.print(employeeNode);
            System.out.print(" <==> ");
            employeeNode = employeeNode.getNext();
        }
        System.out.print("null");

    }

}
