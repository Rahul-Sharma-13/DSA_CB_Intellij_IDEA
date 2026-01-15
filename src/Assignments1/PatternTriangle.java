package Assignments1;
import java.util.Scanner;

public class PatternTriangle {

        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int star = 1;
            int space = n-1;
            int row = 1;

            while(row<=n){
                //for spaces
                int i = 0;
                while(i<space){
                    System.out.print("\t");
                    i++;
                }

                //for stars

                int val = row;
                int j = 0;
                while(j<star){
                    System.out.print( val +"\t");

                    if(j<star/2){
                        val++;
                    }else{
                        val--;
                    }
                    j++;
                }

                //updation
                row++;
                star+=2;
                space--;
                System.out.println();
            }


        }

}
