package Assignment4;

import java.util.Scanner;

public class SubmissionABooleanMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = input.nextInt();
            }
        }
        Print(mat);
    }
    public static void Print(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1){
                    setRowCol(mat, i, j);
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(Math.abs(mat[i][j])+" ");
            }
            System.out.println();
        }
    }
    public static void setRowCol(int[][] mat, int i, int j){
        for (int k = 0; k < mat.length; k++) {
            if(mat[k][j] == 1){
                continue;
            }
            mat[k][j] = -1;
        }
        for (int k = 0; k < mat[0].length; k++) {
            if(mat[i][k] == 1){
                continue;
            }
            mat[i][k] = -1;
        }
    }
}
