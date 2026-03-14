package AssignmentRecursion42Questions;

public class PrintAllIndexesDryRun {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        int key = 2;
        int i = 0;
        FindIndex(arr, key, i);
    }

    public static void FindIndex(int[] arr, int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        FindIndex(arr, key, i + 1);
    }
}
