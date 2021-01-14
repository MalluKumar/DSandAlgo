package sorting;

public class RadixSort_String {

    public static void main (String[] args) {

        String[] array = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort (array, 26, 5);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void radixSort (String[] array, int radix, int width) {

        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort (array, i, radix);
        }

    }

    public static void radixSingleSort (String[] array, int position, int radix) {

        int[] tempArray = new int[radix];

        for (String value : array) {
            tempArray[getIndex(position, value)]++;
        }

        // to get stable sorting
        for (int i = 1; i < radix; i++) {
            tempArray[i] += tempArray[i - 1];
        }

        String[] temp = new String[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            temp[--tempArray[getIndex(position, array[i])]] = array[i];
        }

        for (int i = 0; i < temp.length; i++) {
            array[i] = temp[i];
        }

    }

    public static int getIndex (int position, String value) {
        return value.charAt(position) - 'a';
    }

}
