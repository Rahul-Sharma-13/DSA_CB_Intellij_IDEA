package Assignment3;

import java.util.Scanner;

public class IncorrectAlexGoesShopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int num = input.nextInt();
        while(num-->0){
            int budget = input.nextInt();
            int item = input.nextInt();
//            Shopping(arr, budget, item);
            findAns(arr, budget, item);
        }
    }
//    public static void Shopping(int[] arr, int budget, int item){
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(CanExhaust(budget, arr[i])){
//                count++;
//            }
//        }
//        if(count>=item){
//            System.out.println("Yes");
//        }else{
//            System.out.println("No");
//        }
//    }
//    public static boolean CanExhaust(int budget, int element){
//        int x = element;
//        while(budget >= x){
//            if(x == budget){
//                return true;
//            }
//            x +=element;
//        }
//        return false;
//    }
    public static void findAns(int[] arr, int moneyHave, int claimQty) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= moneyHave) {
                int remainMoney = moneyHave;
                while (remainMoney > 0) {
                    remainMoney -= arr[i];
                    if (remainMoney == 0) {
                        count++;
                        break;
                    }
                }
            }
            if (count == claimQty) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
