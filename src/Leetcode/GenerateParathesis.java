package Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParathesis {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
//        StringBuilder ans = new StringBuilder();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Paranthesis(n, 0, 0, "", str);
    }
    public static void Paranthesis(int n, int first, int last, String ans, List<String> str){
        if(first==n && last ==n){
            System.out.println(ans);
            str.add(ans);
            return;
        }
        if(first>n || last>first){
            return;
        }
        Paranthesis(n, first+1, last, ans+"(",  str);
        Paranthesis(n, first, last + 1, ans + ")", str);
//        if(first<n){
//            Paranthesis(n, first+1, last, ans+"(",  str);
//        }
//        if(last<first) {
//            Paranthesis(n, first, last + 1, ans + ")", str);
//        }
    }
}
