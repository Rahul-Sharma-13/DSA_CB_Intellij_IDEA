package Assignment2;
import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int digit = input.nextInt();
        System.out.println(countDigit(num, digit));
    }
    public static int countDigit(int num, int digit){
        int x = num;
        int count = 0;
        while (x > 0) {
            int rem = x%10;
            if(rem == digit){
                count++;
            }
            x = x/10;
        }
        return count;
    }
}
