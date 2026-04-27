package Assignment4;

import java.util.Scanner;

public class ColumnWithMaximumSumInAMatrix {
    public static void main(String[] args) {
//        int[][] arr = { {11, 12, 13, 14},
//                        {21, 22, 23, 24},
//                        {31, 32, 34, 35},
//                        {41, 42, 43, 44}};
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        Print(arr);
    }
    public static void Print(int[][] arr){
        int ans = 0;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum +=arr[j][i];
            }
            if(ans<sum){
                ans = sum;
                idx = i+1;
            }
        }
        System.out.println(ans);
        System.out.println(idx);
    }
}
