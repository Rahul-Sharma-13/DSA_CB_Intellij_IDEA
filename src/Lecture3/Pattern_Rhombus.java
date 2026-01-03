package Lecture3;
import java.util.Scanner;

public class Pattern_Rhombus {
    public static void main(String[] args) {

//
//        5
//                          1
//                      2	3	2
//                  3	4	5	4	3
//              4	5	6	7	6	5	4
//          5	6	7	8	9	8	7	6	5
//              4	5	6	7	6	5	4
//                  3	4	5	4	3
//                      2	3	2
//                          1

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int space = n-1;
        int star = 1;
        int val = 1;
        while(row<=2*n-1){
            //space
            int i = 1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }

            //
            int k = 1;
            int p = val;
            while(k<=star){
                System.out.print(p +"\t");
                if(k<star/2+1){
                    p++;
                }else{
                    p--;
                }
                k++;

            }
            //Horizontal mirror

            if(row<n){
                star += 2;
                val++;
                space--;
            } else {
                star -= 2;
                space++;
                val--;
            }

            row++;
            System.out.println();
        }
    }
}
