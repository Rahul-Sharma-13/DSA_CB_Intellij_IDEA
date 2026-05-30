package Lecture21QuickSort;

public class Power {
    public static void main(String[] args) {
        int a = 5;
        int n = 4;
        System.out.println(pow(a, n));
    }
    public static int pow(int a, int n){
        if(n==1){
            return a;
        }
        int ans = pow(a, n/2);
        ans = ans*ans;
        if(n%2==1){
            ans = ans*a;
        }
        return ans;
    }
}
