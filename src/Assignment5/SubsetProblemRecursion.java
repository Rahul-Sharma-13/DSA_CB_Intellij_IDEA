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
        int c = 0;
        int count = Subset(arr, 0, target, 0, "", c);
        System.out.println();
        System.out.println(count);
    }
    public static int Subset(int[] arr, int idx, int target, int sum, String ans, int count){
        if(sum == target){
            System.out.print(ans + " ");
            count++;
            return count;
        }
        if(sum>target){
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {

            count +=  Subset(arr, idx+i, target, sum+arr[idx], ans+arr[idx]+" ", count);
        }

        return count;
    }

}
