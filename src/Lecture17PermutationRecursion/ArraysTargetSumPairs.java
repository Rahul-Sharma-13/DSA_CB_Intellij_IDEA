package Lecture17PermutationRecursion;

import java.util.Scanner;

public class ArraysTargetSumPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n; i++){
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        SumPair(arr, target);
    }
    public static void SumPair(int[] arr, int target){
        for (int i = 0; i< arr.length-1; i++){
            for (int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    if(arr[i]>arr[j]){
                        System.out.println(arr[j]+" and "+arr[i]);
                    }else{
                        System.out.println(arr[i]+" and "+arr[j]);
                    }
                }
            }
        }
    }
}
