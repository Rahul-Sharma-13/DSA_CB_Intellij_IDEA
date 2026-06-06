package Assignment5;

public class LastIndex {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {3, 2, 1, 2, 3};
        int m = 2;
        int ans = findIndex(arr, m, 0, -1);
        System.out.println(ans);
    }
    public static int findIndex(int[] arr, int m, int idx, int ans){
        if(arr[idx] == m){
            ans = idx;
        }
        if(idx >= arr.length-1){
            return ans;
        }
        return findIndex(arr, m, idx+1, ans);
    }
}
