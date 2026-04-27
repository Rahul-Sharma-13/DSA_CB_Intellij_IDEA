package Assignment4;

import java.util.Scanner;

public class ArraysWavePrintColumnWise {
    public static void main(String[] args) {
//        int[][] arr = { {11, 12, 13, 14},
//                {21, 22, 23, 24},
//                {31, 32, 33, 34},
//                {41, 42, 43, 44}};
////                {51, 52, 53, 54}};
//        Print(arr);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        Print(arr);
    }
    public static void Print(int[][]arr){
        int n = arr.length;
        int m = arr[0].length;
        int j = 0;
        while(j<m){
            int i = 0;
            while(i<n){
                System.out.print(arr[i][j]+", ");
                i++;
            }
            i--;
            j++;
            while(i>=0){
                System.out.print(arr[i][j]+", ");
                i--;
            }
            j++;
        }
        System.out.print("END");
    }
}
