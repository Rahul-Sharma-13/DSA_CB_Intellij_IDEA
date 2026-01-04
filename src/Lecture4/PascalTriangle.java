package Lecture4;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int row = 0;
        int star = 1;

        while(row<n){
            //star
            int i = 0;
            int ncr = 1;
            while (i < star) {
                System.out.print(ncr + " ");
                ncr = ((row -i) * (ncr))/(i+1);
                i++;
            }

            row++;
            star++;
            System.out.println();
        }

    }
}
