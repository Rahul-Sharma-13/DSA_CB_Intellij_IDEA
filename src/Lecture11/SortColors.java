package Lecture11;

public class SortColors {
//    Dutch national Flag Algorithm
    public static void main(String[] args) {
        int [] arr = {2, 0, 2, 1, 1};
        Sort(arr);

    }
    public static void Sort(int[] arr){
        int zero = 0;
        int two = arr.length - 1;
        int i = 0;
        while(i<=two){
            if(arr[i] == 0){
                int temp = arr[zero];
                arr[zero] = arr[i];
                arr[i] = temp;
                zero++;
                i++;
            }else if(arr[i] == 2){
                int temp = arr[two];
                arr[two] = arr[i];
                arr[i] = temp;
                two--;
            }else{
                i++;
            }
        }
    }
}
