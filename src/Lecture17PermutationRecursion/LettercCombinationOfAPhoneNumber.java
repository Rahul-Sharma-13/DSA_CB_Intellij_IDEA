package Lecture17PermutationRecursion;

public class LettercCombinationOfAPhoneNumber {
    static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        String ques = "23";
        Combo(ques, "");
    }
    public static void Combo(String ques, String ans){
        if(ques.length() ==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String get = key[ch-'0'];
        for (int i = 0; i<get.length(); i++){
            Combo(ques.substring(1), ans+get.charAt(i));
        }
    }
}
