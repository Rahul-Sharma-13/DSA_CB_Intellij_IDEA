package Lecture35HashMapQues;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
//        sab kaam constant me hoga

//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(9);
//        set.add(4);
//        set.add(-2);
//        set.add(6);
//        set.add(7);
//        set.add(1);
////        duplicate is not allowed
//        System.out.println(set);
//
////        contains to get element
//        System.out.println(set.contains(7));
//        System.out.println(set.contains(71));
//
////        remove
//        System.out.println(set.remove(1));
//        System.out.println(set.remove(11));
//        System.out.println(set);
//        System.out.println(set.size());
//
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(9);
        set.add(4);
        set.add(-2);
        set.add(6);
        set.add(7);
        set.add(1);
//        duplicate is not allowed
//        sorted output
        System.out.println(set);

////        contains to get element
//        System.out.println(set.contains(7));
//        System.out.println(set.contains(71));
//
////        remove
//        System.out.println(set.remove(1));
//        System.out.println(set.remove(11));
//        System.out.println(set);
//        System.out.println(set.size());

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(9);
        set2.add(4);
        set2.add(-2);
        set2.add(6);
        set2.add(7);
        set2.add(1);
//        duplicate is not allowed
//        order is preserved
        System.out.println(set2);

////        contains to get element
//        System.out.println(set.contains(7));
//        System.out.println(set.contains(71));
//
////        remove
//        System.out.println(set.remove(1));
//        System.out.println(set.remove(11));
//        System.out.println(set);
//        System.out.println(set.size());






    }
}
