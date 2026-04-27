package Assignment3;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int mini = FindMin(arr, i);
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }
    public static int FindMin(int[] arr, int idx){
        int mini = idx;
        for (int i = idx; i < arr.length; i++) {
            if(arr[mini]>arr[i]){
                mini = i;
            }
        }
        return mini;
    }
}
