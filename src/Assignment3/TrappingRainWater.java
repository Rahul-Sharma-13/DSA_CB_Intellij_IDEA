package Assignment3;

import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
//            System.out.println(CalcRainWater(arr));
            CalcRainWater(arr);
        }
    }
    public static void CalcRainWater(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1], arr[i]);
        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(left[i]+" ");
//        }
//        System.out.println();
        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for (int i = n-2; i >=0; i--) {
            right[i] = Math.max(right[i+1], arr[i]);
        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(right[i]+" ");
//        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.min(left[i], right[i]) - arr[i];
        }
        System.out.println(sum);
    }
}
