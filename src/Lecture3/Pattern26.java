package Lecture3;

public class Pattern26 {
    public static void main(String[] args) {

//                          1
//                      1	2	3
//                  1	2	3	4	5
//              1	2	3	4	5	6	7
//          1	2	3	4	5	6	7	8	9

        int n = 5;
        int row = 1;
        int star = 1;
        int space = n - 1;
        while (row <= n) {
            int count = 1;

            // space
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }
            // star
            int j = 1;
            while (j <= star) {
                System.out.print(count + "\t");
                count++;
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
