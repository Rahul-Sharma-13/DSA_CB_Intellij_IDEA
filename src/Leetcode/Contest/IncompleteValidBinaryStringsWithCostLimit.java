package Leetcode.Contest;

import java.util.ArrayList;
import java.util.List;

public class IncompleteValidBinaryStringsWithCostLimit {
    public static void main(String[] args) {
        int n = 3;
        int k = 1;
        String str = "";
//        for (int i = 0; i < n; i++) {
//            str = str+"0";
//        }
        List<String> ans = validStrings(n, k);
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.println(ans);
//        }
        System.out.println(ans);
    }
    public static List<String> validStrings(int n, int k){
        List<String> ans = new ArrayList<>();
        findBinaryStr(n, k, 0, 0, new StringBuilder(), ans);
        return ans;
    }
    public static void findBinaryStr(int n, int k,int idx,int sum,  StringBuilder ans, List<String> ll ){
        if(sum >k){
            return;
        }
        if(n == idx){
            ll.add(ans.toString());
            return;
        }
        ans.append('0');
        findBinaryStr(n, k, idx+1, sum,  ans, ll);
        ans.deleteCharAt(ans.length()-1);
        if(ans.length()==0||ans.charAt(ans.length()-1) != '1'){
            ans.append('1');
            findBinaryStr(n, k, idx+1, sum + idx, ans, ll);
        }
        ans.deleteCharAt(ans.length() - 1);
    }
}
