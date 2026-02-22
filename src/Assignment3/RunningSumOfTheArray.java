package Assignment3;
import java.util.Scanner;

public class RunningSumOfTheArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }
        runningSum(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void runningSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            arr[i] = sum;
        }
    }
}
