package Lecture21;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int low = 10;
        int high = 100;
        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
//            int x = rn.nextInt(high - low +1); it gives the random number between 0-90
            int x = rn.nextInt(high - low +1)+low; // it gives the number between 10-100
            System.out.println(x);
        }
    }
}
