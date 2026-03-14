package AssignmentRecursion42Questions;

public class SumOfEvenDigitsDryRun {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        int i = 1;
        System.out.println(FindSum(num, sum, i));
    }

    public static int FindSum(int num, int sum, int i) {
        if (num == 0) {
            return sum;
        }
        int rem = num %10;
        if(i%2==0){
            sum = sum +rem;
        }
        return FindSum(num/10, sum, i+1);
    }
}
