package Assignment1;
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
        int star = n/2+1;
        int space =-1;

        while(row<=n){
            //star
            int i = 1;
            if(row == 1 || row == n){
                i = 2;
            }
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

            i = 1;
            while(i<=star){
                System.out.print("*\t");
                i++;
            }

            if(row<n/2+1){
                star--;
                space += 2;
            }
            else{
                star++;
                space -= 2;
            }

            row++;
            System.out.println();
        }

    }
}
