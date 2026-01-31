package Lecture8PrefixSuffixAndReversalAlgo.Homework_Questions;
//  https://leetcode.com/problems/partition-array-into-disjoint-intervals/description/

public class PartitionArrayIntoDisjointIntervals {
    public static void main(String[] args) {
        int [] arr = {1,2};
        int length = findLength(arr);
        System.out.println(length);
    }

    public static int findLength(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(end > start){
            if(arr[start] > arr[end]){
                return end + 1;
            }else{
                end--;
            }
        }
        return end + 1;
    }
}
