package Lecture32;

public class StackClassClient {
    public static void main(String[] args) {
        StackClass st = new StackClass();
        StackI st1 = new StackI(){
            @Override
            public void push(int item ){

            }
            @Override
            public int pop(){
                return 0;
            }
        };
    }
}
