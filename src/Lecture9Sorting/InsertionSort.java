package Lecture9Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 7, 4, 8, 2, 11};
//        InsertLastElement(arr, arr.length - 1);
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            InsertLastElement(arr, i);
        }
    }

    public static void InsertLastElement(int[] arr, int i) {
//        ye kisi bhi array ke last element ko sahi kr deta hai
//        isme ham last ele ko store krenge item me
        int item = arr[i];
//        loop ko i-1 se isliye start kya taaki element ko i-1 se compare kiya ja sake
//        for ex: [2,3,4,5,1]
//        isme 1 ko 5 se compare krna hai to i agr last index ko show kr rha h to j ko i-1 hona pdega
        int j = i - 1;
//        item ko har pichle ele se compare krenge
        while (j >= 0 && arr[j] > item) {
//            agr arr[j] bda h to usko utha ke j+1 pe rakh denge
            arr[j + 1] = arr[j];
//            item ko utha ke arr[j] pe rakh denge
            arr[j] = item;
            j--;
        }

        //return j+1 position ke liye
    }
    //no. of swapping ke base pe selection is best mtlb sabse km swaps krta hai
}
