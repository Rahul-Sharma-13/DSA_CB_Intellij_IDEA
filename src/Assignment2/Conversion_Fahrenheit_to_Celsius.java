package Assignment2;
import java.util.Scanner;

public class Conversion_Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minFahrenheit = input.nextInt();
        int maxFahrenheit = input.nextInt();
        int steps = input.nextInt();
        celsiusToFahrenheit(minFahrenheit, maxFahrenheit, steps);
    }

    public static void celsiusToFahrenheit(int minFahrenheit, int maxFahrenheit, int steps){
        while(maxFahrenheit>=minFahrenheit){
            System.out.print(minFahrenheit + " ");
            double c = (5.0f/9)*(minFahrenheit-32);
            System.out.println((int)c);
            minFahrenheit +=steps;
        }
    }
}
