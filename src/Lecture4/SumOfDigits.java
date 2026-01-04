package Lecture4;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 2346;
        int sum = 0;
//        while(n>0){
//            int rem = n%10;
//            sum += rem;
//            n /= 10;
//        }

        for(; n>0;){
            int rem = n%10;
            sum += rem;
            n /= 10;
        }
        System.out.println(sum);
    }
}
