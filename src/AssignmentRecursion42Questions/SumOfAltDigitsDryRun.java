package AssignmentRecursion42Questions;

public class SumOfAltDigitsDryRun {
    public static void main(String[] args) {
        int n = 123456;
        int i = 1;
        System.out.println(sumOfAlternate(n, i));
    }
    public static int sumOfAlternate(int n, int idx) {
        if (n / 10 == 0) {
            return n;
        }
        if (idx == 1) {
            idx = 0;
        } else {
            idx = 1;
        }
        int sum = sumOfAlternate(n / 10, idx);
        if (idx == 1) {
            sum += n % 10;
        }
        return sum;
    }
}
