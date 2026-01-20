package Assignment2;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println(gcd);
    }
    public static int findGCD(int divisor, int dividend){
        int rem = Integer.MIN_VALUE;
        while(rem!=0){
            rem = dividend%divisor;
            if(rem==0){
                return divisor;
            }
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
    }
}
