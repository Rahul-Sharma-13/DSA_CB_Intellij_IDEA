package Lecture35HashMapQues;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(9);
        set.add(4);
        set.add(-2);
        set.add(6);
        set.add(7);
        set.add(1);
//        duplicate is not allowed
        System.out.println(set);

        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);

        for(int x: ll){
            System.out.print(x+" ");
        }
        System.out.println();
        for (int x: set){
            System.out.print(x+" ");
        }



    }
}
