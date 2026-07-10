package Lecture44BitMasking;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(Single(nums));
    }
    public static int Single(int[] nums){
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans^nums[i];
        }
        return ans;
    }
}
