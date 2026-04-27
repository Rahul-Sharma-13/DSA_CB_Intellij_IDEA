package Lecture29;
//https://leetcode.com/problems/subarray-product-less-than-k/submissions/1982633763/
public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 6};
        int k = 100;
        System.out.println(Product(arr, k));
    }
    public static int Product(int[] arr, int k){
        int start = 0, end = 0, p = 1, ans = 0;
        while(end<arr.length){
//            widow grow
            p = p*arr[end];
//            window shrink
            while(p>=k&&start<=end){
                p = p/arr[start];
                start++;
            }
//            answer update
            ans += (end - start + 1);
            end++;
        }
        return ans;
    }
}
