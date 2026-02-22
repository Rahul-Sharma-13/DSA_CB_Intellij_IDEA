package Assignment3;
import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        findSquares(arr);
        sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void findSquares(int[] arr){
        for(int i = 0; i<arr.length; i++){
            arr[i] = (int) Math.pow(arr[i], 2);
        }
    }
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i< n-1; i++){
            for(int j = 0; j<n - i - 1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
