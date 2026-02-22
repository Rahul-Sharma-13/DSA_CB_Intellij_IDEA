package Practice;
import java.util.Scanner;

public class PatternWithZeroes {
    public static void main(String[] args) {
//        n = 5
//        1
//        2 2
//        3 0 3
//        4 0 0 4
//        5 0 0 0 5
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=star){
                if(i == 1||row==i){
                    System.out.print(row + " ");
                }
                else{
                    System.out.print("0 ");
                }
                i++;
            }
            star++;
            row++;
            System.out.println();
        }
    }
}
