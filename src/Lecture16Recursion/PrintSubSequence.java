package Lecture16Recursion;

public class PrintSubSequence {
//    substring-> continuous subpart of string (a, b, c, ab, bc, abc)
//    sequence-> it's a part of string , but does not need to be continuous
//    or even in order("", a, b, c, ab, bc, ac, abc)
//    totol subseq = 2 ki power string ki len
    public static void main(String[] args) {
        String ques = "abcd";
        Print(ques, "");;
    }
    public static void Print(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        Print(ques.substring(1), ans);
        Print(ques.substring(1), ans+ch);
    }
}
