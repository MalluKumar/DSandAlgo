package lists.linkedList.singly;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addNode(Employee employee) {                 // adding employee to front or head

        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;

    }

    public EmployeeNode removeNode() {                      // removing employee at head

        EmployeeNode removeNode = head;

        if (! isEmpty()) {
            head = head.getNext();
            size--;
            removeNode.setNext(null);                      // optional
            return removeNode;
        } else {
            return null;
        }

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        EmployeeNode employeeNode = head;

        while (employeeNode != null) {
            System.out.println(employeeNode);
            employeeNode = employeeNode.getNext();
        }

    }

}
