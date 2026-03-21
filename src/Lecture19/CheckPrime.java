package Lecture19;

public class CheckPrime {
    //    https://leetcode.com/problems/count-primes/description/
    public static void main(String[] args) {
        int n = 787;
        System.out.println(IsPrime(n));
    }
    public static boolean IsPrime(int n){
        for (int i = 2; i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
