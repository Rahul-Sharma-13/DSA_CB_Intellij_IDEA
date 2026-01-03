package Lecture2;
import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
//                *
//              * * *
//            * * * * *
//          * * * * * * *
//        * * * * * * * * *
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;
        while(row<=n){
            //spaces
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }

            System.out.println();
            row++;
            space--;
            star +=2;
        }
    }
}
