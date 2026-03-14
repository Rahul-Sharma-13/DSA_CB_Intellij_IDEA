package AssignmentRecursion42Questions;

public class StringPalindrome {
    public static void main(String[] args) {
        String word = "madam";
//        System.out.println(word.charAt(0));
        System.out.println(CheckPal(word));
    }
    public static boolean CheckPal(String word){
        int start = 0;
        int end = word.length()-1;
        if(start == end){
            return true;
        }
        if(word.charAt(start) != word.charAt(end)){
            return false;
        }
        return CheckPal(word.substring(start+1, end));
    }
}
