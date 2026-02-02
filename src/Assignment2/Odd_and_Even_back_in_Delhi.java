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
            findSum(num);

            n--;
        }
//        System.out.println(checkNum(n));
    }
    public static void checkNum(int num1,int num2){
         if(num1%4==0 || num2%3==0){
             System.out.println("Yes");

         }
         else{
             System.out.println("No");
         }
    }
    public static void findSum(int num){
        int sum1 = 0;
        int sum2=0;
        while(num>0){
            int rem = num%10;
            if(rem%2==0)
            sum1 = sum1+rem;
            else
                sum2+=rem;
            num = num/10;
        }
        checkNum(sum1,sum2);

    }
}
