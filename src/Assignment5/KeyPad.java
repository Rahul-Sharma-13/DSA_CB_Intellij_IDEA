package Assignment5;

import java.util.Scanner;

public class KeyPad {
    static String[] keypad = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        PrintKeyPad(n, "");
        System.out.println();
        System.out.println(countKey(n));
    }
    public static void PrintKeyPad(String s, String ans){
        if(s.isEmpty()){
            System.out.print(ans + " ");
            return;
        }
        char ch = s.charAt(0);
        String num = keypad[ch - '0'];
        for (int i = 0; i < num.length(); i++) {
            PrintKeyPad(s.substring(1),ans + num.charAt(i));
        }
    }
    public static int countKey(String s){
        if(s.isEmpty()){
            return 1;
        }
        int sum = 0;
        char ch = s.charAt(0);
        String num = keypad[ch - '0'];
        for (int i = 0; i < num.length(); i++) {
            sum += countKey(s.substring(1));
        }
        return sum;
    }
}
