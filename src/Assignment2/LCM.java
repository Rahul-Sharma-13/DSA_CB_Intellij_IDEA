package Assignment2;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println(findLCM(n1, n2));
    }
    public static int findLCM(int num1, int num2){
        int i = 2;
        int lcm = 1;
        while(i<=Integer.max(num1, num2)){
            boolean trigger = false;
            if(num1%i==0){
                num1 =  num1/i;
                lcm = lcm * i;
            }

            if (num2%i==0) {
                num2 = num2/i;
            } else{
                trigger = true;
            }

            if(trigger){
                i++;
            }
        }
        return lcm;
    }
}
