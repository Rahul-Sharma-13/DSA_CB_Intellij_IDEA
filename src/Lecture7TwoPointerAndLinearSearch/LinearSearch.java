package Lecture7TwoPointerAndLinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        int item = 5;
        System.out.println(Search(arr, item));
    }
    public static int Search(int[] arr, int item){
        int i = 0;
        while(i<arr.length){
            if(arr[i]==item){
                return i;
            }
            i++;
        }
        return -1;
    }
}
