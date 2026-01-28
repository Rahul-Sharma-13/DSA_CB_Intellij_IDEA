package Assignment2;
import java.util.Scanner;
//          12345
//          12134

public class Odd_and_Even_back_in_Delhi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n>0){
            int num = input.nextInt();
            if(num == 0){
                System.out.println("No");
            } else if(checkNum(num)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            n--;
        }
//        System.out.println(checkNum(n));
    }
    public static boolean checkNum(int num){
        int sum = findSum(num);
        if(sum%2 == 0){
            return sum % 4 == 0;
        }
        else{
            return sum%3 == 0;
        }
    }
    public static int findSum(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        return sum;
    }
}
