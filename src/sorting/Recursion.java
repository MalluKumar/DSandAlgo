package sorting;

public class Recursion {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
        System.out.println(iterativeFactorial(3));
    }

    // recursive approach
    public static int recursiveFactorial(int num) {

        // base condition
        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }

    // iterative approach
    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int sum = 1;

        for (int i = num; i > 0; i--) {
            sum *= i;
        }

        return sum;
    }
}
