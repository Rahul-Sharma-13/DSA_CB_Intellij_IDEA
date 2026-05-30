package Lecture14ArrayList;

import java.util.ArrayList;

public class ArraysSumOfTwoArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,0,2,9};
        int[] arr2 = {3,4,5,6,7};
        SumOfTwoArrays(arr1, arr2);
    }
    public static void SumOfTwoArrays(int[] arr1, int[] arr2){
        ArrayList<Integer> ll = new ArrayList<>();
        int carry = 0;
        int i = arr1.length - 1, j = arr2.length - 1;

        while(i>=0&& j >=0){
            int sum = carry + arr1[i] + arr2[j];
            ll.add(sum%10);
            carry = sum/10;
            j--;
        }
        while(i>=0){
            int sum = carry + arr1[i] ;
            ll.add(sum%10);
            carry = sum/10;
            i--;
        }

        while(j>=0){
            int sum = carry + arr1[j] ;
            ll.add(sum%10);
            carry = sum/10;
            j--;
        }
        if(carry != 0){
            ll.add(carry);
        }
        for (int elm : ll){
            System.out.print(elm +" ");
        }
        System.out.println("End");
    }
}
