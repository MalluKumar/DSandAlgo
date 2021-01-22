package hashTables.problems;

public class SimpleHashing {

    public static void main (String[] args) {

        int[] array = {59382, 43, 6894, 500, 99, -58};
        int[] result = new int[10];

        for (int i = 0; i < array.length; i++) {
            result[hash(array[i])] = array[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static int hash(int num) {
        return Math.abs(num % 10);
    }

}
