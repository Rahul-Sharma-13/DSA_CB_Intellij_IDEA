package Assignments1;
import java.util.Scanner;

public class PatternRhombus {
    public static void main(String[] args) {
//               1
//             2 3 2
//           3 4 5 4 3
//             2 3 2
//               1

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;
        int val = 1;

        while(row<=2*n-1){
            //space
            int i = 1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            //star
            int j = 1;
            int x = val;
            while(j<=star){
                System.out.print(x + "\t");
                if(j<star/2+1){
                    x++;
                }else{
                    x--;
                }
                j++;
            }
            if(row<n){
                space--;
                star+=2;
                val++;
            }else{
                space++;
                star-=2;
                val--;
            }

            row++;
            System.out.println();
        }


    }
}
