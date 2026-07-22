package Leetcode.Arrays1;

public class TrappingRainWater {
//    https://leetcode.com/problems/trapping-rain-water/description/
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
//        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};

        int ans = calculate(arr);
        System.out.println(ans);
    }

    public static int calculate(int[] height){
//        NOT VERY OPTIMIZED ONE=>
//        int[] left = new int[height.length];
//        left[0] = height[0];
//        for (int i = 1; i < left.length; i++) {
//            left[i] = Math.max(left[i-1], height[i]);
//        }
//        int[] right = new int[height.length];
//        right[right.length-1] = height[height.length-1];
//        for (int i = right.length-2; i >=0; i--) {
//            right[i] = Math.max(right[i+1], height[i]);
//        }
//        int[] ansArr = new int[height.length];
//        for (int i = 0; i < ansArr.length; i++) {
//            ansArr[i] = Math.min(right[i], left[i]) - height[i];
//        }
//        int sum = 0;
//        for (int i = 0; i < ansArr.length; i++) {
//            sum+=ansArr[i];
//        }
//        return sum;

        int length = height.length;
        int[] left = new int[length];
        left[0] = height[0];
        for (int i = 1; i < length; i++) {
            left[i] = Math.max(left[i-1], height[i]);
        }
        int[] right = new int[length];
        right[length-1] = height[length-1];
        for (int i = length-2; i >=0; i--) {
            right[i] = Math.max(right[i+1], height[i]);
        }
        for (int i = 0; i < length; i++) {
            right[i] = Math.min(right[i], left[i]) - height[i];
        }
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum+=right[i];
        }
        return sum;

    }
}
