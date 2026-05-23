package Practice;

public class CoinOutcomes {
    public static void main(String[] args) {
        int noc = 3;
        Print(noc, "");
    }
    public static void Print(int noc, String ans){
        if(noc == 0){
            System.out.println(ans);
            return;
        }
        noc--;
        if(!ans.endsWith("H")) {
            Print(noc, ans + "H");
        }
        Print(noc, ans+"T");
    }
}
