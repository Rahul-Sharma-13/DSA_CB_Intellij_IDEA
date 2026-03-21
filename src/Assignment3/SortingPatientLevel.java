package Assignment3;

import java.util.Scanner;

public class SortingPatientLevel {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++)
            arr[i]=scn.nextInt();
        sortColors(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void sortColors(int[] nums) {
        // Write your code here
        int start = 0;
        int end = nums.length-1;
        int i = 0;
        while(end>i){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                i++;
                start++;
            }else if(nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }else{
                i++;
            }
        }
    }
}
