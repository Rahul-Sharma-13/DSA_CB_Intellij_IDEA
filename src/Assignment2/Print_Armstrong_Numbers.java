package Assignment2;
import java.util.Scanner;

public class Print_Armstrong_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        findArmstrongNum(n1, n2);
    }
    public static void findArmstrongNum(int n1, int n2){
        while(n1<=n2){
            if(checkArmstrong(n1)){
                System.out.println(n1);
            }
            n1++;
        }
    }
    public static boolean checkArmstrong(int num){
        int sum = 0;
        int count = checkCount(num);
        int x = num;
        while(x>0){
            int rem = x%10;
            sum = (int)(sum + Math.pow(rem, count));
            x=x/10;
        }
        if(sum == num){
            return true;
        }else{
            return false;
        }
    }
    public static int checkCount(int num){
        int x = num;
        int count = 0;
        while(x>0){
            x = x/10;
            count++;
        }
        return count;
    }
}
