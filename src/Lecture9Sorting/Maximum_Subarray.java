package Lecture9Sorting;

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
//
//    public int maxSubarraySumCircular(int[] nums) {
//        int linearSum = SubArraySum(nums);
//        int totalSum = 0;
//        for(int i = 0; i<nums.length; i++){
//            totalSum += nums[i];
//            nums[i] *= -1;
//        }
//        int midSum = SubArraySum(nums);
//        int sum = totalSum + midSum;
//        if(sum == 0){
//            return linearSum;
//        }
//        return Math.max(sum, linearSum);
//    }
//    public int SubArraySum(int[] arr){
//        int curr = 0;
//        int ans = Integer.MIN_VALUE;
//        for(int i = 0; i<arr.length; i++){
//            curr+= arr[i];
//            ans = Math.max(ans, curr);
//            if(curr<0){
//                curr = 0;
//            }
//        }
//        return ans;
//    }
}
