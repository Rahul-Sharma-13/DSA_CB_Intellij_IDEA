package Lecture12;

public class FindtheMinimumAreatoCoverAllOnesI {
    public static void main(String[] args) {
        int[] [] grid = {{0,1,0},{1,0,1}};

    }
    public static int MinimumArea(int[] [] arr){
        int minr = Integer.MAX_VALUE;
        int minc = Integer.MAX_VALUE;
        int maxr = Integer.MIN_VALUE;
        int maxc = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int  j =0; j<arr[0].length; j++){
                if(arr[i][j] == 1){
                    minr = Math.min(minr, i);
                    minc = Math.min(minc, j);
                    maxr = Math.max(maxr, i);
                    maxc = Math.max(maxc, j);
                }
            }
        }
        return (maxc - minc + 1) * (maxr - minr + 1);
    }
}
