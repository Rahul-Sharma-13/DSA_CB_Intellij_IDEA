package Assignment4;

import java.util.Scanner;

public class PiyushAndMagicalPark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        int s = input.nextInt();
        char[][] ch = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ch[i][j] = input.next().charAt(0);
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(ch[i][j]+" ");
//            }
//            System.out.println();
//        }
        GreatEscape(ch, k, s);
    }
    public static void GreatEscape(char[][] ch, int k, int s){
        int n = ch.length;
        int m = ch[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(ch[i][j] == '.'){
                    s-=3;
                    if(j == m-1){
                        s++;
                    }
                    if(s<k){
                        break;
                    }
                }else if(ch[i][j] == '*'){
                    s +=5;
                    if(j != m-1){
                        s--;
                    }
                    if(s<k){
                        break;
                    }
                }else if(ch[i][j] == '#'){
                    break;
                }
            }
            if(s<k){
                break;
            }
        }
        if(s>k){
            System.out.println("Yes \n"+s);
        }else {
            System.out.println("No");
        }
    }

}
