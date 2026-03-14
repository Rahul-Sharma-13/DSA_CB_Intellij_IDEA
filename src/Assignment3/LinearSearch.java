package Assignment3;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        System.out.println(Search(arr, target));
    }

    private static int Search(int[] arr, int target) {
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
