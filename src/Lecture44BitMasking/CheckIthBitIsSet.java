package Lecture44BitMasking;

public class CheckIthBitIsSet {
    public static void main(String[] args) {
//        set = 1
//        unset = 0
        int n = 84;
        int i = 4;
        int mask = (1<<i);
        if((n&mask) == 0){
            System.out.println("Unset");
        }else{
            System.out.println("Set");
        }
    }
}
