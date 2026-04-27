package Assignment3;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void Sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            FixLastIndex(arr, i);
        }
    }
    public static void FixLastIndex(int[] arr, int i){
        int item = arr[i];
        int j = i - 1;
        while(j>=0&&arr[j]>item){
            arr[j+1]=arr[j];
            arr[j] = item;
            j--;
        }
    }
}
