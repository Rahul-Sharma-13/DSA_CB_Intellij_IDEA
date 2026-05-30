//package Lecture33;
//
//public class LinkedList<T> {
//    private class Node{
//        T val;
//        Lecture26LinkedList.LinkedList.Node next;
//        public Node(int val){
//            this.val = val;
//        }
//    }
//    private Lecture26LinkedList.LinkedList.Node head;
//    private Lecture26LinkedList.LinkedList.Node tail;
//    private int size;
//
//    //    O(1)
//    public void addlast(int item){
//        if(size==0){
//            addfirst(item);
//        }else{
//            Lecture26LinkedList.LinkedList.Node nn = new Lecture26LinkedList.LinkedList.Node(item);
//            tail.next = nn;
//            tail = nn;
//            size++;
//        }
//    }
//    public void addindex(int item, int k){
//        if(k ==0){
//            addfirst(item);
//        }else if(k == size){
//            addlast(item);
//        }else{
//            Lecture26LinkedList.LinkedList.Node nn = new Lecture26LinkedList.LinkedList.Node(item);
//            Lecture26LinkedList.LinkedList.Node prev = getNode(k -1);
//            nn.next = prev.next;
//            prev.next = nn;
//            size++;
//        }
//    }
//    //    O(N)
//    private Lecture26LinkedList.LinkedList.Node getNode(int k){
//        Lecture26LinkedList.LinkedList.Node temp = head;
//        for (int i = 0; i < k; i++) {
//            temp = temp.next;
//        }
//        return temp;
//    }
//
//    //    O(1)
//    public void addfirst(int item){
//        Lecture26LinkedList.LinkedList.Node nn = new Lecture26LinkedList.LinkedList.Node(item);
//        if(size ==0){
//            head = nn;
//            tail = nn;
//            size++;
//        }else{
//            nn.next = head;
//            head = nn;
//            size++;
//        }
//    }
//    //    O(N)
//    public void display(){
//        Lecture26LinkedList.LinkedList.Node temp = head;
//        while(temp!=null){
//            System.out.print(temp.val+"--> ");
//            temp = temp.next;
//        }
//        System.out.println(".");
//    }
//    //    O(1)
//    public int size(){
//        return size;
//    }
//    //    O(1)
//    public int getFirst(){
//        return head.val;
//    }
//    //    O(N)
//    public int getLast(){
//        return tail.val;
//    }
//    //    O(N)
//    public int getIndex(int k){
//        return getNode(k).val;
//    }
//    //    O(1)
//    public int removeFirst(){
//        Lecture26LinkedList.LinkedList.Node curr=head;
//        if(size == 1){
//            head = null;
//            tail = null;
//            size--;
//        }else{
//            head = head.next;
//            curr.next = null;
//            size--;
//        }
//        return curr.val;
//    }
//    //    O(N)
//    public int removeLast(){
//        if(size == 1){
//            return removeFirst();
//        }
//        else{
//            int val = tail.val;
//            Lecture26LinkedList.LinkedList.Node prev = getNode(size-2);
//            prev.next = null;
//            tail = prev;
//            size--;
//            return val;
//        }
//    }
//
//    public T removeindex(int k){
//        if(k == 0){
//            return removeFirst();
//        }else if(k == size - 1){
//            return removeLast();
//        }else{
//            Lecture26LinkedList.LinkedList.Node prev = getNode(k - 1);
//            Lecture26LinkedList.LinkedList.Node curr = prev.next;
//            prev.next = curr.next;
//            curr.next = null;
//            size--;
//            return curr.val;
//        }
//    }
//}