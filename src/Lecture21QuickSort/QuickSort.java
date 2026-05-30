package Lecture21QuickSort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,7,2,1,8,3,4};
        Sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int idx = Partition(arr, start, end);
        Sort(arr, start, idx-1);
        Sort(arr, idx+1, end);
    }
    public static int Partition(int[] arr, int start, int end){
//        Partitioning mtlb ki kisi number ko choose krna or uske left me saare element usse chhote ho
//        or right me saare element us number se bade ho


//        agar kisi random number ko use krke partitioning karni hai to pehle us number
//        ko last me le jaenge baaki ka code same rahega
        int item = arr[end];
        int idx= start;
        for (int i = start; i < end; i++) {
            if(arr[i]<item){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        int temp = arr[end];
        arr[end] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}
