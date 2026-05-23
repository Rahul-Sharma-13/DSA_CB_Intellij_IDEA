package Lecture32;

public interface StackI {
    public static final int x = 0;
    public void push(int x);
    public int pop();

    // java8
    public static void fun(){

    }
    default void fun1(){

    }
    // java9
    private static void fun2(){

    }
}
