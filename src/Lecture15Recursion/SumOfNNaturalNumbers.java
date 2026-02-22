package Lecture15Recursion;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum(n));
    }
    public static int Sum(int n){
        if(n == 0){
            return 0;
        }
//        if(n == 1){
//            return 1;
//        }
        //both works
        int x = Sum(n-1);
        return x + n;
    }
}
