package AssignmentRecursion42Questions;

public class LastOccDryRun {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3, 2, 4, 6};
        int key = 2;
        int i = 0;
        int occ = 0;
        System.out.println(FindLastOcc(arr, key, i, occ));
    }

    public static int FindLastOcc(int[] arr, int key, int i, int occ) {
        if (i == arr.length) {
            return occ;
        }
        if (arr[i] == key) {
            occ = i;
        }
        return FindLastOcc(arr, key, i + 1, occ);

    }
}
