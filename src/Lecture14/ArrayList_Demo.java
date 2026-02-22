package Lecture14;

import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println(l);
        l.add(10);//O(1)
        l.add(20);
        l.add(30);
        l.add(0, -9); //O(N)
        l.add(3);
        l.add(5);
        l.add(7);
        System.out.println(l);
        //get
        System.out.println(l.get(1));//O(1)
        //remove
        System.out.println(l.remove(3));//O(n)
        System.out.println(l);
        System.out.println(l.size());
        //set --> update
        System.out.println(l.set(2, -7));
    }
}
