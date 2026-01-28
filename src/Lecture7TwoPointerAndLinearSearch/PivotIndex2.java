package Lecture7TwoPointerAndLinearSearch;

public class PivotIndex2 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(Pivot_Index1(arr));
    }
    public static int Pivot_Index1(int[] arr){
        int totalSum = 0;
        for(int i = 0; i< arr.length; i++){
            totalSum +=arr[i];
        }
        int left = 0;
        for(int i = 0; i<arr.length; i++){
            int right = totalSum-left-arr[i];
            if(left==right){
                return i;
            }
            left += arr[i];
        }
        return -1;
    }
    public static int Pivot_Index(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        //prefix
        left[0] = 0;//no need
        for (int i = 1; i<n; i++){
            left[i] = left[i-1] + arr[i-1];
        }
        //suffix
        int [] right = new int[n];
        right[n-1] = 0;//no need
        for(int i = n-2; i>=0; i--){
            right[i] = right[i+1] + arr[i+1];
        }
        //calculation
        for(int i = 0; i<right.length; i++){
            if(left[i] == right[i]){
                return i;
            }
        }
        return -1;
    }
}
