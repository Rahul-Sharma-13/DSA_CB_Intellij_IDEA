package Assignment3;

import java.util.Scanner;

public class InverseOfAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        findReverse(arr);
    }

    public static void findReverse(int[] arr) {
        int[] nums = new int[arr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[arr[i]] = i;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
