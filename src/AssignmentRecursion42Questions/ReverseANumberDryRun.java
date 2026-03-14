package AssignmentRecursion42Questions;

public class ReverseANumberDryRun {
    public static void main(String[] args) {
        int n = 123;
        int count = 0;
        System.out.println(reverse(n, count));
    }
    public static int reverse(int n, int count){
        if(n == 0){
            return count;
        }
        int rem = n%10;
        count = count * 10 + rem;
        return reverse(n/10, count);
    }
}
