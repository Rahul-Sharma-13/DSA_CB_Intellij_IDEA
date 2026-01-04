package Lecture4;

import java.util.Scanner;

public class CheckPrimeUsingBreak {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int count = 0;
            for(int i=2; i<=n; i++){
                if(n%i ==0){
                    count++;
                    //break lgane se sirf is loop se hi bahar hoga agar koi or outer loop hai to break sirf inner loop se bahar hoga outer se nahi
                    break;
                }
            }
            if(count>=1){
                System.out.println("Not Prime");
            }else{
                System.out.println("Prime");
            }
            System.out.println("Number of Factors = " + count);

    }
}
