package Lecture24;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(2, 8));
        System.out.println(add(2, 7, 9));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static int add(int x,int... a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+= a[i];
        }
        return sum;
    }
//    DiamondProblem
//    multiple inheritence allowed nhi hoti java me usi ko diamond problem kehte hai
}
