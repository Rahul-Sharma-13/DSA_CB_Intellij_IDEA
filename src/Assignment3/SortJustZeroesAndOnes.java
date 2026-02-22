package Assignment3;
import java.util.Scanner;

public class SortJustZeroesAndOnes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sort(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(end>start){
            if(arr[start] == 0){
                start++;
            }else{
                swap(arr, start, end);
                end--;
            }
        }
    }
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
