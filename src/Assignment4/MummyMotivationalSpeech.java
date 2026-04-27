package Assignment4;

import java.util.Scanner;

public class MummyMotivationalSpeech {
    public static void main(String[] args) {
        int[][] arr = {{11, 0, 0, 0},
                        {21, 22, 0, 0},
                        {31, 32, 0, 0},
                        {41, 42, 43, 44}};
        Print(arr);

//        Scanner input = new Scanner(System.in);

    /// /        int m = input.nextInt();
//        int n = input.nextInt();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = input.nextInt();
//            }
//        }
    }
    public static void Print(int[][] arr) {
        int star = 1;
        for (int i = 0; i < arr.length; i++) {
            //stars
//            int space = arr.length-star;
//            for (int j = 0; j < star; j++) {
//                if(arr[i][j]>0){
//
//                }
//            }
            for (int j = star; j < arr[i].length; j++) {
                if(arr[i][j]!=0){
                    System.out.println("false");
                    return;
                }
            }
            star++;
        }
        System.out.println("true");
    }

//    public static void Print(int[][] arr){
//        int row = 0;
//        while(row<arr.length){
//            int col = 0;
//            int count = row+1;
//            int count2 = arr.length - count;
//            int c = 0;
//            int c2 = 0;
//            while(col<arr[row].length){
//                if(arr[row][col]>0){
//                    c++;
//                }else{
//                    c2++;
//                }
//                if(c>count||c2>count2){
//                    System.out.println("false");
//                    return;
//                }
//                col++;
//            }
//            row++;
//        }
//        System.out.println("true");
//    }

}
