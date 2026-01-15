package Lecture6;
import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // ye loop isliye lagaya hai taaki ye poora code baar chal sake
        int t = input.nextInt();
        while(t-->0){
            int m = input.nextInt();//Aayush
            int n = input.nextInt();//Harshit
            Game(m, n);
        }


    }

    public static void Game(int m, int n){
        int phone = 1;
        int a = 0;
        int h = 0;
        while(true){
            a += phone;
            if(a>m){
                System.out.println("Harshit");
                break;
            }
            phone++;
            h = h + phone;
            if(h>n){
                System.out.println("Aayush");
                break;
            }
            phone++;
        }
    }
}
