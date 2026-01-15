package Assignments1;
import java.util.Scanner;

public class PatternDoubleSidedArrow {
    public static void main(String[] args) {
        // n=7
//                      1
//                  2 1   1 2
//              3 2 1       1 2 3
//          4 3 2 1           1 2 3 4
//              3 2 1       1 2 3
//                  2 1   1 2
//                      1

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int innerSpace = -1;
        int outerSpace = n-1;
        int row = 1;
        int star = 1;
        int val = 1;
        while(row <=n){
            //outer Space
            int i = 1;
            while(i<=outerSpace){
                System.out.print("  ");
                i++;
            }
            //star
            int j = 1;
            int x = val;
            while(j<=star){
                System.out.print(x + " ");
                x--;
                j++;
            }
            //inner spaces
            i = 1;
            while(i<=innerSpace){
                System.out.print("  ");
                i++;
            }
            //star
            x = 1;
            if(row==1||row==n){
                x = 2;
            }
            while(x<=val){
                System.out.print(x + " ");
                x++;
            }
            //mirroring
            if(row<=n/2){
                star++;
                innerSpace+=2;
                outerSpace-=2;
                val++;
            }else{
                star--;
                innerSpace-=2;
                outerSpace+=2;
                val--;
            }
            row++;
            System.out.println();
        }
    }
}
