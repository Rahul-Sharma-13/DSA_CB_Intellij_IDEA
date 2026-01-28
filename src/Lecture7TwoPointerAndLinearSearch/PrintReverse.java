package Lecture7TwoPointerAndLinearSearch;

public class PrintReverse {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        Print(arr);
    }
    public static void Print(int[] arr){
        for(int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
