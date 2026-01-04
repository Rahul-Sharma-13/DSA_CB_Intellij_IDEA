package Lecture4;

public class hcf {
    //hcf or euclid or gcd
    public static void main(String[] args) {
        int divisor = 36;//60
        int dividend = 60;//30
        while(dividend % divisor != 0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println(divisor);

        // jab divisor 60 or dividend 36 hoga to loop sirf ek baar extra chlega kyunki jb numerator bda hota h tb
    }
}
