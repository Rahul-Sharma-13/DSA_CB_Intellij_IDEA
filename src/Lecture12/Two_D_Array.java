package Lecture12;

public class Two_D_Array {
    public static void main(String[] args) {
        int [] [] arr = new int[4] [3];
        System.out.println(arr);//it gives the 2d array's address
        System.out.println(arr[0]);// it gives the address of 1d array
        System.out.println(arr[0][0]);// it gives the value of the element
        int [] [] other = arr;


        int[][] arr1 = new int [4][];// this is allowed
//        int [] [] arr1 = new int [] [4] this is not allowed
    }
}
