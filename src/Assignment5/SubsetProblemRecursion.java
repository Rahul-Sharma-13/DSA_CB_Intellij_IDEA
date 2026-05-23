package Assignment5;

import java.util.Scanner;

public class SubsetProblemRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        Subset(arr, 0, target);
    }
    public static void Subset(int[] arr, int idx, int target){
        
    }

}
