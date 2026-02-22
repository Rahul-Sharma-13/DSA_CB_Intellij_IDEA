package Lecture15Recursion;

public class FactTailRecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n, 1));
    }
    public static int Fact(int n, int ans){
//        if(n == 0){
//            return 1;
//        }
        //return n * Fact(n-1);// this is HEAD REcursion
        //return Fact(n-1) * n; // this is also Head Recursion
        // Last statement is recursive call then ---> TAIL RECURSION
        // if not ---> then it is HEAD RECURSION

        if(n == 0){
            return ans;
        }
        return Fact(n-1, ans*n);
        // now this is tail recursion

    }
}
