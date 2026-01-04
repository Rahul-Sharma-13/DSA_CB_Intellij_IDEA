package Lecture4;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for(int i=2; i<=n; i++){
            if(n%i ==0){
                count++;
            }
        }
        if(count>=1){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
        System.out.println("Number of Factors = " + count);
    }
}
