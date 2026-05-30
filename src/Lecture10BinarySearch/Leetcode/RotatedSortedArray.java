package Lecture10BinarySearch.Leetcode;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(Search(arr, target));
    }
    public static int Search(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] >= arr[low]){
                if(arr[low] <= target && arr[mid] > target){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(arr[mid] < target && arr[high] >= target){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
