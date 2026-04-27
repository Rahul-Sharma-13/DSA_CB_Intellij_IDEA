package Assignment4;

import java.util.Scanner;

public class RotateImage {
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
        RotateDiagonally(arr);
    }
    public static void RotateDiagonally(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int colStart = 0;
            int colEnd = arr.length - 1;
            while(colEnd>colStart){
                int temp = arr[i][colStart];
                arr[i][colStart] = arr[i][colEnd];
                arr[i][colEnd] = temp;
                colStart++;
                colEnd--;
            }
        }
        int star = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < star; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            star++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
