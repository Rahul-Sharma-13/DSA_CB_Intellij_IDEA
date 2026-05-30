package Lecture29SlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;
//https://leetcode.com/problems/sliding-window-maximum/description/
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] arr = WindowMax(nums, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static int[] WindowMax(int[] nums, int k){
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int j = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        //1st window ki
        for (int i = 0; i < k; i++) {
            while(!dq.isEmpty() && nums[i]>nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
        }
        ans[j++] = nums[dq.getFirst()];
        for (int i = k; i < nums.length; i++) {
            while(!dq.isEmpty() && nums[i]>nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.add(i);
            //window shrink
            if(i-k == dq.getFirst()){
                dq.removeFirst();
            }
            //ans update
            ans[j++] = nums[dq.getFirst()];
        }
        return ans;
        
    }
}
