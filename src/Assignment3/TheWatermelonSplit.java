package Assignment3;

import java.util.Scanner;

public class TheWatermelonSplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Watermelon(n);
    }
    public static void Watermelon(int n){
        if(n ==2){
            System.out.println("NO");
        }else if(n%2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
