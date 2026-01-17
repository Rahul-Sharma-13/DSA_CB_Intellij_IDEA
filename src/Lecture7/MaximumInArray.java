package Lecture7;


public class MaximumInArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        System.out.println(maximum(arr));
        System.out.println(maximum1(arr));

    }

    // new and modified version of maximum
    public static int maximum1(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int maximum(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
