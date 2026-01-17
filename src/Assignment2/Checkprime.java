package Assignment2;
import java.util.Scanner;

public class Checkprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(checkPrime(num)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
    public static boolean checkPrime(int num){
        int i = 2;
        while(num>=i*i){
            if(num%i == 0){
                return false;
            }
            i++;
        }

        return true;
    }

}
