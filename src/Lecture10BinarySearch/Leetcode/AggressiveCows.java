package Lecture10BinarySearch.Leetcode;
import java.util.Scanner;
import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0) {
            int nos = input.nextInt();
            int noc = input.nextInt();
            int[] stall = new int[nos];
            for (int i = 0; i < stall.length; i++) {
                stall[i] = input.nextInt();
            }
            Arrays.sort(stall);
            System.out.println(largestMinimum(stall, noc));
        }
    }
    public static int largestMinimum(int[] stall, int noc){
        int low =  1;
        int high = stall[stall.length - 1] - stall[0];
        int ans = 0;
        while(low<=high){
            int mid = (low + high) / 2;
            if(isitPossible(stall, noc, mid)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static boolean isitPossible(int[] stall, int noc, int mid){
        int cow = 1;
        int pos = stall[0];
        for(int i = 1; i<stall.length; i++){
            if(stall[i] - pos >= mid){
                cow++;
                pos = stall[i];
            }
            if(cow == noc){
                return true;
            }
        }
        return false;
    }
}
