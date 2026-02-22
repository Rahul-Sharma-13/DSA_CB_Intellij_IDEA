package Assignment1;
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
            int j = 1;
            while(j<=star){
                if(row == 1|| row == n){
                    System.out.print("*\t");
                }else{
                    if(j == 1|| j == n){
                        System.out.print("*\t");
                    }else{
                        System.out.print("\t");
                    }
                }

                j++;
            }
            row++;
            space--;
            System.out.println();
        }
    }
}
