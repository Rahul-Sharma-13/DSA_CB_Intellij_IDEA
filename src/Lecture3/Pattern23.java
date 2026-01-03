package Lecture3;

public class Pattern23 {
    public static void main(String[] args) {

//        1
//        2 2 2
//        3 3 3 3 3
//        4 4 4 4 4 4 4
//        5 5 5 5 5 5 5 5 5

        int n = 5;
        int row = 1;
        int star = 1;
        int space = n - 1;
        while (row <= n) {
            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                System.out.print(row + " ");
                j++;
            }
            // next row ki prep
            System.out.println();
            row++;
            star += 2;
            space--;
        }
    }
}
