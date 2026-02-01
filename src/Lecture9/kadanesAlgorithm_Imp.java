package Lecture9;

public class kadanesAlgorithm_Imp {
    public static void main(String[] args) {
        int [] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(SubArraySum(arr));
    }
    public static int SubArraySum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0; i<arr.length; i++){
            curr += arr[i];
            ans = Math.max(ans, curr);
            if(curr < 0){
                curr = 0;
            }
        }
        return ans;
    }
}
