package Lecture3;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {

        //        7
//                * * * * * * *
//                * * *   * * *
//                * *       * *
//                *           *
//                * *       * *
//                * * *   * * *
//                * * * * * * *


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = n/2+1;
        int row = 1;
        int space = -1;
        while(row<=n){
            //star
            int i = 1;
            if(row == 1 || row == n){
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

            //star
            i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }

            //mirror
            if(row<n/2 +1){
                space +=2;
                star--;
            }else{
                space -=2;
                star++;
            }

            //updation
            row++;
            System.out.println();
        }
    }
}
