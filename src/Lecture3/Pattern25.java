package Lecture3;

public class Pattern25 {
    public static void main(String[] args) {

//                          1
//                      2	3	4
//                  5	6	7	8	9
//              10	11	12	13	14	15	16
//          17	18	19	20	21	22	23	24	25

        int n = 5;
        int row = 1;
        int star = 1;
        int space = n - 1;
        int count = 1;
        while (row <= n) {
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
