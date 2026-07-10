package Lecture44BitMasking;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(NthNumber(n));
    }
    public static int NthNumber(int n){
        int mul = 5;
        int sum = 0;
        while (n>0){
            if((n&1) != 0){
                sum = sum + mul;
            }
            mul = mul*5;
            n>>=1;
        }
        return sum;
    }
}
