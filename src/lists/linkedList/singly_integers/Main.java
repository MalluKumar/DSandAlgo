package lists.linkedList.singly_integers;

public class Main {

    public static void main (String[] args) {

        IntegerLinkedList integerLinkedList = new IntegerLinkedList();

        integerLinkedList.addToFront(5);
        integerLinkedList.addToFront(1);
        integerLinkedList.addToFront(-20);

        integerLinkedList.print();                         // after adding integers to front
        System.out.println();
        System.out.println(integerLinkedList.size());
        System.out.println("-----------------------------------------------------------------------------------------");

        integerLinkedList.removeFromFront();

        integerLinkedList.print();                         // after removing integers from front
        System.out.println();
        System.out.println(integerLinkedList.size());
        System.out.println("-----------------------------------------------------------------------------------------");

        integerLinkedList.insetSorted(2);
        integerLinkedList.insetSorted(9);
        integerLinkedList.insetSorted(4);

        integerLinkedList.print();                         // after removing integers from front
        System.out.println();
        System.out.println(integerLinkedList.size());
        System.out.println("-----------------------------------------------------------------------------------------");

    }

}
