package sorting;

public class CountingSort {

    public static void main (String[] args) {

        int[] array = {5, 9, 6, 8, 7, 3, 2, 2, 5, 5};

        sort (array, 1, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void sort (int[] array, int min, int max) {

        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - 1]++;
        }

        int j = 0;

        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                array[j++] = i;
                countArray[i - min]--;
            }
        }

        /*
         * Second method to write above for loop
         *
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0) {
                array[j++] = i + 1;
                countArray[i]--;
            }
        }
        */

    }

}
