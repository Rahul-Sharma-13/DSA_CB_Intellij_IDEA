package Practice;
import java.util.Scanner;

public class HollowDimondPattern {
//              n = 5
//            * * * * *
//            * *   * *
//            *       *
//            * *   * *
//            * * * * *
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = n/2+1;
        int space = -1;
        int row = 1;
        while(row<=n){
            //star
            int i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            //space
            int s = 1;
            while(s<=space){
                System.out.print("  ");
                s++;
            }
            //star
            i = 1;
            // if row = 1 or row = n then i will become 2 so that it will print one less star
            if(row==1 || row == n){
                i = 2;
            }
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            // horizontal mirroring
            if(row<n/2+1){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            row++;
            System.out.println();
        }
    }

}
