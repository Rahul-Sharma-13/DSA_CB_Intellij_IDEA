package Assignments1;
import java.util.Scanner;

public class HollowRhombus {

//            *****
//           *   *
//          *   *
//         *   *
//        *****

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int space = n-1;
        int star = n;

        while(row<=n){
            //space
            int i = 0;
            while(i<space){
                System.out.print("\t");
                i++;
            }

            //star
            int j = 0;
            while(j<star){
                if(row == 1|| row == n){
                    System.out.print("*\t");
                }else{

                }

                j++;
            }
            row++;
            space--;
            System.out.println();
        }
    }
}
