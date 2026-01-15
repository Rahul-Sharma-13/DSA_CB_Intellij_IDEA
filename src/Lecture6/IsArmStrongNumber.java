package Lecture6;
import java.util.Scanner;

public class IsArmStrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(ArmStrongNumber(n));
    }

    public static boolean ArmStrongNumber(int n){
        int cod = countOfDigit(n);
        int sum = 0;
        int temp = n;
        while(n>0){
            int rem = n%10;
            sum = (int)(sum + Math.pow(rem, cod));
            n = n/10;
        }
        if(sum==temp){
            return true;
        }
        return false;

    }
    public static int countOfDigit(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
}
