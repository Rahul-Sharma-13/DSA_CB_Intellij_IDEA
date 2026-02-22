package Practice;
import java.util.Scanner;

public class PatternRhombus {
    public static void main(String[] args) {
//        n = 3
//              1
//            2 3 2
//          3 4 5 4 3
//            2 3 2
//              1
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int space = n -1;
        int star = 1;
        int row = 1;
        int val = 1;
        while(row<=2*n-1){
            //space
            int s = 1;
            while(s<=space){
                System.out.print("  ");
                s++;
            }
            //star
            int i = 1;
            int x = val;
            while(i<=star){
                System.out.print(x + " ");
                if(i<=star/2){
                    x++;
                }
                else{
                    x--;
                }
                i++;
            }
            if(row<n){
                star+=2;
                space--;
                val++;
            }
            else{
                star-=2;
                space++;
                val--;
            }
            row++;
            System.out.println();
        }
    }
}
