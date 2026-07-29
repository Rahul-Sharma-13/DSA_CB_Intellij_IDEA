package Leetcode.Arrays1;

import java.util.Scanner;

public class DivisibleSubArrays {
    public static void main(String[] args) {
//        Scanner scn=new Scanner(System.in);
//        int t = scn.nextInt();
//        while(t-->0){
//            int n = scn.nextInt();
//            int[] arr=new int[n];
//            for (int i = 0; i < n; i++)
//                arr[i]=scn.nextInt();
//            System.out.println(subarraysDivByK(arr, n));
//        }
        int[] arr = {4, 5, 0, -2, -3};
        int k = arr.length;
        System.out.println(subarraysDivByK(arr, k));
    }

//    BRUTE FORCE
//    public static long subarraysDivByK(int[] nums, int k) {
//        // Write your code here
//        int x = 0;
//        for (int i = 0; i < k; i++) {
//            x += find(i, nums,k);
//        }
//        return x;
//    }
//    public static int find(int idx, int[] arr, int k){
//        int count = 0;
//        int ans = arr[idx];
//        for (int i = idx; i < k; i++) {
////            System.out.println("ans "+ans+" at idx " + i);
//            if(ans%k == 0){
//                count++;
//            }
//            if(i+1 != k) {
//                ans += arr[i+1];
//            }
//        }
////        System.out.println("count "+count);
//        return count;
//    }

//    OPTIMIZED APPROACH
    public static long subarraysDivByK(int[] nums, int k) {
        int[] freq = new int[k];
        freq[0] = 1;

        int prefixSum = 0;
        long count = 0;

        for (int num : nums) {
            prefixSum += num;

            int rem = ((prefixSum % k) + k) % k;

            count += freq[rem];
            freq[rem]++;
        }

        return count;
    }

}
