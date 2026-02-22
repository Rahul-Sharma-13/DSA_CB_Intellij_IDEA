package Lecture15Recursion;

public class Power {
    public static void main(String[] args) {
        int a = 3;
        int x = 4;
        System.out.println(pow(a,x));
    }
    public static int pow(int a, int x){
        if(x==0){
            return 1;
        }
        int c = pow(a, x - 1);
        return c * a;
    }
}
