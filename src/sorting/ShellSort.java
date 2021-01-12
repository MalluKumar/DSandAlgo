package sorting;

public class ShellSort {

    public static void main(String[] args) {

        int[] array = {8, 7, 9, 28, -20, -8, 0};

        for (int gap = array.length/2; gap > 0; gap /= 2) {

            for (int i = gap;  i < array.length; i++) {
                int element = array[i];

                int j = i;

                while(j >= gap && array[j - gap] > element) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = element;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
