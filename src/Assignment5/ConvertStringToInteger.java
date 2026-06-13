package Assignment5;

import java.util.Scanner;

public class ConvertStringToInteger {
    public static void main(String[] args) {
//        String str = "1234";
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int ans = Conversion(str, 0, 10);
        System.out.println(ans);
    }
    public static int Conversion(String str, int ans, int mul){
        if(str.isEmpty()){
            return ans;
        }
        char ch = str.charAt(0);
        int num = ch - '0';
        return Conversion(str.substring(1), ans *mul + num, mul);
    }
}
