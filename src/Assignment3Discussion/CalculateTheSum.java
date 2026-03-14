package Assignment3Discussion;

import java.util.Scanner;

public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        int q = input.nextInt();
        while(q-->0){
            int x = input.nextInt();
            arr = new_arr(arr, x);
        }
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum%1000000007);
    }

    private static int[] new_arr(int[] arr, int x) {
        int[] temp = new int[arr.length];
        for(int i = 0; i<temp.length; i++){
            int j = i-x;
            if(j<0){
                j+=arr.length;
            }
            temp[i] = arr[i] + arr[j];
        }
        return temp;
    }

}
