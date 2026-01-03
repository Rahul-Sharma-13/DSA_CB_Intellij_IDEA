package Lecture2;

public class Pattern10 {
    public static void main(String[] args) {
//        * * * * * * * * *
//          * * * * * * *
//            * * * * *
//              * * *
//                *

        int n = 5;
        int row = 1;
        int star = 2*n-1;
        int space = 1;
        while(row<=n){

            //spaces
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }

            row++;
            star -=2;
            space++;
            System.out.println();
        }
    }
}
