package Practice;

public class DiceRolling {
    public static void main(String[] args) {
        Print(4, 0, "");
    }
    public static void Print(int end, int curr, String ans){
        if(curr == end){
            System.out.println(ans);
            return;
        }
        if(curr>end){
            return;
        }
        for (int i = 1; i <= 3; i++) {
            Print(end, curr+i, ans+i);
        }
//        Print(end, curr+1, ans+'1');
//        Print(end, curr+2, ans+'2');
//        Print(end, curr+3, ans+'3');
    }
}
