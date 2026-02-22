package Lecture15Recursion;

public class CountVowels {
    public static void main(String[] args) {
        String word = "wenox";
        System.out.println(Count(word));
    }
    public static int Count(String word){
        if(word.length() == 0){
            return 0;
        }
        char ch = word.charAt(0);
        int c = 0;
        if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
            c = 1;
        }
        c = c + Count(word.substring(1));
        return c;
    }
}
