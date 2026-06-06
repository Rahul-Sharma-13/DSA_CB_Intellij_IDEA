package Assignment5;

import java.util.Objects;

public class IncompleteDictionaryOrder {
    public static void main(String[] args) {
        String s = "cab";
        System.out.println(s.substring(1));
        DictOrder(s, s,  "");
    }
    public static void DictOrder(String s, String org, String ans){
        if(s.isEmpty()){
            if(!Objects.equals(ans, org)) {
                System.out.println(ans);
            }
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String  left = s.substring(0, i);
            String right = s.substring(i+1);
            if(ch>=org.charAt(i)) {
                DictOrder(left + right, org ,ans + ch);
            }
        }
    }
}
