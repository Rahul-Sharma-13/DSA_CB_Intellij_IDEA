package Lecture14ArrayList;

public class FrequencyArray {
    public static void main(String[] args) {
        String s = "trdyguhhaj";
        int [] freq = new int[26];
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            System.out.println(ch-'a');
        }
    }
}
