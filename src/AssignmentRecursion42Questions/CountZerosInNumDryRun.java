package AssignmentRecursion42Questions;

public class CountZerosInNumDryRun {
    public static void main(String[] args) {
        int n = 10020;
        System.out.println(Count(n));
    }
    public static int Count(int num){
        int count = 0;
        if(num == 0){
            return count;
        }
        int rem = num%10;
        if(rem ==0){
            count++;
            return Count(num/10) + count;
        }else{
            return Count(num/10);
        }
    }
}
