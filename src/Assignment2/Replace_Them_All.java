package Assignment2;
import java.util.Scanner;

public class Replace_Them_All {
    public static void main(String[] a){
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if(n<0){
            long x = -1*n;
            System.out.println(-replaceZero(x));
        }
        else{
            System.out.println(replaceZero(n));
        }
    }
    public static long replaceZero(long n){
        long x = n;
        long i = 0;
        long product = 0;
        if(x == 0){
            return 5;
        }
        while(x>0){
            long rem = x%10;
            if(rem == 0){
                rem = 5;
            }
            product = rem * (long)Math.pow(10, i) + product;
            x=x/10;
            i++;
        }
        return product;
    }

}
