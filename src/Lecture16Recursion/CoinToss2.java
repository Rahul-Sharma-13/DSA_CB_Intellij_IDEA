package Lecture16Recursion;

public class CoinToss2 {

//    is ques me hamein recursive calls aise lagani hai jisse ki 2 Head ek sath kabhi na aayein
//    wo saari recurssive calls block krni hai
    public static void main(String[] args) {
        int n = 4;
        Toss(n, "");
    }

    public static void Toss(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        if(ans.length()==0||ans.charAt(ans.length()-1)!='H'){
            Toss(n - 1, ans + "H");
        }
        Toss(n - 1, ans + "T");
//        ans.endsWith("h");
    }
}
