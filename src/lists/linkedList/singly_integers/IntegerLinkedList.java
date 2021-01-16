package lists.linkedList.singly_integers;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {

        IntegerNode newNode = new IntegerNode(value);

        newNode.setNext(head);
        head = newNode;
        size++;

    }

    public IntegerNode removeFromFront() {

        if (isEmpty()) {
            return null;
        }

        IntegerNode removeNode = head;

        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;

    }

    public void insetSorted(Integer value) {

        IntegerNode newNode = new IntegerNode(value);

        IntegerNode currentNode = head.getNext();
        IntegerNode previousNode = head;

        if (isEmpty() || head.getValue() >= value) {
            addToFront(value);
            return;
        } else {

            while (currentNode != null && value >= currentNode.getValue()) {
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }

            newNode.setNext(currentNode);
            previousNode.setNext(newNode);
            size++;

        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void print() {

        IntegerNode node = head;

        System.out.print("Head -> ");

        while (node != null) {
            System.out.print(node);
            System.out.print(" <=> ");
            node = node.getNext();
        }

        System.out.print("Null");

    }

}
