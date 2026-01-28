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
        while(x>0){
            int rem = Math.toIntExact(x % 10);
//            System.out.print(Math.toIntExact(x % 10) + " ");
            int digit = 9-rem;
            if(rem>digit&&rem!=9){
                rem = digit;
            }
            product = rem*(long)Math.pow(10,i) + product;
            x=x/10;
            i++;
        }
        return product;
    }
}
