package search;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {5, 9, 20, 66, 88, 532, 1000, 1001};

        System.out.println(iterativeBinarySearch(array, 1000));
        System.out.println(recursiveBinarySearch(array, 1000));

    }

    // First Method: Iterative approach
    public static int iterativeBinarySearch(int[] array, int value) {

        int start = 0;
        int end = array.length;

        while (start < end) {

            int mid = (start + end) / 2;

            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return -1;

    }

    // Second Method: Recursive approach
    public static int recursiveBinarySearch(int[] array, int value) {
        return recursiveBinarySearch(array, 0, array.length, value);
    }

    public static int recursiveBinarySearch(int[] array, int start, int end, int value) {

        //Base condition
        if (start >= end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (array[mid] == value) {
            return mid;
        } else if (array[mid] < value) {
            return recursiveBinarySearch(array, mid + 1, end, value);
        } else {
            return recursiveBinarySearch(array, start, mid, value);
        }

    }

}
