package Assignments1;
import java.util.Scanner;

public class HollowDiamondPattern {
    public static void main(String[] args) {
//                    n = 5
//                * * * * *
//                * *   * *
//                *       *
//                * *   * *
//                * * * * *

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int star = n;
        int space =-1;

        while(row<=n){
            //star
            int i = 1;
            while(i<=star){
                System.out.print("*\t");
                i++;
            }

            //space
            int j = 1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }

            if(row<n/2+1){
                star--;
                space += 2;
            }
            else{
                star++;
                space += 2;
            }

            row++;
            System.out.println();
        }

    }
}
