package AssignmentRecursion42Questions;

public class DecimalToBinaryDryRun {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Conversion(n));
    }
    public static int Conversion(int num){
        if(num==0){
            return 0;
        }
        int rem = num%2;
        return Conversion(num/2)*10+rem;
    }
}
