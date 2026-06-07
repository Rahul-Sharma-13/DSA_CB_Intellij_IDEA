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
        int sum = 0;
//        for (int idx = 0; idx < n; idx++) {
//            sum += Subset(arr, idx, target, 0, "", sum);
//        }
        Subset2(arr,target, 0, sum, "");
        System.out.println();
        System.out.println(countSubset(arr, target, 0, sum));
    }
//    public static int Subset(int[] arr, int idx, int target, int sum, String ans, int tsum){
//        if(idx == arr.length) {
//            if (sum == target) {
//                System.out.print(ans + " ");
//                return 1;
//            }
//            if (sum > target) {
//                return 0;
//            }
//        }
//        tsum = Subset(arr, idx+1, target, sum+arr[idx], ans+arr[idx]+" ", tsum);
//        return tsum;
//    }













//    public static int countSubset(int[] arr, int idx, int target, int sum){
//        if(sum == target){
//            return 1;
//        }
//        if(sum>target){
//            return 0;
//        }
//        return countSubset(arr, idx+1, target, sum+arr[idx]);
//
//    }






    public static void Subset2(int[] arr, int target, int idx, int sum, String ans){
        if(idx == arr.length){
            if(sum == target){
                System.out.print(ans+" ");
                return;
            }
            return;
        }
        if(sum>target){
            return;
        }
        Subset2(arr, target, idx+1, sum + arr[idx] , ans + arr[idx]+" ");
        Subset2(arr, target, idx+1, sum, ans);
    }
    public static int countSubset(int[] arr, int target, int idx, int sum){
        if(idx == arr.length){
            if(sum == target){
                return 1;
            }
            return 0;
        }
        if(sum>target){
            return 0;
        }
        int x = countSubset(arr, target, idx+1, sum + arr[idx]);
        int y = countSubset(arr, target, idx+1, sum);
        return x+y;
    }

}
