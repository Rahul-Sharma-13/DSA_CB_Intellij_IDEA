package AssignmentRecursion42Questions;

public class LargestDigitDryRun {
    public static void main(String[] args) {
        int n = 2483;
        int i = Integer.MIN_VALUE;
        System.out.println(FindLargest(n, i));
    }

    public static int FindLargest(int n, int largest) {
        if (n == 0) {
            return largest;
        }
        int rem = n % 10;
        if (rem > largest) {
            largest = rem;
        }
        return FindLargest(n / 10, largest);
    }
}
