package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void main(String[] args) {

        int[] array = {2, 9, 6, 5, -5, 7, 7, 0};

        bucketSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void bucketSort(int[] array) {

        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();                 // can use linkedlist instead of arraylist.
        }

        for (int i = 0; i < array.length; i++) {
            buckets[hash(array[i])].add(array[i]);
        }

        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                array[j++] = value;
            }
        }

    }

    private static int hash(int value) {
        return value / (int) 10;
    }

}
