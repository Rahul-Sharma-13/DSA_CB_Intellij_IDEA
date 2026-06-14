package Leetcode.Contest;

public class checkGoodInteger {
    public static void main(String[] args) {
        int n = 37;
        System.out.println(goodInteger(n));
    }
    public static boolean goodInteger(int n){
        int digitSum = findDigitSum(n);
        int squareSum = findSquareSum(n);
        if(squareSum - digitSum>=50){
            return true;
        }
        return false;
    }

    private static int findSquareSum(int n) {
        int sqareSum = 0;
        while(n!=0){
            int rem = n%10;
            sqareSum += (rem * rem);
            n /= 10;
        }
        return sqareSum;
    }

    private static int findDigitSum(int n) {
        int digitSum = 0;
        while(n!=0){
            int rem = n%10;
            digitSum += rem;
            n /= 10;
        }

        return digitSum;
    }
}
