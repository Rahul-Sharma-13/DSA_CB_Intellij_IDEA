package Assignments1;
import java.util.Scanner;

public class PatternInvertedHourGlass {
    public static void main(String[] args) {
//          n=5
//        5                   5
//        5 4               4 5
//        5 4 3           3 4 5
//        5 4 3 2       2 3 4 5
//        5 4 3 2 1   1 2 3 4 5
//        5 4 3 2 1 0 1 2 3 4 5
//        5 4 3 2 1   1 2 3 4 5
//        5 4 3 2       2 3 4 5
//        5 4 3           3 4 5
//        5 4               4 5
//        5                   5

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int star = 1;
        int space = 2*n-1;
        while(row<=2*n+1){
            //star
            int val = n;
            int i = 1;
            while(i<=star){
                System.out.print( val +" ");
                val--;
                i++;
            }
            //space
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }

            //star
            i = 1;
            int cal = val+1;
            if(row==n+1){
                i=2;
                cal = val +2;
            }
            while(i<=star){
                System.out.print(cal + " ");
                cal++;
                i++;
            }

            if(row<=n){
                space-=2;
                star++;
            }else{
                space+=2;
                star--;
            }
            row++;
            System.out.println();
        }
    }

}
