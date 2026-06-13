package Lecture41_DP1;

import java.util.Arrays;

public class MinimumCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        int zero = findCost(cost, 0, dp);
        int first = findCost(cost, 1, dp);

        System.out.println(Math.min(zero, first));
    }
    public static int findCost(int[] cost, int i, int[] dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int step1 = findCost(cost, i+1, dp);
        int step2 = findCost(cost, i+2, dp);
        return dp[i] = Math.min(step1, step2) + cost[i];
    }
}
