package sorting;

public class InsertionSort {

    public static void main (String[] args) {

        int[] array = {6, 2, 5, 3, -7, 1};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {

            int element = array[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex;  i > 0 && array[i-1] > element; i--) {
                array[i] = array[i-1];
            }

            array[i] = element;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
