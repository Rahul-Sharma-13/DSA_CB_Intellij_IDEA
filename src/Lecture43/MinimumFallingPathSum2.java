package Lecture43;

import java.util.Arrays;

public class MinimumFallingPathSum2 {
    public static void main(String[] args) {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int[] i : dp) {
            Arrays.fill(i, -100000);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(ans, FallingPathSum(matrix, 0, i, dp));
        }
        System.out.println(ans);
    }

    public static int FallingPathSum(int[][] matrix, int cr, int cc, int[][] dp) {
        if(cr == matrix.length-1){
            return matrix[cr][cc];
        }
        if(dp[cr][cc] != -100000){
            return dp[cr][cc];
        }
        int ans = Integer.MAX_VALUE;
        for (int col = 0; col < dp.length; col++) {
            if(col!=cc){
                ans = Math.min(ans, FallingPathSum(matrix, cr+1, col, dp));
            }
        }
        return ans + matrix[cr][cc];
    }
}