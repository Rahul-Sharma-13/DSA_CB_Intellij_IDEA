package Assignment2;
import java.util.Scanner;

public class Simple_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true){
            int n = input.nextInt();
            sum = simpleInput(n, sum);
            if(sum<=0){
                break;
            }

        }
    }
    public static int simpleInput(int n , int sum){
        sum = sum + n;
        if(sum>0){
            System.out.println(n);
        }
        return sum;

    }
}
