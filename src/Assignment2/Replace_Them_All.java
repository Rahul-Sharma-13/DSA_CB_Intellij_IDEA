package Assignment2;
import java.util.Scanner;

public class Replace_Them_All {
    public static void main(String[] a){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n<0){
            int x = -1*n;
            System.out.println(-replaceZero(x));
        }
        else{
            System.out.println(replaceZero(n));
        }
    }
    public static int replaceZero(int n ){
        int x = n;
        int i = 0;
        int product = 0;
        if(x == 0){
            return 5;
        }
        while(x>0){
            int rem = x%10;
            if(rem == 0){
                rem = 5;
            }
            product = rem * (int)Math.pow(10, i) + product;
            x=x/10;
            i++;
        }
        return product;
    }

}
