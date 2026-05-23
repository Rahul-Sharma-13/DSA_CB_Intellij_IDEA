package Lecture35;

import java.util.Arrays;
import java.util.PriorityQueue;
// important it's a premium question in leetcode
//https://leetcode.ca/all/253.html

//similar question :- https://leetcode.ca/all/252.html
//https://leetcode.com/problems/merge-intervals/
//https://leetcode.com/problems/ipo/description/

public class MergeRoomsII {
    public static void main(String[] args) {
        int[][] intervals = { { 9, 30 }, { 5, 10 }, { 15, 20 }, { 6, 9 }, { 2, 6 }, { 3, 5 } };
//        sorting 2d arrays
//        Arrays.sort(intervals, (a, b)->a[0] - b[0]);
//        for (int i = 0; i < intervals.length; i++) {
//            System.out.println(intervals[i][0] + "," + intervals[i][1]);
//        }

    }
    public static int MergeRoom(int[][] intervals){
//        isme 2d array sort ho rha h 0th index ke base pe
        Arrays.sort(intervals, (a, b)->a[0] - b[0]);
//        isme hum pq ko minimum value ke according pq fill krende
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]>=pq.peek()[1]){
                pq.poll();
            }
            pq.add(intervals[i]);
        }
        return pq.size();
    }
}
