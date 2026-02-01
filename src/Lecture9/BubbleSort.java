package Lecture9;

public class BubbleSort {
    public static void main(String[] args) {
//        bubble, selection, insertion, merge, quick, heap, Dutch National Flag, Counting
        int[] arr = {4, 5, 3, 2, 1};
        Sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void Sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n - 1; i++){
            for(int j = 0; j<n - i - 1; j++){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}