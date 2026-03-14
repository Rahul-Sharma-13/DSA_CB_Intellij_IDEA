package AssignmentRecursion42Questions;

public class FirstOccDryRun {
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 5, 6, 7, 4, 2, 2};
        int key = 4;
        int i = 0;
        System.out.println(FindOcc(arr, key, i));
    }
    public static int FindOcc(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FindOcc(arr, key, i + 1);
    }
}
