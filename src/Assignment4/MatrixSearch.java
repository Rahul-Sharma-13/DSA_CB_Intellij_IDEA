package Assignment4;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
//        int m = scn.nextInt();
//        int n = scn.nextInt();
//        int[][] arr=new int[m][n];
//        for (int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//                arr[i][j]=scn.nextInt();
//            }
//        }
        int[][] arr = { {11, 12, 13, 14},
                        {21, 22, 23, 24},
                        {31, 32, 34, 35},
                        {41, 42, 43, 44},
                        {51, 52, 53, 54}};
        int k = scn.nextInt();
        System.out.print(searchMatrix(arr, k));
    }
    public static int searchMatrix(int[][] matrix, int target) {
        // Write your code here
//        int length = matrix[0].length-1;
        int i = matrix.length - 1;
        int j = 0;
        while(i>=0&&j<matrix[0].length){
            if(matrix[i][j]==target){
                return 1;
            }else if(matrix[i][j]>target){
                i--;
            }else{
                j++;
            }
        }
        return 0;
    }
}
