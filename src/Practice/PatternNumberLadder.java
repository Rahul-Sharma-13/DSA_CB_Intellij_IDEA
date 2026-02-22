package Practice;
import java.util.Scanner;

public class PatternNumberLadder {
    public static void main(String[] args) {
//        n = 4
//        1
//        2 3
//        4 5 6
//        7 8 9 10
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = 1;
        int row = 1;
        int x = 1;
        while(row<=n){
            //star
            int i = 1;
            while(i<=star){
                System.out.print(x + " ");
                i++;
                x++;
            }
            //updation
            row++;
            star++;
            System.out.println();
        }
    }
}
