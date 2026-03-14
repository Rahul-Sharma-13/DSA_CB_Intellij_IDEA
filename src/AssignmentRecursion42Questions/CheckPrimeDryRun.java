package AssignmentRecursion42Questions;

public class CheckPrimeDryRun {
    public static void main(String[] args) {
        int n = 7;
        int i = 2;
        System.out.println(checkPrime(n, i));
    }

    public static boolean checkPrime(int n, int i) {
        if(n ==0||n==1){
            return false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return checkPrime(n, i + 1);
    }
}
