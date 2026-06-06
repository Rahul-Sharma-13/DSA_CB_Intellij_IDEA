package Assignment9;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
//        int n = 6;
        int k = 2;
        int[] arr = {3, 2, 1, 5, 6, 4};
        findKthLargest(arr, k);
    }
    public static void findKthLargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq.peek());
    }
}
