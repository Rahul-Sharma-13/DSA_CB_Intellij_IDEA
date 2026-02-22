package Lecture13;

import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "the sky is    blue   ";
        s = s.trim();
        System.out.println(s);
        String [] arr = s.split(" +");// " +" space ke basis pe string ko split krke usko array me bhar dega usko is tarah se bhi likh sakte hai "\s+"
//        System.out.println(Arrays.toString(arr));
        String ans = "";
        for (int i = arr.length - 1; i>=0; i--){
            ans = ans + arr[i] + " ";
        }
        System.out.println(ans);
    }

}
