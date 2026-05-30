package Lecture35HashMapQues;

import java.util.PriorityQueue;
import java.util.Scanner;

//https://codeskiller.codingblocks.com/problems/2698
public class MinimumSumPair {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 1, 4};
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int ans = 0;
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            ans += a+b;
            pq.add(a+b);
        }
        System.out.println(ans);
    }
}
