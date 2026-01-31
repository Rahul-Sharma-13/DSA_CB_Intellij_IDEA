package Lecture8PrefixSuffixAndReversalAlgo.Homework_Questions;
import java.util.Scanner;
//  https://leetcode.com/problems/container-with-most-water/description/

public class Container_With_Most_Water {
    public static void main(String[] args) {
        int [] arr = {3,6,1};
        int area = findWater(arr);
        System.out.println(area);
    }
    public static int findWater(int[] arr){
        //totally wrong approach
//        int totalSum = 0;
//        int n = arr.length;
//        //prefix
//        int[] left = new int[n];
//        left[0] = arr[0];
//        for(int i = 1; i<n; i++){
//            left[i] = Math.max(left[i-1],arr[i]);
//        }
//        //suffix
//        int[] right = new int[n];
//        right[n-1] = arr[n-1];
//        for(int i = n-2; i>=0; i--){
//            right[i] = Math.max(right[i+1],arr[i]);
//        }
////        calculation
//        for(int i = 0; i<n; i++){
//            System.out.print(left[i] + " ");
//        }
//        System.out.println();
//        for(int i = 0; i<n; i++){
//            System.out.print(right[i] + " ");
//        }
//        System.out.println();
//        for(int i = 0; i<n; i++){
//            System.out.print(i + " ");
//        }
////        for(int i = 0; i<n; i++){
////            System.out.print((Math.min(left[i], right[i]) - arr[i]) + " ");
////        }

        // it will be done with the two pointers approach
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int area = Integer.MIN_VALUE;
        while(end>start){
            int temp = (Integer.min(arr[start], arr[end])) * (end - start);
            if(temp>area){
                area = temp;
            }

            if(arr[start] > arr[end]){
                end--;
            }else{
                start++;
            }
        }
        return area;
    }
}
