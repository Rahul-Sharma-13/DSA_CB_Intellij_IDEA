package Assignment3;

import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Perm(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Perm(int[] arr){
        int n = arr.length;
        int p = -1, q = -1;
        for (int i = n-2; i >=0; i--) {
            if(arr[i]<arr[i+1]){
                p = i;
                break;
            }
        }
        if(p == -1){
            Reverse(arr,0, n-1);
            return;
        }
        for (int i = n-1; i >p; i--) {
            if(arr[i]>arr[p]){
                q = i;
                break;
            }
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        Reverse(arr, p+1, n - 1);

    }
    public static void Reverse(int[] arr, int i, int j){
        while(j>i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
