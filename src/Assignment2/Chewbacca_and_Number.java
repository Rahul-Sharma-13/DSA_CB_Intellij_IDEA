package Assignment2;
import java.util.Scanner;

public class Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long formattedNum = changeNum(n);
        System.out.println();
        System.out.println(formattedNum);
    }
    public static long changeNum(long num){
        long x = num;
        int i = 0;
        long product= 0;
        while(x>9){
            int rem = Math.toIntExact(x % 10);
//            System.out.print(Math.toIntExact(x % 10) + " ");
            int digit = 9-rem;
            if(rem>digit){
                rem = digit;
            }
            product = rem*(long)Math.pow(10,i) + product;
            x=x/10;
            i++;
        }
        if(x>=5 && x!=9){
            x=9-x;
        }
        product = x*(long)Math.pow(10,i) + product;
        return product;
    }
}
