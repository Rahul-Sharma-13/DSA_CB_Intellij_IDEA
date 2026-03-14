package AssignmentRecursion42Questions;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1023;
        System.out.println(DigSum(n));
    }
    public static int DigSum(int n){
        if(n == 0){
            return 0;
        }
        int rem = n % 10;
        return DigSum(n/10) + rem;
    }
}
