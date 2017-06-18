public class MergeSort {
    public static void mergeSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p+r)/2;
            mergeSort(arr, p, q);
            mergeSort(arr, q+1, r);
            merge(arr, p, q, r);
        }
    }

    private static void merge(int[] arr, int p, int q, int r) {
        int[] low = new int[q-p+1];
        int[] high = new int[r-q];

        int k = p;
        int i;
        int j;

        for (i = 0; k <= q; i++, k++) {
            low[i] = arr[k];
        }
        for (j = 0; k <= r; j++, k++) {
            high[j] = arr[k];
        }

        k = p;
        i = 0;
        j = 0;

        while (i < low.length && j < high.length) {
            if (low[i] < high[j]) {
                arr[k] = low[i];
                i++;
            } else {
                arr[k] = high[j];
                j++;
            }
            k++;
        }
        while (i < low.length) {
            arr[k] = low[i];
            i++; k++;
        }
        while (j < high.length) {
            arr[k] = high[j];
            j++; k++;
        }
    }
}
