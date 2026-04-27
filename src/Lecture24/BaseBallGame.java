package Lecture24;

import java.util.Stack;

public class BaseBallGame {
    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};

    }
    public static int calPoints(String[] ops){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            String s = ops[i];
            if(s.equals("+")){
                int a = st.pop();
                int b = st.peek();
                st.push(a);
                st.add(a+b);
            }else if(s.equals("C")){
                st.pop();
            }else if (s.equals("D")){
                int x = st.peek();
                st.push(2*x);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for(int x:st){
            sum+=x;
        }
        return sum;
    }
}
