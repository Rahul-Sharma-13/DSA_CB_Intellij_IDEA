package Assignments1;
import java.util.Scanner;

public class MagicPattern {
    public static void main(String[] args) {
//        n = 5
//        *********
//        **** ****
//        ***   ***
//        **     **
//        *       *
//        **     **
//        ***   ***
//        **** ****
//        *********

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = n;
        int space =-1;
        int row = 1;
        while(row <= 2*n-1){
            //star
            int i = 1;
            if(row == 1||row == 2*n-1){
                i=2;
            }
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //space
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //updation
            if(row < n){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
            row++;
            System.out.println();
        }

    }
}
