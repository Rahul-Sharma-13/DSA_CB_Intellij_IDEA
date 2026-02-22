package Practice;
import java.util.Scanner;

public class MirrorStarPattern {
    public static void main(String[] args) {
//            n = 5
//              *
//           *  *  *
//        *  *  *  *  *
//           *  *  *
//              *
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = 1;
        int space = n/2;
        int row = 1;
        while(row<=n){
            //space
            int s = 1;
            while(s<=space){
                System.out.print("  ");
                s++;
            }
            //star
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //updation
            if(row<=n/2){
                star+=2;
                space--;
            }else{
                star-=2;
                space++;
            }
            row++;
            System.out.println();


        }
    }
}
