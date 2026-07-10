package Lecture44BitMasking;

public class OddEven {
    public static void main(String[] args) {
        int n = 78;
        if((n&1) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
