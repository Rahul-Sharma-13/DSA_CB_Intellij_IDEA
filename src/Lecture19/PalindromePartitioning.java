package Lecture19;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/palindrome-partitioning/description/
public class PalindromePartitioning {
    public static void main(String[] args) {
        String ques = "nitin";
        List<String> ll = new ArrayList<>();
        Partitioning(ques, "", ll);
    }

    public static void Partitioning(String ques, String ans, List<String> ll) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if (isPalindrome(s)) {
                ll.add(s);
                Partitioning(ques.substring(i), ans + s + "|", ll);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s1){
        int i = 0;
        int j = s1.length() - 1;
        while(i<j){
            if(s1.charAt(i) != s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
