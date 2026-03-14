package AssignmentRecursion42Questions;

public class HCFDryRun {
    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        System.out.println(FindHCF(a, b));
    }

    public static int FindHCF(int dividend, int divisor) {
        int rem = dividend % divisor;
        if(rem == 0){
            return divisor;
        }
        return FindHCF(divisor, rem);
    }
}
