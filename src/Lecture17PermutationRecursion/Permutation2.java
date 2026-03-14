package Lecture17PermutationRecursion;
// you can stop the duplicates from generating by using this method
// it is used where you want to remove duplicates
public class Permutation2 {
    public static void main(String[] args) {
        String ques = "abc";
        String ans = "";
        Print(ques, ans);
    }

    public static void Print(String ques, String ans) {
        if (ques.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            if (IsPresent(ques, ch, i)) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i + 1);
                Print(s1 + s2, ans + ch);
            }
        }
    }

    public static boolean IsPresent(String str, char ch, int idx) {
        for (int i = idx + 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
}
