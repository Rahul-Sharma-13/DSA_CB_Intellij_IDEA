package Lecture9;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Subarray_Sum(arr));
    }
    public static int Subarray_Sum(int[] arr){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            int curr_Sum = 0;
            for(int j = i; j<arr.length; j++){
                curr_Sum += arr[j];
                ans = Math.max(ans, curr_Sum);
            }
        }
        return ans;
    }
}
