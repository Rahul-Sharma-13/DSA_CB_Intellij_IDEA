package Assignment3;

import java.util.Scanner;

public class CalcTheSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int q = input.nextInt();
        while(q-->0){
            int x = input.nextInt();
            arr = CreateArr(arr, x);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum%1000000007);
    }
    public static int[] CreateArr(int[] arr, int x){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j = i-x;
            if(j<0){
                j+=arr.length;
            }
            temp[i] =arr[i]+arr[j];
        }
        return temp;
    }
}
