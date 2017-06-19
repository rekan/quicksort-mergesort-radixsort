import java.util.ArrayList;
import java.util.List;

public class RadixSort {
    public static void radixSort(int[] arr) {
        final int RADIX = 10;

        List<Integer>[] buckets = new ArrayList[RADIX];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        boolean sorted = false;
        int temp, placeValue = 1;

        while (!sorted) {
            sorted = true;
            for (Integer element : arr) {
                temp = element / placeValue;
                buckets[temp % RADIX].add(element);
                if (sorted && temp > 0) {
                    sorted = false;
                }
            }
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : buckets[b]) {
                    arr[a++] = i;
                }
                buckets[b].clear();
            }
            placeValue = placeValue * RADIX;
        }
    }
}
