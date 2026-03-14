package Lecture16Recursion;


public class BoardPath {
    public static void main(String[] args) {
        int n = 4;
        Path(n,0,  "");
    }

    public static void Path(int n, int curr, String ans) {
        if (curr == n) {
            System.out.println(ans);
        }
        if (curr > n) {
            return;
        }
        Path(n, curr + 1, ans + 1);
        Path(n, curr + 2, ans + 2);
        Path(n, curr + 3, ans + 3);
    }
}
