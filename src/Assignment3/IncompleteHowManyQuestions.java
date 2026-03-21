package Assignment3;

import java.util.Scanner;

public class IncompleteHowManyQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] res = new String[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = input.nextLine();
        }
        int num = TotalQues(res);
        System.out.println(num);
    }
    public static int TotalQues(String[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(Ques(arr[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean Ques(String num){
        int canAttempt = 0;
        String numb = num.replaceAll(" ", "");
        int num2 = Integer.parseInt(numb);
        while(num2>0){
            int rem = num2%10;
            if(rem == 1){
                canAttempt++;
            }
            num2 /=10;
        }
        if(canAttempt>=2){
            return true;
        }
        return false;
    }
}
