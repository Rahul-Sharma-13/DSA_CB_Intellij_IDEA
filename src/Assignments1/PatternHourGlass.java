package Assignments1;
import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String[] args) {

//          5 4 3 2 1 0 1 2 3 4 5
//            4 3 2 1 0 1 2 3 4
//              3 2 1 0 1 2 3
//                2 1 0 1 2
//                  1 0 1
//                    0
//                  1 0 1
//                2 1 0 1 2
//              3 2 1 0 1 2 3
//            4 3 2 1 0 1 2 3 4
//          5 4 3 2 1 0 1 2 3 4 5

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int star = 2*n+1;
        int space = 0;
        int val=n;
        while(row<=2*n+1){
            //space
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }

            //star
            int j = 1;
            int p=val;
            while(j<=star){
                System.out.print(p+" ");
                if(j<star/2+1){
                    p--;
                }
                else {
                    p++;
                }
                j++;
            }

            if(row<=n){
                star-=2;
                space++;
                val--;
            }
            else{
                space--;
                star+=2;
                val++;
            }
            System.out.println();
            row++;

        }

    }
}
