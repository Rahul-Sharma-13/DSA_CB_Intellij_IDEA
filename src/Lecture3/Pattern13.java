package Lecture3;
import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int star = 1;
        while(row<=2*n-1){
            //star
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //Mirror
            if(row<n){
                star++;
            } else {
                star--;
            }

            //updation
            System.out.println();
            row++;
        }
    }
}
