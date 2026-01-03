package Lecture3;


public class Pattern27 {
    public static void main(String[] args) {

//                  1
//                1 2 1
//              1 2 3 2 1
//            1 2 3 4 3 2 1
//          1 2 3 4 5 4 3 2 1

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
            int val = 1;
            int j = 1;
            while (j <= star) {
                System.out.print(val + " ");

                if(j < star/2 + 1){
                    val++;
                } else {
                    val--;
                }
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
