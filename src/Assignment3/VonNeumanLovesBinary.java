package Assignment3;

import java.util.Scanner;

public class VonNeumanLovesBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i<n; i++){
            arr[i] = input.nextLong();
        }
        Print(arr);
    }
    public static void Print(long[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(FindNum(arr[i]));
        }
    }
    public static int FindNum(long num){
        int i = 0;
        int ans = 0;
        while(num>0){
            long rem = num%10;
            ans += (int)(rem * (long)Math.pow(2,i));
            i++;
            num/=10;
        }
        return ans;
    }
}
