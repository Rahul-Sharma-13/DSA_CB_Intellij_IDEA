package Lecture17PermutationRecursion;

public class Lexicographical {
    public static void main(String[] args) {
        int n = 1000;
        Lexi(0,n);
    }
    public static void Lexi(int curr, int n){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i = 0;
        if(curr==0){
            i = 1;
        }
        for (; i<=9; i++){
            Lexi(curr*10+i, n);
        }
    }
}
