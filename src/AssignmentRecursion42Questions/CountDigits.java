package AssignmentRecursion42Questions;

public class CountDigits {
    public static void main(String[] args) {
        int n = -289836;
        int count = 0;
        System.out.println(Count2(n, count));
    }
    public static int Count(int n ){
        int count;
        if(n == 0){
            return 0;
        }else{
            count = 1;
        }
        return Count(n/10) + count;
    }

    //      OR
    public static int Count2(int n, int count){
        if(n == 0){
            return count;
        }else{
            count++;
        }
        return Count2(n/10, count);
    }
}
