package stacks;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] employeeStack;
    private int top;

    public ArrayStack (int capacity) {
        employeeStack = new Employee[capacity];
    }

    public void push (Employee employee) {

        if (top == employeeStack.length) {

            // Resize the array
            Employee[] newStack = new Employee[2 * employeeStack.length];

            System.arraycopy (employeeStack, 0, newStack, 0, employeeStack.length);
            employeeStack = newStack;
        }

        employeeStack[top++] = employee;

    }

    public Employee pop () {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee = employeeStack[--top];
        employeeStack[top] = null;
        return employee;

    }

    public Employee peek() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return employeeStack[top - 1];             // to get top element in the stack without removing it from stack

    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void print() {

        for (int i = top - 1; i >= 0; i--) {
            System.out.println(employeeStack[i]);
        }

    }

}
