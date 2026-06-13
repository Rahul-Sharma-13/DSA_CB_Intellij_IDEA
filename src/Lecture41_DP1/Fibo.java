package Lecture41_DP1;

public class Fibo {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        System.out.println(finTD(n, dp));
        System.out.println(finBU(n));
    }
    public static int finBU(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[dp.length-1];
    }
    public static int finTD(int n, int[] dp){
        if(n==0||n==1){
            return n;
        }
        if(dp[n] != 0){ // dp apply ho rha h
            return dp[n];
        }
        int f1 = finTD(n-1, dp);
        int f2 = finTD(n-2, dp);
        return dp[n] = f1+f2; // yaad kr rhe h array me
    }
    public static int fin(int n){
        if(n==0||n==1){
            return n;
        }
        int f1 = fin(n-1);
        int f2 = fin(n-2);
        return f1+f2;
    }
}
