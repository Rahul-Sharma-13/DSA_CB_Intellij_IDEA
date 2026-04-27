package Lecture24;

public class DynamicStack_Client {
    public static void main(String[] args) throws Exception{
        DynamicStack st = new DynamicStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.Display();
    }
}
