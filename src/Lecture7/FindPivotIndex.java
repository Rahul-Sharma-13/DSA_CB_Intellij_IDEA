package Lecture7;

//prefix and suffix

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(Pivot_Index(arr));

    }
    public static int Pivot_Index(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n; i++){
            int leftSum = sum(arr, 0, i-1);
            int rightSum = sum(arr, i+1, n - 1);
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
    public static int sum(int[] arr, int i, int j){
        int ans = 0;
        for(int k = i; k<=j; k++){
            ans = ans +arr[k];
        }
        return ans;
    }
}
