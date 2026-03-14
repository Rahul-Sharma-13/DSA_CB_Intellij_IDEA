package AssignmentRecursion42Questions;

public class ProductOfDigitsDryRun {
    public static void main(String[] args) {
        int n = 234;
        int count = 1;
        System.out.println(FindProduct(n, count));
    }

    public static int FindProduct(int num, int count){
        if(num == 0){
            return count;
        }
        int rem = num % 10;
        count = count * rem;
        return FindProduct(num/10, count);
    }
}
