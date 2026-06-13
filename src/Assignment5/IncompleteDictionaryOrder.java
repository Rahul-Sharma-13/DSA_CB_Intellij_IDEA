package Assignment5;

import java.util.ArrayList;

public class IncompleteDictionaryOrder {
    public static void main(String[] args) {
        String s = "cab";
        ArrayList<String> list = new ArrayList<>();
        DictOrder(s, s,  "", list);
        System.out.println(list);

    }
    public static void DictOrder(String s, String org, String ans, ArrayList<String> list){
        if(s.length()==0) {
            if (ans.compareTo(org) > 0) {
                list.add(ans);
//                System.out.println(ans);
            }
            return;
        }
        char ch = s.charAt(0);
        DictOrder(s.substring(1), org, ans, list);
        DictOrder(s.substring(1), org, ans + ch, list);
    }
}
