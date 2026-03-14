package AssignmentRecursion42Questions;

public class LCMDryRun {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int LCM = (a*b)/FindHCF(a,b);
        System.out.println(LCM);
    }
    public static int FindHCF(int dividend, int divisor){
        int rem = dividend%divisor;
        if(rem == 0){
            return divisor;
        }
        return FindHCF(divisor, rem);
    }
}
