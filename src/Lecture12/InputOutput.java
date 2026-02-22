package Lecture12;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int [] [] arr = new int[n] [m];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println();
        printArray(arr);
    }
    public static void printArray(int[] [] arr){
        for(int i = 0; i<arr.length; i++){
            for(int n = 0; n<arr[0].length; n++){
                System.out.print(arr[i][n] + " ");
            }
            System.out.println();
        }
    }
}
