package Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DictionaryOrderSmaller {
    public static void main(String[] args) {

//        String[] nothing = {"rahul", "rajesh", "rohan", "raj"};
//        Arrays.sort(nothing);
//        for (int i = 0; i<nothing.length; i++){
//            System.out.println(nothing[i]);
//        }

        Scanner input = new Scanner(System.in);
        String s = input.next();
        ArrayList<String> list = new ArrayList<>();
//        System.out.println(s.substring(0,1));
        DictOrder(s, s,  "", list);
//        System.out.println(list);
        String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void DictOrder(String s, String org, String ans, ArrayList<String> list){
        if(s.isEmpty()) {
            if (ans.compareTo(org) < 0) {
                list.add(ans);
//                System.out.println(ans);
            }
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            DictOrder(left + right, org, ans + ch, list);
        }
    }
}
