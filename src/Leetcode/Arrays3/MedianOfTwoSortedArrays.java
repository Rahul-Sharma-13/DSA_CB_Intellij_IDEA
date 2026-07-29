package Leetcode.Arrays3;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};

        double median = MergeArr(arr1, arr2);
        System.out.println(median);
    }
    public static double MergeArr(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n + m];
        int i = 0;
        int j = 0;
        int idx = 0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[idx] = arr1[i];
                idx++;
                i++;
            }else{
                ans[idx] = arr2[j];
                idx++;
                j++;
            }
        }
        while (i<n){
            ans[idx] = arr1[i];
            idx++;
            i++;
        }
        while(j<m){
            ans[idx] = arr2[j];
            idx++;
            j++;
        }
        for (int k = 0; k < ans.length; k++) {
            System.out.print(ans[k] + " ");
        }
        System.out.println();
        int ansLength = ans.length;
        if(ansLength %2 == 0){
            int first = (ansLength - 1)/2;
            int second = ansLength/2;
            return (double)(ans[first] + ans[second])/2;
        }else{
            return ans[ansLength/2];
        }
    }

}
