package Assignment4;

import java.util.Scanner;

public class MurthalParatha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tNoP = input.nextInt();
        int noC = input.nextInt();
        int[] ranks = new int[noC];
        for (int i = 0; i < noC; i++) {
            ranks[i] = input.nextInt();
        }
        System.out.println(Sol(ranks, tNoP));
    }

    public static int Sol(int[] ranks, int tNoP) {
        int i = 0;
        int nop = 1;
        int cnop = 0;
        int ans = 0;
        int rank;
        while (i < ranks.length) {
            rank = ranks[i];
            int time = nop * rank;
            if (nop <= ranks.length) {
                cnop = cnop + time;
                nop++;
            } else {
                if (cnop > ans) {
                    ans = cnop;
                    cnop = 0;
                }
                i++;
                nop = 1;
            }
        }
        return ans;
    }
}
