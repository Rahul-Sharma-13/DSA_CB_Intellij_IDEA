package Lecture35;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArrays2 {
//    https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

//    HW:-https://leetcode.com/problems/intersection-of-two-arrays/description/
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 9};
        int[] arr2 = {9, 4, 9, 8, 4};
        int[] x = intersection(arr1, arr2);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
    }
    public static int[] intersection(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr1.length; i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i], map.get(arr1[i]) +1);
            }else{
                map.put(arr1[i], 1);
            }
        }
        ArrayList<Integer> ll = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if(map.containsKey(arr2[i]) && map.get(arr2[i]) >= 1){
                ll.add(arr2[i]);
                map.put(arr2[i], map.get(arr2[i]) - 1);
            }
        }
        int[] ans = new int[ll.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ll.get(i);
        }
        return ans;
    }
}
