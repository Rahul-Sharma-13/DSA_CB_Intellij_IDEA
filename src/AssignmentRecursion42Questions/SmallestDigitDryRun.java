package AssignmentRecursion42Questions;

public class SmallestDigitDryRun {
    public static void main(String[] args) {
        int n = 409;
        int smallest = Integer.MAX_VALUE;
        System.out.println(FindSmallest(n, smallest));
    }
    public static int FindSmallest(int num, int smallest){
        if(num==0){
            return smallest;
        }
        int rem = num%10;
        if(smallest>rem){
            smallest = rem;
        }
        return FindSmallest(num/10, smallest);
    }
}
