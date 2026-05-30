package Lecture14ArrayList;

import java.util.ArrayList;

public class ArrayList_Demo2 {
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
        for (int i = 0; i<l.size(); i++){
            System.out.println(l.get(i) + " ");
        }

    }
}
