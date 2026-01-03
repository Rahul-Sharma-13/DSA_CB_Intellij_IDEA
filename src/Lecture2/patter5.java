package Lecture2;

public class patter5 {
    public static void main(String[] args) {
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

        int n = 5;
        int row = 1;
        int star = 5;
        int space = 1;

        while(row<=n){

            //spaces
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }

            //star
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }


            row++;
            System.out.println();
            star--;
            space++;
        }
    }
}
