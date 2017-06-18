public class QuickSort {
    public static void quickSort(int[] arr, int p, int r) {
        if (p < r) {
            int pivot = partition(arr, p, r);
            quickSort(arr, p, pivot-1);
            quickSort(arr, pivot+1, r);
        }
    }
    private static int partition(int[] arr, int p, int r) {
        int q = p;
        for (int j = p; j < r; j++) {
            if (arr[j] <= arr[r]) {
                swap(arr, j, q);
                q++;
            }
        }
        swap(arr, r, q);
        return q;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
