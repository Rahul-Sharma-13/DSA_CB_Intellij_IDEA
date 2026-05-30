package Lecture19BackTracking;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 120;
        System.out.println(Sieve(n));
    }
    public static int Sieve(int n){
        int[] prime = new int[n+1];
        prime[0] = 1;
        prime[1] = 1;
        for (int i = 2; i*i < prime.length; i++) {
            if(prime[i] ==0){
                for (int j = 2; j*i<prime.length; j++){
                    prime[j*i] = 1;
                }
            }
        }
        int c = 0;
        for (int i = 2; i < prime.length; i++) {
            if(prime[i] ==0){
                c++;
            }
        }
        return c;
    }
}
