package Lecture32;

public class StackClass implements StackI {
    // ye dono interface ki wajah se body deni pdi h
    @Override
    public void push(int x){
//        StackI.x = 5;
        System.out.println(StackI.x);
    }
    @Override
    public int pop(){
        return 0;
    }
    //ye khud ka method hai
    public void Display(){

    }
}
