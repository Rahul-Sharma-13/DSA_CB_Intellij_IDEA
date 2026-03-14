package AssignmentRecursion42Questions;

public class CheckArraySortedDryRun {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 8, 9};
        int i = 0;
        System.out.println(CheckSorted(arr, i));
    }
    public static boolean CheckSorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return CheckSorted(arr, i+1);
    }
}
