package Lecture17PermutationRecursion;

import java.util.ArrayList;
import java.util.List;

public class ValidParantheses {
    public static void main(String[] args) {
        int n = 3;
        List<String> xyz = new ArrayList<>();
        Parentheses(n, 0,0,"", xyz);
        System.out.println(xyz);
    }

    public static void Parentheses(int n, int open, int closed, String ans, List<String> ll) {
        if (open == n && closed == n) {
            ll.add(ans);
            return;
        }
        if (open > n || closed > open) {
            return;
        }
        Parentheses(n, open, closed + 1, ans + ")", ll);
        Parentheses(n, open + 1, closed, ans + "(", ll);
    }
}
