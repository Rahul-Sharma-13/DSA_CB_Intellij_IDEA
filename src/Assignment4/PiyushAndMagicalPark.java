package Assignment4;

import java.util.Scanner;

public class PiyushAndMagicalPark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        char[][] ch = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            String[] temp = s.split(" ");
            for (int j = 0; j < m; j++) {
                ch[i][j] = temp[j].charAt(0);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
}
