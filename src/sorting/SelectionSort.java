package sorting;

public class SelectionSort {

    public static void main(String [] args) {

        int[] array = {1, 5, 2, -8, -9, 35, -20, 56};

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestIndex = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[largestIndex] < array[i]) {
                    largestIndex = i;
                }
            }

            swap(array, largestIndex, lastUnsortedIndex);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
