package Lecture21QuickSort;

import java.util.Random;

public class RandomizeQuickSort {
    public static void main(String[] args) {
        int[] arr = {5,7,2,1,8,3,4};
        Sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int idx = Partition(arr, start, end);
        Sort(arr, start, idx-1);
        Sort(arr, idx+1, end);
    }
    public static int Partition(int[] arr, int start, int end){
        Random rn = new Random();
        int ri = rn.nextInt(end - start)+start;
        int t = arr[ri];
        arr[ri]= arr[end];
        arr[end] = t;
        int item = arr[end];
        int idx= start;
        for (int i = start; i < end; i++) {
            if(arr[i]<item){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        int temp = arr[end];
        arr[end] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}
