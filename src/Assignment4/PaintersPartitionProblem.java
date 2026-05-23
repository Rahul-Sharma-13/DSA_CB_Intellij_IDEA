package Assignment4;

import java.util.Scanner;

public class PaintersPartitionProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int painter = input.nextInt();
        int k = input.nextInt();
        int[] boards = new int[k];
        for (int i = 0; i < k; i++) {
            boards[i] = input.nextInt();
        }
        System.out.println(PartitionProblem(boards, painter));
    }

    public static int PartitionProblem(int[] boards, int painter) {
        int start = 0;
        int end = 0;
        int ans = 0;
        for (int i = 0; i < boards.length; i++) {
            end += boards[i];
        }
        while(end>=start){
            int mid = start + (end-start)/2;
            if(isittrue(boards, mid, painter)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isittrue(int[] boards, int mid, int painter) {
        int painters = 1;
        int time = 0;
        for (int i = 0; i < boards.length;) {
            if(time+boards[i]<=mid){
                time += boards[i];
                i++;
            }else{
                painters++;
                time = 0;
            }
            if(painters>painter){
                return false;
            }
        }
        return true;
    }
}
