package Lecture8PrefixSuffixAndReversalAlgo;

public class ReversalAlgorithm {
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
        k = k%n;
        //starting ke n-k element ko reverse {1, 2, 3, 4, 5, 6, 7}; n-k = 4 (yaani starting ke 4 elements ko reverse kro)
        // after this func call arr = {4, 3, 2, 1, 5, 6, 7}
        Reverse(arr, 0, n-k-1);
        //ending ke k elements ko reverse karna hai{4, 3, 2, 1, (5, 6, 7)} is step me n-k se lekar n-1 tak ke elements ko reverse karna hai
        //yaani last ke 3 elements {4, 3, 2, 1, 7, 6, 5}
        Reverse(arr, n-k, n-1);
        //at the end pura array reverse karna hai {4, 3, 2, 1, 7, 6, 5}=>{5, 6, 7, 1, 2, 3, 4}
        Reverse(arr, 0, n-1);
    }
    public static void Reverse(int[] arr, int i, int last){
        while(last>i){
            int temp = arr[i];
            arr[i]=arr[last];
            arr[last] = temp;
            last--;
            i++;
        }
    }
}
