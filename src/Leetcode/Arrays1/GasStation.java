package Leetcode.Arrays1;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        int ans = canGo(gas, cost);
        System.out.println(ans);
    }
    public static int canGo(int[] gas, int[] cost){
        int tg = 0;
        int tc = 0;
        int n = gas.length;
        for(int i = 0; i<n; i++){
            tg += gas[i];
            tc += cost[i];
        }
        if(tc>tg){
            return -1;
        }

        int tank = 0;
        int start = 0;
        for(int i = 0; i<n; i++){
            tank += gas[i] - cost[i];
            if(tank <0){
                tank = 0;
                start = i+1;
            }
        }
        return start;
    }
}
