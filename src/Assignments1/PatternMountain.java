package Assignments1;
import java.util.Scanner;

public class PatternMountain {
    public static void main(String[] args) {
//          1						1
//          1	2				2	1
//          1	2	3		3	2	1
//          1	2	3	4	3	2	1


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int star = 1;
        int space = 2*n-3;
        while(row <=n){
            //star
            int i = 1;
            int val = 1;
            while(i<=star){
                System.out.print(val+ " ");
                i++;
                val++;
            }
            //space
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            //star
            i = 1;
            val--;
            if(row == n){
                i = 2;
                val--;
            }

            while(i<=star){
                System.out.print(val + " ");
                i++;
                val--;
            }

            row++;
            star++;
            space-=2;
            System.out.println();
        }
    }
}
