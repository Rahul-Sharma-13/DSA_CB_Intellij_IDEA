package AssignmentRecursion42Questions;

public class PrintArrElementDryRun {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int i = 0;
        PrintArr(arr, i);
    }

    public static void PrintArr(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        PrintArr(arr, i + 1);
    }
}
