package Lecture7;
import java.util.Scanner;


public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        display(arr);
    }
    public static void display(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
