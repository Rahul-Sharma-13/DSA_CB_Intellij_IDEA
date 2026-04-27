package Assignment4;

import java.util.Scanner;

public class ArraysWavePrintRowWise {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int m = input.nextInt();
//        int n = input.nextInt();
//        int[][] arr = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = input.nextInt();
//            }
//        }
        int[][] arr = { {11, 12, 13, 14},
                        {21, 22, 23, 24},
                        {31, 32, 33, 34},
                        {41, 42, 43, 44}};
        Print(arr);
    }
    public static void Print(int[][] arr){
        int j = 0;
        int i = 0;
        while(i<arr.length){
            while(j<arr[0].length&&j>=0){
                System.out.print(arr[i][j]+", ");
                if(i%2 == 0){
                    j++;
                }else{
                    j--;
                }
            }
            if(j<0){
                j++;
            }else if(j==arr[0].length){
                j--;
            }
            i++;

        }
        System.out.println("END");
    }
}
