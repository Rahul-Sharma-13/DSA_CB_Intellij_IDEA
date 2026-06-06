package Assignment5;

import java.util.Scanner;

public class IncompleteSubsetProblemRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        int sum = 0;
        for (int idx = 0; idx < n; idx++) {
            sum += Subset(arr, idx, target, 0, "", sum);
        }
        System.out.println();
        System.out.println(sum);
    }
    public static int Subset(int[] arr, int idx, int target, int sum, String ans, int tsum){
        if(sum == target){
            System.out.print(ans + " ");
            return 1;
        }
        if(sum>target){
            return 0;
        }
        tsum = Subset(arr, idx+1, target, sum+arr[idx], ans+arr[idx]+" ", tsum);
        return tsum;
    }
    public static int countSubset(int[] arr, int idx, int target, int sum){
        if(sum == target){
            return 1;
        }
        if(sum>target){
            return 0;
        }
        return countSubset(arr, idx+1, target, sum+arr[idx]);

    }

}
