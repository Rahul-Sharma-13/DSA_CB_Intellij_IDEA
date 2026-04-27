package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class AggrCows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cows = input.nextInt();
        int[] stalls = new int[n];
        for (int i = 0; i < n; i++) {
            stalls[i] = input.nextInt();
        }
        Arrays.sort(stalls);
        System.out.println(findDis(stalls, cows));
    }
    public static int findDis(int[] stalls, int cows){
        int start = 0;
        int end = stalls[stalls.length-1] - stalls[0];
        int ans = 0;
        while(end>=start){
            int mid = start+(end-start)/2;
            if(isItPossible(stalls, cows, mid)){
                ans = mid;
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
    public static boolean isItPossible(int[] stalls, int cows, int mid){
        int c = 1;
        int pos = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if((stalls[i]-pos)>=mid){
                pos = stalls[i];
                c++;
            }
            if(c == cows){
//                System.out.println("true");
                return true;
            }
        }
//        System.out.println("false");
        return false;
    }
}
