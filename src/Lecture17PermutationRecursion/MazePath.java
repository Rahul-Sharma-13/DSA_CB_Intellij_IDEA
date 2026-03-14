package Lecture17PermutationRecursion;

public class MazePath {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        Path(0, 0, n-1, m-1, "");
    }
    public static void Path(int cr, int cc, int er, int ec, String ans){
        if (cr == er&&cc==ec){
            System.out.println(ans);
            return;
        }
        if (cr>er || cc>ec){
            return ;
        }
        System.out.println(ans);
        Path(cr+1, cc, er, ec, ans+"V");
        Path(cr, cc+1, er, cc, ans+"H");
    }
}
