package AssignmentRecursion42Questions;

public class CountElementOccDryRun {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3};
        int key = 2;
        int i = 0;
        int occ = 0;
        System.out.println(FindOcc(arr, i, key, occ));
    }

    public static int FindOcc(int[] arr, int i, int key, int occ) {
        if (i == arr.length) {
            return occ;
        }
        if (arr[i] == key) {
            occ++;
        }
        return FindOcc(arr, i + 1, key, occ);
    }
}
