package arrays;

public class arrayDemo {

    public static void main(String [] args) {

        int[] array = new int[5];
        double[] floatArray = new double[2];

        array[0] = 4;
        array[1] = 9;
        floatArray[0] = 12e6d;

        for (int i = 0; i < floatArray.length; i++) {
            System.out.println(floatArray[i]);
        }

    }

}
