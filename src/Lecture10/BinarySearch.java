package Lecture10;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 5, 7, 8, 9, 13, 16, 18, 19, 20, 21};
        int item = 13;
        System.out.println(Search(arr,item));
    }
    public static int Search(int[] arr, int item){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == item){
                return mid;
            } else if (arr[mid]>item) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
