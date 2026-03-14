package AssignmentRecursion42Questions;

public class CountEvenNumDryRun {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 10};
        int i = 0;
        int count = 0;
        System.out.println(CountEvenNumber(arr, i, count));
    }

    public static int CountEvenNumber(int[] arr, int i, int count) {
        if(i == arr.length){
            return count;
        }
        if(arr[i]%2==0){
            count++;
        }
        return CountEvenNumber(arr, i+1, count);
    }
}
