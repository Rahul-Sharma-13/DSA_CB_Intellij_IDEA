package Assignment2;
import java.util.Scanner;

public class Boston_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int primesum = primeSum(num);
//        System.out.println(primesum);
        int digitsum = digitSum(num);
//        System.out.println(digitsum);
        if(primesum == digitsum){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
    public static int primeSum(int num){
        int x = num;
        int i = 2;
        int sum = 0;
        while(x!=1){
            if(x%i==0){
                x = x/i;
                if(i>9){
                    i = digitSum(i);
                    sum = sum + i;
                }else{
                    sum = sum + i;
                }
            }else{
                i++;
            }
        }
        return sum;
    }
    public static int digitSum(int num){
        int x = num;
        int sum = 0;
        while(x>0){
            int rem = x%10;
            sum = sum + rem;
            x = x/10;
        }
        return sum;
    }
}
