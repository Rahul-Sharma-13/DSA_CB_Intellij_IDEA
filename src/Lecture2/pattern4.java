package Lecture2;

public class pattern4 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n-1;
        int star = 1;

        while(row<=n){
            //spaces
            int i = 1;
            while(space >=i){
                System.out.print("  ");
                i++;
            }
            //stars
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }

            System.out.println();
            space--;
            row++;
            star++;
        }
    }
}
