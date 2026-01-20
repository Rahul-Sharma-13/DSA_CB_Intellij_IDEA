package Assignment2;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int source = input.nextInt();
        int destination = input.nextInt();
        int number = input.nextInt();
        if(source == 10 || destination == 10){
            System.out.println(findConversion(source, destination, number));
        }else{
            int x = findConversion(source, 10, number);
            System.out.println(findConversion(10, destination, x));
        }

    }
    public static int findConversion(int source , int destination, int num){
        int i = num;
        int mul = 1;
        int sum = 0;
        while(i>0){
            int rem = i % destination;
            sum = sum + rem *mul;
            i = i/destination;
            mul = mul * source;
        }
        return sum;
    }

}
