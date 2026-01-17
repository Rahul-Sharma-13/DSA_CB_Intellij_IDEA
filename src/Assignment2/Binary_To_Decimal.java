package Assignment2;
import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int decimal = findDecimal(n);
        System.out.println(decimal);
    }
    public static int findDecimal(int num){
        int sum = 0;
        int count = 0;
        int x = num;
        while(x>0){
            int rem = x%10;
            if(rem!=0){
                sum = (int)(sum+Math.pow(2,count));
            }
            count++;
            x = x/10;
        }
        return sum;
    }
    public static int countDigit(int n ){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
}
