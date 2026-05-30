package Leetcode;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int [] arr = {3, 2, 3, 1, 2, 4, 5, 6, 5};
        int k = 4;
        int ans = KThElement(arr, k);
        System.out.println(ans);
    }
    public static int KThElement(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();//min priority queue
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
