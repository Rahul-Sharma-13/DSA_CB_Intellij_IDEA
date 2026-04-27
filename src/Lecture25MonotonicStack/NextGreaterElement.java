package Lecture25MonotonicStack;

import java.util.Stack;

public class NextGreaterElement {
//    next greater
//    next smaller
//    previous greater
//    previous smaller
    public static void main(String[] args) {
        int[] arr = {4,5,2,10};
        NGE(arr);
    }
    public static void NGE(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()] = -1;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(arr[i] +" "+ans[i]);
        }
    }
//    daily temperature
//    Asteroid Collision
//    pattern 132
//    sunny bulding hackerank
//    Car fleet
//    next greater element in circular array
}
