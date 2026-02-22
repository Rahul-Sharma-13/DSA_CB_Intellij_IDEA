package Practice;
import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
//        n = 4
//        0
//        1 1
//        2 3 5
//        8 13 21 34
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = 1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
