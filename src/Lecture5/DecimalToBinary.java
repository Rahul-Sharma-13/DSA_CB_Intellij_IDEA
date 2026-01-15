package Lecture5;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int mul = 1;
        int sum = 0;
        while(n>0){
            int rem = n%2;
            sum = sum + rem * mul;
            mul = mul * 10;
            n = n/2;

        }
        System.out.println(sum);

    }
}
