package queue.circular;

public class Main {

    public static void main (String[] args) {

        Employee manager = new Employee("Virat", "Male", 32);
        Employee captain = new Employee("Rahane", "Male", 30);
        Employee vc = new Employee("Rohit", "Male", 35);

        CircularQueue queue = new CircularQueue(5);

        queue.add(manager);
        queue.add(captain);
        queue.add(vc);
        queue.print();
        System.out.println(queue.size());
        System.out.println("------------------------------------");

        queue.remove();
        System.out.println(queue.size());
        queue.print();
        System.out.println("-------------------------------------");

        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println("-------------------------------------");

    }

}
