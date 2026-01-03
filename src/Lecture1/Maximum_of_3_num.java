package Lecture1;

public class Maximum_of_3_num {
    public static void main(String[] args) {
        int a = 80;
        int b = 50;
        int c = 20;
        if (a>=b && a>=c){
            System.out.println("a is maximum...");
        } else if (b >= a && b >= c) {
            System.out.println("b is maximum...");
        }else{
            System.out.println("c is maximum...");
        }
    }
}
