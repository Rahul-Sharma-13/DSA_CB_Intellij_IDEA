package Lecture10;

public class Kth_Root {
    public static void main(String[] args) {
        int n = 149;
        int k = 3;
        System.out.println(root(n,k));
    }
    public static int root(int n, int k){
        int start = 0;
        int end = n;
        int ans = 0;
        while(start<=end){
            int mid =( start + end )/2;
            if(Math.pow(mid, k) <= n){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
