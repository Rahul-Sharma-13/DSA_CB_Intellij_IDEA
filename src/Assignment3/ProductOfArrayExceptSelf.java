package Assignment3;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        long[] ans = product(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

    }
    public static long[] product(int[] arr){
        int n = arr.length;
        //left
        long[] left = new long[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = (left[i-1] * arr[i-1]);
            System.out.println();
        }
        //right
        long[] right = new long[n];
        right[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            right[i] = (right[i+1]*arr[i+1]);
        }
        //calc
        for (int i = 0; i < n; i++) {
            left[i] = (left[i] *right[i]);
        }
        return left;
    }
}
