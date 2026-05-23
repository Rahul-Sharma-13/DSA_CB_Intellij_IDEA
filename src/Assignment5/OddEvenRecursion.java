package Assignment5;

import java.util.Scanner;

public class OddEvenRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n%2 == 0){
            Print(n-1);
            System.out.println(n);
        }else{
            Print(n);
        }

    }

    public static void Print(int n) {
        int x = n;
        if (n <= 0) {
            return;
        }

        System.out.println(n);
        n-=2;
        Print(n);
        if(n+1<=x&&n+1>0){
            System.out.println(n + 1);
        }

    }
}
