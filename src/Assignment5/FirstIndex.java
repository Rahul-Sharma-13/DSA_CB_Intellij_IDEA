package Assignment5;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int m = input.nextInt();
        int ans = findFirst(arr, m, 0, -1);
        System.out.println(ans);
    }
    public static int findFirst(int[] arr, int m, int idx, int ans){
        if(arr[idx] == m){
            ans = idx;
            return ans;
        }
        if(idx>=arr.length-1){
            return ans;
        }
        return findFirst(arr, m, idx+1, ans);
    }
}
