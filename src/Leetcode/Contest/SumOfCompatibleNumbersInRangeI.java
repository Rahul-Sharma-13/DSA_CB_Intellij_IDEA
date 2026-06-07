package Leetcode.Contest;

public class SumOfCompatibleNumbersInRangeI {
    public static void main(String[] args) {
        int n = 2;
        int k = 3;
        int sum = findSum(n, k);
        System.out.println(sum);
    }
    public static int findSum(int n, int k){
        int sum = 0;
        for (int i = 1; i <= n + k; i++) {

            if(Math.abs(n-i) <= k && (n&i)==0){
                System.out.println(Math.abs(n-i) + "->"+i);
                sum+=i;
            }
        }
        return sum;
    }
}
