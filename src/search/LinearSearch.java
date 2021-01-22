package search;

public class LinearSearch {

    public static void main(String[] args) {

        int[] array = {5, 9, 1, 2, 0, 6, 7};

        System.out.println(linearSearch(array, 0));

    }

    public static int linearSearch(int[] array, int searchElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                return i;
            }
        }

        return -1;
    }

}
