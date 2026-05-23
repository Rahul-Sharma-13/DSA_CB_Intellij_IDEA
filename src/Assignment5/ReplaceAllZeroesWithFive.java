package Assignment5;

import java.util.Scanner;

public class ReplaceAllZeroesWithFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(Replace(n));
    }
    public static int Replace(int n){
        if(n == 0){
            return 0;
        }
        int rem = n% 10;
        if(rem == 0){
            rem = 5;
        }
        return Replace(n/10) *10 +rem;
    }
}
