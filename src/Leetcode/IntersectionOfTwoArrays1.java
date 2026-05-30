package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays1 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,2,1};
        int [] arr2 = {2,2};
        int[] arr = findIntersection(arr1, arr2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] findIntersection(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if(map.containsKey(arr1[i])){
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }else{
                map.put(arr1[i], 1);
            }
        }
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i]) && map.get(arr2[i])>=1 && !ar.contains(arr2[i])){
                ar.add(arr2[i]);
                map.put(arr2[i], map.get(arr2[i]) - 1);
            }
        }
        int[] ans = new int[ar.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ar.get(i);
        }
        return ans;
    }
}
