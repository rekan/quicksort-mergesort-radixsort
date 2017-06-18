public class Main {
    public static void main(String[] args) {
        int[] testOne = {5, 3, 0, -1, -3, 1, 2};
        QuickSort.quickSort(testOne, 0, testOne.length-1);
        printResult(testOne);

        int[] testTwo = {5, 3, 0, -1, -3, 1, 2};
        MergeSort.mergeSort(testTwo, 0, testTwo.length-1);
        printResult(testTwo);

    }

    public static void printResult(int[] arr) {
        for (int e: arr) {
            System.out.print(e + " | ");
        }
        System.out.println("\n");
    }
}
