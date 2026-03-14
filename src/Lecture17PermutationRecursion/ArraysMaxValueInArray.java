package Lecture17PermutationRecursion;

import java.util.Scanner;

public class ArraysMaxValueInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(FindMax(arr));
    }
    public static int FindMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
