package Lecture33Generics;

import java.util.*;

public class CarsClient {
    public static void main(String[] args) {
        Cars[] arr = new Cars[5];
        arr[0] = new Cars(200, 10, "White");// P S C
        arr[1] = new Cars(1000, 20, "Black");
        arr[2] = new Cars(345, 3, "Yellow");
        arr[3] = new Cars(34, 89, "Grey");
        arr[4] = new Cars(8907, 6, "Red");
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(Cars o1, Cars o2){
                return o1.price - o2.price;
            }
        });
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(Cars o1, Cars o2){
                return o2.speed - o1.speed;
            }
        });
//        Sort(arr);
        Display(arr);

    }
    public static <T extends Comparable<T>> void Sort(T[] arr){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            for(int j = 0; j<n - i; j++){
                if(arr[j].compareTo(arr[j+1])>0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static <T>void Display(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
