package Assignment4;

public class RowwiseSortMatrix {
    public static void main(String[] args) {
        int[][] arr = { {13, 14, 11, 12},
                {23, 24, 21, 22},
                {31, 33, 32, 34},
                {43, 41, 42, 44}};
        for (int i = 0; i < arr.length; i++) {
            Sort(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    Swap(arr, i, j);
                }
            }
        }
    }
    public static void Swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
