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
        int i = num1 *num2;
        int lcm = 1;
        while(i>1){
            if(i%num1 == 0 && i%num2 == 0){
                lcm = i;
            }
            i--;
        }
        return lcm;
    }
}
