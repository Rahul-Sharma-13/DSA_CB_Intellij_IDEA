package Assignment3Discussion;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Permutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Permutation(int[] arr) {
        int n = arr.length;
        int p = -1, q = -1;
        //p
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }
        if (p == -1) {
            Reverse(arr, 0, n - 1);
            return;
        }
        //q
        for (int i = n - 1; i > p; i--) {
            if (arr[i] > arr[p]) {
                q = i;
                break;
            }
        }

        //swap
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        //p+1 to n-1 reverse krna hai
        Reverse(arr, p + 1, n - 1);
    }

    public static void Reverse(int[] arr, int i, int last) {
        while (last > i) {
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
            last--;
            i++;
        }
    }
}
