package Leetcode.Contest;

import java.util.HashMap;

public class DigitFreqScore {
    public static void main(String[] args) {
        int n = 101;
        int sum = digitFreq(n);
        System.out.println(sum);
    }

    public static int digitFreq(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            if (map.containsKey(rem)) {
                map.put(rem, map.get(rem)+1);
            } else {
                map.put(rem, 1);
            }

        }
        for(int p : map.keySet()){
            map.put(p, p *map.get(p));
        }
        for (int x : map.keySet()) {
            sum += map.get(x);
        }
        return sum;
    }
}
