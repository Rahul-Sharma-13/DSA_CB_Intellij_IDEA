package Assignment3Discussion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxSumCircularSubArray {
    public static void main(String[] args) {
//        int[] arr = {8, -8, 9, -9, 10, -11, 12};
//        System.out.println(MaximumSumCircular(arr));
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println(MaximumSumCircular(arr));
        }
    }

    public static int MaximumSumCircular(int[] arr) {
        int Linear_Sum = SubArraySum(arr);
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] *= -1;
        }
        int mid_Sum = SubArraySum(arr);
        ;
        int circular_Sum = totalSum + mid_Sum;
        if (circular_Sum == 0) {
            return Linear_Sum;
        }
        return Math.max(Linear_Sum, circular_Sum);
    }

    public static int SubArraySum(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            ans = Math.max(ans, curr);
            if (curr < 0) {
                curr = 0;
            }
        }
        return ans;
    }
}
