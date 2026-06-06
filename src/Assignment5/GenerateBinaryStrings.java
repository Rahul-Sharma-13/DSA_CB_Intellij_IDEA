package Assignment5;

public class GenerateBinaryStrings {
    public static void main(String[] args) {
        String s = "1??0?101";
        printString(s, "");
    }
    public static void printString(String s, String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
            char ch = s.charAt(0);
            if(ch == '?'){
                printString(s.substring(1), ans + "0" );
                printString(s.substring(1), ans + "1" );
            }else{
                printString(s.substring(1), ans +ch);
            }
    }
}
