package Assignment4;

import java.util.Scanner;

public class KthRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
            long n = input.nextLong();
            int k = input.nextInt();
            System.out.println(findKthRoot(n, k));
        }
    }
    public static long findKthRoot(long n, int k){
        long start = 0;
        long end = n;
        long ans = 0;
        while(end>=start){
            long mid = start+(end-start)/2;
            if(Math.pow(mid, k)<=n){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
}
