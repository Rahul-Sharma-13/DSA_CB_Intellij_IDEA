package AssignmentRecursion42Questions;

public class MinElementInArrayDryRun {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3};
        int i = 0;
        int min = Integer.MAX_VALUE;
        System.out.println(FindMin(arr, i, min));
    }
    public static int FindMin(int[] arr, int i , int min){
        if(i == arr.length){
            return min;
        }
        if(arr[i]<min){
            min = arr[i];
        }
        return FindMin(arr, i + 1, min);
    }
}
