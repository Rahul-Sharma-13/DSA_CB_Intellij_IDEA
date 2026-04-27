package Assignment3;

import java.util.Scanner;

public class HowManyQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] res = new String[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = input.nextLine();
        }

        int canAttempt = 0;
        for (int i = 0; i < n; i++) {
            if(something(res, i)){
                canAttempt++;
            }
        }
        System.out.println(canAttempt);

    }
    public static boolean something(String[] res, int idx){
        int[] num = new int[3];
        String[] str = res[idx].split(" ");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        return CanAttempt(num);
    }
    public static boolean CanAttempt(int[] num){
        int canAttemp = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] == 1){
                canAttemp++;
            }
        }
        if(canAttemp>=2){
            return true;
        }
        return false;
    }

}

//int count =0;
//        for(int i=0; i<num.length(); i++){
//int j = num.charAt(i) -'0';
//            if(j==1){
//count++;
//        }
//        }
//        if(count >=2){
//canAttempt++;
//        }
//        return  canAttempt;
