package AssignmentRecursion42Questions;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(Sum(num));
    }
    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        return Sum(n - 1) + n;
    }
}
