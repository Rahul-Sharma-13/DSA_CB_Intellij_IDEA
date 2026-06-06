package Assignment5;

import java.util.Scanner;

public class RecursionSubsequences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        PrintSub(str, "");
        System.out.println();
        System.out.println(countSub(str));
    }
    public static void PrintSub(String str, String ans){
        if(str.isEmpty()){
            System.out.print(ans+" ");
            return;
        }
        char ch = str.charAt(0);
        PrintSub(str.substring(1), ans);
        PrintSub(str.substring(1), ans+ch);
    }
    public static int countSub(String str){
        if(str.isEmpty()){
            return 1;
        }
        int x = countSub(str.substring(1));
        int y = countSub(str.substring(1));
        return x+y;
    }
}
