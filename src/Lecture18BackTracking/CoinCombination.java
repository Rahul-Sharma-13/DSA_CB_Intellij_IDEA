package Lecture18BackTracking;

public class CoinCombination {
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int amount = 8;
        Permutation(coin, amount,"", 0);
    }
    public static void Permutation(int[] coin, int amount, String ans, int idx){
        if(amount ==0){
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if(amount>=0){
                //amount -= coin[i]
                Permutation(coin, amount-coin[i], ans+coin[i], i);
                //amount += coin[i]
            }
        }
    }
}
