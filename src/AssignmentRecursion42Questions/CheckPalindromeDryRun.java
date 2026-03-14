package AssignmentRecursion42Questions;

public class CheckPalindromeDryRun {
    public static void main(String[] args) {
        int n = 121;
        int count = 0;
        int reverse = Checkpal(n, count);
        if(n == reverse){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static int Checkpal(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        return Checkpal(n / 10, count * 10 + rem);
    }
}
