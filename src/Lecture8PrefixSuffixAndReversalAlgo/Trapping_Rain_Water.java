package Lecture8PrefixSuffixAndReversalAlgo;
//https://leetcode.com/problems/trapping-rain-water/

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int [] arr = {4, 2, 0, 3, 2, 5};
        System.out.println(Trapping(arr));

    }
    public static int Trapping(int[] arr){
        int n= arr.length;
        int [] left = new int [n];
        //prefix
        //ek left array banaya or usme left[0] = arr[0] rakh diya
        //second-> arr ke current element ko left ke previous element se compare karke dono ke max ka array bnega left
        left[0] = arr[0];
        for(int i = 1; i<n; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        //suffix
        //isme bhi prefix ki tarah same hi kahani h but isme elements fill karna last se shuru hoga
        //left = {4,4,4,4,4,5} right = {5,5,5,5,5,5}
        int[] right = new int [n];
        right[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
//calculation
        //isme jo sum hai wo saare area ka sum h
        //sirf is case me breadth ki value 1 h isliye sirf length calculate karke area nikala ja sakta h
        //ig no need to explain why sum is there lekin left right or array ka kya role hai ->
        //ham sabse pehle left or right ka minimum nikalnge taaki ye pta chle ki kiske respect me hame area nikalna h
        //fir us length me se arr[i] element ko sub kr denge taaki baaki ki bachi huyi length aa jaye

        int sum = 0;
        for(int i= 0; i<n; i++){
            sum = sum + Math.min(left[i], right[i]) - arr[i];
        }
        return sum;
    }
}
