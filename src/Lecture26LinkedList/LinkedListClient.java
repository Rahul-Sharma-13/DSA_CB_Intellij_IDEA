package Lecture26LinkedList;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addfirst(40);
        ll.addlast(50);
        ll.addindex(-7, 2);
        ll.display();
        System.out.println(ll.getLast());
        System.out.println(ll.getFirst());
        System.out.println(ll.getIndex(2));
    }
}
