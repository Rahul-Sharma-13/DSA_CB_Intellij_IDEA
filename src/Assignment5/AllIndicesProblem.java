package Assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllIndicesProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        List<Integer> al = findIndices(arr, target, 0, new ArrayList<>());
//        System.out.println(al);
        int[] ans = new int[al.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = al.get(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    public static List<Integer> findIndices(int[] arr, int target, int idx, ArrayList<Integer> al){
         if(idx==arr.length){
              return al;
         }
        if(arr[idx] == target){
            al.add(idx);
//           return;
        }
        return findIndices(arr, target, idx + 1, al);
    }
}
