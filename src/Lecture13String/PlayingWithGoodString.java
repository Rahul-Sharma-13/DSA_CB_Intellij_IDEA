package Lecture13String;

import java.util.Scanner;

public class PlayingWithGoodString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        System.out.println(longestLength(s));
    }
    public static int longestLength(String s){
        int ans = 0, c = 0;
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Isvowels(ch)){
                c++;
            }else{
                c = 0;
            }
            ans = Math.max(ans, c);
        }
        return ans;
    }

    public static boolean Isvowels(char ch) {
        if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

}
