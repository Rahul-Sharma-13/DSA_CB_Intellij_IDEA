package AssignmentRecursion42Questions;

public class SumOfArrayElem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6};
        System.out.println(Sum(arr, 0));
    }

    public static int Sum(int[] arr, int i) {
        int sum = 0;
        if(i == arr.length){
            return sum;
        }
        return Sum(arr, i+1) + arr[i];
    }
}
