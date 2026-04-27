package Lecture20;

public class PartitionInArray {
    public static void main(String[] args) {
        int[] arr = {5,7,2,1,8,3,4};
        System.out.println(Partition(arr, 0, arr.length-1));
    }
    public static int Partition(int[] arr, int start, int end){
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
