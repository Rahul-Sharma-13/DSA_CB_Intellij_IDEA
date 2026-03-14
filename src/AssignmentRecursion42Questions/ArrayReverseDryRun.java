package AssignmentRecursion42Questions;

public class ArrayReverseDryRun {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        int i = arr.length - 1;
        Print(arr, i);
    }

    public static void Print(int[] arr, int i) {
        System.out.println(arr[i]);
        if (i == 0) {
            return;
        }
        i--;
        Print(arr, i);

    }
}
