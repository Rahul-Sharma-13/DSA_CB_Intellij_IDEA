package Lecture36HashMap;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
//        https://leetcode.com/problems/longest-consecutive-sequence/description/

    }
    public static int Longest(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if(set.contains(x)&&!set.contains(x-1)){
                int c = 0;
                while(set.contains(x)){
                    set.remove(x);
                    c++;
                    x++;
                }
                ans = Math.max(ans, c);
            }
        }
        return ans;
    }









}
