package AssignmentRecursion42Questions;

public class MaxElementInArrayDryRun {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3};
        int i = 0;
        int max = Integer.MIN_VALUE;
        System.out.println(FindMax(arr, i, max));
    }
    public static int FindMax(int[] arr, int i, int max){
        if(i == arr.length){
            return max;
        }
        if(arr[i]>max){
            max = arr[i];
        }
        return FindMax(arr, i + 1, max);
    }
}
