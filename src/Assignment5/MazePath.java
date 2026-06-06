package Assignment5;

import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        findPath(n-1, m-1, 0, 0, "");
    }
    public static int findPath(int n, int m,int r, int c, String ans){
        if(n==r&&m==c){
            System.out.print(ans+" ");
            return 1;
        }
        if(r>n||c>m){
            return 0;
        }
        int x = findPath(n, m, r+1, c, ans + "V");
        int y = findPath(n, m,r, c+1, ans + "H");
        int z = findPath(n, m,r+1, c+1, ans+"D");
        return x+y+z;
    }
}
