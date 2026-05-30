package Lecture33Generics;

import java.util.Arrays;

public class CarsClient2 {
    public static void main(String[] args) {
        Cars[] arr = new Cars[5];
        arr[0] = new Cars(200, 10, "White");// P S C
        arr[1] = new Cars(1000, 20, "Black");
        arr[2] = new Cars(345, 3, "Yellow");
        arr[3] = new Cars(34, 89, "Grey");
        arr[4] = new Cars(8907, 6, "Red");
        Arrays.sort(arr, (a, b)-> a.price - b.price);
        Arrays.sort(arr, (a, b)-> a.speed - b.speed);
        Arrays.sort(arr, (a, b)-> a.color.compareTo(b.color));
//        Sort(arr);
        Display(arr);
    }
    public static <T>void Display(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
