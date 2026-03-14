package Assignment3;
import java.util.Scanner;

public class IncompleteProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        product(arr);
    }
    public static void product(int[] arr){
        
    }
}
