package Assignment5;

import java.util.Scanner;

public class GenerateParanthesis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        PrintParanthesis(n, 0, 0, "");
    }
    public static void PrintParanthesis(int n, int open, int close, String ans ){
        if(open == n && close == n){
            System.out.println(ans);
            return;
        }
        if(open>n || close>open){
            return;
        }
        PrintParanthesis(n, open + 1, close, ans + "(");
        PrintParanthesis(n, open, close+ 1, ans+")");
    }
}
