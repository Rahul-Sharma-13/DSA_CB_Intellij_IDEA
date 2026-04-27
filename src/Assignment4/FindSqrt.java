package Assignment4;

import java.util.Scanner;

public class FindSqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long x = input.nextLong();
        int n = 122;
        findSqrt(n);
    }
    public static void findSqrt(long n){
        long start = 2;
        long end = n;
        long ans = 0;
        int count = 0;
        while(end>=start){
            long mid = start+(end-start)/2;
            if(mid*mid<=n){
                ans = mid;
                start = mid+1;
            }else{
                end = mid - 1;
            }
            count++;
        }
        System.out.println(count);
        System.out.println(ans);
//        sqrt(n);
    }
//    public static void sqrt(int n){
//        int count = 0;
//        for (int i = 2; i*i <= n; i++) {
//            count++;
//        }
//        System.out.println(count);
//    }
}
