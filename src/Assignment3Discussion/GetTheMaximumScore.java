package Assignment3Discussion;

import java.util.Scanner;

public class GetTheMaximumScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            int n = input.nextInt();
            int m = input.nextInt();
            int[] arr1= new int[n];
            int[] arr2 = new int[m];
            for (int i = 0; i < n; i++) {
                arr1[i] = input.nextInt();
            }
            for (int i = 0; i < m; i++) {
                arr2[i] = input.nextInt();
            }
            System.out.println(MaximumScore(arr1, arr2));
        }
    }
    public static int MaximumScore(int[] arr1, int[] arr2){
        int mod = 1000_000_007;
        int i = 0, j = 0, s1 = 0, s2=0;
        long ans = 0;
        while(i<arr1.length && j< arr2.length){
            if(arr1[i]>arr2[j]){
                j++;
            }else if(arr1[i] <arr2[j]){
                i++;
            }else{
                long sum1 = sum(arr1, s1, i);
                long sum2 = sum(arr2, s2, j);
                ans = (ans + Math.max(sum1, sum2) % mod) % mod;
                i++;
                j++;
                s1 = i;
                s2 = j;
            }
        }
        long sum1 = sum(arr1, s1, arr1.length-1);
        long sum2 = sum(arr2, s2, arr2.length-1);
        ans = (ans + Math.max(sum1, sum2) % mod) % mod;
        return (int)ans;
    }
    public static long sum(int[] arr, int start, int end){
        long sum = 0;
        for(int i = start; i<=end; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
