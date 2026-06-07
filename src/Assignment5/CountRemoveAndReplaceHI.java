package Assignment5;

import java.util.Scanner;

public class CountRemoveAndReplaceHI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int count = countHI(str, 0);
        System.out.println(count);
        removeHi(str, "");
        replaceHi(str, "");
    }
    public static int countHI(String str, int count){
        if(str.isEmpty() ){
            return count;
        }
        char ch = str.charAt(0);
        if(str.length()>=2&& ch == 'h' && str.charAt(1) == 'i'){
            return countHI(str.substring(2), count+1);
        }else {
            return countHI(str.substring(1), count);
        }
    }
    public static void removeHi(String str, String ans){
        if(str.isEmpty() ){
            System.out.println(ans);
            return ;
        }
        char ch = str.charAt(0);
        if(str.length()>=2&& ch == 'h' && str.charAt(1) == 'i'){
            removeHi(str.substring(2), ans);
        }else {
            removeHi(str.substring(1), ans + ch);
        }
    }
    public static void replaceHi(String str, String ans){
        if(str.isEmpty() ){
            System.out.println(ans);
            return ;
        }
        char ch = str.charAt(0);
        if(str.length()>=2&& ch == 'h' && str.charAt(1) == 'i'){
            replaceHi(str.substring(2), ans+"bye");
        }else {
            replaceHi(str.substring(1), ans + ch);
        }
    }
}
