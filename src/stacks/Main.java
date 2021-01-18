package stacks;

public class Main {

    public static void main (String[] args) {

        ArrayStack stack = new ArrayStack(3);

        stack.push(new Employee("Virat", "Male", 32));
        stack.push(new Employee("Dhoni", "Male", 35));
        stack.push(new Employee("Rahul", "Male", 28));
        stack.push(new Employee("Sweety", "Female", 14));
        System.out.println(stack.size());
        stack.print();
        System.out.println("----------------------------------------------");
        stack.pop();
        System.out.println(stack.size());
        stack.print();
        System.out.println("----------------------------------------------");
        System.out.println(stack.peek());
        System.out.println("----------------------------------------------");
        stack.print();

    }

}
