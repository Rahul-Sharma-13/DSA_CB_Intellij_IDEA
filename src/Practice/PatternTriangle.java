package Practice;
import java.util.Scanner;

public class PatternTriangle {
//              n = 4
//                    1
//                  2 3 2
//                3 4 5 4 3
//              4 5 6 7 6 5 4
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = 1;
        int space = n-1;
        int row = 1;
        while(row<=n){
            //space
            int s = 1;
            while(s<=space){
                System.out.print("\t");
                s++;
            }
            //star
            int i = 1;
            int x = row;
            while(i<=star){
                System.out.print(x + "\t");
                if(i<=star/2){
                    x++;
                }else{
                    x--;
                }
                i++;
            }
            //updation
            row++;
            System.out.println();
            star+=2;
            space--;
        }
    }
}
