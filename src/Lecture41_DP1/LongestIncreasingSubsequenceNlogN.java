package Lecture41_DP1;

public class LongestIncreasingSubsequenceNlogN {
    public static void main(String[] args) {
        int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
        System.out.println(LIS(arr));
    }
    public static int LIS(int[] arr){
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int len = 1;
        for (int i = 1; i < dp.length; i++) {
            if(dp[len - 1] < arr[i]){
                dp[len] = arr[i];
                len++;
            }
            else{
                int idx = binarySearch(dp, 0, len - 1, arr[i]);
                dp[idx] = arr[i];
            }
        }
        return len;
    }
    public static int binarySearch(int[] dp, int start, int end, int item){
        int ans = 0;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(dp[mid]>=item){
                ans = mid;
                end = mid - 1;
            }else{
                start = start + 1;
            }
        }
        return ans;
    }
//    354


}
