package Assignment4;

import java.util.Scanner;

public class PrintUpperTriangularMatrix {
    public static void main(String[] args) {
//        int[][] arr = { {11, 12, 13, 14},
//                {21, 22, 23, 24},
//                {31, 32, 33, 34},
//                {41, 42, 43, 44}};
//        Print(arr);

        Scanner scn=new Scanner(System.in);
//        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr=new int[n][n];
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        Print(arr);
    }
    public static void Print(int[][] arr){
        int n = arr.length;
        int space = 0;
        for (int i = 0; i < n; i++) {
            //for zeroes
            for (int j = 0; j < space; j++) {
                System.out.print("0 ");
            }
            for (int j = space; j < n; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
            space++;
        }
    }
}
