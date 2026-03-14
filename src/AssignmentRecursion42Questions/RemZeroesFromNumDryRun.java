package AssignmentRecursion42Questions;

public class RemZeroesFromNumDryRun {
    public static void main(String[] args) {
        int n = 102;
        System.out.println(RemoveZeroes(n));
    }

    public static int RemoveZeroes(int num) {
        int x = 0;
        if(num==0){
            return x;
        }
        int rem = num % 10;
        if (rem != 0) {
            x = RemoveZeroes(num/10) * 10 +rem;
        }else{
            x = RemoveZeroes(num/10);
        }
        return x;
    }
}
