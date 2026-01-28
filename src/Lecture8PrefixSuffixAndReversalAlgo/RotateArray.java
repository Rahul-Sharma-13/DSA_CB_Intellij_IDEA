package Lecture8PrefixSuffixAndReversalAlgo;
//REVERSAL ALGORITHM

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        Rotate(arr,k);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void Rotate(int[] arr, int k){
        int n = arr.length;
        //k = k%n isliye liya h taaki agr by chance k ki value n se badi aati hai to use scale down kar sake
        //kyunki after n number of rotations array dobara se wahi array ban jaega jo wo n rotations ke pehle tha
        k = k%n;
        for(int j = 0; j<k; j++){
            int item = arr[n-1];
            for(int i = n-2; i>=0; i--){
                arr[i+1] = arr[i];
            }
            arr[0] = item;
        }

    }
}
