package Assignment3;
import java.util.Scanner;

public class ArraysReverseAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        reverse(arr);
        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(end>=start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
