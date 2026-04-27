package Lecture23StackAndQueue;

import java.util.Stack;

public class Stack_Java {
    public static void main(String[] args) {
//        iski default capacity hi 10 hoti hai iske andar koi aisa constructor nhi hai jo ki parameter leta ho
//        Stack<Integer> st = new Stack<>(8);
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
//        ye vector ki tarah apne aap ko 2* se increase krta h full hone pe
        System.out.println(st.capacity());
        System.out.println(st.size());
        //remove
        System.out.println(st.pop());
        System.out.println();


        System.out.println(st.size());
        System.out.println(st.capacity());
        System.out.println(st.isEmpty());
        for(int x: st){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
