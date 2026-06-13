package Assignment5;

import java.util.Scanner;

public class ReplacePi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
            String str = input.next();
            replace(str, "");
        }
    }
    public static void replace(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char chp = str.charAt(0);
        if(str.length()>=2 && chp == 'p' && str.charAt(1) == 'i'){
            replace(str.substring(2), ans + 3.14);
        }else{
            replace(str.substring(1), ans + chp);
        }

    }
}
