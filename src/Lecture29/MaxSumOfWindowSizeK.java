package Lecture29;

public class MaxSumOfWindowSizeK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 2, 1};
        int k = 3;
        System.out.println(MaxSum(arr, k));
    }
    public static int MaxSum(int[] arr, int k){
//        1. first window ka ans
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum+arr[i];
        }
        int ans = sum;
        for (int i = k; i < arr.length; i++) {
//            1 window grow
            sum+= arr[i];
//            2. window shrink
            sum-=arr[i-k];
//            3. ans update
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
