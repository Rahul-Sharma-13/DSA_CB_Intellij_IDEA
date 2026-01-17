package Lecture7;
//Two Pointer

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        Reverse(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void Reverse(int[] arr){
        int i = 0;
        int last = arr.length-1;
        while(last>i){
            int temp = arr[i];
            arr[i]=arr[last];
            arr[last] = temp;
            last--;
            i++;
        }

    }
}
