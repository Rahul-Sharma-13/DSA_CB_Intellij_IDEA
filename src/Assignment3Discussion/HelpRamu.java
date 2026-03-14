package Assignment3Discussion;

import java.util.Scanner;

public class HelpRamu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int c1 = input.nextInt();
            int c2 = input.nextInt();
            int c3 = input.nextInt();
            int c4 = input.nextInt();
            int n = input.nextInt();
            int m = input.nextInt();
            int[] rickshaw = new int[n];
            int[] cab = new int[m];
            for (int i = 0; i < rickshaw.length; i++) {
                rickshaw[i] = input.nextInt();
            }
            for (int i = 0; i < cab.length; i++) {
                cab[i] = input.nextInt();
            }
            System.out.println(Help(c1, c2, c3, c4, rickshaw, cab));
        }
    }

    public static int Help(int c1, int c2, int c3, int c4, int[] rickshaw, int[] cab) {
        int cost_rickshaw = 0, cost_cab = 0;
        for (int i = 0; i < rickshaw.length; i++) {
            cost_rickshaw += Math.min(rickshaw[i] * c1, c2);
        }
        for (int i = 0; i < cab.length; i++) {
            cost_cab += Math.min(cab[i] * c1, c2);
        }
        cost_cab = Math.min(cost_cab, c3);
        cost_rickshaw = Math.min(cost_rickshaw, c3);
        return Math.min(c4, cost_rickshaw + cost_cab);

    }
}
