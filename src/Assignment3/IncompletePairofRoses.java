package Assignment3;

import java.util.Scanner;

public class IncompletePairofRoses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            int target = input.nextInt();
            FindPair(arr, target);
            System.out.println();
        }
    }

    public static void FindPair(int[] arr, int target){
        int a = 0;
        int b = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 1; j<arr.length; j++){

                if(arr[i]+arr[j] <= target){
                    a = arr[i];
                    b = arr[j];
                }
            }
        }

        System.out.println("Deepak should buy roses whose prices are "+a +" and "+b+".");
    }

}
