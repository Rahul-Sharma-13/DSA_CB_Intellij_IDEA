package Assignment3;

import java.util.Scanner;

public class IncompleteHelpRamu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            int c1 = input.nextInt();
            int c2 = input.nextInt();
            int c3 = input.nextInt();
            int c4 = input.nextInt();
            int n = input.nextInt();
            int m = input.nextInt();
            int[] rikshaw = new int[n];
            int[] cab = new int[m];
            for (int i = 0; i < n; i++) {
                rikshaw[i] = input.nextInt();
            }
            for (int i = 0; i < m; i++) {
                cab[i] = input.nextInt();
            }
        }
    }
}
