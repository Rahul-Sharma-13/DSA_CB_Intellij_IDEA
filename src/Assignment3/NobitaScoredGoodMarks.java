package Assignment3;

import java.util.Scanner;

public class NobitaScoredGoodMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n-->0){
            int candies = input.nextInt();
            int friends = input.nextInt();
            System.out.println(ReturnedCandies(candies, friends));
        }
    }
    public static int ReturnedCandies(int cand, int friends){
        int rem = cand % friends;
        int shortage = friends - rem;
        return Integer.min(rem, shortage);
    }
}
