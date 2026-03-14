package Lecture18BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int amount = 8;
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Permutation(coin, amount,ll, 0,ans);
        System.out.println(ans);
    }
    public static void Permutation(int[] coin, int amount, List<Integer> ll, int idx,List<List<Integer>> ans){
        if(amount ==0){
//            System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if(amount>=0){
                ll.add(coin[i]);
                Permutation(coin, amount-coin[i],ll, i,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
