package sorting;

public class MergeSort {

    public static void main (String[] args) {

        int[] array = {2, 1, 9, 10, 5, -2};

        split (array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void split (int[] array, int start, int end) {

        // all the elements are split when this is executed
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        split (array, start, mid);
        split (array, mid, end);
        merge (array, start, mid, end);

    }

    public static void merge (int[] array, int start, int mid, int end) {

        // when first element on the right side is greater than last element on the left side
        if (array[mid - 1] <= array[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[array.length];      // array.length or end - start

        while (i < mid && j < end) {
            tempArray[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        // Handling the remaining elements when left or right side is complete.
        // We need to copy remaining elements in the left side to original array,
        // but no need to copy the remaining elements in the right side as the temporary
        // array will be later copied back to original array.

        // copying leftover elements in left side
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(tempArray, 0, array, start, tempIndex);

    }

}
