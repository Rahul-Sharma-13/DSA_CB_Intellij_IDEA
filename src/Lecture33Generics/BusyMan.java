package Lecture33Generics;

import java.util.Arrays;
import java.util.Scanner;

public class BusyMan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
            int n = input.nextInt();
            Pair[] arr = new Pair[n];
            for (int i = 0; i < n; i++) {
                int start = input.nextInt();
                int end = input.nextInt();
                arr[i] = new Pair(start, end);
            }
            Arrays.sort(arr, (a, b) -> a.end - b.end);
            int activitie = 1;
            int et = arr[0].end;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i].start >= et) {
                    activitie++;
                    et = arr[i].end;
                }
            }
            System.out.println(activitie);
        }
    }
    static class Pair{
        int start, end;
        public Pair(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
}

