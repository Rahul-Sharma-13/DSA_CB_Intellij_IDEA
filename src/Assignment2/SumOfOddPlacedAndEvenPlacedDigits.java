package Assignment2;
import java.util.Scanner;

public class SumOfOddPlacedAndEvenPlacedDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(findsumofeven(n));
        System.out.println(findsumofodd(n));
    }
    public static int findsumofeven(int n){
        int x = n;
        int sum = 0;
        int i = 1;
        while(x>0){
            int rem;
            if(i%2==0){
                rem = x%10;
                sum +=rem;
            }
            i++;
            x = x/10;
        }
        return sum;
    }

    public static int findsumofodd(int n){
        int x = n;
        int sum = 0;
        int i = 1;
        while(x>0){
            int rem;
            if(i%2!=0){
                rem = x%10;
                sum +=rem;
            }
            i++;
            x = x/10;
        }
        return sum;
    }
}
