package Assignment5;

public class CountRemoveAndReplace2 {
    public static void main(String[] args) {
        String str = "abchihitfhi";
        int count = countHI(str, 0);
        System.out.println(count);
        String ans = removeHi(str, "");
        System.out.println(ans);
        String ans2 = replaceHi(str, "");
        System.out.println(ans2);
    }
    public static int countHI(String str, int count){
        if(str.isEmpty() ){
            return count;
        }
        char ch = str.charAt(0);
        if(str.length()>=3&& ch == 'h' && str.charAt(1) == 'i'&& str.charAt(2) == 't'){
            return countHI(str.substring(3), count);
        }else if(str.length()>=2&& ch == 'h' && str.charAt(1) == 'i'){
            return countHI(str.substring(2), count+1);
        }else {
            return countHI(str.substring(1), count);
        }
    }
    public static String removeHi(String str, String ans){
        if(str.isEmpty() ){
            return ans;
        }
        char ch = str.charAt(0);
        if(str.length()>=3&& ch == 'h' && str.charAt(1) == 'i'&& str.charAt(2) == 't'){
            return removeHi(str.substring(3), ans + "hit");
        }else if(str.length()>=2&& ch == 'h' && str.charAt(1) == 'i'){
            return removeHi(str.substring(2), ans);
        }else {
            return removeHi(str.substring(1), ans + ch);
        }
    }
    public static String replaceHi(String str, String ans){
        if(str.isEmpty() ){
            return ans;
        }
        char ch = str.charAt(0);
        if(str.length()>=3&& ch == 'h' && str.charAt(1) == 'i'&& str.charAt(2) == 't'){
            return replaceHi(str.substring(3), ans + "hit");
        }else if(str.length()>=2&& ch == 'h' && str.charAt(1) == 'i'){
            return replaceHi(str.substring(2), ans+"bye");
        }else {
            return replaceHi(str.substring(1), ans + ch);
        }
    }
}
