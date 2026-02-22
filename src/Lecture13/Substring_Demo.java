package Lecture13;

public class Substring_Demo {
    public static void main(String[] args) {
        String s = "codingBlocks";
        System.out.println(s.substring(2, 6));
        // isme internally substring method me < hai rather than <= to isliye ham 2 se 5 print karne ke liye hame 2 se 6 tak index pass karna pdega
        System.out.println(s.substring(2));
        // isme 2 se lekar last tak saare character print ho jaenge
        print(s);
    }

    public static void print(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
