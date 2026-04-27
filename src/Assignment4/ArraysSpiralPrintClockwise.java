package Assignment4;

import java.util.Scanner;

public class ArraysSpiralPrintClockwise {
    public static void main(String[] args) {
        int[][] arr = { {11, 12, 13, 14, 15},
                        {21, 22, 23, 24, 25},
                        {31, 32, 34, 35 ,36},
                        {41, 42, 43, 44, 45}};

//        Scanner input = new Scanner(System.in);
//        int m = input.nextInt();
//        int n = input.nextInt();
//        int[][] arr = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = input.nextInt();
//            }
//        }
        Print(arr);
    }
    public static void Print(int[][] arr){
        int minRow = 0, minCol = 0;
        int maxRow = arr.length-1, maxCol = arr[0].length-1;
        int c = 0;
        int te = arr.length*arr[0].length;
        while(c<te){
            for (int j = minCol; j <= maxCol && c<te; j++) {
                System.out.print(arr[minRow][j]+", ");
                c++;
            }
            minRow++;
            for (int j = minRow; j <= maxRow && c<te; j++) {
                System.out.print(arr[j][maxCol]+", ");
                c++;
            }
            maxCol--;
            for (int j = maxCol; j >= minCol && c<te; j--) {
                System.out.print(arr[maxRow][j]+", ");
                c++;
            }
            maxRow--;
            for (int j = maxRow; j >= minRow && c<te; j--) {
                System.out.print(arr[j][minCol]+", ");
                c++;
            }
            minCol++;
        }
        System.out.println("END");
    }
}
