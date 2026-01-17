package Assignment2;
import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(returnReverse(n));
    }
    public static int returnReverse(int n ){
        int x = n;
        int num = 0;
        while(x>0){
            int rem = x%10;
            num = num *10 +rem;
            x = x/10;
        }
        return num;
    }
}

