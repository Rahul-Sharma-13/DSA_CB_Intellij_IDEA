package Lecture33Generics;

public class GenericsDemo {
    public static void main(String[] args) {
        Integer[] arr = {10, 2, 4, 5, 6};
        Display(arr);
        String[] arr1 = {"raj", "rohit", "mohit", "Anki"};
        Display(arr1);
    }

    public static <T>void Display(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static <T> T get(T[] arr){
        return arr[0];
    }
}
