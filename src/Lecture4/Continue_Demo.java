package Lecture4;

import java.util.Scanner;

public class Continue_Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i<=5; i++){
            if(i==3){
                continue;//isse sirf ek iteration miss hogi(jab bhi i ki value 3 hogi iteration skip ho jaegi)
            }
            System.out.println(i);
        }
    }
}
