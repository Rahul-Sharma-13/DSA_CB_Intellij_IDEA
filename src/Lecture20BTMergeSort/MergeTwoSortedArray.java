package Lecture20BTMergeSort;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 7};
        int[] arr2 = {1, 3, 4, 11, 13, 15};
        int[] ar = MergeTwoArray(arr1, arr2);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }

    public static int[] MergeTwoArray(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0, k = 0;
        int[] ans = new int[n + m];
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }
        while (i < n) {
            ans[k++] = arr1[i++];
        }
        while (j < m) {
            ans[k++] = arr2[j++];
        }
        return ans;
    }
}
