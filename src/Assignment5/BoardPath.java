package Assignment5;
//  http://hack.codingblocks.com/app/contests/9614

public class BoardPath {
    public static void main(String[] args) {
        int n = 3;
        int faces = 3;
        int count = findPath(n, faces, 0, "");
        System.out.print("\n"+count);
    }
    public static int findPath(int n, int faces, int count, String ans){
        if(count == n){
            System.out.print(ans + " ");
            return 1;
        }
        if(count>n){
            return 0;
        }
        int x = 0;
        for (int i = 1; i <= faces; i++) {
            x += findPath(n, faces, count+i, ans + i);
        }
        return x;
    }
}
