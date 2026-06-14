package Lecture17PermutationRecursion;

import java.util.ArrayList;
import java.util.List;

public class Lexicographical {
    public static void main(String[] args) {
        int n = 1000;
        List<Integer> ll = new ArrayList<Integer>();
        Lexi(0, n, ll);

    }

    public static void Lexi(int curr, int n, List<Integer> ll) {
        if (curr > n) {
            return;
        }
//		System.out.println(curr);
        if (curr != 0) {
            ll.add(curr);
        }
        int i = 0;
        if (curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            Lexi(curr * 10 + i, n, ll);
        }
    }
}
