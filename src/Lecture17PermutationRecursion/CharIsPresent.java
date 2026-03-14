package Lecture17PermutationRecursion;

public class CharIsPresent {
    public static void main(String[] args) {
        String str = "aboseihnoaaoheao";
        char ch ='a';
        int i = 2;
        System.out.println(IsPresent(str, ch, i));
    }

    public static boolean IsPresent(String str, char ch, int idx) {
        for (int i = idx; i<str.length();i++){
            if (str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
}
