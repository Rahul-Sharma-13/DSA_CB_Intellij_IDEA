package Lecture44BitMasking;

public class PrintSubsequenceWithBitMasking {
    public static void main(String[] args) {
        String s = "abc";
        print(s);
    }
    public static void print(String s){
        int n = s.length();
        for (int i = 0; i < (1 << n); i++) {
            Subsequence(s, i);
        }
    }
    public static void Subsequence(String s, int i){
        String ans = "";
        int pos = 0;
        while(i>0){
            if((i&1) != 0){
                ans = ans + s.charAt(pos);
            }
            pos++;
            i>>=1;
        }
        System.out.println(ans);
    }
}
