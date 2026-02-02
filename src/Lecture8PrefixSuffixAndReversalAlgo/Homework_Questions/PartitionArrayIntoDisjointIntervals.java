package Lecture8PrefixSuffixAndReversalAlgo.Homework_Questions;
//  https://leetcode.com/problems/partition-array-into-disjoint-intervals/description/

public class PartitionArrayIntoDisjointIntervals {
    public static void main(String[] args) {
        int [] arr = {5,0,3,8,6};
        int x = findLength(arr);
        System.out.println(x);
    }

    public static int findLength(int[] arr){
        int n = arr.length;
        //prefix
        int[] left = new int[n];
        left[0] = arr[0];
        for(int i = 1; i<left.length;i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        //suffix
        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            right[i] = Math.min(right[i+1], arr[i]);
        }

        // calculation
        for(int i = 1; i<right.length; i++){
            if(left[i-1] <= right[i]){
                return i;
            }
        }
        return 0;
    }
}
