package Lecture42;

import java.util.Arrays;

public class ZeroOneKnapSack {
    public static void main(String[] args) {
        int cap = 4;
        int[] wt = {1,2, 3, 2, 2};
        int[] val = {1, 8, 0, 5, 3};
        int[][] dp = new int[cap + 1][wt.length];
        for (int[] a:dp){
            Arrays.fill(a, -1);
        }
        System.out.println(KnapSack(wt, val, cap, 0, dp));
    }
    public static int KnapSack(int[] wt, int[] val, int cap, int i, int [][] dp){
        if(i == wt.length || cap == 0){
            return 0;
        }
        if(dp[cap][i] != -1){
            return dp[cap][i];
        }
        int inc = 0, exc = 0;
        if(cap>= wt[i]){
            inc = val[i] + KnapSack(wt, val, cap - wt[i], i+ 1, dp);
        }
        exc = KnapSack(wt, val, cap, i+ 1, dp);
        return dp[cap][i] = Math.max(inc, exc);
    }
}
