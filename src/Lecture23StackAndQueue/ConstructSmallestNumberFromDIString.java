package Lecture23StackAndQueue;

import java.util.Stack;

public class ConstructSmallestNumberFromDIString {
    public static void main(String[] args) {
        String s = "IIIDIDDD";
        System.out.println(SmallestNumberFromDIString(s));
    }
    public static String SmallestNumberFromDIString(String s){
        int[] arr = new int[s.length() +1];
        Stack<Integer> st = new Stack<>();
        int c= 1;
        for (int i = 0; i <= s.length(); i++) {
            if(i == s.length()||s.charAt(i)=='I'){
                arr[i] = c++;
                while(!st.isEmpty()){
                    arr[st.pop()] = c++;
                }
            }
            else{
                st.push(i);
            }
        }
        String ans = "";
        for (int x:arr){
            ans = ans+x;
        }
        return ans;
    }
}
