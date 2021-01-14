package sorting;

public class RadixSort {

    public static void main (String[] args) {

        int[] array = {8624, 4532, 9672, 1286, 4805, 5627, 4805};

        sort (array, 10, 4);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void sort (int[] array, int radix, int width) {

        for (int i = 0; i < width; i++) {
            radixSingleSort (array, i, radix);
        }

    }

    public static void radixSingleSort (int[] array, int position, int radix) {

        int[] tempArray = new int[radix];

        for (int value : array) {
            tempArray[getDigit(position, value, radix)]++;
        }

        for (int j = 1; j < radix; j++) {
            tempArray[j] += tempArray[j - 1];
        }

        int[] temp = new int[array.length];

        for (int tempIndex = array.length - 1; tempIndex >= 0; tempIndex--) {
            temp[--tempArray[getDigit(position, array[tempIndex], radix)]] = array[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < array.length; tempIndex++) {
            array[tempIndex] = temp[tempIndex];
        }

    }

    public static int getDigit (int position, int value, int radix) {
        return (value / (int) Math.pow(radix, position) ) % radix;
    }

}
