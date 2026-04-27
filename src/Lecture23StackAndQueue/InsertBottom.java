package Lecture23StackAndQueue;

import java.awt.*;
import java.util.Stack;

public class InsertBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Insert(st, -7);
        System.out.println(st);
    }
    public static void Insert(Stack<Integer>st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int item = st.pop();
        Insert(st, x);
        st.push(item);
    }
}
