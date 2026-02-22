package Practice;
import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String[] args) {
//        n = 5
//            *****
//           *   *
//          *   *
//         *   *
//        *****

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = n;
        int outerSpace = n - 1;
        int innerSpace = n - 2;
        int row = 1;
        while(row<=n){
            //outer space
            int s = 1;
            while(s<=outerSpace){
                System.out.print("  ");
                s++;
            }
            int i = 1;
            while(i<=star){
                if(row == 1|| row == n){
                    System.out.print("* ");
                }
                else{
                    if(i == 1 || i == n){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                i++;
            }

            row++;
            System.out.println();
            outerSpace--;
        }

    }
}
