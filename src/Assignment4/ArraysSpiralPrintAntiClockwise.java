package Assignment4;

import java.util.Scanner;

public class ArraysSpiralPrintAntiClockwise {
    public static void main(String[] args) {
//        int[][] arr = { {11, 12, 13, 14},
//                {21, 22, 23, 24},
//                {31, 32, 33, 34},
//                {41, 42, 43, 44},
//                {51, 52, 53, 54}};
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
    public static void Print(int[][] arr){
        int maxRow = arr.length;
        int maxCol = arr[0].length;
        int minRow = 0,minCol = 0;
        int i = 0;
        int j = 0;
        while(maxRow>minRow&& maxCol>minCol) {
            while (i < maxRow) {
                System.out.print(arr[i][j]+", ");
                i++;
            }
            i--;
            j++;
            minCol++;
            while (j < maxCol) {
                System.out.print(arr[i][j]+", ");
                j++;
            }
            j--;
            i--;
            maxRow--;
            while (i >= minRow) {
                System.out.print(arr[i][j]+", ");
                i--;
            }
            i++;
            j--;
            maxCol--;
            while(j>=minCol){
                System.out.print(arr[i][j]+", ");
                j--;
            }
            i++;
            j++;
            minRow++;
        }
        System.out.println("END");
    }
}
