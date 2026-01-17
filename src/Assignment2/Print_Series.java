package Assignment2;
import java.util.Scanner;

public class Print_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        int num = input.nextInt();
        printSeries(range, num);
    }
    public static void printSeries(int range, int num){
        int i = 1;
        while(i<=range){
            int seriesNum = 3*i+2;
            if(seriesNum % num == 0){
                i++;
                range++;
            } else{
                System.out.println(seriesNum);
                i++;
            }
        }
    }
}
