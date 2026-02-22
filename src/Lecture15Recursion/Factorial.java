package Lecture15Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n));
    }
    public static int Fact(int n){
        //Base Case
        if(n == 0){
            return 1;
        }
        int f = Fact(n-1);//SP
        return f * n;
    }
}
