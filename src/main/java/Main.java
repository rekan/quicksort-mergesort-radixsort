public class Main {
    public static void main(String[] args) {
        int[] test = {5, 3, 0, -1, -3, 1, 2};
        QuickSort.quickSort(test, 0, test.length-1);
        printResult(test);
    }

    public static void printResult(int[] arr) {
        for (int e: arr) {
            System.out.print(e + " | ");
        }
    }
}
