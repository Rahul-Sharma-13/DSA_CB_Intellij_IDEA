package Lecture20;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 9, 6};
        int[] ar = Sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ar[i] +" ");
        }
    }
    public static int[] Sort(int[] arr, int start, int end){
        if(start == end){
            int[] ar = {arr[start]};
            return ar;
        }
        int mid = start+(end-start)/2;
        int[] first = Sort(arr, start, mid);
        int[] Sec = Sort(arr, mid+1, end);
        return MergeTwoArray(first, Sec);
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
