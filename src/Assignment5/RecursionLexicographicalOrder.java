package Assignment5;

public class RecursionLexicographicalOrder {
    public static void main(String[] args) {
        PrintLexi(100, 0);
    }
    public static void PrintLexi(int n, int curr){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i = 0;
        if(curr == 0){
            i = 1;
        }
        for (; i <= 9; i++) {
            PrintLexi(n, curr*10+i);
        }
    }
}
