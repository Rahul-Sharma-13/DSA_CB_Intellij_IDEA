package Lecture14;

import java.util.ArrayList;

public class ArrayList_demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        // by default capacity = 10 can change the default capacity by giving size by writing  new ArrayList<>(6);
        //arraylist capacity increases by 1.5 but in vector it is increased by 2
        // vector syncronised hota hai or cheezein sync hone se safety rakhta h but array list asyncronus hoti hai
        System.out.println(l);
        l.add(10);//O(1)
        l.add(20);
        l.add(30);
        l.add(0, -9); //O(N)
        l.add(3);
        l.add(5);
        l.add(7);
    }
}
