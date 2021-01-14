package sorting;

public class InsertionSort_Recursion {

    public static void main (String[] args) {

        int[] array = {4, 1, 9, -4, 3, 0, 4};

        sort (array, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void sort (int[] array, int num) {

        // Base condition
        if (num < 2) {
            return;
        }

        sort (array, num - 1);

        int element = array[num - 1];
        int i;

        for (i = num - 1; i>0 && array[i-1] > element; i--) {
            array[i] = array[i - 1];
        }

        array[i] = element;

    }

}
