package Assignment5;

import java.util.Scanner;

public class NthTriangleRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(Print(n));
    }
    public static int Print(int n){
        if(n == 1){
            return 1;
        }
        return Print(n-1)+n;
    }
}
