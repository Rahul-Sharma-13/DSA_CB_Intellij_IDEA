package Lecture42;

import java.util.Arrays;

public class CoinChnage2 {
    public static void main(String[] args) {
//        inclusion and exclusion
        int amount = 5;
        int[] coins = {1, 2, 5};
        int [][] dp = new int[amount + 1][coins.length];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }
        System.out.println(coinChangeBU(coins, amount));
    }
    public static int coinChangeBU(int[] coin, int amount){
        int [][] dp = new int[coin.length + 1][amount+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int am = 1; am < dp[0].length; am++) {
                int inc = 0, exc = 0;
                if(am>= coin[i-1]){
                    inc = dp[i][am-coin[i-1]];
                }
                exc = dp[i-1][am];
                dp[i][am] = inc + exc;
            }
        }
        return dp[dp.length - 1][dp[0].length-1];
    }
    public static int coinChangeTD(int[] coin, int i, int amount, int[][] dp){
        if(amount == 0){
            return 1;
        }
        if(i == coin.length){
            return 0;
        }
        if(dp[amount][i] != -1){
            return dp[amount][i];
        }
        int inc = 0, exc = 0;
        if(amount>= coin[i]){
            inc = coinChangeTD(coin, i, amount - coin[i], dp);
        }
        exc = coinChangeTD(coin, i + 1, amount, dp);
        return dp[amount][i] = inc + exc;
    }
}
